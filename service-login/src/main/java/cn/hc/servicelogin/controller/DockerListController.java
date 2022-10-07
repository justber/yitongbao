package cn.hc.servicelogin.controller;


import cn.hc.result.R;
import cn.hc.servicelogin.entity.DockerList;
import cn.hc.servicelogin.entity.DockerQuery;
import cn.hc.servicelogin.service.DockerListService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;


/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author hc
 * @since 2022-10-05
 */
@RestController
@RequestMapping("/servicelogin/docker-list")
@CrossOrigin
public class DockerListController {
    @Autowired
    private DockerListService dockerListService;

    /***
     *  分页数据查询带模糊查询
     * @param current
     * @param page
     * @param dockerQuery  查询数据集的封装
     * @return
     */
    @GetMapping("pagelisttest/{current}/{page}")
    public R pageLimit(
            @PathVariable Long current,
            @PathVariable Long page,
            @RequestBody(required = false) DockerQuery dockerQuery
            ){
        Page<DockerList> dockerListPage = new Page<>(current,page);
        dockerListService.page(dockerListPage,null);

        return R.ok().data("rows",dockerListPage.getRecords()).data("total",dockerListPage.getTotal());
    }

    /*
      根据用户id删除数据
     */
    @DeleteMapping("deleteById/{id}")
    public R deleteById(@PathVariable String id){
        boolean b = dockerListService.removeById(id);
        if (b){ return R.ok();}
        return R.error();

    }

    /**
     * 添加数据
     * @param dockerList
     * @return
     */
    @PostMapping("addDocker")
    public R  addDocker(@RequestBody DockerList dockerList){
        // 格式化日期
//        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
//        Date now=new Date();
//        String nowStr=sdf.format(now);
//        System.out.println(nowStr);//2019-08-28 15:25:01 546

        dockerList.setGmtCreate(new Date());
        dockerList.setGmtModified(new Date());
        boolean save = dockerListService.save(dockerList);
        if (save){
        return R.ok();}
        return R.error();
    }

    /**
     * 根据指定id获取数据
     * @param id
     * @return
     */
    @GetMapping("getDataById/{id}")
    public R getDataById(@PathVariable String id){
        DockerList byId = dockerListService.getById(id);


        return R.ok().data("dockerData",byId);
    }


    @PostMapping("updataData")
    public R updateData(@RequestBody DockerList dockerList){
        boolean b = dockerListService.updateById(dockerList);
        if (b){
            return R.ok();
        }
        return R.error();
    }



}

