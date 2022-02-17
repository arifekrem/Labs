
public class LoginFormTester
{
	public static void main(String[] args)
  {
		LoginForm form = new LoginForm("tim.mcinerney", "abc123");
		
		form.input("tim.mcinerney");
		form.input("abc123");
		
		form.click("Submit");
		
		if (form.loggedIn())
			System.out.println("Successful Login");
		else
			System.out.println("Incorrect user name or password");
		System.out.println("Expected:\nSuccessful Login");
		
		
		form.input("tim.mcinerney");
		form.input("ab123");
		
		form.click("Submit");
		
		if (form.loggedIn())
			System.out.println("Successful Login");
		else
			System.out.println("Incorrect user name or password");
		System.out.println("Expected:\nIncorrect user name or password");
  }
}
