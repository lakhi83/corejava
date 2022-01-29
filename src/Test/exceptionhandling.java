package Test;

public class exceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num =10;
int[] array1 = {5,7,34,56};
try {
	int result = num/0;
} catch(ArithmeticException e) {
	System.out.println("inside airthmetic expression");
	
}

	}
	
}
