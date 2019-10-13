package cn.bdqn.goods.service.impl;

import cn.bdqn.goods.dao.MembersDao;
import cn.bdqn.goods.pojo.Members;
import cn.bdqn.goods.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("MemberService")
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MembersDao membersDao;

    @Override
    public List<Members> search(String memberNumber) {

        return membersDao.getList(memberNumber);
    }

    @Override
    public int add(Members members) {
        return membersDao.add(members);
    }

    @Override
    public int del(String memberNumber) {
        return membersDao.del(memberNumber);
    }
}
