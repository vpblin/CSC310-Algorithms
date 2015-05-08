package Polynomials;

//thanks http://pages.pacificcoast.net/~cazelais/251/gauss-jordan.pdf
//thanks http://people.ucsc.edu/~ptantalo/math21/Winter07/GaussJordan.java


public class GJM {

	public static void main(String[] args) 
	{
		
		double [][] temp = new double [4][5];
		double [][] inv = new double [4][5]; 
		double [][] givenm = {{3,6,12,9,78},{2,3,5,7,48},{1,7,2,3,27},{4,9,1,2,45}};;

		
		for(int i = 0; i < inv.length; i++)
		{
			for(int y = 0; y < inv[i].length; y++)
			{
				if(i == y)
				{
					inv[i][y] = 1;
				}
				else
				{
					inv[i][y] = 0;
				}
			}
		}
		

		for(int i = 0; i < givenm.length; i++)
		{
			for(int y = 0; y < givenm[i].length; y++)
			{
				temp[i][y] = givenm[i][y];
				System.out.print(givenm[i][y] + " ");
			}
		}
		System.out.println();

		for(int i = 0; i < inv.length; i++)
		{
			for(int y = 0; y < inv[i].length; y++)
			{
				System.out.print(inv[i][y] + " ");
			}
			System.out.println();
		}
		
		
		for(int i = 0; i < givenm.length; i++)
		{
			for(int y = 0; y < givenm[i].length; y++)
			{
				if(i == y)
				{
					double div = givenm[i][y];
					for(int x = 0; x < givenm[i].length; x++)
					{
						if(givenm[i][y]!= 0)
						{
							givenm[i][x] = givenm[i][x]/div;
							inv[i][x] = givenm[i][x]/div;
						}
					}
					
					for(int x = 0; x < givenm.length; x++)
					{
						if(x != i)
						{
							double mult = givenm[x][y];
							for(int z = 0; z < givenm[x].length; z++)
							{
								givenm[x][z] -= givenm[i][z] * mult; 
								inv[x][z] -= givenm[i][z] * mult; 
							}
						}
					}
					
				}
			}
		}


		for(int i = 0; i < temp.length; i++)
		{
			for(int y = 0; y < temp[i].length; y++)
			{
				System.out.print(temp[i][y] + " ");
			}
			System.out.println();
		}

		
		for(int i = 0; i < givenm.length; i++)
		{
			for(int y = 0; y < givenm.length; y++)
			{
				temp[i][y] = temp[i][y] * inv[y][i];
			}
		}
		

	}
	



}


