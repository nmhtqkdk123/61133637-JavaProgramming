package Hieu61133637;

public class AccountInfo {
	private static final String Username = "63CNTT";
	private static String Password = "123";
	
	protected AccountInfo() {
		
	}
	
	protected byte Login(String user, String pass) {
		if(user.equals(Username) && pass.equals(Password)) return 1;
		else if (user.equals(Username) && !pass.equals(Password)) return 0;
		return -1;
	}
	
}
