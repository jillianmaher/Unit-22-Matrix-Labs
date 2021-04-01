/* Uncomment the section for the lab you want to test. 
 * Complete the comments below about the lab you want graded 
 *
 * NAME: 
 * DATE: 
 * LAB TO GRADE: 
 * 
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

class Main 
{
  public static void main(String[] args) throws IOException
  {
    //TEST CODE FOR TICTACTOE.  Delete the /* and */
    
    /*
    TicTacToe game = new TicTacToe( "XXXOOXXOO" );
		System.out.println( game ); //will output the board
		System.out.println( game.getWinner() ); //will output "X wins horizontally"

		game = new TicTacToe( "OXOOXOXOX" );
		System.out.println( game ); //will output the board
		System.out.println( game.getWinner() ); //will output "cat's game - no winner"

    */

    //TEST CODE FOR MAGIC SQUARE. Uses the data file magic1.dat
    //   Delete the /* and */ 

    /*
    Scanner file = new Scanner( new File("magic1.dat") );
		int zz = file.nextInt();
		for( int xx = 0; xx < zz; xx++)
		{
			int size = file.nextInt();
			file.nextLine();  //pick up the trash left by the prior line
			String line = file.nextLine();
			MagicSquare1 one = new MagicSquare1(size, line);
			System.out.println( one );
			System.out.println( one.isMagicSquare() ? "MAGIC SQUARE\n\n" : "NOT MAGIC SQUARE\n\n" );
		}

    */

    //TEST CODE FOR KITTYMAP. Delete the /* and */

    /*
    KittyMap km = new KittyMap(10, 10);
		System.out.println( km + "\n\n");
		km.printKittyCount();

    */

  }
}