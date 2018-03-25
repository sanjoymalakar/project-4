package oop.encapsulation;

public class TestStudent {

	public static void main(String[] args) {
	Student st1 = new Student();
    st1.setStID(101);
	st1.setStName("sanjoy");
    st1.setStDOB("07-17-1990");
  System.out.println(st1.getStID() +" "+st1.getStName()+" "+st1.getStDOB());
		  
    
	}
}