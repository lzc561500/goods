package cn.bdqn.goods.dao;

import cn.bdqn.goods.pojo.Members;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MembersDao {
    public List<Members> getList(@Param("memberNumber")String memberNumber);
    public int add(Members members);
    public int del(@Param("memberNumber")String memberNumber);
}
