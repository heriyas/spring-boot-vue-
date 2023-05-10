package com.zouweihao.zouweihao.controller;


import com.zouweihao.zouweihao.entity.User;
import com.zouweihao.zouweihao.service.UserService;
import com.zouweihao.zouweihao.util.JwtUtil;
import com.zouweihao.zouweihao.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class userController {

    @Autowired
    private UserService userService;

    private final String USERNAME = "邹伟豪";
    private final String PASSWORD = "123";

    @PostMapping("/loginAjax_zouweihao")
    public Result loginSubmit(@RequestBody User user){
        System.out.println(user.toString());
        User appcetUser =  userService.getLogin(user.getUser_id(),user.getUser_password());
        System.out.println(appcetUser.toString());
        appcetUser.setUser_token(JwtUtil.createToken(appcetUser));
        System.out.println(appcetUser.getUser_token());
        System.out.println("访问成功");
        return  new Result(200, "成功",appcetUser);
    }


//    @PostMapping("/loginAjax_zouweihao")
//    public Result loginSubmit(@RequestBody User user, HttpServletRequest request){


//        User a =  userService.getLogin(user.getUser_id(),user.getUser_password());
//
//        Date date = new Date();
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String logintime = simpleDateFormat.format(date);
//
//        if (a != null) {
//            HttpSession session = request.getSession();
//            session.setAttribute("user_name",a.getUser_name());
//            session.setAttribute("user_role",a.getUser_role());
//            session.setAttribute("user_id",a.getUser_id());
//            userService.updateTime(logintime, a.getUser_name());
//            return new Result(200,"成功",a);
//        }else
//            return new Result(400,"err");
//    }

    @GetMapping("/userAjax_a")
    public Result getAll() {
        List<User> userList = userService.getAllUser();
      return  new Result(200, "成功",userList);

    }

    @PostMapping("/userAdd_a")
    public Result save(@RequestBody User user) {
        userService.save(user);
        System.out.println(user);
        return new Result(200,"OK");
    }

    @GetMapping("/userSelect_a/{id}")
    public Result getUserId(@PathVariable Integer id) {
        User user = userService.getUserId(id);
        System.out.println(user);
        if (user != null) {
            return new Result(200,"成功",user);
        }else
            return new Result(400,"err");
    }

    @PutMapping("/userUpdate_a")
    public Result update(@RequestBody User user) {
        userService.update(user);
        return new Result(200,"OK");
    }

    @DeleteMapping("/userDelete_a/{id}")
    public Result delete(@PathVariable  Integer id) {
        userService.delete(id);
        return new Result(200, "ok");
    }

    @GetMapping("/userSelect_id_a/{user_id}")
    public Result getUser_id(@PathVariable String user_id) {
        List<User> userListId = userService.getUser_Id(user_id);

        if (userListId != null) {
            return new Result(200,"成功",userListId);
        }else
            return new Result(400,"err");
    }



    @GetMapping("/userAjax_b")
    public Result getAllUserB() {
        List<User> userList = userService.getAllUserB();
        return  new Result(200, "成功",userList);

    }

    @PostMapping("/userAdd_b")
    public Result saveB(@RequestBody User user) {
        userService.saveB(user);
        System.out.println(user);
        return new Result(200,"OK");
    }

    @GetMapping("/userSelect_b/{id}")
    public Result getUserIdB(@PathVariable Integer id) {
        User user = userService.getUserIdB(id);
        System.out.println(user);
        if (user != null) {
            return new Result(200,"成功",user);
        }else
            return new Result(400,"err");
    }

    @PutMapping("/userUpdate_b")
    public Result updateB(@RequestBody User user) {
        userService.updateB(user);
        return new Result(200,"OK");
    }

    @DeleteMapping("/userDelete_b/{id}")
    public Result B(@PathVariable  Integer id) {
        userService.deleteB(id);
        return new Result(200, "ok");
    }

    @GetMapping("/userSelect_id_b/{user_id}")
    public Result getUser_idB(@PathVariable String user_id) {
        List<User> userListId = userService.getUser_IdB(user_id);

        if (userListId != null) {
            return new Result(200,"成功",userListId);
        }else
            return new Result(400,"err");
    }

    @GetMapping("/userAjax_c")
    public Result getAllAdmin() {
        List<User> userList = userService.getAllAdmin();
        return  new Result(200, "成功",userList);

    }
}
