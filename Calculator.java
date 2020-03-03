import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.print("Which calculator do you want to use?\n1. General\n2. Scientific\n");
		Scanner choice = new Scanner(System.in);
		int uc = choice.nextInt();
		if(uc==1) {
			General gc = new General();
			gc.gcal();
		}
		else if(uc==2) {
			Scientific sc = new Scientific();
			sc.scal();
		}
		else {
			System.out.println("Invalid Input!!! Try Again.");
		}
			

	}

}
