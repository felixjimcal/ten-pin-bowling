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

	@Test
	public void DoesGameExist() 
	{
		Game bowling;
		
		bowling = new Game();
		
		assertNotNull(bowling);
	}
	
	@Test
	public void GutterGameReturns0() 
	{
		Game bowling = new Game();
		
		int pins = 0;
		
		for(int i = 0; i <20; i++)
		{
			bowling.roll(pins);
		}
		
		assertEquals(0, bowling.scoredPoints());
	}
	
	@Test
	public void SinglePinGameReturns20() 
	{
		Game bowling = new Game();
		
		int pins = 1;
		
		for(int i = 0; i <20; i++)
		{
			bowling.roll(pins);
		}
		
		assertEquals(20, bowling.scoredPoints());
	}
	
}
