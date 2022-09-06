package javaArrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variable is collection of elements that store same data type
		
		//int a []= new int[5];
		//storing values in the array
		
/*
		a[0]=100;
		a[1]=200;
	    a[2]=300;
		a[3]=400;
		a[4]=500;
	  System.out.println(a[2]);// read specific value
	  length/size of array */
                 
                 int a[] = {100,200,300,400,500};
                 System.out.println(a.length);
		for ( int i:a)
		{
			System.out.println(i);
			
		}
	


}
}
