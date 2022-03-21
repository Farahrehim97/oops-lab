package controlsttmnt;

public class q1_co1 {

	String pcode,pname;
	float price;
	
	public q1_co1(String pcode,String pname,float price)
	{
		this.pcode=pcode;
		this.pname=pname;
		this.price=price;
	}
	
	public static void main(String args[])
	{
		q1_co1 p1=new q1_co1("#p001","brush",50);
		q1_co1 p2=new q1_co1("#p002","paste",90);
		q1_co1 p3=new q1_co1("#p003","floss",20);
		System.out.println("Product 1");
		System.out.println("Pcode: "+p1.pcode+" Pname: "+p1.pname+" Price: "+p1.price);
		System.out.println("Product 2");
		System.out.println("Pcode: "+p2.pcode+" Pname: "+p2.pname+" Price: "+p2.price);
		System.out.println("Product 3");
		System.out.println("Pcode: "+p3.pcode+" Pname: "+p3.pname+" Price: "+p3.price);
		System.out.println("Product with lowest price");
		if(p1.price<p2.price && p1.price<p2.price)
		{
			System.out.println(p1.pname+" : "+p1.price);
		}
		if(p2.price<p3.price)
		{
			System.out.println(p2.pname+" : "+p2.price);
		}
		else
		{
			System.out.println(p3.pname+" : "+p3.price);
		}
	}
}
