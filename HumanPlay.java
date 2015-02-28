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
	
	//����
	public boolean CheckHitFlag()
	{
		boolean hitFlag = true;
		System.out.print("�������Ƿ�Ҫ�ƣ�Y/N��:");
		Scanner in = new Scanner(System.in);
		String inString = in.next();
		if((inString.equals("n")) || (inString.equals("N")))
		{
			hitFlag = false;
		}
		
		return hitFlag;
	}
	
	//�õ���һ����
	public void getnextCards(int Cardcount)
	{
		card[Cardcount -1] = humanPlay.getNextCard();
		count++;
		return;
	}
	
	public void showAllHumanCard()
	{
		System.out.print("�˵����ǣ�");
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
