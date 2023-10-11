public class PracticeStr
{
	String s1= "Today is Monday";
	String st="Padmaja";
	public void  pracstring()
	{
		String s2= "Tomorrow is Tuesday";
		System.out.println(s2);
		char s3=s1.charAt(3);
		System.out.println(s3);
		String s4= s1.substring(9,15);
		System.out.println(s4);
		String s5= s2.substring(8);
		System.out.println(s5);
		int x=s1.lastIndexOf("y");
		System.out.println(x);
		int y = s2.lastIndexOf("t");
		System.out.println(y);
		String s6 = s4.concat(s5);
		System.out.println(s6);
		int x1= s4.compareTo(s5);
		if(x1==0)
		{
				System.out.println("The strings are same");
		}
		else
		{
			System.out.println("The strings are not same");
		}
	}
	public void reverse()
		{
			String r="  ";
			for(int i=0;i<=st.length()-1;i++)
			{
				char ns=st.charAt(i);
				r= ns+r;
			}
				System.out.println("The reverse string is :"+r);
			
		}
	public int addition1(int d,int e)
		{
			int f = d+e;
			System.out.println("The addition is : " +f);
			return f;
		}
	public void trycatch()
	{
		try
		{
			String tc="		Padmaja		";
			String tc1=tc.trim();
			System.out.println("The text is :"+tc1);
		}
		catch(Exception e)
		{
			System.out.println("The error is thrown");
			e.printStackTrace();
		}
	}
		
	
	public static void main(String [] args)
	{
		PracticeStr pst1=new PracticeStr();
		int a=5;
		System.out.println(a);
		System.out.println(pst1.s1);
		pst1.pracstring();
		pst1.reverse();
		pst1.addition1(4,5);
		pst1.trycatch();
		
	}
}