package chae;

import java.util.Random;
import java.util.Scanner;


public class Dice{
	
	
	public static void main(String[] args) {
		
		Random r= new Random();
		Scanner sc=  new Scanner(System.in);
		
		makeDice[] room= new makeDice[5];
		makeDice m=new makeDice();
		
		
		
		m.DiceSetting(room, sc, r);
		
	}

	
}

