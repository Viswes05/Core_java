package polymorphism;
class bank
{
	int loanamt()
	{
		return 0;
	}
}
class IOB extends bank
{
	int loanamt()
	{
		return 20000;
	}
}
class HDFC extends bank
{
	int loanamt()
	{
		return 50000;
	}
}
class SBI extends bank
{
	int loanamt()
	{
		return 70000;
	}
}
public class Poly3 {

	public static void main(String[] args) {
		bank s;
		s=new HDFC();
		System.out.println("Your Loan amount is "+s.loanamt());

	}

}
