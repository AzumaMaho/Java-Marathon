package ex079C;

import java.util.Scanner;

public class Ex079C {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.print("> ");

		Scanner sc = new Scanner(System.in);
		
		String nums = sc.nextLine();
		
		int A = nums.charAt(0) - '0';
		int B = nums.charAt(1) - '0';
		int C = nums.charAt(2) - '0';
		int D = nums.charAt(3) - '0';
		
		for (int op1 = 0; op1 < 2; op1++) {
		    for (int op2 = 0; op2 < 2; op2++) {
		        for (int op3 = 0; op3 < 2; op3++) {
		        	
		        	int result = A;
		        	
		        	if (op1 == 0) {
		        		result += B;
		        	} else {
		        		result -= B;
		        	}
		        	
		        	String s1;
		        	if (op1 == 0) {
		        	    s1 = "+";
		        	} else {
		        	    s1 = "-";
		        	}
		        	
		        	
		        	
		        	if (op2 == 0) {
		        		result += C;
		        	} else {
		        		result -= C;
		        	}
		        	
		        	String s2;
		        	if (op2 == 0) {
		        	    s2 = "+";
		        	} else {
		        	    s2 = "-";
		        	}
		        	
		        	
		        	
		        	if (op3 == 0) {
		        		result += D;
		        	} else {
		        		result -= D;
		        	}
		        	
		        	String s3;
		        	if (op3 == 0) {
		        	    s3 = "+";
		        	} else {
		        	    s3 = "-";
		        	}
		        	
		        	if(result == 7) {
		        		System.out.println(A + s1 + B + s2 + C + s3 + D + "=7");
		        		sc.close();
		        		return;
		        	}
		        	
		        }
		    }
		}
		sc.close();

	} 


}
