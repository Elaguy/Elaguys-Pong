package schultz.personal.pong;

public class Score {
	private int playerScore;
	private int aiScore;
	private int winNum;
	
	public Score(int num) {
		winNum = num;
	}
	
	public void checkScore() {
		if(playerScore >= winNum) { // player won, ai lost
			Pong.renderer.setPlayerWon(true);
		}
		
		else if(aiScore >= winNum) { // player lost, ai won
			Pong.renderer.setAiWon(true);
		}
	}
	
	public void setPlayerScore(int score) {
		playerScore = score;
	}
	
	public void setAiScore(int score) {
		aiScore = score;
	}
	
	public int getPlayerScore() {
		return playerScore;
	}
	
	public int getAiScore() {
		return aiScore;
	}
}
