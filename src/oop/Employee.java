package oop;

public class Employee {
	
	
		// TODO Auto-generated method stub
		
		int eid;
		String ename;
		double sal;
		int deptno;
		String job;                
	
		
	void display()
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(sal);
		System.out.println(job);        
	}    
	
    public static void main(String[] args) {		
		Employee emp1 =new Employee();	
		emp1.eid = 101;
		emp1.ename = "Rajesh";
		emp1.sal = 250000;
		emp1.deptno = 01;
		emp1.job = "Manager";
		emp1.display();
		
		Employee emp2 = new Employee();
		emp2.eid = 102 ;
		emp2.ename = "Satish";
		emp2.sal = 550000;
		emp2.deptno = 02;
		emp2.job = " Area Manager";
		emp2.display();
    }
	
		
	
	
		
	}


