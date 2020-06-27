package com.techinfuse.day1;


class Doctor1{
	public void eatFood() {
		System.out.println("Doctor eating food");
	}	
}


class Surgeon1 extends Doctor{
	
	public void eatFood() {
		System.out.println("Surgeon eating food");
	}
}

public class TestOverride2 {
	
	public static void main(String[] args) {
		Surgeon1 s = new Surgeon1();
		s.eatFood();
		
	}

}
