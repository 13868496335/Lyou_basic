package cn.zjiet.travel.service.feign;

import cn.zjiet.travel.service.WeixinService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @description: 携程会员获取微信信息接口
 * @author: linc
 * @create: 2019-09-08 13:27
 */
@FeignClient(name = "app-weixin-client")
public interface MemberToWxFeign extends WeixinService {
}
