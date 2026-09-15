package encaps;

import java.util.Scanner;

class pro5
{
	public String sname;
	public int sid;
	public int smark;
	public String getSname()
	{
		return sname;
	}
	public void setSname(String sname)
	{
		this.sname=sname;
	}
	public int getSid()
	{
		return sid;
	}
	public void setSid(int sid)
	{
		this.sid = sid;
	}
	public int getMark()
	{
		return smark;
	}
	public void setMark(int smark)
	{
		this.smark= smark;
	}
}

public class Enclass5 extends pro5 {

	public static void main(String[] args) {
		Enclass5 e= new Enclass5();
		Scanner s=new Scanner(System.in);
		String a;
		int b,c;
		System.out.println("Student ID: ");
		b=s.nextInt();
		System.out.println("Student name: ");
		a=s.next();
		System.out.println("Student mark: ");
		c=s.nextInt();
		e.setSname(a);
		e.setSid(b);
		e.setMark(c);
		System.out.println("Student name: "+e.getSname());
		System.out.println("Student Id: "+e.getSid());		
		System.out.println("Student Mark: "+e.getMark());
	}

}
