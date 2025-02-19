package chess;

import boardgame.Piece;
import boardgame.Position;
import chess.enums.Color;

public class ChessPiece {
	
	private Color color;
	private int moveCount;
	
	private Piece piece;
	
	public ChessPiece(Color color, int moveCount, Piece piece) {
		this.color = color;
		this.moveCount = moveCount;
		this.piece = piece;
	}
	
	public ChessPosition getChessPosition() {
		return null;
	}
	
	protected boolean isThereOpponentPiece(Position position) {
		return false;
	}
	
	protected void increaseMoveCount() {
		
	}
	
	protected void decreaseMoveCount() {
		
	}
}
