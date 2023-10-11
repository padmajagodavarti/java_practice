package com.anjaas.mypackpg;
/*
* My first comment
*/
public class Packprc1
{
	static int st=10;
	public int addition(int a,int b)
	{
		int c =a+b;
		System.out.println("The value of addition is :" +c);
		return c;
	}
	public static int multiply(int x,int y)
	{
		int z = x*y;
		System.out.println("The value of multiplication is :" +z);
		return z;
	}
	public static void main(String [] args)
	{
		Packprc1 pp1=new Packprc1();
		pp1.addition(45,55);
		System.out.println("The value is :"+Packprc1.st);
		Packprc1.multiply(12,8);
	}
	
}
