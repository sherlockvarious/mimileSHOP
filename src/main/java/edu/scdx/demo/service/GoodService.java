package edu.scdx.demo.service;
import com.github.pagehelper.PageInfo;
import edu.scdx.demo.entity.Goods;

import java.util.List;

public interface GoodService {
    public PageInfo<Goods> findGoods(int pageNo, int pageSize);
    public void deleteGoodById(Goods good);
    void deleteGoodsByIds(List<Integer> ids);
    public boolean insertGoods(Goods good);
    public void updateGood(Goods good);
    public Goods getGood(Integer Goodsid);
}
