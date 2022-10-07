package cn.hc.servicelogin.controller;

import cn.hc.result.R;
import org.springframework.web.bind.annotation.*;

/**
 * @author hc
 * @date 2022/10/4 18:57
 * http://localhost:8080/vue-admin-template/user/login
 */
@RequestMapping("/vue-admin-template/user")
@RestController
@CrossOrigin
public class TestController {
    /**
     * @DESC 登录验证
     * @return
     */
    @PostMapping("login")
    public R login(){
        System.out.println("登录");
        return R.ok().data("token","admin");
    }

    /**
     * @DESC
     *     设置登录的角色
     *     登录名称和密码
     *     以及登录的图片
     * @return
     */
    @GetMapping("info")
    public R info(){
        return R.ok().data("roles","[admin]")
                .data("name","admin")
                .data("avatar","https://grain-online-education.oss-cn-shenzhen.aliyuncs.com/avatar/avatar.jpg");
    }

    /**
     *  @DESC 摄入绘制登出草最
     */
    @PostMapping("logout")
    public R logout(){
        System.out.println("登出");
        return R.ok().data("SET_TOKEN","admin");
    }

}
