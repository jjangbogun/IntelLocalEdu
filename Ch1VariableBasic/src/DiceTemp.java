
public class DiceTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int diceNum = 0; // 1~6
		diceNum = (int)(Math.random() * 6) + 1;
		
		for(;;) {
			diceNum = (int)(Math.random() * 6) + 1;
			
			System.out.println(diceNum);
			if(diceNum == 6) {
				break;
			}
         	   
	            
		}
		
//		diceNum = 1;
//		System.out.println(diceNum);
//		
//		diceNum = 2;
//		System.out.println(diceNum);
//		
//		diceNum = 3;
//		System.out.println(diceNum);
//		
//		diceNum = 4;
//		System.out.println(diceNum);
//		
//		diceNum = 5;
//		System.out.println(diceNum);
//		
//		diceNum = 6;
//		System.out.println(diceNum);
		
		
		
		
		
		
//		for(int i = 9; i > 4; i--) {
//			System.out.print(i+"  ");	
//		}
//		System.out.println();
//		for(int i = 4; i > -1; i--) {
//			System.out.print(i+"  ");
//		}
//		System.out.println();
//		for(int n = -1; n > -6; n--) {
//			System.out.print(n+"  ");
//		}

	}

}
