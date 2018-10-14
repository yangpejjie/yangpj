package com.jianbo.platform.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * 课程信息表
 */
public class Course extends Model<Course> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Long id;
	private String courseId;
	private String courseName;
	private String courseType;
	private String courseLevel;
	private String courseState;
	private String userId;
	private String userName;
	private Double expectCoursePrice;
	private Double realCoursePrice;
	private String introduction;
	private String coursePicture;
	private String videoIntroduction;
	private Date reserveDate;
	private Date realDate;
	private String isVerify;
	private String state;
	private Integer isDelte;
	private Date createTime;
	private Date modefyTime;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseType() {
		return courseType;
	}

	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}

	public String getCourseLevel() {
		return courseLevel;
	}

	public void setCourseLevel(String courseLevel) {
		this.courseLevel = courseLevel;
	}

	public String getCourseState() {
		return courseState;
	}

	public void setCourseState(String courseState) {
		this.courseState = courseState;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Double getExpectCoursePrice() {
		return expectCoursePrice;
	}

	public void setExpectCoursePrice(Double expectCoursePrice) {
		this.expectCoursePrice = expectCoursePrice;
	}

	public Double getRealCoursePrice() {
		return realCoursePrice;
	}

	public void setRealCoursePrice(Double realCoursePrice) {
		this.realCoursePrice = realCoursePrice;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getCoursePicture() {
		return coursePicture;
	}

	public void setCoursePicture(String coursePicture) {
		this.coursePicture = coursePicture;
	}

	public String getVideoIntroduction() {
		return videoIntroduction;
	}

	public void setVideoIntroduction(String videoIntroduction) {
		this.videoIntroduction = videoIntroduction;
	}

	public Date getReserveDate() {
		return reserveDate;
	}

	public void setReserveDate(Date reserveDate) {
		this.reserveDate = reserveDate;
	}

	public Date getRealDate() {
		return realDate;
	}

	public void setRealDate(Date realDate) {
		this.realDate = realDate;
	}

	public String getIsVerify() {
		return isVerify;
	}

	public void setIsVerify(String isVerify) {
		this.isVerify = isVerify;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
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
		return "Course{" +
			", id=" + id +
			", courseId=" + courseId +
			", courseName=" + courseName +
			", courseType=" + courseType +
			", courseLevel=" + courseLevel +
			", courseState=" + courseState +
			", userId=" + userId +
			", userName=" + userName +
			", expectCoursePrice=" + expectCoursePrice +
			", realCoursePrice=" + realCoursePrice +
			", introduction=" + introduction +
			", coursePicture=" + coursePicture +
			", videoIntroduction=" + videoIntroduction +
			", reserveDate=" + reserveDate +
			", realDate=" + realDate +
			", isVerify=" + isVerify +
			", state=" + state +
			", isDelte=" + isDelte +
			", createTime=" + createTime +
			", modefyTime=" + modefyTime +
			"}";
	}
}
