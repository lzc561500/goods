package cn.bdqn.goods.service;

import cn.bdqn.goods.pojo.Goods;

import java.util.List;

public interface GoodsService {
    public List<Goods> getList();
    public Goods getById(int id);
}
