package tweentyOneGames;

import java.util.Scanner;

public class HumanPlay 
{
	private final static int HANDS_MAX = 27;
	private Card[] card = new Card[HANDS_MAX];
	private  int  count;
	private playGame humanPlay = new playGame();
	
	public HumanPlay() 
	{
		count = 0;
	}
	
	public void getBeginCard()
	{
		card[0] = humanPlay.getFirstCard(); 
		card[1] = humanPlay.getNextCard();
		count += 2;
		return;
	}
	
	//输入
	public boolean CheckHitFlag()
	{
		boolean hitFlag = true;
		System.out.print("请输入是否要牌（Y/N）:");
		Scanner in = new Scanner(System.in);
		String inString = in.next();
		if((inString.equals("n")) || (inString.equals("N")))
		{
			hitFlag = false;
		}
		
		return hitFlag;
	}
	
	//得到下一张牌
	public void getnextCards(int Cardcount)
	{
		card[Cardcount -1] = humanPlay.getNextCard();
		count++;
		return;
	}
	
	public void showAllHumanCard()
	{
		System.out.print("人的牌是：");
		for (int i = 0; i < count; i++) {
			card[i].showCards();
		}
		System.out.println();
	}
	
	public int getHumanCardValue()
	{
		return humanPlay.getCardsValue();
	}
}
