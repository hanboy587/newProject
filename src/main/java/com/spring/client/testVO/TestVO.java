package com.spring.client.testVO;

import org.apache.ibatis.type.Alias;

@Alias("test")
public class TestVO {
	private String aa;
	private String bb;
	public String getAa() {
		return aa;
	}
	public void setAa(String aa) {
		this.aa = aa;
	}
	public String getBb() {
		return bb;
	}
	public void setBb(String bb) {
		this.bb = bb;
	}
	
	@Override
	public String toString() {
		return "TestVO [aa=" + aa + ", bb=" + bb + "]";
	}
	
}
