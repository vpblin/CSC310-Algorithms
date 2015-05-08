package MinimumSpanningTree;

import java.util.Queue;

public class MST {
	// thanks: CSC 220
	// thanks:
	// http://stackoverflow.com/questions/29355121/design-a-graph-where-shortest-path-tree-is-longer-than-minimum-spanning-tree
	// thanks: http://www.cs.usask.ca/
	// thanks: http://en.wikipedia.org/wiki/Minimum_spanning_tree

	public int V;
	public int thisV;
	public Graph g;
	public int no_of_tree;
	public que q;
	public Node nodes[];

	public MST() throws Exception {
		nodes = new Node[20];
		// adjMat = new int[20][20];
		g = new Graph(20);
		V = 0;
		for (int j = 0; j < 20; j++) {
			for (int k = 0; k < 20; k++) {
				// adjMat[j][k] = 10000000;
			}
		}
		q = new que();
	}

	public void addVertex(char lab) {
		nodes[V++] = new Node(lab);
	}

	public void addEdge(int start, int end, int weight) {
		// adjMat[start][end] = weight;
		// adjMat[end][start] = weight;
		g.addEdge(start, end, weight);
	}

	public void printV(int v) {
		System.out.println(nodes[v].label);
	}

	public void putInTheQue(int nod, int D) {
		int queueIndex = q.find(nod);
		if (queueIndex != -1) {
			Edge myEdge = q.peek(queueIndex);
			int original = myEdge.getD();
			if (original > D) {
				q.remove(queueIndex);
				Edge theEdge = new Edge(thisV, nod, D);
				q.insert(theEdge);
			}
		} else {
			Edge theEdge = new Edge(thisV, nod, D);
			q.insert(theEdge);
		}
	}

	public void avadakedavra() {
		thisV = 0;
		while (no_of_tree < V - 1) {
			nodes[thisV].isInTree = true;
			no_of_tree++;
			for (int i = 0; i < V; i++) {

				if (i == thisV || nodes[i].isInTree) {
					continue;
				}
				int distance = g.getWeightBetween(thisV, i);
				if (distance == 10000000)
					continue;
				putInTheQue(i, distance);
			}
			Edge theEdge = q.removeMin();
			int source_of_life = theEdge.getSource();
			thisV = theEdge.getDestination();
			System.out.println("XXXXX");
			System.out.println("X " + nodes[source_of_life].getName() + " X");
			System.out.println("X " + nodes[thisV].getName() + " X");
			System.out.println("XXXXX");

		}
		setNodeFalse();
	}

	public String continueTree(int a) {
		return " ";
	}

	public void setNodeFalse() {
		for (int i = 0; i < V; i++) {
			nodes[i].setInTree(false);
		}

	}

}