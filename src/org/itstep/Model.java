package org.itstep;

public class Model {
	private String word;
	private byte number;

	public byte getNumber() {
		return number;
	}

	public void setNumber(byte number) {
		this.number = number;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public Model(String word, byte number) {
		super();
		this.word = word;
		this.number = number;
	}

	public Model() {
		super();
	}

	public String inputWordByScaner1(String word) {
		if (word.equals("Nastya")) { // Имя студента
			String correctWord = word;
			return correctWord;
		} else {
			return null;
		}
	}

	public byte inputWordByScaner2(byte number) {
		if (number == 1) {
			byte correctNumber = number;
			return correctNumber;
		} else {
			return 0;
		}
	}

	public String writeSentence(String word1, byte number) {
		return word1 + " " + number;
	}
}
