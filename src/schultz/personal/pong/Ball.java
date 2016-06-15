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
	
	public void moveBall(Ball ball) {
		ball.setXPos(ball.getXPos() + ball.getXDelta());
		ball.setYPos(ball.getYPos() + ball.getYDelta());
	}
	
	public void wallBounce(Ball ball) {
		if(ball.getXPos()+ball.getWidth() >= Pong.frameObj.getWidth()) {
			ball.setXDelta(ball.getXDelta() * -1);
		}
		
		if(ball.getXPos() <= 0) {
			ball.setXDelta(ball.getXDelta() * -1);
		}
		
		if(ball.getYPos() <= 0) {
			ball.setYDelta(ball.getYDelta() * -1);
		}
		
		if(ball.getYPos()+ball.getWidth() >= Pong.frameObj.getHeight()) {
			ball.setYDelta(ball.getYDelta() * -1);
		}
	}
	
	public void paddleBounce(Ball ball, Paddle paddle) {
		if(ball.getXPos() > paddle.getXPos() && ball.getXPos() < paddle.getXPos() + paddle.getWidth())
			if(ball.getYPos() > paddle.getYPos() && ball.getYPos() < paddle.getYPos() + paddle.getHeight())
				ball.setXDelta(ball.getXDelta() * -1);
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
