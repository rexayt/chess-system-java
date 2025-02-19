package chess.enums;

public enum Color {
	
	BLACK(1),
	WHITE(2);
	
	private int color;
	
	private Color(int color) {
		this.color = color;
	}
	
	public int getCode() {
		return this.color;
	}
	
	public static Color valueOf(int color) {
		for (Color co : Color.values()) {
			if (color == co.getCode() ) {
				return co;
			}
		}
		throw new IllegalArgumentException("Invalid Color code");
	}
}
