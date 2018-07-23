package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import code.Game;

public class TestBowling {
	
	private Game bowling;
	
	public TestBowling() {
		bowling = new Game();
	}

	@Test
	public void DoesGameExist() 
	{		
		assertNotNull(bowling);
	}
	
	@Test
	public void GutterGameReturns20() 
	{
		int rolls = 20, pins = 1;
		
		RollMany(rolls, pins);
		
		assertEquals(20, bowling.scoredPoints());
	}
	
	@Test
	public void OneSpareReturns() 
	{
		// Turn
		bowling.Roll(5); // first roll
		bowling.Roll(5); // second roll = spare
		bowling.Roll(3);
		
		RollMany(17, 0);
		
		assertEquals(16, bowling.scoredPoints());
	}
	
	public void RollMany(int rolls, int pins)
	{
		for(int i = 0; i <rolls; i++)
		{
			bowling.Roll(pins);
		}
	}	
}
