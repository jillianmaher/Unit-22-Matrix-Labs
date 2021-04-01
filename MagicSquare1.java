//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MagicSquare1
{
	private int[][] mat;

	/* Finished constructor. 
   *   Sizes the matrix and fills with numbers 
   *   according to the input String
   */
	public MagicSquare1(int size, String numbers)
	{
		mat = new int[size][size];
		String[] s = numbers.split(" " );
		int k = 0;
		for( int i = 0; i < size; i++)
		{
			for( int j = 0; j < size; j++)
			{
				mat[i][j] = Integer.parseInt(s[k++]);
			}
		}		
	}

  /*  Return true or false if the mat is a Magic Square
   *  
   *  In a Magic Square, all rows, colums, 
   *     and diagonals are the same sum
   */
	public boolean isMagicSquare()
	{
		return false;
	}

  /* Calculate the sum of the given row.
   * 
   * For example, in the given matrix 
   *     8 1 2 
   *     3 6 7
   *     9 0 4
   *  sumRow(1) will return 16 == ( 3 + 6 + 7)
   */
	public int sumRow( int r )
	{
		return 0;
	}

  /* Calculate the sum of the given row.
   * 
   * For example, in the given matrix 
   *     8 1 2 
   *     3 6 7
   *     9 0 4
   *  sumCol(1) will return 7 == ( 1 + 6 + 0)
   */
	public int sumCol( int c )
	{
		return 0;
	}

  /*  Find the sum of the values in the diagonal 
   *    from [0][0] to [length-1][length-1]
   */
	public int sumDownDiag()
	{
		return 0;
	}

  /*  Find the sum of the values in the diagonal
   *    from [0][length-1] to [length-1][0]
   */
	public int sumUpDiag()
	{
		return 0;
	}
/* Output the given mat in row-column view
   * For example,
   *     8 1 2 
   *     3 6 7
   *     9 0 4
   */
	public String toString()
	{
		String output="";



		return output;
	}
}