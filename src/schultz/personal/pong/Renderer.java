package schultz.personal.pong;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class Renderer extends JPanel implements KeyListener {
	
	private boolean upPressed;
	private boolean downPressed;
	
	public Renderer() {
		setFocusable(true);
		addKeyListener(this);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		render(g);
	}
	
	public void update() {
		Pong.ball.moveBall(Pong.ball);
		Pong.ball.wallBounce(Pong.ball);
		Pong.ball.paddleBounce(Pong.ball, Pong.paddle1);
		Pong.ball.paddleBounce(Pong.ball, Pong.paddle2);
		movePaddle(Pong.paddle1);
		movePaddle(Pong.paddle2);
	}
	
	private void render(Graphics g) {
		setBackground(Color.BLACK);
		renderObjects(g);
	}
	
	private void movePaddle(Paddle paddle) {
		if(upPressed) {
			if(paddle.getYPos()-paddle.getSpeed() > 10)
				paddle.setYPos(paddle.getYPos()-paddle.getSpeed());
		}
		
		if(downPressed) {
			if(paddle.getYPos()+paddle.getSpeed() < Pong.frameObj.getHeight()-85)
				paddle.setYPos(paddle.getYPos()+paddle.getSpeed());
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

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP)
			upPressed = true;
		else if(e.getKeyCode() == KeyEvent.VK_DOWN)
			downPressed = true;
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP)
			upPressed = false;
		else if(e.getKeyCode() == KeyEvent.VK_DOWN)
			downPressed = false;
	}
}
