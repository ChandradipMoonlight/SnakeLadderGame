package javapractice;

public class SnakeLadderGame {
	public static final int NO_PLAY = 0 ;
	public static final int LADDER = 1 ;
	public static final int SNAKE = 2 ;
	
	public static void main(String[] args) {
		System.out.println("Wellcome to the Snake and Ladder game.");
		
		int position=0;
		int newPosition=0;
		
		int dieRolls = (int) (Math.random()*6)+1;
		int checkOption = (int) (Math.random()*3);
		
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
		position=position+newPosition;
		if (position<0) {
			position = 0;
		}
		System.out.println("your are now at "+position+"th"+" position");
	} 
}


