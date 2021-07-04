import static org.junit.Assert.assertEquals;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Junit{
	Scanner sc=new Scanner(System.in);

	@Order(1)
	@Test
	public void testM() {
		
		System.out.println("Enter  the firstname");
		String str=sc.nextLine();
		String inp=str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
		assertEquals(str,inp);
		assert str.equals(inp): "First character needs to be Upper case";
		assert str.length()>=3: "The string needs at least 3 characters";
	}
	
	
	

	    @Order(2)
		@Test
		
		public void email() {
			System.out.println("Enter the email");
			String email=sc.nextLine();
			String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(email);
			assert matcher.matches()==true: "Invalid email";
			
			
		}
	    
	   
	    
	    @Order(3)
	    @Test
		
		public void phone()
		{
			

			System.out.println("Enter the phone");
			String phone=sc.nextLine();
			String regex = "^[0-9]{2}\s[0-9]{10}$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(phone);
			assert matcher.matches()==true: "Invalid email";
			
		}
	    
	    @Order(4)
		@Test
		public void password() {
			System.out.println("Enter the password:");
			String pass=sc.nextLine();
			String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()]{1}).{8,}$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(pass);
			assert matcher.matches()==true: "Invail password format";
		}
}
