package javapractice;

public class SnakeLadderGame {
	public static final int NO_PLAY = 0 ;
	public static final int LADDER = 1 ;
	public static final int SNAKE = 2 ;
	
	public static void main(String[] args) {
		System.out.println("Wellcome to the Snake and Ladder game.");
		
		int p1_position=0;
		int p2_position=0;
		int newPosition=0;
		int winPosition=100;
		int count1=0;
		int count2=0;
		
		int checkOption;
		
		int currentPlayer1=(int) (Math.random()*2)+1;
		
		while (true) {
		
		if(currentPlayer1==1) {
			System.out.println("now player-1's turn");
			count1++;
		int dieRolls = (int) (Math.random()*6)+1;
		 checkOption = (int) (Math.random()*3);

		
		switch (checkOption) {
		case NO_PLAY : 
			newPosition = 0;
			break;
		case LADDER :
			newPosition = dieRolls ;
			break;
		case SNAKE :
			newPosition = -dieRolls ;
			break;
		}
		p1_position=p1_position+newPosition;
		if (p1_position<0) {
			p1_position = 0;
		}
		if (p1_position>10) {
			p1_position=newPosition;
		}
		System.out.println("now Player-1 at "+p1_position+"th"+" position");
		if (p1_position==winPosition) {
			break;
		}
		}
		else {
			count2++;
			System.out.println("now player-2's turn");
			int dieRolls = (int) (Math.random()*6)+1;
			checkOption = (int) (Math.random()*3);
		
			
			switch (checkOption) {
			case NO_PLAY : 
				newPosition = 0;
				break;
			case LADDER :
				newPosition = dieRolls ;
				break;
			case SNAKE :
				newPosition = -dieRolls ;
				break;
			}
			p2_position=p2_position+newPosition;
			if (p2_position<0) {
				p2_position = 0;
			}
			if (p2_position>winPosition) {
				p2_position=newPosition;
			}
			System.out.println("now Player-2 at "+p2_position+"th"+" position");
			if (p2_position==winPosition) {
				break;
			}
			
		}
		
		if(checkOption==1) {
			System.out.println("Ohh, You got ladder. Now play again.");
		}
		else {
			if(currentPlayer1==1) {
				currentPlayer1 = 2;
			}
			else {
				currentPlayer1 = 1;
			}
			
		}
		
		}
		if (p1_position==winPosition) {
		System.out.println("\nCongratulation Player-1 you are win! \n after die rolled "+ count1+" times.");
	} else {
		System.out.println("\nCongratulation Player-2 you are win! \n after die rolled "+ count2+" times.");
		
	}
	}
}
