package com.jianbo.platform.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * 用户学习课程信息表
 */
public class Userstudyinfo extends Model<Userstudyinfo> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Long id;
	private String userId;
	private Integer courseCount;
	private Long leanTime;
	private Long experienceValue;
	private String level;
	private Integer isDelte;
	private Date createTime;
	private Date modefyTime;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getCourseCount() {
		return courseCount;
	}

	public void setCourseCount(Integer courseCount) {
		this.courseCount = courseCount;
	}

	public Long getLeanTime() {
		return leanTime;
	}

	public void setLeanTime(Long leanTime) {
		this.leanTime = leanTime;
	}

	public Long getExperienceValue() {
		return experienceValue;
	}

	public void setExperienceValue(Long experienceValue) {
		this.experienceValue = experienceValue;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public Integer getIsDelte() {
		return isDelte;
	}

	public void setIsDelte(Integer isDelte) {
		this.isDelte = isDelte;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModefyTime() {
		return modefyTime;
	}

	public void setModefyTime(Date modefyTime) {
		this.modefyTime = modefyTime;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Userstudyinfo{" +
			", id=" + id +
			", userId=" + userId +
			", courseCount=" + courseCount +
			", leanTime=" + leanTime +
			", experienceValue=" + experienceValue +
			", level=" + level +
			", isDelte=" + isDelte +
			", createTime=" + createTime +
			", modefyTime=" + modefyTime +
			"}";
	}
}
