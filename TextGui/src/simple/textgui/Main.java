package simple.textgui;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int option;
		int number1;
		int number2;

		while(true) {
			System.out.println("Enter your choice. 1. Addition 2. Substraction 3. Multiplication 4. Division 5. Exit");
			option = Integer.parseInt(in.next());
			
			if(option==1) {
				askForNumbers();
				
				number1 = Integer.parseInt(in.next());
				number2 = Integer.parseInt(in.next());
				float sum = number1 + number2;
				System.out.println("The sum is " + sum);
				
			} else if (option==2) {
				askForNumbers();
				
				number1 = Integer.parseInt(in.next());
				number2 = Integer.parseInt(in.next());
				float diff = number1 - number2;
				System.out.println("The difference is " + diff);
			} else if (option==3) {
				askForNumbers();
				
				number1 = Integer.parseInt(in.next());
				number2 = Integer.parseInt(in.next());
				float product = number1 * number2;
				System.out.println("The product is " + product);
			}  else if (option==4) {
				askForNumbers();
				
				number1 = Integer.parseInt(in.next());
				number2 = Integer.parseInt(in.next());
				float quotient = number1 / number2;
				System.out.println("The quotient is " + quotient);
			} else {
				break;
			}
		}
	}
	
	public static void askForNumbers() {
		System.out.println("Enter 2 numbers");
	}

}
