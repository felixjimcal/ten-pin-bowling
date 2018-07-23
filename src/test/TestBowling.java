package test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import code.Game;

public class TestBowling {

	@Test
	public void DoesGameExist() 
	{
		Game bowling = new Game();
		
		assertNotNull(bowling);
	}

}
