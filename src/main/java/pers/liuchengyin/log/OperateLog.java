package pers.liuchengyin.log;

import java.lang.annotation.*;

/**
 * @ClassName OperateLog
 * @Description 日志注解，作用：可以添加一些自己想要获取的内容，通过注解的方式来获取
 * @Author 柳成荫
 * @Date 2020/12/28
 */
// 注解放置的目标位置,METHOD是可注解在方法级别上
@Target(ElementType.METHOD)
//注解在哪个阶段执行 - 运行时
@Retention(RetentionPolicy.RUNTIME)
public @interface OperateLog {
    /** 操作模块（如订单模块） */
    String operateModule() default "";
    /** 操作说明（如新增订单） */
    String operateDesc() default "";
    /** 请求类型（GET/POST/PUT/DELETE） */
    String operateType() default "";
    // 更多补充...
}