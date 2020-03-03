import java.util.Scanner;

public class Scientific {

	public void scal() {
		System.out.println("Scientific Calculator\nWhich operation you want to do?");
		System.out.println("1. Addition (+)\n2. Subtraction (-)\n3. Multiplication (*)\n4. Division (/)"
				+ "\n5. Modulus (%)\n6. Square (x^2)\n7. Root\n8. Log\n9. ln\n10. sin\n11. cos\n12. tan\n"
				+ "13. sec\n14. cosec\n15. cot\n16. factorial\n17. Power");
		Scanner number = new Scanner (System.in);
		int num = number.nextInt();
		switch(num) {
		case 1: //Addition
			System.out.println("Enter First Number:");
			double a = number.nextDouble();
			System.out.println("Enter Last Number: ");
			double b = number.nextDouble();
			double sum = a+b;
			System.out.println("Addition of two numbers is: "+sum);
			break;
			
		case 2: //Subtraction
			System.out.println("Enter First Number: ");
			a = number.nextDouble();
			System.out.println("Enter Last Number: ");
			b = number.nextDouble();
			double sub = a-b;
			System.out.println("Subtraction of two numbers is: "+sub);
			break;
			
		case 3: //Multiplication
			System.out.println("Enter First Number: ");
			a = number.nextDouble();
			System.out.println("Enter Last Number: ");
			b = number.nextDouble();
			double mul = a*b;
			System.out.println("Multiplication of two numbers is: "+mul);
			break;
			
		case 4: //Division
			System.out.println("Enter First Number: ");
			a = number.nextDouble();
			System.out.println("Enter Last Number: ");
			b = number.nextDouble();
			double div = a/b;
			System.out.println("Division of two numbers is: "+div);
			break;
			
		case 5: //Modulus
			System.out.println("Enter First Number: ");
			a = number.nextDouble();
			System.out.println("Enter Last Number: ");
			b = number.nextDouble();
			double mod = a%b;
			System.out.println("Modulus of two numbers is: "+mod);
			break;
		
		case 6: //Square
			System.out.println("Enter Number: ");
			a = number.nextDouble();
			double sqr = a*a;
			System.out.println("Square of the number is: "+sqr);
			break;
			
		case 7: //Root
			System.out.println("Enter Number: ");
			a = number.nextDouble();
			double root = Math.sqrt(a);
			System.out.println("Root of the number: "+root);
			break;
			
		case 8: //logarithm
			System.out.println("Enter Value: ");
			a = number.nextDouble();
			double log = Math.log10(a);
			System.out.println("Logarithm of number is: "+log);
			break;
			
		case 9: //ln
			System.out.println("Enter Value: ");
			a = number.nextDouble();
			double ln = Math.log(a);
			System.out.println("ln of number is: "+ln);
			break;
			
		case 10: //sin
			System.out.println("Enter Value: ");
			a = number.nextDouble();
			double sin = Math.sin(a);
			System.out.println("Sin of given Value: "+sin);
			break;
			
		case 11: //cos
			System.out.println("Enter Value: ");
			a = number.nextDouble();
			double cos = Math.cos(a);
			System.out.println("Cos of given Value: "+cos);
			break;
			
		case 12: //tan
			System.out.println("Enter Value: ");
			a = number.nextDouble();
			double tan = Math.tan(a);
			System.out.println("tan of given Value: "+tan);
			break;
		
		case 13: //sec
			System.out.println("Enter Value: ");
			a = number.nextDouble();
			double sec = 1/Math.cos(a);
			System.out.println("sec of given Value: "+sec);
			break;
			
		case 14: // cosec
			System.out.println("Enter Value: ");
			a = number.nextDouble();
			double csc = 1/Math.sin(a);
			System.out.println("cosec of given Value: "+csc);
			break;
			
		case 15: //cot
			System.out.println("Enter Value: ");
			a = number.nextDouble();
			double cot = 1/Math.tan(a);
			System.out.println("cot of given Value: "+cot);
			break;
			
		case 16: //factorial
			System.out.println("Enter Value: ");
			a = number.nextDouble();
			double i,fact=1;
			for(i=1;i<=a;i++) {
				 fact = fact*i;
			}
			System.out.println("Factorial of number is: "+fact);
			break;
			
		case 17: //power
			System.out.println("Enter number: ");
			a = number.nextDouble();
			System.out.println("Enter power: ");
			b = number.nextDouble();
			double res = Math.pow(a, b);
			System.out.println("Result: "+res);
			break;
		default:
			System.out.println("Invalid Input!!! Try Again.");
			break;
		}
		
		}
	}
