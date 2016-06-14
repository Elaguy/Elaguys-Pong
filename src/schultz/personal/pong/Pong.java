package schultz.personal.pong;

public class Pong {
	
	public static final String VERSION = "0.1i";
	
	public static Pong pong;
	public static Frame frameObj;
	public static Renderer renderer;
	public static Ball ball;
	public static Paddle paddle1, paddle2;
	
	public Pong() {
		frameObj = new Frame();
		renderer = new Renderer();
		ball = new Ball(frameObj.getWidth()/2, frameObj.getHeight()/2, 12, 12, 3, 0);
		paddle1 = new Paddle(10, frameObj.getHeight()-100, 10, 75, 3);
		paddle2 = new Paddle(frameObj.getHeight()+180, 10, 10, 75, 3);
	}
	
	private void runGame() {
		frameObj.initFrame();
		frameObj.startGame();
	}
	
	public static void main(String[] args) {
		pong = new Pong();
		pong.runGame();
	}
}
