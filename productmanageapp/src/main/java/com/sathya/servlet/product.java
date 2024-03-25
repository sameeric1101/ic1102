package com.sathya.servlet;

import java.io.InputStream;
import java.sql.Date;
import java.util.Base64;

public class product {
	
	private String proId;
	private String proName;

	private double proprice;

	private String proBrand;

	private String promadein;

	private Date promfgdate;
	private Date proexpdate;
	private Date proImage;
	public String getProId() {
		return proId;
	}
	public void setProId(String proId) {
		this.proId = proId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public double getProprice() {
		return proprice;
	}
	public void setProprice(double proprice) {
		this.proprice = proprice;
	}
	public String getProBrand() {
		return proBrand;
	}
	public void setProBrand(String proBrand) {
		this.proBrand = proBrand;
	}
	public String getPromadein() {
		return promadein;
	}
	public void setPromadein(String promadein) {
		this.promadein = promadein;
	}
	public Date getPromfgdate() {
		return promfgdate;
	}
	public void setPromfgdate(Date promfgdate) {
		this.promfgdate = promfgdate;
	}
	public Date getProexpdate() {
		return proexpdate;
	}
	public void setProexpdate(Date proexpdate) {
		this.proexpdate = proexpdate;
	}
	public Date getProImage() {
		return proImage;
	}
	public void setProImage(Date proImage) {
		this.proImage = proImage;
	}
	public void setProImage(byte[] bytes) {
		// TODO Auto-generated method stub
		
	}
	
		
	}
	
	
	