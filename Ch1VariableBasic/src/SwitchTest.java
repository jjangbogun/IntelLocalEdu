import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {


    System.out.println("숫자를 입력하세요");
	Scanner scan = new Scanner(System.in);
	
	int userN =scan.nextInt();
	int dan = 1;
	int num = 1;
	
	switch (userN ) {
		
	    case 1 :
	    	while (dan <= 9) {     
		        
	            while (num<=9) 
	            {
	               System.out.print( dan +" X "+ num +" = " + (dan*num)+ "       ");
	               num++;
	               
	             } 
	            System.out.println();
	            num = 1;
	            dan++;
	    }
		    break;
		
		default :
			while (dan <= 9) {     
		        
	            while (num<=9) 
	            {
	               System.out.print( dan +" X "+ num +" = " + (dan*num)+ "       ");
	               num++;       
	             } 
	            num = 1;  
	            dan++;
	    }
	}
     
	}

	
}
