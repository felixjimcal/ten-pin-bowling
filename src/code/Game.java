package code;

public class Game {
	
	private int current_roll = 0;
	private int[] rolls = new int[21];
	
	public void Roll(int quantity_pins)
	{
		rolls[current_roll] = quantity_pins;
		current_roll++;
	}
	
	public int scoredPoints()
	{
		int roll_num = 0, score = 0;
		
		for(int frame = 0; frame <10; frame++)
		{
			if(rolls[roll_num] + rolls[roll_num + 1] == 10)
			{
				score += 10 + rolls[roll_num + 2];
			}
			else
			{
				score += rolls[roll_num] + rolls[roll_num + 1];
			}
			roll_num += 2;
		}		
		return score;
	}
	


}
