package hello;
 import java.util.Scanner;
 
public class Last {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner myobj = new Scanner (System.in);
    
    System.out.println("Enter your name");
    String username = myobj.nextLine();
    System.out.println("Hello " + username);
	}

}
