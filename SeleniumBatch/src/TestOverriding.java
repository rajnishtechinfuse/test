class Doctor{
  public void treatPatient(){
  // treatPatient method
  System.out.println("inside Doctor ");
  }
}


class Surgeon extends Doctor{
  public void treatPatient(){
  // treatPatient method
	  System.out.println("inside Surgeon ");
  }
}


class TestOverriding{
  public static void main (String args[]){
    Doctor doctorObj = new Doctor();
	// treatPatient method in class Doctor will be executed
    doctorObj.treatPatient();
   
    Surgeon surgeonObj = new Surgeon();
    // treatPatient  method in class Surgeon  will be executed
    surgeonObj.treatPatient();
  }
}