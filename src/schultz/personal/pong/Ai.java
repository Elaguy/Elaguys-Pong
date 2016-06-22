package schultz.personal.pong;

public class Ai {
	
	private Paddle aiPaddle;
	
	public Ai(Paddle aiPad) {
		aiPaddle = aiPad;
	}
	
	public void moveAi() {
		if(aiPaddle.getYPos()-aiPaddle.getSpeed() > 10)
			if(Pong.ball.getYPos() < aiPaddle.getYPos())
				aiPaddle.setYPos(aiPaddle.getYPos() - aiPaddle.getSpeed());
		
		if(aiPaddle.getYPos()+aiPaddle.getSpeed() < Pong.frameObj.getHeight()-85)
			if(Pong.ball.getYPos() > aiPaddle.getYPos())
				aiPaddle.setYPos(aiPaddle.getYPos() + aiPaddle.getSpeed());
	}
	
}
