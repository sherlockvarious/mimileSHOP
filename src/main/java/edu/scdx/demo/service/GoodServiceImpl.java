package edu.scdx.demo.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.scdx.demo.dao.GoodsMapper;
import edu.scdx.demo.entity.Goods;
import edu.scdx.demo.entity.GoodsExample;
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
    public boolean insertGoods(Goods good){
        if (goodsMapper.insertSelective(good)==1){
            return true;
        }
        return false;
    }
    /**
     * @Describe    更新商品信息
     * @param       good
     * @return      void
     */
    @Override
    public void updateGood(Goods good) {
        goodsMapper.updateByPrimaryKeySelective(good);
    }
    /**
     * @Describe    根据id 查询商品
     * @param       id
     * @return      Product
     */
    @Override
    public Goods getGood(Integer id) {
        Goods good = goodsMapper.selectByPrimaryKey(id);
        return good;
    }
    /**
     * @Describe    关键字搜索产品
     * @param       keyWord
     * @return      List<Product>
     */
    @Override
    public List<Goods> searchByKeyword(String keyWord) {
        // 通过关键字查询商品
        GoodsExample example = new GoodsExample();
        example.createCriteria().andGoodsNameLike("%" + keyWord + "%");
        List<Goods> goods = goodsMapper.selectByExample(example);
        return goods;
    }
    /**
     * @Describe    类型筛选产品
     * @param       type
     * @return      List<Product>
     */
    @Override
    public List<Goods> searchByType(String type) {
        GoodsExample example = new GoodsExample();
        example.createCriteria().andTypeNameEqualTo(type);
        List<Goods> goods = goodsMapper.selectByExample(example);
        return goods;
    }

    /**
     * @Describe    品牌筛选产品
     * @param       brand
     * @return      List<Product>
     */
    @Override
    public List<Goods> searchByBrand(String brand) {
        GoodsExample example = new GoodsExample();
        example.createCriteria().andBrandEqualTo(brand);
        List<Goods> goods = goodsMapper.selectByExample(example);
        return goods;
    }
}
