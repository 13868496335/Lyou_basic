package cn.zjiet.travel.entry;

import lombok.Builder;
import lombok.Data;


/**
 * @description: 会员实体类
 * @author: linc
 * @create: 2019-09-13 13:04
 */
@Data
@Builder
public class MemberEntry {
    //会员编号
    private  String  uuid;
    //会员名称
    private  String  name;
    //会员年龄
    private  int     age;

}
