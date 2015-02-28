package tweentyOneGames;

public class GamesProcess 
{
	private final static int VALUE_MAX = 21;
	private final static int INVIAL_VALUE = 0; //无效值
	private int lose; //lose 1表示电脑输  2表示人输  3表示平局
	private computerPlay computer = new computerPlay();
	private HumanPlay  human = new HumanPlay();
	private boolean computerHitFlag = true;
	private boolean humanHitFlag = true;
	
	
	public GamesProcess() 
	{
		// TODO Auto-generated constructor stub
		lose = INVIAL_VALUE;
	}
	
	public void gameStart()
	{
		computer.getBeginCard();
	    human.getBeginCard();
	    computer.showComCard();
	    human.showAllHumanCard();
	}
	
	public void  gaming() 
	{
		int count = 3;   //从第三张开始算
		while(humanHitFlag || computerHitFlag)
	    {	
	    	//计算机的顺序
	    	if(computerHitFlag)
	    	{
	    		computerHitFlag = computer.getNextCards(count);
	    	}
	    	
	    	if(computer.getComputerCardValue() > VALUE_MAX)
	    	{
	    		lose = 1;
	    	    break;
	    	}
	    	computer.showComCard();
	    	
	    	//人的顺序
	    	humanHitFlag = human.CheckHitFlag();
	    	if(humanHitFlag)
	    	{
	    		human.getnextCards(count);
	    	}
	    	
	    	if(human.getHumanCardValue() > VALUE_MAX)
	    	{
	    		lose = 2;
	    		break;
	    	}
	    	human.showAllHumanCard();
	    	
	    	//发牌的次数
	    	count++;
	    }
	}
	
	public void gameOver()
	{
		computer.showAllComCard();
		human.showAllHumanCard();
		if(lose != INVIAL_VALUE)
		{	
			if(lose == 1)
			{
				System.out.println("U WIN!!");
			}else if(lose == 2)
			{
				System.out.println("U LOSE!!");
			}
		}else{
			if((human.getHumanCardValue()) > (computer.getComputerCardValue()))
			{
				System.out.println("U WIN!!");
			}else if((human.getHumanCardValue()) < (computer.getComputerCardValue()))
			{
				System.out.println("U LOSE!");
			}else{
				System.out.println("平局！！");
			}
		}
	}
	
}
