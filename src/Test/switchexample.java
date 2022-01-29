package Test;

public class switchexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 ="clean world green world ";
		int vowelcount =0;
		
		for(int index=0;index<str1.length();index++) {
			char temp = str1.charAt(index);
			switch(temp) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				vowelcount++;
				break;
				
			}
		}
		
	System.out.println("total number of vowel  " + vowelcount);	
		
	}

}
