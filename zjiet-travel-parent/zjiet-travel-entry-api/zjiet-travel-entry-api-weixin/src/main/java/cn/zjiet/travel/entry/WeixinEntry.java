package cn.zjiet.travel.entry;

import lombok.Builder;
import lombok.Data;

/**
 * @description: 微信实体类
 * @author: linc
 * @create: 2019-09-13 12:56
 */

@Data
@Builder
public class WeixinEntry {

    //微信用户唯一标识
    private  String appUuid;
    //微信用户昵称
    private  String username;
    //头像信息
    private  String autor;

}
