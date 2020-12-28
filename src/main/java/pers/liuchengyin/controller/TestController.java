package pers.liuchengyin.controller;

import org.springframework.web.bind.annotation.*;
import pers.liuchengyin.log.OperateLog;
import pers.liuchengyin.pojo.Response;
import pers.liuchengyin.pojo.User;


/**
 * @ClassName TestController
 * @Description TestController
 * @Author 柳成荫
 * @Date 2020/12/28
 */
@RequestMapping("/test")
@RestController
public class TestController {

    @PostMapping("/add")
    @OperateLog(operateModule = "用户管理", operateType = "POST", operateDesc = "新增成员")
    public Response<User> addUser(@RequestBody User user){
        Response<User> response = new Response<>();
        if(null == user.getId()){
            response.setSuccess(false);
            response.setMessage("新增失败！");
            return response;
        }
        response.setSuccess(true);
        response.setMessage("新增成功");
        response.setT(user);
        return response;
    }

    @GetMapping("/info")
    @OperateLog(operateModule = "用户管理", operateType = "GET", operateDesc = "获取用户")
    public Response<User> info(String name, Integer age){
        User user = new User(1L, name,"女", age);
        return new Response<User>(true,"查询成功",user);
    }


    @OperateLog(operateModule = "用户管理", operateType = "PUT", operateDesc = "修改用户")
    @PutMapping("/update")
    public Response<User> update(String name, String sex){
        User user = new User(1L, name, sex, 18);
        return new Response<User>(true,"修改成功",user);
    }


    @OperateLog(operateModule = "用户管理", operateType = "DELETE", operateDesc = "修改")
    @DeleteMapping("/delete")
    public Response<String> delete(@RequestParam("id") Long id){
        return new Response<String>(true,"删除成功","delete_ok");
    }

    @OperateLog(operateModule = "异常模块", operateType = "GET", operateDesc = "异常处理")
    @GetMapping("/exception")
    public Response<String> exception(){
        int num = 10 / 0;
        return new Response<String>(true,"没有异常","OK");
    }
}
