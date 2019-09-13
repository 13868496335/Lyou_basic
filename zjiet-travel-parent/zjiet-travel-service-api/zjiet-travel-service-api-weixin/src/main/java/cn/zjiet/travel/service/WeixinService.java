package cn.zjiet.travel.service;

import cn.zjiet.travel.entry.WeixinEntry;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @description: 微信业务接口定义类
 * @author: linc
 * @create: 2019-09-08 01:29
 */
public interface WeixinService {

    /**
     * @Description: 获取当前用户的微信信息；
     * @return: WeixinEntry
     * @Author: Linc
     * @date: 2019-09-08
     */
    @GetMapping("weixinInfo")
    public WeixinEntry getLoginWxInfo();

}
