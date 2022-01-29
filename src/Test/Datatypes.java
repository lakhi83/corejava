package Test;

public class Datatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 20;
		int num2 = 30;
        int sum = num1+num2;
        int min = num2-num1;
        int mul = num1*num2;
        float div = (float)num2/num1;
        
        String result = "the sum of tow number is" +sum;
        System.out.println(sum);
        System.out.println(min);
        System.out.println(mul);
        System.out.println(div);
        
        String name = "clean india green india";
        System.out.println("Total num of chars are" +name.length());
        char char1 = name.charAt(0);
        System.out.println("char are first place is" + char1);
        System.out.println("the string in uppercase " + name.toUpperCase());
        System.out.println("the string in uppercase " + name.toLowerCase());
        		
        		
        
	}
	}


