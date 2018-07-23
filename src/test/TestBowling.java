package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import code.Game;

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
	
}
