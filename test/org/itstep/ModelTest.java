package org.itstep;

import static org.junit.Assert.*;

import org.junit.Test;

public class ModelTest {

	@Test
	public void inputWordByScaner1() {
		Model myTest = new Model();
		String runTest = myTest.inputWordByScaner1("Nastya");
		assertEquals("Nastya", runTest);
	}
	
	@Test
	public void inputWordByScaner1v2() {
		Model myTest = new Model();
		String runTest = myTest.inputWordByScaner1("Katya");
		assertNull(runTest);
		
		}
		
	@Test
	public void inputWordByScaner2() {
		Model myTest = new Model();
		byte runTest = myTest.inputWordByScaner2((byte)1); //приведение типов
		assertEquals(1, runTest);
		}
	
	@Test
	public void inputWordByScaner2v2() {
		Model myTest = new Model();
		byte runTest = myTest.inputWordByScaner2((byte)42);
		assertEquals(0, runTest);
	}

	
	@Test
	public void writeSentence() {
		Model myTest = new Model();
		String runTest = myTest.writeSentence("Nastya", (byte)1);
		assertEquals("Nastya " + 1, runTest);
	}

}
