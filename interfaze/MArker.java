package interfaze;
interface ticket
{
	
}
class person implements ticket
{
	
}
public class MArker {

	public static void main(String[] args) {
		person s=new person();
		if(s instanceof ticket)
		{
			System.out.println("This object login Succesfully");
		}
		else
		{
			System.out.println("Object not login ");
		}
	}
}
