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
		int frame_index = 0, score = 0;
		
		for(int frame = 0; frame <10; frame++)
		{
			if(isStrike(frame_index))
			{
				score += 10 + strike_bonus(frame_index);
				frame_index++;
			}
			else if(isSpare(frame_index))
			{
				score += 10 + rolls[frame_index + 2];
				frame_index += 2;
			}
			else
			{
				score += rolls[frame_index] + rolls[frame_index + 1];
				frame_index += 2;
			}
		}		
		return score;
	}
	
	public int strike_bonus(int frame_index)
	{
		return rolls[frame_index + 1] + rolls[frame_index + 2];
	}
	
	public boolean isStrike(int frame_index)
	{
		return rolls[frame_index] == 10; 
	}
	
	public boolean isSpare(int frame_index)
	{
		return rolls[frame_index] + rolls[frame_index +1] == 10;
	}
}
