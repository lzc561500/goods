package cn.bdqn.goods.service;

import cn.bdqn.goods.pojo.Members;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MemberService {
    public List<Members> search(@Param("memberNumber")String memberNumber);
    public int add(Members members);
    public int del(String memberNumber);
}
