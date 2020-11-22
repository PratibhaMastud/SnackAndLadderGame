package Game;

import java.util.Random;

public class SnakeLadderGame {

    static int startPosition=0;
	static int topPosition=0;
	static int currentPosition=0;
	
	public static int findNumRollsDie() {
		
		Random random = new Random();
		int rollsDieNumber = random.nextInt(6)+1;
		return rollsDieNumber;
	}
	
	public static void main(String[] args) {

		currentPosition += findNumRollsDie();
		System.out.println("The Player Current Position is : "+currentPosition);
	
	}

}
