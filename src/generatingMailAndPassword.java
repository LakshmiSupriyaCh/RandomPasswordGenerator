import java.io.*;
import java.util.*;
public class generatingMailAndPassword {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your First Name:");
		String fname= br.readLine();
		System.out.println("Enter your Last Name:");
		String lname= br.readLine();
	       Email email=new Email(fname,lname);
	}
}
class Email
{
	private String firstName;
	private String lastName;
	private String randomPassword;
	private String departmentName;
	private String companyName="xycompany";
	
	Email(String fName,String lName)
{
	this.firstName=fName;
	this.lastName=lName;
	System.out.println("Welcome "+ firstName + " " + lastName );
	System.out.println("************************************");
	department();
	 String email_id=(firstName.toLowerCase() + "." + lastName.toLowerCase() + "@"+  departmentName +  "." +  companyName + ".com");
 	System.out.println("Your Mail-ID : " + email_id);
     password(8);
	}
private void department()
   {
	   System.out.println("Choose your department from the List below:" );
	   System.out.println(" Production  (Code:11) \n Accounting (Code:12) \n Sales      (Code:13) \n R&D        (Code:14) \n Finance     (Code:15)");
	   System.out.println("Enter your department code:");
	   Scanner input = new Scanner(System.in);
	   int choice=input.nextInt();
	   if(choice==11) { departmentName="Production"; }
	   else if(choice==12) { departmentName="Accounting"; }
	   else if(choice==13) { departmentName="Sales"; }
	   else if(choice==14) { departmentName="R&D"; }
	   else if(choice==15){ departmentName="Finance"; }
	   else { System.out.println("No Department is choosed");}  
   }
private void password(int length)
    {
	   String passwordSet= "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$";
	   char[] pwd= new char[length];
			   for (int i=0 ; i < length ; i++)
			   {
				   int rand = (int) (Math.random() * passwordSet.length());
				   pwd[i]=passwordSet.charAt(rand);
			}
			   System.out.println("Your Password: " + new String (pwd));
}
}