package com.jianbo.platform.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * 回复表
 */
public class Replay extends Model<Replay> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Long id;
	private String replayId;
	private String adviceID;
	private String userId;
	private String comment;
	private Date sendDate;
	private Integer isDelte;
	private Date createTime;
	private Date modefyTime;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReplayId() {
		return replayId;
	}

	public void setReplayId(String replayId) {
		this.replayId = replayId;
	}

	public String getAdviceID() {
		return adviceID;
	}

	public void setAdviceID(String adviceID) {
		this.adviceID = adviceID;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getSendDate() {
		return sendDate;
	}

	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
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
		return "Replay{" +
			", id=" + id +
			", replayId=" + replayId +
			", adviceID=" + adviceID +
			", userId=" + userId +
			", comment=" + comment +
			", sendDate=" + sendDate +
			", isDelte=" + isDelte +
			", createTime=" + createTime +
			", modefyTime=" + modefyTime +
			"}";
	}
}
