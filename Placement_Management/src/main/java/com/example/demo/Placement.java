package com.example.demo;



import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Placement 
{
	@Id
	private Integer id;
	private String name;
	private String qualification;
	private Integer year;
	
	//Default Constructor
	public Placement() {
		super();
		// TODO Auto-generated constructor stub
	}
    //Parameterised Constructor
	public Placement(Integer id, String name, String qualification, Integer year) {
		super();
		this.id = id;
		this.name = name;
		this.qualification = qualification;
		this.year = year;
	}
	//Getter and Setter method
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	//ToString Method
	@Override
	public String toString() {
		return "Placement [id=" + id + ", name=" + name + ", qualification=" + qualification
				+ ", year=" + year + "]";
	}
	
	
	
	
	

}
