package Game;

import java.util.Random;

public class SnakeLadderGame {
	
	static int currentPosition=0;
	static int noPlay=0;
	static int winPosition=30;
	static int numberOfDiceRolls=0;
	
	public static int playRollDie() {
	Random random=new Random();			
		int rollNumber = random.nextInt(6)+1;
		numberOfDiceRolls = numberOfDiceRolls + 1;
		System.out.println("The number of times dice rolls are : "+numberOfDiceRolls);

		return rollNumber;

	}
	
	public static int findOptionNumber() {
		Random random=new Random();			
		int optionNumber = random.nextInt(3);
		return optionNumber;
	}
	
	
	public static void main(String[] args) {
		
		while( currentPosition <= winPosition ) {
		int option = findOptionNumber();
			//System.out.println("option : "+option);
		if( option == 0 ) {
			currentPosition = noPlay;			 
		}else if( option == 1 ) {
			//Got Ladder
		if( currentPosition > 10 ) {
			System.out.println("Player win Current Position is1 : "+currentPosition);
		}
			currentPosition += playRollDie();
		}else if( option == 2 ) {
			//Snake Bite
		if( currentPosition > 0 ) {
			currentPosition -= playRollDie();
			System.out.println("Snake Attack position :"+currentPosition);
	    }
	 }
 
		if( currentPosition == 27 ) {
			int reguiredNo = playRollDie();
			System.out.println("The game is Hold current position :"+currentPosition);
		if( reguiredNo == 3 ) {
			currentPosition += playRollDie();
		}
			System.out.println("The game is Win :"+currentPosition);
		}else if( currentPosition == 25 ) {
			int reguiredNo = playRollDie();
			System.out.println("The game is Hold current position :"+currentPosition);
			if( reguiredNo == 5 ) {
					currentPosition += playRollDie();
			}
			System.out.println("The game is Win :"+currentPosition);	 
		}else if( currentPosition == 26 ) {
			int reguiredNo = playRollDie(); 
			System.out.println("The game is Hold current position :"+currentPosition);
			if( reguiredNo == 4 ) {
				currentPosition += playRollDie();				 
			}
			System.out.println("The game is Win :"+currentPosition);	
		}else if( currentPosition == 28 ) {
			int reguiredNo = playRollDie();
			System.out.println("The game is Hold current position :"+currentPosition);	
			if( reguiredNo == 2 ) {
				currentPosition += playRollDie();
			}
			System.out.println("The game is Win :"+currentPosition);	
		}else if( currentPosition == 29 ) {
			int reguiredNo = playRollDie();
			System.out.println("The game is Hold current position :"+currentPosition);
			if( reguiredNo == 1 ) {
				currentPosition += playRollDie();
			}
			System.out.println("The game is Win :"+currentPosition);
			}
		  }
		System.out.println("The number of times dice rolls are : "+numberOfDiceRolls);

	   }
	}
	  
	
  


