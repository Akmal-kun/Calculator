import java.util.Scanner;

public class simple_calculator{
	static void show_result(double a , double b , int x){
		double result;
		if (x == 1){
			result = a + b;
			System.out.println("The result is " + result);
		}
		else if (x == 2){
			result = a - b;
			System.out.println("The result is " + result);
		}
		else if (x == 3){
			result = a * b;
			System.out.println("The result is " + result);
		}
		else if (x == 4){
			result = a / b;
			System.out.println("The result is " + result);
		}
		Scanner key = new Scanner(System.in);
		System.out.print("Repeat? [y/n] ");
		String choice;
		choice = key.nextLine();
		switch(choice){
			case "y": calculator(); break;
			default:
				System.exit(0);
		}
	}
	
	static void usage(){
		System.out.println("+ : for adittion");
		System.out.println("- : for subtraction");
		System.out.println("* : for multiplication");
		System.out.println("/ : for division");
		calculator();
	}

	static void calculator(){
		Scanner key = new Scanner(System.in);
		double a;
		double b;
		System.out.print("Enter the first number   : ");
		a = key.nextDouble();
		System.out.print("Enter the second number : ");
		b = key.nextDouble();
		String op;
		System.out.print("Enter a number operation : ");
		Scanner keyboard = new Scanner(System.in);
		op = keyboard.nextLine();
		switch(op){
			case "+": show_result(a , b , 1); break;
			case "-": show_result(a , b , 2); break;
			case "*": show_result(a , b , 3); break;
			case "/": show_result(a , b , 4); break;
			default:
				System.out.println("Number operation does'nt exists");
				usage();
		}
	}

	public static void main(String [] args){
		System.out.println("Welcome to this program");
		System.out.println("This program was created by Akmal_kun");
		calculator();
	}
}
