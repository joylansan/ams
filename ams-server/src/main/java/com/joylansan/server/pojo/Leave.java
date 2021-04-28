package com.joylansan.server.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @author joylansan
 * @since 2021-04-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Leave对象", description="")
public class Leave implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "请假时间")
    private LocalDateTime time;

    @ApiModelProperty(value = "申请时间")
    private LocalDateTime writeTime;

    @ApiModelProperty(value = "请假理由")
    private String reason;

    @ApiModelProperty(value = "通过时间")
    private LocalDateTime checkTime;

    @ApiModelProperty(value = "是否同意")
    private Boolean enable;

    @ApiModelProperty(value = "学生id")
    private Integer studentId;

    @ApiModelProperty(value = "教师id")
    private Integer teacherId;

    @ApiModelProperty(value = "班级id")
    private Integer classId;


}
