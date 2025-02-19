package chess;

import boardgame.Position;

public class ChessPosition {
	
	private char column;
	private int row;
	
	public ChessPosition(char column, int row) {
		this.column = column;
		this.row = row;
	}
	
	protected static Position toPosition() {
		
		return null;
	}
	
	protected ChessPosition fromPosition() {
		
		return null;
	}
}
