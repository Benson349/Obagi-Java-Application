 import java.util.Scanner;


public class UserInput{
    public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		
		
		System.out.print("Enter your name: ");
		String name = input.nextLine();


        System.out.print("Enter your address: ");
		String adress = input.nextLine();
		System.out.print();
		
		System.out.print("Enter Your age: ");
		byte age = input.nextByte();
		System.out.println();
		
		
		
	
	
	}
}
