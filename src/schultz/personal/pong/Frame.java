package schultz.personal.pong;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Frame implements ActionListener {
	
	private JFrame frame;
	private Timer timer;
	
	private int width;
	private int height;
	
	public Frame() {
		width = 800;
		height = 600;
		timer = new Timer(20, this);
	}
	
	public void initFrame() {
		frame = new JFrame("Elaguy's Pong - VERSION: " + Pong.VERSION);
		frame.setSize(width, height);
		frame.add(Pong.renderer);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void startGame() {
		timer.start();
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Pong.renderer.update();
		Pong.renderer.repaint();
		
	}

}
