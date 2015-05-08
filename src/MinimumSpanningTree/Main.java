package MinimumSpanningTree;

public class Main {

	public static void main(String[] args) throws Exception {
		// http://www.quora.com/How-does-Kargers-randomized-algorithm-for-minimum-spanning-tree-work
		MST graph = new MST();
		graph.addVertex('A');
		graph.addVertex('B');
		graph.addVertex('C');
		graph.addVertex('D');
		graph.addVertex('E');
		graph.addVertex('F');
		graph.addVertex('G');
		graph.addVertex('H');
		graph.addVertex('X');
		graph.addVertex('Z');

		graph.addEdge(0, 1, 1);
		graph.addEdge(0, 3, 2);
		graph.addEdge(1, 2, 2);
		graph.addEdge(2, 3, 4);
		graph.addEdge(3, 4, 2);
		graph.addEdge(3, 5, 2);
		graph.addEdge(4, 5, 5);
		graph.addEdge(5, 6, 4);
		graph.addEdge(5, 7, 5);
		graph.addEdge(6, 7, 1);

		
		
		graph.avadakedavra();
	}
}
