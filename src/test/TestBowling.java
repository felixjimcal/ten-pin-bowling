package test;

import static org.junit.Assert.*;

import org.junit.Test;

import code.Bowling;

public class TestBowling {

	@Test
	public void DoesGameExist() 
	{
		Bowling game = new Bowling();
		
		assertNotNull(game);
	}

}
