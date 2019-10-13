package cn.bdqn.goods.controller;

import cn.bdqn.goods.pojo.Goods;
import cn.bdqn.goods.pojo.Members;
import cn.bdqn.goods.service.GoodsService;
import cn.bdqn.goods.service.MemberService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MembersController {
    @Autowired
    private MemberService memberService;
    @Autowired
    private GoodsService goodsService;


    @RequestMapping("/index")
    public String  getString(){

        return "index";
    }


    @RequestMapping("/search")
    @ResponseBody
    public String index( String memberNumber){
        List<Members> list=memberService.search(memberNumber);
        String json= JSON.toJSONString(list);
        return json;
    }

    @RequestMapping("/product")
    public String goods(int goodsId, Model model){
        Goods goods=goodsService.getById(goodsId);
        model.addAttribute("goods",goods);
        return "product";
    }
@RequestMapping("/add")
public String add(Model model){
        List<Goods> list=goodsService.getList();
        model.addAttribute("list",list);
        return "add";
}

   @RequestMapping(value = "add",method = RequestMethod.POST)
   @ResponseBody
    public String add(Members members){
        try {
            memberService.add(members);
        }catch (Exception e){
            e.printStackTrace();
            return "false";
        }
        return "true";
    }

    @RequestMapping("/del")
    @ResponseBody
    public String del(String memberNumber){
        try {
            memberService.del(memberNumber);
            return "true";
        } catch (Exception e) {
            e.printStackTrace();
            return "false";
        }
    }
}
