import java.util.Scanner;
public class Test 
{

	public static void main(String[] args) 
	{
		System.out.println("Welcome to CaesarCipher!");
		System.out.println("Please enter the message you would like to encode");
		
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		
		CaesarCipherEncoder cs = new CaesarCipherEncoder(s);
		
		System.out.println("Please enter the value of the shift: ");
		int n = in.nextInt();
		
		System.out.println(cs.decode(cs.encode(n)));
	}


}
