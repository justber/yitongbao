package cn.hc.servicelogin.entity;

import java.math.BigDecimal;

import cn.hc.servicelogin.vaild.ListValue;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotEmpty;

/**
 * <p>
 * 课程
 * </p>
 *
 * @author hc
 * @since 2022-10-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class DockerProject implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 体检项目ID
     */
      @TableId(value = "id", type = IdType.ID_WORKER)
    private String id;

    /**
     * 体检项目名称
     */
    @NotEmpty
    private String title;

    /**
     * 项目销售价格，设置为0则可免费观看
     */
    private BigDecimal price;

    /**
     * 项目封面图片路径
     */
    private String cover;

    /**
     * 项目数量
     */
    private Long buyCount;

    /**
     * 浏览数量
     */
    private Long viewCount;

    /**
     * 乐观锁
     */
    private Long version;

    /**
     * 项目状态 Draft未发布  Normal已发布
     */

    private String status;

    /**
     * 逻辑删除 1（true）已删除， 0（false）未删除\
     * 自定义校验
     */
    @ListValue(value = {0,1})
    private Integer isDeleted;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 更新时间
     */
    private Date gmtModified;

    /**
     * 描述
     */
    @NotEmpty
    private String description;


}
