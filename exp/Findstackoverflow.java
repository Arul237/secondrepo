package com.onesoft.exp;

public class Findstackoverflow {
public void findA() {
	findB();
}
public void findB() {
	findA();
}
public static void main(String[] args) {
	Findstackoverflow of=new Findstackoverflow();
	of.findA();

}
}
