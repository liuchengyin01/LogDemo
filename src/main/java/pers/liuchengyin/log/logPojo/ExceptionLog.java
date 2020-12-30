package pers.liuchengyin.log.logPojo;

import lombok.Data;
import lombok.ToString;


/**
 * @ClassName ExceptionLog
 * @Description 异常日志类
 * @Author 柳成荫
 * @Date 2020/12/28
 */
@Data
@ToString
public class ExceptionLog extends BaseLog{
    /** 异常名 */
    private String excName;
    /** 异常信息 */
    private String excMessage;
}
