package pers.liuchengyin.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @ClassName User
 * @Description 用户类
 * @Author 柳成荫
 * @Date 2020/12/28
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private Long id;
    private String name;
    private String sex;
    private Integer age;
}
