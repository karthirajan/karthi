package org.Hello;


public class CentralBank {
	
	public void empId(int id) {
		System.out.println("emp id is :"+id);
		

	}
	public void empId(String name) {
		System.out.println("emp name is :"+name);
		

	}
	public void empId(long phno) {
		System.out.println("id is :"+phno);
		

	}
	public void empId(int id,String name) {
		System.out.println("id is :"+id +name);
		

	}
	public void empId(String name,long phno) {
		System.out.println("id is :"+name+phno);
		

	}
	public static void main(String[] args) {
		CentralBank c=new CentralBank();
		c.empId(20);
		c.empId(8110069885l);
		c.empId("karthi");
		c.empId(20, "karthi");
	}
	
	
		
		
		


}
