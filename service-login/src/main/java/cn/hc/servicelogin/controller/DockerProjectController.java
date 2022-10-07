package cn.hc.servicelogin.controller;


import cn.hc.result.R;
import cn.hc.servicelogin.entity.DockerInfoVo;
import cn.hc.servicelogin.entity.DockerProject;
import cn.hc.servicelogin.entity.DockerQuery;
import cn.hc.servicelogin.service.DockerListService;
import cn.hc.servicelogin.service.DockerProjectService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 课程 前端控制器
 * </p>
 *
 * @author hc
 * @since 2022-10-06
 */
@RestController
@RequestMapping("/servicelogin/docker-project")
public class DockerProjectController {

    @Autowired
    private DockerProjectService service;
    @PostMapping("saveData")
    public R saveData(@RequestBody DockerInfoVo dockerQuery){
        DockerProject dockerProject = new DockerProject();
        BeanUtils.copyProperties(dockerQuery,dockerProject);

        service.save(dockerProject);
        return R.ok();
    }
}

