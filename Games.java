package tweentyOneGames;

import java.util.Scanner;

public class Games {

	public static void main(String[] args) 
	{
		String inChar = new String();
		
		do
		{
			GamesProcess gamepro =  new GamesProcess();
			Scanner in = new Scanner(System.in);
			
	    
			//��Ϸ��ʼ����ʼ����   
			gamepro.gameStart();
	    
	    //��Ϸ����ʱ
	    gamepro.gaming();	
	    
	    //��Ϸ����
	    gamepro.gameOver();
	    
	    //����
	    System.out.println("�Ƿ������Ϸ(Y/N)�� ");
	    inChar = in.next();
		}while(inChar.equals("Y"));
	}

}
