package nt.finger.paint;

import android.graphics.Canvas;
import android.graphics.Paint;

public class FriendlyPoint extends Point {
	
	private final Point neighbour;
	
	public FriendlyPoint(final float x, final float y, final int col, final Point neighbour) {
		super(x, y, col);
		this.neighbour = neighbour;
	}
	
	@Override
	public void draw(final Canvas canvas, final Paint paint) {
		paint.setColor(col);
		canvas.drawLine(x, y, neighbour.x, neighbour.y, paint);
	}
	
	@Override
	public String toString() {
		return x + ", " + y + ", " + col + "; N[" + neighbour.toString() + "]";
	}
}
