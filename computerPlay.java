package tweentyOneGames;


public class computerPlay{
	private final static int HANDS_MAX = 27;
	private final static int HIT_MAX = 17;
	private Card[] card = new Card[HANDS_MAX];
	private playGame computerPlay = new playGame();
	private int count; //用来记录发了几张牌了
	
	public computerPlay() {
		// TODO Auto-generated constructor stub
		count = 0;
	}

	public void getBeginCard()
	{
		card[0] = computerPlay.getFirstCard();
		card[1] = computerPlay.getNextCard();
		count += 2;
		return;
	}
	
	public boolean getNextCards(int cardCount)
	{
		int value = computerPlay.getCardsValue();
		boolean hitFlag = false;
		
		if(value <= HIT_MAX)
		{
			card[cardCount-1] = computerPlay.getNextCard();
			count++;
			hitFlag = true;
		}
		
		return hitFlag;
	}
	
	public void showAllComCard()
	{
		System.out.print("电脑的牌是：");
		for (int i = 0; i < count; i++) {
			card[i].showCards();
		}
		System.out.println();
	}
	
	public void showComCard()
	{
		System.out.print("电脑的牌是： ");
		card[0].hiddenCards();
		for(int i = 1; i < count; i++)
		{
			card[i].showCards();
		}
		System.out.println();
	}
	
	public int getComputerCardValue()
	{
		return computerPlay.getCardsValue();
	}
}