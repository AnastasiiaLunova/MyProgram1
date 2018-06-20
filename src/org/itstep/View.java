package org.itstep;

public class View {
	public static final String INPUT_SENTENSE = "Input word: ";
	public static final String WRONG_INPUT = "Wrong input! Repeat please!";
	public static final String OUR_WORD = "You write word: ";
	public static final String OUR_SENTENCE = "You write sentence: ";

	public void printMesage(String mesage) {
		System.out.println(mesage);
	}
	
	public void printMesageAndWord(String mesage, String word) {
		System.out.println(mesage + word);
	}
	
	public void printMesageAndNumber(String mesage, byte number) {
		System.out.println(mesage + number);
	}
}
