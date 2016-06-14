package schultz.personal.pong;

import java.awt.*;
import javax.swing.*;

public class Renderer extends JPanel {
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		render(g);
	}
	
	public void update() {
		System.out.println("In update method");
		moveBall();
		wallBounce();
		System.out.println("Wall bounce");
	}
	
	private void render(Graphics g) {
		setBackground(Color.BLACK);
		renderObjects(g);
	}
	
	private void moveBall() {
		Pong.ball.setXPos(Pong.ball.getXPos() + Pong.ball.getXDelta());
		Pong.ball.setYPos(Pong.ball.getYPos() + Pong.ball.getYDelta());
	}
	
	private void wallBounce() {
		if(Pong.ball.getXPos() >= Pong.frameObj.getWidth()) {
			Pong.ball.setXDelta(Pong.ball.getXDelta() * -1);
			Pong.ball.setYDelta(Pong.ball.getYDelta() * -1);
		}
		
		if(Pong.ball.getXPos() <= 0) {
			Pong.ball.setXDelta(Pong.ball.getXDelta() * -1);
		}
		
		if(Pong.ball.getYPos() <= 0) {
			Pong.ball.setYDelta(Pong.ball.getYDelta() * -1);
			Pong.ball.setXDelta(Pong.ball.getXDelta() * -1);
		}
		
		if(Pong.ball.getYPos() >= Pong.frameObj.getHeight()) {
			Pong.ball.setYDelta(Pong.ball.getYDelta() * -1);
		}
	}
	
	private void renderObjects(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillOval(Pong.ball.getXPos(), Pong.ball.getYPos(), Pong.ball.getWidth(), Pong.ball.getHeight());
		
		g.fillRect(Pong.paddle1.getXPos(), Pong.paddle1.getYPos(), Pong.paddle1.getWidth(), Pong.paddle1.getHeight());
		g.fillRect(Pong.paddle2.getXPos(), Pong.paddle2.getYPos(), Pong.paddle2.getWidth(), Pong.paddle2.getHeight());
	}

	public Dimension getPreferredSize() {
		return new Dimension(Pong.frameObj.getWidth(), Pong.frameObj.getHeight());
	}
}
