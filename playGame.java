package tweentyOneGames;

public class playGame {
	private int cardsValue;   // �Ƶ���ֵ
	private Card card = new Card();
	
	public playGame()
	{
		cardsValue = 0;
	}
	
	public int getCardsValue() {
		return cardsValue;
	}
	
	//���ڵ�һ���Ƿ������ƣ������Ҫ0,1
	public Card getFirstCard()
	{
		int CardValue = 0;
		Cards cards = new Cards();
	    card = cards.getCards();
	    CardValue = card.getNumber();
	    if((CardValue == 1) || (CardValue > 10))
	    {
	    	cardsValue = 10;
	    }else{
	    	cardsValue = CardValue;
		}
		return  card;
	}
	
	//�ӵڶ��ſ�ʼ��
	public Card getNextCard()
	{
		int CardValue = 0;
		Cards cards = new Cards();
		Card card = cards.getCards();
		CardValue = card.getNumber();
		if(CardValue > 10){
			CardValue = 10;
		}
		cardsValue += CardValue;	
		return card;
	}
}
