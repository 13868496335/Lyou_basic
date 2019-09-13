package cn.zjiet.travel.service.imp;

import cn.zjiet.travel.entry.WeixinEntry;
import cn.zjiet.travel.service.WeixinService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 微信业务逻辑实现接口
 * @author: linc
 * @create: 2019-09-13 13:42
 */
@RestController
public class WeixinServiceImp implements WeixinService {

    @Override
    public WeixinEntry getLoginWxInfo() {
        return  WeixinEntry.builder()
                             .appUuid("WX572398040")
                             .username("llc")
                             .autor("QQ头像").build();
    }
}
