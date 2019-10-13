package cn.bdqn.goods.service.impl;

import cn.bdqn.goods.dao.GoodsDao;
import cn.bdqn.goods.pojo.Goods;
import cn.bdqn.goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("GoodsService")
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsDao goodsDao;


    @Override
    public List<Goods> getList() {
        return goodsDao.getList();
    }

    @Override
    public Goods getById(int id) {

        return goodsDao.getById(id);
    }
}
