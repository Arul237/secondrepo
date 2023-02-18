package com.onesoft.twelve.oops;

public class UseEngineer {
public static void main(String[] args) {                         //interface
	Engineering en=new Engineering();
	System.out.println(en.printCourse("course")+en.findFees("course")+en.printDuration("course"));
}
}
interface Course {
	public String printCourse(String course) ;
	public int 	findFees(String course);
	public String printDuration(String degree);
	}
class Engineering implements Course{
	public String printCourse(String course) {
		return course;
	}
		public int 	findFees(String course) {
		if(course.equalsIgnoreCase("Engineering")) {
			return 150000;
		}
		else if(course.equalsIgnoreCase("Medical")) {
		return 300000;
		}
		else if(course.equalsIgnoreCase("others")) {
			return 50000;
		}
		else {
			return 0;
		}}
		public String printDuration(String degree) {
			if("Engineering".equalsIgnoreCase("Engineering")) {
				return "4yeras ";
			}
			else if(degree.equalsIgnoreCase("Medical")) {
			return "5years";
			}
			else if(degree.equalsIgnoreCase("others")) {
				return "1years";
			}
			else {
				return "3years";
		}
		}
	}

