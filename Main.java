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
			
	    
			//游戏开始，开始发牌   
			gamepro.gameStart();
	    
	    //游戏进行时
	    gamepro.gaming();	
	    
	    //游戏结束
	    gamepro.gameOver();
	    
	    //输入
	    System.out.println("是否继续游戏(Y/N)： ");
	    inChar = in.next();
		}while(inChar.equals("Y"));
	}

}
