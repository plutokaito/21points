package tweentyOneGames;

public class Card
{
	private int color; //颜色
	private int number; //数值
	
	public Card()
	{
		color = 0;
		number = 1;
	}
	
	public int getColor() 
	{
		return color;
	}
	
	public int getNumber() 
	{
		return number;
	}
	
	public void setColor(int color) 
	{
		this.color = color;
	}
	
	public void setNumber(int number) 
	{
		this.number = number;
	}
	
	
	//获取花色
	public String getColorPic() 
	{
		String colorMap = new String();
		switch (color)
		{
		case 0:
			colorMap = "黑桃";
			break;
		case 1:
			colorMap = "红桃";
			break;
		case 2:
			colorMap = "梅花";
			break;
		case 3:
			colorMap = "方片";
			break;
		default:
			break;
		}
		
		return colorMap;
	}
	
	//获取'A'~'K'
	public String getNumberPic() 
	{
		String numPic = new String();
		switch (number) 
		{
		case 1:
			numPic = "A";
			break;
		case 11:
			numPic = "J";
		    break;
		case 12:
			numPic = "Q";
			break;
		case 13:
			numPic = "K";
			break;
		default:
			numPic = number + "";
			break;
		}
		
		return numPic;
	}
	
	public void showCards()
	{
		System.out.print(getColorPic() + getNumberPic() + " ");
	}
	
	public void hiddenCards()
	{
		System.out.print("■" + "■" +" ");
	}
}
