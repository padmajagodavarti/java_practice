package com.anjaas.mypackpg2;
import com.anjaas.mypackpg.Packprc1;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Packprc2
{
	public void currentdate()
	{
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("MMddYYYYHHmmss");  
		System.out.println("The current date is :" +formatter.format(date));
	}
	public int subtr(int t,int u)
	{
		int v = t-u;
		System.out.println("The subtraction is :"+v);
		return v;
	}
	public static void main(String [] args)
	{
		Packprc2 pp2=new Packprc2();
		pp2.currentdate();
		pp2.subtr(28,18);
		Packprc1.multiply(3,4);
		
	}
}