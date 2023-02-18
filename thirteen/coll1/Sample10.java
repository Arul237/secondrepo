package com.onesoft.thirteen.coll1;

import java.util.ArrayList;

public class Sample10 {
	
		public static void main(String[] args) {
			Stuudent b1=new Stuudent("Arul",false,22,"physics");
			Stuudent b2=new Stuudent("malathi",true,21,"maths");
			Stuudent b3=new Stuudent("Gopi",false,23,"english");
			Stuudent b4=new Stuudent("devi", true,22,"botany");
			ArrayList<Stuudent> stu=new ArrayList<>();
			stu.add(b1);
			stu.add(b2);
			stu.add(b3);
			stu.add(b4);  // list too list
			ArrayList<Stuudent> maleList=new ArrayList<>();
			for(Stuudent c:stu) {
				if(c.getIsMale()==true) {
					maleList.add(c);
				}
			}
			maleList.forEach(x-> System.out.println(x)) ;
			
			ArrayList<Stuudent> subj=new ArrayList<>();
			for(Stuudent c:stu) {
				if(c.getSubject().equalsIgnoreCase("botany")) {
					subj.add(c);
				}
			}
			subj.forEach(x-> System.out.println(x)) ;
			
	}}
	class Stuudent {
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
		public Stuudent(String studentname,boolean isMale,int age,String subject){
			this.studentname=studentname;
			this.isMale=isMale;
			this.age=age;
			
			this.subject=subject;
		}
			public String toString() {
				return studentname+isMale+age+subject;
		}
	}





