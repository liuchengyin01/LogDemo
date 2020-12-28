package pers.liuchengyin.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @ClassName Response
 * @Description 返回结果
 * @Author 柳成荫
 * @Date 2020/12/28
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Response<T> {
    private boolean success;
    private String message;
    private T t;
}
