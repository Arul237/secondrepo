package com.onesoft.second;

public class Usestudent {
public static void main(String[] args) {
	Student detail= new Student();
	detail.name="Arul";
	detail.rollnumber=125;
	detail.tamilmark=25;
	detail.english=45;
	detail.maths=45;
	detail.physics=45;
	detail.chemistry=45;
	detail.biology=56;
	detail.total=detail.tamilmark+detail.english+detail.maths+detail.physics+detail.chemistry+detail.biology;
	detail.average=detail.total/6;
	System.out.println("Name="+" "+detail.name+ " "+"Average="+detail.average);
	Student detail1= new Student();
	detail1.name="dinesh";
	detail1.rollnumber=145;
	detail1.tamilmark=85;
	detail1.english=95;
	detail1.maths=80;
	detail1.physics=82;
	detail1.chemistry=85;
	detail1.biology=70;
	detail1.total=detail1.tamilmark+detail1.english+detail1.maths+detail1.physics+detail1.chemistry+detail1.biology;
	detail1.average=detail.total/6;
	System.out.println("Name="+" "+detail1.name+ " "+"Average="+detail1.average);
	
}
}
