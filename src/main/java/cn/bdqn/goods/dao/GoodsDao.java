package cn.bdqn.goods.dao;

import cn.bdqn.goods.pojo.Goods;

import java.util.List;

public interface GoodsDao {
   public List<Goods> getList();
   public Goods getById(int id);
}
