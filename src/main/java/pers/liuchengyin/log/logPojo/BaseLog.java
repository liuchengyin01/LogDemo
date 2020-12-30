package pers.liuchengyin.log.logPojo;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @ClassName BaseLog
 * @Description 公共Log
 * @Author 柳成荫
 * @Date 2020/12/29
 */
@Data
@ToString
public class BaseLog {
    /** 分布式id(自增id) */
    private Long id;
    /** 请求参数 */
    private String requestParam;
    /** 请求头参数 */
    private String headerParam;
    /** 请求方法名 */
    private String operateMethod;
    /** 操作用户ID */
    private Long operateUserId;
    /** 操作用户名 */
    private String operateUserName;
    /** 请求URI(如/test/add) */
    private String operateUri;
    /** 请求IP */
    private String operateIp;
    /** 操作模块 */
    private String operateModule;
    /** 请求类型(GET/POST/PUT/DELETE) */
    private String operateType;
    /** 操作描述 */
    private String operateDesc;
    /** 创建时间 */
    private Date createTime;
}
