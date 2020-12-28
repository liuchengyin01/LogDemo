package pers.liuchengyin.log;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @ClassName OperationLog
 * @Description 请求日志类
 * @Author 柳成荫
 * @Date 2020/12/28
 */
@Data
@ToString
public class OperationLog {
    /** 分布式id(自增id) */
    private Long operateId;
    /** 操作模块 */
    private String operateModule;
    /** 请求类型(GET/POST/PUT/DELETE) */
    private String operateType;
    /** 操作描述 */
    private String operateDesc;
    /** 操作方法名 */
    private String operateMethod;
    /** 请求参数 */
    private String operateRequestParam;
    /** 请求头参数 */
    private String operateHeaderParam;
    /** 返回结果 */
    private String operateResponseParam;
    /** 请求用户ID */
    private Long operateUserId;
    /** 请求用户名称 */
    private String operateUserName;
    /** 请求IP */
    private String operateIp;
    /** 请求URI(如/test/add) */
    private String operateUri;
    /** 调用方法时间(创建时间) */
    private Date createTime;
}
