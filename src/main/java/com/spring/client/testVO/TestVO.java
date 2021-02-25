package com.spring.client.testVO;

import java.util.Date;

import org.apache.ibatis.type.Alias;

@Alias("test")
public class TestVO {
	private int member_no;
	private String member_name;
	private String member_id;
	private String member_passwd;
	private Date member_birth;
	private String member_phone;
	
	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	public int getMember_no() {
		return member_no;
	}
	public void setMember_no(int member_no) {
		this.member_no = member_no;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getMember_passwd() {
		return member_passwd;
	}
	public void setMember_passwd(String member_passwd) {
		this.member_passwd = member_passwd;
	}
	public Date getMember_birth() {
		return member_birth;
	}
	public void setMember_birth(Date member_birth) {
		this.member_birth = member_birth;
	}
	public String getMember_phone() {
		return member_phone;
	}
	public void setMember_phone(String member_phone) {
		this.member_phone = member_phone;
	}
	
	@Override
	public String toString() {
		return "TestVO [member_no=" + member_no + ", member_id=" + member_id + ", member_passwd=" + member_passwd
				+ ", member_birth=" + member_birth + ", member_phone=" + member_phone + "]";
	}
	
	
}
