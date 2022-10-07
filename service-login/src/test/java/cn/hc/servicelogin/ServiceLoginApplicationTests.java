package cn.hc.servicelogin;

import cn.hc.servicelogin.entity.DockerList;
import cn.hc.servicelogin.service.DockerListService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

@SpringBootTest
class ServiceLoginApplicationTests {

    @Autowired
    DockerListService service;
    @Test
    void contextLoads() {
        // 2019-11-07 09:18:25

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date now=new Date();
        String nowStr=sdf.format(now);
        System.out.println(nowStr);//2019-08-28 15:25:01 546

    }

}
