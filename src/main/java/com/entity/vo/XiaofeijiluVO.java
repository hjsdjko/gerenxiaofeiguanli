package com.entity.vo;

import com.entity.XiaofeijiluEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 消费记录
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xiaofeijilu")
public class XiaofeijiluVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 标题
     */

    @TableField(value = "xiaofeijilu_name")
    private String xiaofeijiluName;


    /**
     * 消费类型
     */

    @TableField(value = "xiaofeijilu_types")
    private Integer xiaofeijiluTypes;


    /**
     * 消费金额
     */

    @TableField(value = "xiaofeijilu_new_money")
    private Double xiaofeijiluNewMoney;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 消费详情
     */

    @TableField(value = "xiaofeijilu_text")
    private String xiaofeijiluText;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show3 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：标题
	 */
    public String getXiaofeijiluName() {
        return xiaofeijiluName;
    }


    /**
	 * 获取：标题
	 */

    public void setXiaofeijiluName(String xiaofeijiluName) {
        this.xiaofeijiluName = xiaofeijiluName;
    }
    /**
	 * 设置：消费类型
	 */
    public Integer getXiaofeijiluTypes() {
        return xiaofeijiluTypes;
    }


    /**
	 * 获取：消费类型
	 */

    public void setXiaofeijiluTypes(Integer xiaofeijiluTypes) {
        this.xiaofeijiluTypes = xiaofeijiluTypes;
    }
    /**
	 * 设置：消费金额
	 */
    public Double getXiaofeijiluNewMoney() {
        return xiaofeijiluNewMoney;
    }


    /**
	 * 获取：消费金额
	 */

    public void setXiaofeijiluNewMoney(Double xiaofeijiluNewMoney) {
        this.xiaofeijiluNewMoney = xiaofeijiluNewMoney;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：消费详情
	 */
    public String getXiaofeijiluText() {
        return xiaofeijiluText;
    }


    /**
	 * 获取：消费详情
	 */

    public void setXiaofeijiluText(String xiaofeijiluText) {
        this.xiaofeijiluText = xiaofeijiluText;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间 show3 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show3 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
