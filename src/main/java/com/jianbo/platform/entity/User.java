package com.jianbo.platform.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * 用户信息基本表
 */
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Long id;
	private String userId;
	private String nick;
	private String pass;
	private String phone;
	private String male;
	private String position;
	private String company;
	private String sign;
	private String mail;
	private Integer isBindMail;
	private String realName;
	private String graduateSchool;
	private Date entranceDate;
	private String education;
	private String schoolCertify;
	private Integer errCount;
	private String deviceId;
	private String isVerify;
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

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMale() {
		return male;
	}

	public void setMale(String male) {
		this.male = male;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Integer getIsBindMail() {
		return isBindMail;
	}

	public void setIsBindMail(Integer isBindMail) {
		this.isBindMail = isBindMail;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getGraduateSchool() {
		return graduateSchool;
	}

	public void setGraduateSchool(String graduateSchool) {
		this.graduateSchool = graduateSchool;
	}

	public Date getEntranceDate() {
		return entranceDate;
	}

	public void setEntranceDate(Date entranceDate) {
		this.entranceDate = entranceDate;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getSchoolCertify() {
		return schoolCertify;
	}

	public void setSchoolCertify(String schoolCertify) {
		this.schoolCertify = schoolCertify;
	}

	public Integer getErrCount() {
		return errCount;
	}

	public void setErrCount(Integer errCount) {
		this.errCount = errCount;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getIsVerify() {
		return isVerify;
	}

	public void setIsVerify(String isVerify) {
		this.isVerify = isVerify;
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
		return "User{" +
			", id=" + id +
			", userId=" + userId +
			", nick=" + nick +
			", pass=" + pass +
			", phone=" + phone +
			", male=" + male +
			", position=" + position +
			", company=" + company +
			", sign=" + sign +
			", mail=" + mail +
			", isBindMail=" + isBindMail +
			", realName=" + realName +
			", graduateSchool=" + graduateSchool +
			", entranceDate=" + entranceDate +
			", education=" + education +
			", schoolCertify=" + schoolCertify +
			", errCount=" + errCount +
			", deviceId=" + deviceId +
			", isVerify=" + isVerify +
			", isDelte=" + isDelte +
			", createTime=" + createTime +
			", modefyTime=" + modefyTime +
			"}";
	}
}
