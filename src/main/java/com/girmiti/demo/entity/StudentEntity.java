package com.girmiti.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class StudentEntity 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sId;
	private String sName;
	private long sPhno;
	public int getsId() {
		return sId;
	}
	
	public StudentEntity()
	{}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public long getsPhno() {
		return sPhno;
	}
	public void setsPhno(long sPhno) {
		this.sPhno = sPhno;
	}
	@Override
	public String toString() {
		return "StudentEntity [sId=" + sId + ", sName=" + sName + ", sPhno=" + sPhno + "]";
	}
	public StudentEntity(String sName, long sPhno) {
		this.sName = sName;
		this.sPhno = sPhno;
	}
	
}
