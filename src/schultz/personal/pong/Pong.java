package schultz.personal.pong;

public class Pong {
	
	public static final String VERSION = "0.9r";
	
	public static Pong pong;
	public static Frame frameObj;
	public static Renderer renderer;
	public static Ball ball;
	public static Paddle paddle1, paddle2;
	public static Ai ai;
	public static Score score;
	public static Sound sound;
	
	public Pong() {
		frameObj = new Frame();
		renderer = new Renderer();
		ball = new Ball(frameObj.getWidth()/2, frameObj.getHeight()/2, 12, 12, 3, 3);
		paddle1 = new Paddle(10, frameObj.getHeight()-100, 10, 75, 5);
		paddle2 = new Paddle(frameObj.getWidth()-20, frameObj.getHeight()/2, 10, 75, 2);
		ai = new Ai(paddle2);
		score = new Score(5);
		sound = new Sound();
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
