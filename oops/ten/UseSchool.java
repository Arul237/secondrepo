package com.onesoft.oops.ten;

public class UseSchool {

	public static void main(String[] args) {
	School s1=new School();
	s1.setName("arul");
	s1.setlocation("chennai");
	s1.setnoOfStudents(5000);
	s1.setisGovernment(false);
System.out.println(s1.getName()+" "+ s1.getlocation()+" "+s1.getnoOfStudents()+" "+s1.getisGovernment());
	}

}
class School{
	private String name;                                              // encapsulation
	private String location ;
	private int noOfStudents;
	private boolean isGovernment;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setlocation (String location) {
		this.location=location;
		
	}
	public String getlocation() {
		return location;
	}
	public void setnoOfStudents(int noOfStudents) {
		this.noOfStudents=noOfStudents;
	}
	public int getnoOfStudents() {
		return noOfStudents;
	}
	public void setisGovernment(boolean isGovernment) {
		this.isGovernment=isGovernment;
	}
	public boolean getisGovernment() {
		return isGovernment;
	}
	
}