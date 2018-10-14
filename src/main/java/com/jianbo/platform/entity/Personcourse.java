package com.jianbo.platform.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * 我的课程表
 */
public class Personcourse extends Model<Personcourse> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Long id;
	private String userId;
	private String courseId;
	private String progress;
	private String readDuration;
	private String lastReadChapterId;
	private String lastReadChapterTime;
	private Date date;
	private String isPurchased;
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

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getProgress() {
		return progress;
	}

	public void setProgress(String progress) {
		this.progress = progress;
	}

	public String getReadDuration() {
		return readDuration;
	}

	public void setReadDuration(String readDuration) {
		this.readDuration = readDuration;
	}

	public String getLastReadChapterId() {
		return lastReadChapterId;
	}

	public void setLastReadChapterId(String lastReadChapterId) {
		this.lastReadChapterId = lastReadChapterId;
	}

	public String getLastReadChapterTime() {
		return lastReadChapterTime;
	}

	public void setLastReadChapterTime(String lastReadChapterTime) {
		this.lastReadChapterTime = lastReadChapterTime;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getIsPurchased() {
		return isPurchased;
	}

	public void setIsPurchased(String isPurchased) {
		this.isPurchased = isPurchased;
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
		return "Personcourse{" +
			", id=" + id +
			", userId=" + userId +
			", courseId=" + courseId +
			", progress=" + progress +
			", readDuration=" + readDuration +
			", lastReadChapterId=" + lastReadChapterId +
			", lastReadChapterTime=" + lastReadChapterTime +
			", date=" + date +
			", isPurchased=" + isPurchased +
			", isDelte=" + isDelte +
			", createTime=" + createTime +
			", modefyTime=" + modefyTime +
			"}";
	}
}
