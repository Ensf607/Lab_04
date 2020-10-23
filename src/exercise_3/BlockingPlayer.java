package exercise_3;

public class BlockingPlayer extends RandomPlayer{

	public BlockingPlayer(String name, char mark, RandomGenerator random) {
		super(name, mark, random);
		
	}
protected void makeMove() {
	if(testForBlocking(0,0)==false) 
	helper();
	}

protected void helper() {
	int row=random.discrete(0,2);
	int col=random.discrete(0,2);

if (board.getMark(row, col)==' ' ) 
	 {System.out.println("Random insert!!");
		board.addMark(row, col, mark);}
		else
			helper();
}

protected boolean testForBlocking(int row, int col) {

	// check in the row direction
	for ( row = 0; row < 3; row++) {
		int row_result_opponent = 0;
		int row_result_player = 0;
		for (col = 0; col < 3; col++) {
			if (board.getTheBoard()[row][col] == opponent.mark)
				row_result_opponent++;
			else if (board.getTheBoard()[row][col] == mark) {
				row_result_player++;
			}}
			if (row_result_opponent > 1 && row_result_player==0) {
				System.out.println("Blocking row!!! ");
				for (int col2 = 0; col2 < 3; col2++) {
					if (board.getTheBoard()[row][col2] ==' ') {
						board.addMark(row, col2, mark);
						
					}
				}
				return true;
			}
		

	}

	// check in the column direction
	for ( col = 0; col < 3; col++) {
		int col_result_opponenet = 0;
		int col_result_player = 0;
		for ( row = 0; row < 3; row++) {
			if (board.getTheBoard()[row][col] == opponent.mark)
				col_result_opponenet++;
			else if (board.getTheBoard()[row][col] == mark)
				col_result_player++;}
			if (col_result_opponenet > 1 && col_result_player==0) {
				System.out.println("Blocking col!!! ");
				for (int row2 = 0; row2 < 3; row2++) {
					if (board.getTheBoard()[row2][col] ==' ') {
						board.addMark(row2, col, mark);
						
					}
				}

				return true;
			}
		}
	
	// if there is no winners then check the diagonals

	int diag1Result_opponenet = 0;
	int diag1Result_player = 0;
	for (row = 0; row < 3; row++) {
		if (board.getTheBoard()[row][row] == opponent.mark)
			diag1Result_opponenet++;
		else if (board.getTheBoard()[row][row] ==mark)
			diag1Result_player++;}
		if (diag1Result_opponenet > 1 && diag1Result_player==0) {
			System.out.println("Blocking diag 1 !!!");
			for (int row2 = 0; row2 < 3; row2++) {
				if (board.getTheBoard()[row2][row2] ==' ') {
					board.addMark(row2, row2, mark);
					
				}
			}
			return true;
		}
	

	int diag2Result_opponenet = 0;
	int diag2Result_player = 0;
	for ( row = 0; row < 3; row++) {
		if (board.getTheBoard()[row][2- row] == opponent.mark)
			diag2Result_opponenet++;
		else if (board.getTheBoard()[row][2- row] == mark)
			diag2Result_player++;}
		if (diag2Result_opponenet > 1 && diag2Result_player==0) {
			{System.out.println("Blocking diag 2 !!!");
				for (int row2 = 0;  row2 < 3; row2++) {
					if (board.getTheBoard()[row2][2-row2] ==' ') {
						board.addMark(row2, (2-row2), mark);
						
					}
			}}
			return true;
		}

	
	return false;
}
}
