package Game;

import java.util.Random;

public class SnakeLadderGame {
	
	static int currentPosition=0;
	static int noPlay=0;
	
	public static int playRollDie() {
		Random random=new Random();			
		int rollNumber = random.nextInt(6)+1;
		return rollNumber;
	}
	public static int playLadder() {
		Random random=new Random();			
		int ladderStep = random.nextInt(6)+1;
		System.out.println(ladderStep);
		return ladderStep;
	}
	public static int snackAttack() {
		Random random=new Random();			
		int snackBite = random.nextInt(6)+1;
		return snackBite;
	}
	
	public static void main(String[] args) {
		
		int dieNumber=playRollDie();

		if(dieNumber==0) {
			currentPosition = noPlay;
			System.out.println("No play");

			
		}else if(dieNumber==1) {
				System.out.println("Got ladder");
				currentPosition = currentPosition + playLadder();
				
		}else if(dieNumber==2) {
				System.out.println("Snake attack");
				currentPosition = currentPosition - snackAttack();	

			}

	}

}
