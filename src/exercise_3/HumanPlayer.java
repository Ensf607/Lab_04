package exercise_3;

import java.util.Scanner;

public class HumanPlayer extends Player {

	public HumanPlayer(String name, char mark) {
		super(name, mark);
		// TODO Auto-generated constructor stub
	}



	@Override
	protected void makeMove() {
		Scanner scanner =new Scanner(System.in);
		System.out.println(name+", what row should your next "+mark+" be placed in ?");
		int row=scanner.nextInt();
		System.out.println(name+", what column should your next "+mark+" be placed in ?");
		int col =scanner.nextInt();
		if((row>=0 && row<=2)&&((col>=0 && col<=2))) {
		if (board.getMark(row, col)==' ' ) {
			 {
				board.addMark(row, col, mark);	
			}
			
		
		}
		else {
			System.err.println("There is a mark there, choose another location");
			makeMove();
		}
		}
		else {
			System.err.println("Out of bounds please try again!!");
			makeMove();
		}		
	}

}
