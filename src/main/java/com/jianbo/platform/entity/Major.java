package com.jianbo.platform.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * 微专业信息基本表
 */
public class Major extends Model<Major> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Long id;
	private String majorId;
	private String courseType;
	private String module1;
	private String module2;
	private String module3;
	private String module4;
	private String module5;
	private String module6;
	private String module7;
	private String module8;
	private String module9;
	private String module10;
	private String module11;
	private String module12;
	private String module13;
	private String module14;
	private String module15;
	private String module16;
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

	public String getModule1() {
		return module1;
	}

	public void setModule1(String module1) {
		this.module1 = module1;
	}

	public String getModule2() {
		return module2;
	}

	public void setModule2(String module2) {
		this.module2 = module2;
	}

	public String getModule3() {
		return module3;
	}

	public void setModule3(String module3) {
		this.module3 = module3;
	}

	public String getModule4() {
		return module4;
	}

	public void setModule4(String module4) {
		this.module4 = module4;
	}

	public String getModule5() {
		return module5;
	}

	public void setModule5(String module5) {
		this.module5 = module5;
	}

	public String getModule6() {
		return module6;
	}

	public void setModule6(String module6) {
		this.module6 = module6;
	}

	public String getModule7() {
		return module7;
	}

	public void setModule7(String module7) {
		this.module7 = module7;
	}

	public String getModule8() {
		return module8;
	}

	public void setModule8(String module8) {
		this.module8 = module8;
	}

	public String getModule9() {
		return module9;
	}

	public void setModule9(String module9) {
		this.module9 = module9;
	}

	public String getModule10() {
		return module10;
	}

	public void setModule10(String module10) {
		this.module10 = module10;
	}

	public String getModule11() {
		return module11;
	}

	public void setModule11(String module11) {
		this.module11 = module11;
	}

	public String getModule12() {
		return module12;
	}

	public void setModule12(String module12) {
		this.module12 = module12;
	}

	public String getModule13() {
		return module13;
	}

	public void setModule13(String module13) {
		this.module13 = module13;
	}

	public String getModule14() {
		return module14;
	}

	public void setModule14(String module14) {
		this.module14 = module14;
	}

	public String getModule15() {
		return module15;
	}

	public void setModule15(String module15) {
		this.module15 = module15;
	}

	public String getModule16() {
		return module16;
	}

	public void setModule16(String module16) {
		this.module16 = module16;
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
		return "Major{" +
			", id=" + id +
			", majorId=" + majorId +
			", courseType=" + courseType +
			", module1=" + module1 +
			", module2=" + module2 +
			", module3=" + module3 +
			", module4=" + module4 +
			", module5=" + module5 +
			", module6=" + module6 +
			", module7=" + module7 +
			", module8=" + module8 +
			", module9=" + module9 +
			", module10=" + module10 +
			", module11=" + module11 +
			", module12=" + module12 +
			", module13=" + module13 +
			", module14=" + module14 +
			", module15=" + module15 +
			", module16=" + module16 +
			", isDelte=" + isDelte +
			", createTime=" + createTime +
			", modefyTime=" + modefyTime +
			"}";
	}
}
