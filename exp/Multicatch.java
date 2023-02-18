package com.onesoft.exp;

public class Multicatch {

	public static void main(String[] args) throws InterruptedException,ArrayIndexOutOfBoundsException {
		String[] b={"aas","asrr"};
		try {
			for(int i=0;i<=b.length;i++) {
				System.out.println(b[i]);
			}}
		catch(ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
				Thread.sleep(5678);
				throw new ArrayIndexOutOfBoundsException("yews");
			}
		catch(StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
				System.out.println("invalid");
			}
		}
	}


