package cn.hc.servicelogin.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.math.BigDecimal;

@Data
public class DockerInfoVo {
    @TableId(value = "id", type = IdType.ID_WORKER)
    private String id; // 项目id


    @NotEmpty(message = "体检项目不能为空")
    private String title;  // 项目名称

    // 0.01
    @Pattern(regexp = "/(^[1-9]\\d*(\\.\\d{1,2})?$)|(^0(\\.\\d{1,2})?$)/", message = "必须是价格")
    private BigDecimal price; // 价格


    private String cover; //封面

    @NotEmpty(message = "描述不能为空")
    private String description; // 描述
}

