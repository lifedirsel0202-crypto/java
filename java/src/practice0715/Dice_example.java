package practice0715;

import java.util.Random;
import java.util.Scanner;


public class Dice_example extends BasicDice {

	public static void main(String[] args) {
		
		
		
	Scanner sc= new Scanner(System.in);
	Random r = new Random();
	
	
				BasicDice[] box= new BasicDice[4]; 
				Dice_example d= new Dice_example();
				
				
				d.makeBox(box);
				d.gameS(box, sc, r);
				
	}

}

