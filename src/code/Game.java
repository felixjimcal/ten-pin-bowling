package code;

public class Game {
	
	private int _score = 0;
	
	public void roll(int quantity_pins)
	{
		_score += quantity_pins;
	}
	
	public int scoredPoints()
	{
		return _score;
	}

}
