package schultz.personal.pong;

public class Ball {
	
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private int xDelta;
	private int yDelta;

	public Ball(int x, int y, int w, int h, int xDel, int yDel) {
		xPos = x;
		yPos = y;
		width = w;
		height = h;
		xDelta = xDel;
		yDelta = yDel;
	}
	
	public void setXPos(int x) {
		xPos = x;
	}
	
	public void setYPos(int y) {
		yPos = y;
	}
	
	public void setXDelta(int xDel) {
		xDelta = xDel;
	}
	
	public void setYDelta(int yDel) {
		yDelta = yDel;
	}
	
	public int getXPos() {
		return xPos;
	}
	
	public int getYPos() {
		return yPos;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getXDelta() {
		return xDelta;
	}
	
	public int getYDelta() {
		return yDelta;
	}
}
