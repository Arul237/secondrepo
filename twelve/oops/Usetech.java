package com.onesoft.twelve.oops;

public class Usetech {                                       //implements
	
		public static void main(String[] args) {
			Onrol on=new Onrol();
			System.out.println(on.showSalary("")+on.showDesignation(null)+on.permanentEmployee(false));
			
		}
	}
	 interface Employee {
	public String showSalary(String designation);
	public String showDesignation(String desination);
	public String permanentEmployee(boolean isPermanent);
	}
	 class Onrol implements Employee {
		public String showSalary(String designation) {
			if("hr".equalsIgnoreCase("hr")) {
			return "75000";
		}
			else if(	"tl".equalsIgnoreCase("tl")) {
			return "55000";
			}
			else if("developer".equalsIgnoreCase("developer")) {
			return "35000";
			}
			else  {
				return "25000";
			}}
		public String showDesignation(String designation) {
			return designation;
		}
		public String permanentEmployee(boolean isPermanent) {
			if(isPermanent==true) {
				return "its is a permanent employee";
			}
			else {
				return "not permanent employee";
				
			}
		}		
	}



