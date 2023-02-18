package com.onesoft.oops.ten;

public class UseCollege {

	public static void main(String[] args) {                             //encapsulation
		Course co=new Course(1234,false,"BA");
		College c1=new College("kongu",125,"perundurai",co);
        System.out.println(c1);
	}

}
class College{
	private String name;
	private int noOfStudent;
	private String location;
	private Course course ;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setnoOfStudent(int noOfStudent) {
		this.noOfStudent=noOfStudent;
	}
	public int getnoOfStudent() {
		return noOfStudent;
	}
	public void setLocation(String location) {
		this.location=location;
	}
	public String getLocation() {
		return location;
	}
	public void setCourse(Course course) {
		this.course=course;
	}
	public Course getcourse() {
		return course;
	}
	public College(String name,int noOfStudent,String location,Course course) {
		this.name=name;
		this.noOfStudent=noOfStudent;
		this.location=location;
		this.course=course;
	
	}
	public String toString() {
		return "name="+name+", noOfStudent="+noOfStudent+", location="+location+", course="+course;
	}
	
}
class Course{
	int fees;
	boolean isArts;
	String name;
	public void setfees(int fees) {
		this.fees=fees;
	}
	public int getfees() {
		return fees;
	}
    public void setisArts(boolean isArts) {
			this.isArts=isArts;
		}
		
    public boolean getisArts() {
			return isArts;
    }
    public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
}
	public Course(int fees,boolean isArts,String name) {
		this.fees=fees;
		this.isArts=isArts;
		this.name=name;
	}
	public String toString() {
		return ", fees="+fees+", isArts="+isArts+", name="+name;
	}
}
