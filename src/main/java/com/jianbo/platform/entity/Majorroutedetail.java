package com.jianbo.platform.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * 微专业路线详细信息表
 */
public class Majorroutedetail extends Model<Majorroutedetail> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Long id;
	private String majorId;
	private String courseType;
	private String routeId;
	private String routeName;
	private String adaptPersion;
	private Float expectCoursePrice;
	private Float realCoursePrice;
	private Integer isDelte;
	private Date createTime;
	private Date modefyTime;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMajorId() {
		return majorId;
	}

	public void setMajorId(String majorId) {
		this.majorId = majorId;
	}

	public String getCourseType() {
		return courseType;
	}

	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}

	public String getRouteId() {
		return routeId;
	}

	public void setRouteId(String routeId) {
		this.routeId = routeId;
	}

	public String getRouteName() {
		return routeName;
	}

	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}

	public String getAdaptPersion() {
		return adaptPersion;
	}

	public void setAdaptPersion(String adaptPersion) {
		this.adaptPersion = adaptPersion;
	}

	public Float getExpectCoursePrice() {
		return expectCoursePrice;
	}

	public void setExpectCoursePrice(Float expectCoursePrice) {
		this.expectCoursePrice = expectCoursePrice;
	}

	public Float getRealCoursePrice() {
		return realCoursePrice;
	}

	public void setRealCoursePrice(Float realCoursePrice) {
		this.realCoursePrice = realCoursePrice;
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
		return "Majorroutedetail{" +
			", id=" + id +
			", majorId=" + majorId +
			", courseType=" + courseType +
			", routeId=" + routeId +
			", routeName=" + routeName +
			", adaptPersion=" + adaptPersion +
			", expectCoursePrice=" + expectCoursePrice +
			", realCoursePrice=" + realCoursePrice +
			", isDelte=" + isDelte +
			", createTime=" + createTime +
			", modefyTime=" + modefyTime +
			"}";
	}
}
