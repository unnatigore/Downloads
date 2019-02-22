import java.util.Scanner;
class Application 
{

	
	public static int loginAttemts=0;
	public static final String USER_ID="unnatigore";
	public static final String PASSWORD="abc123";
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String userId;
		String password;
			
		while(loginAttemts!=3)
		{
			System.out.println("Enter User Id");
			userId=sc.nextLine();
			System.out.println("Enter Password");
			password=sc.nextLine();

			
			if(checkLoginDetails(userId,password))
			{
				System.out.println("Welcome");
				break;
			} 
			
		}
		if(loginAttemts==3)
		{
			System.out.println("Contact Admin");
		}
		
	}
	
	private static boolean checkLoginDetails(String userId, String password2) 
	{
		if(userId.equals(USER_ID) && password2.equals(PASSWORD))
		{
			return true;
		}
		else
		{
			loginAttemts++;
			return false;
		}
	}

}