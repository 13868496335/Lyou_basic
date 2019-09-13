package cn.zjiet.travel.service.imp;

import cn.zjiet.travel.entry.WeixinEntry;
import cn.zjiet.travel.service.MemberService;
import cn.zjiet.travel.service.feign.MemberToWxFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 会员调微信接口
 * @author: linc
 * @create: 2019-09-13 13:57
 */
@RestController
public class MemberToWeixinServiceImp  implements MemberService {

    @Autowired
    MemberToWxFeign memberToWxFegin;

    @Override
    public WeixinEntry getMemberToWxInfo() {
        return memberToWxFegin.getLoginWxInfo();
    }

}
