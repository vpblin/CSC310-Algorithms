package graphs;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import Graphs.BFS;


public class test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub		
		
		Graph g = new Graph(10);
		g.addEdge(1, 2, 3);
		g.addEdge(2, 1, 3);
		g.addEdge(2, 3, 3);
		g.addEdge(3, 2, 3);

		g.addEdge(2, 5, 3);
		g.addEdge(5, 2, 3);

		g.addEdge(3, 5, 3);
		g.addEdge(5, 3, 3);

		g.addEdge(3, 8,2);
		g.addEdge(8, 3,3);

		g.addEdge(8, 5,4);
		g.addEdge(5, 8,5);

		g.addEdge(5, 2,6);
		g.addEdge(2, 5,6);

		g.addEdge(4, 5,7);
		g.addEdge(5, 4,8);

		g.addEdge(4, 7,1);
		g.addEdge(7, 4,2);

		g.addEdge(2, 7,3);
		g.addEdge(7, 2,4);

		g.addEdge(7, 8,5);
		g.addEdge(8, 7,6);

		g.addEdge(4, 6,7);
		g.addEdge(6, 4,8);

		g.addEdge(6, 7,9);
		g.addEdge(7, 6,10);

		g.addEdge(1, 6,11);
		g.addEdge(6, 1,23);

		
		g.String();

		//DFS search2 = new DFS(g);
		
		System.out.println("Are 9 and 0 adjacent? " + g.isAdjacent(1, 8));
		System.out.println("Are 4 and 7 adjacent? " + g.isAdjacent(4, 7));

		DFS search2 = new DFS(g);
		search2.DFScomplicated(4);
		System.out.println("Are 9 and 0 connected? " + search2.connected(1, 8));
		System.out.println("Are 4 and 7 connected? " + search2.connected(4, 7));

		
		
		int [] path = search2.getEdgeTo();
		for(int i = 0; i < path.length; i++){
			System.out.println(i + "    " + path[i]);
		}

		int searching = 9;
		System.out.println("DFS path from 9 to 4: ");
		search2.setEverythingFalse();

		if(search2.connected(9, 4)){
			while(searching != 0){
				searching = path[searching];
				System.out.print(searching +  "   ");
			}
		}else{
			System.out.println("No Path Found");
		}
		System.out.println("\n\nPrint Connected Components ...");

		search2.printConnectedComponents();
		
		
		System.out.println("\n\nSearching BFS ...");
		BFS bf = new BFS(g, 4);
		int[] pathBFS = bf.getEdgeTo();
		
		for(int i = 0; i < pathBFS.length; i++){
			System.out.println(i + "    " + pathBFS[i]);
		}
		int searching2 = 8;
		
		System.out.println("BFS path from 4 to 7: ");
		bf.printPathTo(g, 4, 7);
		
		g.printGraphByWeight();
	}

}
