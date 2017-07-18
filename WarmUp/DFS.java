public class DFS {

	public static void main(String[] args) {
		DFS dfs = new DFS();
		
		for (int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				dfs.adjMatrix[i][j] = 0;
			}
		}
		
		dfs.addVertex("a");
		
		dfs.addEdge(0, 0);
		
		dfs.dfs();
	}
	
	Vertex vertices[];
	int adjMatrix[][];
	int count =0;
	
	
	public void addVertex(String label){
		
		Vertex vertex = null;
		
		vertex.label = label;
		vertex.visited = false;
		
		vertices[count++] = vertex;
		
	}
	
	public void addEdge(int start, int end){
		adjMatrix[start][end] = 1;
		adjMatrix[end][start] = 1;
	}
	
	public void displayVertex(int i){
		System.out.println(vertices[i].label);
	}
	
	public int univistedAdjecantVertex(int vertexIndex){
		for(int i = 0; i < count; i++){
			if(adjMatrix[vertexIndex][i] == 1 && vertices[i].visited == false){
				return i;
			}
		}
		return 0;
	}
	
	public void dfs(){
		int i;
		displayVertex(0);
		Stack stack = new Stack();
		stack.push(0);
		
		while(stack.isEmpty() != 0){
			// get univstied vertex of vertex which is at top of stack.
			int univistedVertex = univistedAdjecantVertex(stack.peek());
			
			if(univistedVertex == 0){
				stack.pop();
			} else {
				vertices[univistedVertex].visited = true;
				displayVertex(univistedVertex);
				stack.push(univistedVertex);
			}
		}
	}
	
	public class Vertex{
		
		String label;
		boolean visited;
		
		Vertex(String label, boolean visited){
			this.label = label;
			this.visited = visited;
		}
	}
	
	
}
