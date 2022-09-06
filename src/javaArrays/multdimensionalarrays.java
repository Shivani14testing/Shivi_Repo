package javaArrays;

public class multdimensionalarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a [][]= new int [3][2];
		//use this method when u know size . how to declare variable
	/*	a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;  */
		
		//if size not define we declare this way
		
	int a[][]={ {100,200},{200,300},{300,400},{500,600}};
		
		System.out.println(a.length);    // to find size of row in multidimensional
		System.out.println(a[0]. length);  // to find size of coloum 
		
		//to read multidimensional array . nested for loop
		
		for (int i=0; i<a.length;i++)
		{for (int j =0;j<a[i].length;j++)
		
		
		System.out.println(a[i][j]);
		}}

	}
	


