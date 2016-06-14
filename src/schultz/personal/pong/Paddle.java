package schultz.personal.pong;

public class Paddle {
	
	private int xPos;
	private int yPos;
	private int speed;
	private int width;
	private int height;
	
	public Paddle(int x, int y, int w, int h, int spd) {
		xPos = x;
		yPos = y;
		width = w;
		height = h;
		speed = spd;
	}
	
	public void setXPos(int x) {
		xPos = x;
	}
	
	public void setYPos(int y) {
		yPos = y;
	}
	
	public void setWidth(int w) {
		width = w;
	}
	
	public void setHeight(int h) {
		height = h;
	}
	
	public void setSpeed(int spd) {
		speed = spd;
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
	
	public int speed() {
		return speed;
	}

}
