package edu.scdx.demo.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.scdx.demo.dao.GoodsMapper;
import edu.scdx.demo.entity.Goods;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodServiceImpl implements GoodService{
    @Resource
    GoodsMapper goodsMapper;

    @Override
    public PageInfo<Goods> findGoods(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Goods> goods = goodsMapper.selectByExample(null);
        return new PageInfo<>(goods);
    }

    @Override
    @Transactional // 事务对应的注解
    public void deleteGoodById(Goods goods) {
        goodsMapper.deleteByPrimaryKey(goods.getGoodsId());
    }

    @Override
    public void deleteGoodsByIds(List<Integer> ids) {

    }
}
