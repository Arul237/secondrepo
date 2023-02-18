package com.onesoft.fourteen.coll2;

public class State {
String name;
String code;
String language;
String capital;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
public String getLanguage() {
	return language;
}
public void setLanguage(String language) {
	this.language = language;
}
public String getCapital() {
	return capital;
}
public void setCapital(String capital) {
	this.capital = capital;
}
public State(String name,String code,String language,String capital) {
	this.name=name;
	this.code=code;
	this.language=language;
	this.capital=capital;
}
public String toString() {
	return name+code+language+capital;
}
}
