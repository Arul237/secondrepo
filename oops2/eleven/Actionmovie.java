package com.onesoft.oops2.eleven;

public class Actionmovie extends Movie {
public String getFight(int fight) {
	if(fight>=4 && fight<=7) {
		return "good ";
	}
	else if(fight<7){
		return "bad";
	}
	else {
		return "no fight";
	}
	
}
}
