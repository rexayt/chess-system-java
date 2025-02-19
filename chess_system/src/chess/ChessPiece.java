package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public class ChessPiece extends Piece{
	
	private Color color;
	private int moveCount;
	
	private Piece piece;
	
	public ChessPiece(Board board, Color color, int moveCount, Piece piece) {
		super(board);
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
