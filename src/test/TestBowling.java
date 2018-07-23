package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import code.Game;

// Important
// When you play bowling you have 2 opportunities or
// if you roll more than 7 pins in your turn you make a spare / 
// or even a Strike if you roll all, so it means
// 2 tries in every turn, in 10 turns means 20 intents, without doing spares or strikes
// Test the game, test the intents points


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
	
	public void RollMany(int rolls, int pins)
	{
		for(int i = 0; i <rolls; i++)
		{
			bowling.roll(pins);
		}
	}
	
}
