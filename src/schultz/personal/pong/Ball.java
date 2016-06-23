package schultz.personal.pong;

public class Ball {
	
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private int xDelta;
	private int yDelta;
	private int wallOffset;

	public Ball(int x, int y, int w, int h, int xDel, int yDel, int offset) {
		xPos = x;
		yPos = y;
		width = w;
		height = h;
		xDelta = xDel;
		yDelta = yDel;
		wallOffset = offset;
	}
	
	public void moveBall(Ball ball) {
		ball.setXPos(ball.getXPos() + ball.getXDelta());
		ball.setYPos(ball.getYPos() + ball.getYDelta());
	}
	
	public void wallBounce(Ball ball) {
		if(ball.getXPos()+ball.getWidth() >= Pong.frameObj.getWidth()-wallOffset) { // right
			ball.setXDelta(ball.getXDelta() * -1);
			Pong.score.setPlayerScore(Pong.score.getPlayerScore() + 1);
			Pong.sound.playSound("blip2.wav");
		}
		
		if(ball.getYPos()+ball.getWidth() >= Pong.frameObj.getHeight()) { // bottom
			ball.setYDelta(ball.getYDelta() * -1);
			Pong.sound.playSound("blip3.wav");
		}
		
		if(ball.getXPos() <= 0+wallOffset) { // left
			ball.setXDelta(ball.getXDelta() * -1);
			Pong.score.setAiScore(Pong.score.getAiScore() + 1);
			Pong.sound.playSound("blip4.wav");
		}
		
		if(ball.getYPos() <= 0) { // top
			ball.setYDelta(ball.getYDelta() * -1);
			Pong.sound.playSound("blip5.wav");
		}
	}
	
	public void paddleBounce(Ball ball, Paddle paddle) {
		if((ball.getXPos() + ball.getWidth()) > paddle.getXPos() && ball.getXPos() < paddle.getXPos() + paddle.getWidth())
			if((ball.getYPos() + ball.getHeight()) > paddle.getYPos() && ball.getYPos() < paddle.getYPos() + paddle.getHeight()) {
				ball.setXDelta(ball.getXDelta() * -1);
				Pong.sound.playSound("blip1.wav");
			}
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
