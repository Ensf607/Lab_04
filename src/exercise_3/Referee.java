package exercise_3;

/**
 * This class is responsible for setting the players on the board, then starting the game
 * @author zchem
 *
 */
public class Referee {
	//class objects 
	private Player xPlayer,oPlayer;
	private Board board;

	/**
	 * Setter for {@link #oPlayer}
	 * @param oPlayer passed parameter of type Player
	 */
	public void setoPlayer(Player oPlayer) {
		this.oPlayer=oPlayer;
	}
	/**
	 * Setter for {@link #xPlayer}
	 * @param xPlayer passed parameter of type Player
	 */
	public void setxPlayer(Player xPlayer) {
		this.xPlayer=xPlayer;
	}
	/**
	 * This method is resposible for setting the Players, displaying the board , then staring the game
	 * by invoking {@link Player#play()} of the xPlayer
	 */
	public void runTheGame() {
		xPlayer.setOpponent(oPlayer);
		oPlayer.setOpponent(xPlayer);
		board.display();
		xPlayer.play();
		
		
	}
	/**
	 * Setter for the {@link #board}
	 * @param theBoard
	 */
	public void setBoard(Board theBoard) {
		this.board=theBoard;
	}

}
