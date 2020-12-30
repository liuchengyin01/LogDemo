package pers.liuchengyin.service;

import pers.liuchengyin.log.logPojo.OperationLog;

/**
 * @ClassName OperationLogService
 * @Description 要想记录操作日志，需要实现本接口并将交给Spring管理，在实现类里实现写入数据库
 * @Author 柳成荫
 * @Date 2020/12/29
 */
public interface OperationLogService {
    /**
     * 将日志记录到数据库
     * @param operationLog 日志对象
     */
    void recordOperateLog(OperationLog operationLog);
}
