  package com.onesoft.thirteen.coll1;

import java.util.ArrayList;

public class Sample9 {
	public static void main(String[] args) {
		Student b1=new Student("Arul",false,22,"physics");
		Student b2=new Student("malathi",true,21,"maths");
		Student b3=new Student("Gopi",false,23,"english");
		Student b4=new Student("devi", true,22,"botany");
		ArrayList<Student> stu=new ArrayList<>();
		stu.add(b1);
		stu.add(b2);
		stu.add(b3);
		stu.add(b4);  // list too list
		ArrayList<Student> maleList=new ArrayList<>();
		for(Student c:stu) {
			if(c.getIsMale()==true) {
				maleList.add(c);
			}
		}
		maleList.forEach(x-> System.out.println(x)) ;
}}
class Student {
	String studentname;
	boolean isMale;
	int age; 
	String subject;
	public void setStudentname(String studentname) {
		this.studentname=studentname;
	}
	public String getStudentname() {
		return  studentname;
	}
	public void setIsMale(boolean isMale) {
		this.isMale=isMale;
	}
	public boolean getIsMale() {
		return  isMale;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return  age;
	}
	public void setSubject(String subject) {
		this.subject=subject;
	}
	public String getSubject() {
		return subject;
	}
	public Student(String studentname,boolean isMale,int age,String subject){
		this.studentname=studentname;
		this.isMale=isMale;
		this.age=age;
		
		this.subject=subject;
	}
		public String toString() {
			return studentname+isMale+age+subject;
	}
}



