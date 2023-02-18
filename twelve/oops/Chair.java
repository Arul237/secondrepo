package com.onesoft.twelve.oops;


	public class Chair implements Furniture{
		public void material() {
			System.out.println("the material");
		}
		public void style(String style) {
			if(style.equalsIgnoreCase("wood")) {
			System.out.println("same style");
			}
			else {
				System.out.println("steel");
			}}
			public void chairName(String wow) {
				System.out.println("the chair name");
		}
	}


