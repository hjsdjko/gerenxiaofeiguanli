package com.entity.model;

import com.entity.XiaofeijiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 消费记录
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XiaofeijiluModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 标题
     */
    private String xiaofeijiluName;


    /**
     * 消费类型
     */
    private Integer xiaofeijiluTypes;


    /**
     * 消费金额
     */
    private Double xiaofeijiluNewMoney;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 消费详情
     */
    private String xiaofeijiluText;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show3 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：标题
	 */
    public String getXiaofeijiluName() {
        return xiaofeijiluName;
    }


    /**
	 * 设置：标题
	 */
    public void setXiaofeijiluName(String xiaofeijiluName) {
        this.xiaofeijiluName = xiaofeijiluName;
    }
    /**
	 * 获取：消费类型
	 */
    public Integer getXiaofeijiluTypes() {
        return xiaofeijiluTypes;
    }


    /**
	 * 设置：消费类型
	 */
    public void setXiaofeijiluTypes(Integer xiaofeijiluTypes) {
        this.xiaofeijiluTypes = xiaofeijiluTypes;
    }
    /**
	 * 获取：消费金额
	 */
    public Double getXiaofeijiluNewMoney() {
        return xiaofeijiluNewMoney;
    }


    /**
	 * 设置：消费金额
	 */
    public void setXiaofeijiluNewMoney(Double xiaofeijiluNewMoney) {
        this.xiaofeijiluNewMoney = xiaofeijiluNewMoney;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：消费详情
	 */
    public String getXiaofeijiluText() {
        return xiaofeijiluText;
    }


    /**
	 * 设置：消费详情
	 */
    public void setXiaofeijiluText(String xiaofeijiluText) {
        this.xiaofeijiluText = xiaofeijiluText;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show3 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
