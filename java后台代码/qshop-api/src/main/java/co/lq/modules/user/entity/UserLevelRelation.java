package co.lq.modules.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import co.lq.common.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户等级记录表
 * </p>
 *
 * @author billy
 * @since 2019-12-06
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "UserLevelRelation对象", description = "用户等级记录表")
public class UserLevelRelation extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long              id;

    @ApiModelProperty(value = "用户uid")
    private Long              uid;

    @ApiModelProperty(value = "等级vip")
    private Long              levelId;

    @ApiModelProperty(value = "会员等级")
    private Integer           grade;

    @ApiModelProperty(value = "过期时间")
    private Integer           validTime;

    @ApiModelProperty(value = "是否永久")
    private Integer           isForever;

    @ApiModelProperty(value = "商户id")
    private Long              merId;

    @ApiModelProperty(value = "0:禁止,1:正常")
    private Integer           status;

    @ApiModelProperty(value = "备注")
    private String            mark;

    @ApiModelProperty(value = "是否已通知")
    private Integer           remind;

    @ApiModelProperty(value = "是否删除,0=未删除,1=删除")
    private Integer           isDel;

    @ApiModelProperty(value = "添加时间")
    private Integer           addTime;

    @ApiModelProperty(value = "享受折扣")
    private Integer           discount;

}
