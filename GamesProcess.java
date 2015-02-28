package tweentyOneGames;

public class GamesProcess 
{
	private final static int VALUE_MAX = 21;
	private final static int INVIAL_VALUE = 0; //��Чֵ
	private int lose; //lose 1��ʾ������  2��ʾ����  3��ʾƽ��
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
		int count = 3;   //�ӵ����ſ�ʼ��
		while(humanHitFlag || computerHitFlag)
	    {	
	    	//�������˳��
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
	    	
	    	//�˵�˳��
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
	    	
	    	//���ƵĴ���
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
				System.out.println("ƽ�֣���");
			}
		}
	}
	
}
