package Polynomials;
import java.util.Random;

//thanks http://pages.pacificcoast.net/~cazelais/251/gauss-jordan.pdf
//thanks http://people.ucsc.edu/~ptantalo/math21/Winter07/GaussJordan.java


public class GJM {

	public static void main(String[] args) 
	{
		
		double [][] matrix = {{3,6,12,9,78},{2,3,5,7,48},{1,7,2,3,27},{4,9,1,2,45}};;
		double [][] copy = new double [4][5];
		double [][] inverse = new double [4][5]; 
		
		Random gen = new Random();
		
		for(int i = 0; i < inverse.length; i++)
		{
			for(int y = 0; y < inverse[i].length; y++)
			{
				if(i == y)
				{
					inverse[i][y] = 1;
				}
				else
				{
					inverse[i][y] = 0;
				}
			}
		}
		

		for(int i = 0; i < matrix.length; i++)
		{
			for(int y = 0; y < matrix[i].length; y++)
			{
				copy[i][y] = matrix[i][y];
				System.out.print(matrix[i][y] + " ");
			}
		}
		System.out.println();

		for(int i = 0; i < inverse.length; i++)
		{
			for(int y = 0; y < inverse[i].length; y++)
			{
				System.out.print(inverse[i][y] + " ");
			}
			System.out.println();
		}
		
		
		for(int i = 0; i < matrix.length; i++)
		{
			for(int y = 0; y < matrix[i].length; y++)
			{
				if(i == y)
				{
					double div = matrix[i][y];
					for(int x = 0; x < matrix[i].length; x++)
					{
						if(matrix[i][y]!= 0)
						{
							matrix[i][x] = matrix[i][x]/div;
							inverse[i][x] = matrix[i][x]/div;
						}
					}
					
					for(int x = 0; x < matrix.length; x++)
					{
						if(x != i)
						{
							double mult = matrix[x][y];
							for(int z = 0; z < matrix[x].length; z++)
							{
								matrix[x][z] -= matrix[i][z] * mult; 
								inverse[x][z] -= matrix[i][z] * mult; 
							}
						}
					}
					
				}
			}
		}


		for(int i = 0; i < copy.length; i++)
		{
			for(int y = 0; y < copy[i].length; y++)
			{
				System.out.print(copy[i][y] + " ");
			}
			System.out.println();
		}

		
		for(int i = 0; i < matrix.length; i++)
		{
			for(int y = 0; y < matrix.length; y++)
			{
				copy[i][y] = copy[i][y] * inverse[y][i];
			}
		}
		

	}
	



}


