package pers.liuchengyin.log.logPojo;

import lombok.Data;
import lombok.ToString;

/**
 * @ClassName OperationLog
 * @Description 请求日志类
 * @Author 柳成荫
 * @Date 2020/12/28
 */
@Data
@ToString
public class OperationLog extends BaseLog{
    /** 返回结果 */
    private String operateResponseParam;
}
