package com.thiagoleao.chesschallenge.pieces;

public class Queen extends AbstractPiece {
	private static final String OUTPUT_LETTER = "Q";

	public boolean isAttackPosition(int column, int row) {
		return false;
	}

	public String getOutputLetter() {
		return OUTPUT_LETTER;
	}
}
