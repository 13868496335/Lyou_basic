package cn.zjiet.travel.service;

import cn.zjiet.travel.entry.WeixinEntry;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @description: 会员调微信接口
 * @author: linc
 * @create: 2019-09-13 13:33
 */
public interface MemberService {
    /**
     *@Description: 获取微信信息😁接口
     *@return: WeixinEntry
     *@Author: Linc
     *@date: 2019-09-08
     */
    @GetMapping("memberToWeixin")
    public WeixinEntry getMemberToWxInfo();
}
