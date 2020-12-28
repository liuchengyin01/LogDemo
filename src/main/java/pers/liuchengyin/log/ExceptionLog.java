package pers.liuchengyin.log;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @ClassName ExceptionLog
 * @Description 异常日志类
 * @Author 柳成荫
 * @Date 2020/12/28
 */
@Data
@ToString
public class ExceptionLog {
    /** 分布式id(自增id) */
    private Long excId;
    /** 请求参数 */
    private String excRequestParam;
    /** 请求头参数 */
    private String operateHeaderParam;
    /** 请求方法名 */
    private String operateMethod;
    /** 异常名 */
    private String excName;
    /** 异常信息 */
    private String excMessage;
    /** 操作用户ID */
    private Long operateUserId;
    /** 操作用户名 */
    private String operateUserName;
    /** 请求URI(如/test/add) */
    private String operateUri;
    /** 请求IP */
    private String operateIp;
    /** 发生异常时间(创建时间) */
    private Date createTime;
}
