package com.techinfuse.day1;

class Doctor {

	 void Doctor_Details() {
	  System.out.println("Doctor Details...");
	 }
	}

	class Surgeon extends Doctor {
	 void Surgeon_Details() {
	  System.out.println("Surgen Detail...");
	 }
	}

	public class Hospital {
	 public static void main(String args[]) {
	  Surgeon s = new Surgeon();
	  s.Surgeon_Details();
	  s.Doctor_Details();

	 }
	}
