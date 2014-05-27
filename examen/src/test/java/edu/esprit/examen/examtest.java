package edu.esprit.examen;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class examtest {
	exam e;

	@Before
	public void setUp() throws Exception {
		e=new exam();
		
	}

	@Test
	public void itShouldReturnOneWhentwo(){
		assertEquals(1,e.process(2));
	
	}
		
	

}
