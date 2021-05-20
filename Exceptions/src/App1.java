import java.util.Scanner;

public class App1 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("A:");
		int a = keyboard.nextInt();
		System.out.print("B:");
		int b = keyboard.nextInt();
		int c = 0;
		try {
			c = a/b;
			
		}catch(ArithmeticException e) {
			//System.out.println("Division par zéro est pas correcte");
			//System.out.println("error"+" "+e.getMessage());
			//System.out.println(e.toString());
			e.printStackTrace();
		}finally {
			System.out.println("Result is"+" "+c);
		}
			
		
		 
		

	}

}
