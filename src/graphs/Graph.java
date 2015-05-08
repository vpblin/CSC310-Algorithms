package graphs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Graph implements Iterable{
	private int V = 0;
	private LinkedList<Integer> [] list; 
	private int totalVertex;
	private int [][] weight = new int[100][100];
	private String[] edgesweights = new String[10000];
	
	public Graph(String filename) throws FileNotFoundException{
		

		File input = new File(filename);
		
		Scanner in = new Scanner(input);
		
		int numberOfVertices = in.nextInt();
			

		
		this.V = numberOfVertices;
		list = new LinkedList[numberOfVertices];
		for(int i =0 ; i < V; i++){
			list[i] = new LinkedList();
			
		}

		while(in.hasNext()){
			String str = in.nextLine();
			if(str.contains(",")){

				int a = Integer.parseInt(str.substring(0, str.indexOf(",")));				
				int b = Integer.parseInt(str.substring(str.indexOf(",") + 1));
				
				addEdge(a, b);
				addEdge(b, a);



			}
			


		//UNDIRECTED GRAPH

			
		}
		

	}

	public void printGraphByWeight(){
		int current_weight = 1;
		
		while(current_weight < 200){
			for(int i = 0; i < 100; i ++){
				for(int j = 0; j < 100; j++){
					if(weight[i][j] == current_weight){
						System.out.println("Connection between " + i + " " + j + " is : " + weight[i][j]);
						GenerateGraphByWeight(i,"", current_weight);
					}
				}
			}
			current_weight ++;
		}
	}
	
	public void GenerateGraphByWeight(int a, String edges, int current_weight){
		
		while(current_weight < 200){
			for(int i = a + 1; i < 100; i ++){
				for(int j = 0; j < 100; j++){
					if(weight[i][j] == current_weight){
						System.out.println("Connection between " + i + " " + j + " is : " + weight[i][j]);
						GenerateGraphByWeight(i,"", current_weight);
					}
				}
			}
		}
	}

	public int getWeightBetween(int a, int b){
		return this.weight[a][b];
	}
	public Graph(int V) throws Exception{
		if(V < 1){
			throw new Exception("Cannot be less than 1");
		}
		
		this.V = V;
		list = new LinkedList[V];
		for(int i =0 ; i < V; i++){
			list[i] = new LinkedList();
			
		}
	}
	
	public void setV(int v) {
		V = v;
	}
	
	public int getV(){
		return this.V;
	}
	
	public int getNumVertices(){
		return this.V;
	}

	public void setList(LinkedList[] list) {
		this.list = list;
	}

	public void setTotalVertex(int totalVertex) {
		this.totalVertex = totalVertex;
	}
	
	public void String(){
		for(int i = 0; i < V; i++){
			if(!list[i].isEmpty()){
			System.out.print(i + " :");

			Iterator it = list[i].iterator();
			
			
			
			for(int a : list[i]){
				System.out.print(" " + a + " (" + weight[i][a]+ ")");
				
			}

			System.out.println("\t\t Size " + list[i].size());
			
			
			}
			
		}
	}
	
	public int getNumEdges(){
		int total = 0;
		for(int i = 0; i < V; i++){
			total += list[i].size();
		}
		
		return total;
	}
	
	/*public void List<Integer> path(int v, int w){
		DFS path = new DFS(this);
		
	}*/
	
	public LinkedList<Integer> getAdjacent(int v){
		return list[v];
	}
	
	public boolean isAdjacent(int v, int w){
		return list[v].contains(w);
	}
	
	
	
	public void addEdge(int Vert, int Connect){
		list[Vert].add(Connect);
		totalVertex++;
	}
	public void addEdge(int Vert, int Connect, int Weight){
		list[Vert].add(Connect);
		weight[Vert][Connect] = Weight;
		
		totalVertex++;
	}

	public static Graph ReadGraph(String filename) throws Exception{
		
		File input = new File(filename);
		if(!input.exists()){
			throw new Exception("File does not exist");
		}
		
		Scanner in = new Scanner(input);
		
		Graph G = new Graph(in.nextInt());
		
		while(in.hasNext()){
			int a = in.nextInt();
			int b = in.nextInt();
		//UNDIRECTED GRAPH
			G.addEdge(a, b);
			G.addEdge(b, a);

		}

		
		return G;
		

	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}

