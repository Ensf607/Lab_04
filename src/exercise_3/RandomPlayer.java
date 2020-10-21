package exercise_3;

public class RandomPlayer extends Player {
	RandomGenerator random;

	public RandomPlayer(String name, char mark,RandomGenerator random) {
		super(name, mark);
		this.random=random;
		// TODO Auto-generated constructor stub
	}



	@Override
	protected void makeMove() {

		int row=random.discrete(0, 2);
		int col=random.discrete(0, 2);
		if (board.getMark(row, col)==' ' ) {
			 {
				board.addMark(row, col, mark);	
			}
			
		
		}
		else {
			makeMove();
		}
			
	
	}

}
