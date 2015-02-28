package tweentyOneGames;

import java.util.Random;

public class Cards {
	private final static int INVALID_VALUE = 100;   //设置无效值,注意不能在0~13之间
	private final static int COLOR_MAX = 4; //四种花色
	private final static int NUMBER_MAX = 13; //13种数字
	
	//数值为A ,2,3,4,5,6,7,8, 9,10,J,Q,K;数组中的值分别为1,2,3,4,5,6,7,8,9,10,11,12,13
	//花色： ♠ 黑桃, ♥ 红桃,  ♢方块,  ♣梅花; 数组中的值分别为0,1,3,2;
	private int[][] colorNumber = new int[COLOR_MAX][NUMBER_MAX];  		                                               
	//private String[] cards = new String[NATURE_MAX];   //牌有两种属性，一种是花色，一种是数字
	
	
	{
		//初始化值
		for (int i = 0; i < COLOR_MAX; i++) 
		{
			for (int j = 0; j < NUMBER_MAX; j++)
			{
				colorNumber[i][j] = j+1;
			}
		}
		
	}
	
	public Cards()
	{	
		
	}
	
	//设置花色值和数字的值
	private void  setColorNumber(int value, int colorPos, int numPos) 
	{
		colorNumber[colorPos][numPos] = value;
	}
	
	//获取花色和数字的值
	private int getColorNumber(int colorPos, int numPos)
	{
		return colorNumber[colorPos][numPos];
	}
	
	//获取数字的下标，可以重复
	private int getNumberPos() 
	{
		int pos = 0;
		Random random = new Random();
		pos = random.nextInt(NUMBER_MAX);
		return pos;
	}
	
	//得到颜色的下标，可以重复
	private int getColorPos() 
	{
		int pos =0;
		Random random = new Random();
		pos = random.nextInt(COLOR_MAX);
		return pos;
	}
	
	//得到牌
	public Card getCards()
	{
		int colorPos = 0;
		int numPos = 0;
		int cardsValue = INVALID_VALUE;
		Card selectCard = new Card();
		
		do{
		    //得到花色下标
			colorPos = getColorPos();
		    //得到数字下标
			numPos = getNumberPos();
			//得到值
			cardsValue = getColorNumber(colorPos, numPos);
		}while(cardsValue == INVALID_VALUE);
		
		//设置花色和数字为无效值表示此牌已经用过
		setColorNumber(INVALID_VALUE, colorPos, numPos);
		
		//设置选择到的卡牌
		selectCard.setColor(colorPos);
		selectCard.setNumber(cardsValue);
		
		return selectCard;
	}
}
