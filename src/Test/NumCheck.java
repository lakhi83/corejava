package Test;

import java.util.Scanner;

public class NumCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scanner.nextInt();
		
		
		if(number%2==0) {
			System.out.println("even");
		}else {
				System.out.println("odd");
				
					
					
				
			}
			scanner.close();
		}
		
	}


