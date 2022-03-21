package controlsttmnt;
import java.util.*;
public class q3_co1 {
	
	public static void main(String args[])
	{
		int r1,r2,rs,i1,i2,is;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first complex number");
		System.out.println("enter the real part");
		r1=sc.nextInt();
		System.out.println("enter the imaginery part");
		i1=sc.nextInt();
		System.out.println(r1+" + "+i1+"i");
		System.out.println("enter the second complex number");
		System.out.println("enter the real part");
		r2=sc.nextInt();
		System.out.println("enter the imaginery part");
		i2=sc.nextInt();
		System.out.println(r2+" + "+i2+"i");
		System.out.println("Sum of two complex number :");
		rs=r1+r2;
		is=i1+i2;
		System.out.println(rs+" + "+is+"i");
		
	}

}
