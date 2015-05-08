package MinimumSpanningTree;

class Edge {
	public int source;
	public int destination;
	public int d;

	public Edge(int a, int b, int c) {
		source = a;
		destination = b;
		this.d = c;
	}

	public int getSource() {
		return source;
	}

	public void setSource(int source) {
		this.source = source;
	}

	public int getDestination() {
		return destination;
	}

	public void setDestination(int destination) {
		this.destination = destination;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

}
