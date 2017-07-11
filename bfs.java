public class bfs {

	public static void main(String[] args) {
		BFS2 tree = new BFS2();
		
		tree.addNode(1, "mike");
		// theTree.inOrderTraverseTree(theTree.root);
		// theTree.preorderTraverseTree(theTree.root);
		// theTree.postOrderTraverseTree(theTree.root);
	}
	Node root;
	public void addNode(int key, String name){
		// create new node and intiilize it.
		
		Node newNode = new Node(key, name);
		// if there is no root then this becomes root
		if(root == null){
			root = newNode;
		} else {
			//; Set root as the Node we will start
			// with as we traverse the tree
			Node focusNode = root;
			Node Parent;
			while(true){
				Parent = focusNode; 
				if(key < focusNode.key){
					focusNode = focusNode.leftChild;
					if(focusNode == null){
						Parent.leftChild = newNode;
						return;
					}
				} else {
					focusNode = focusNode.rightChild;
					if(focusNode == null){
						Parent.rightChild = newNode;
						return; // all done.
					}
				}
			}
		}
	}
	
	public boolean remove(int key) {
		return false;
	}
	
	public void preOrderedTraversal(Node focusNode){
		if(focusNode != null) {
			preOrderedTraversal(focusNode.leftChild);
			
			System.out.println(focusNode);
			
			preOrderedTraversal(focusNode.rightChild);
			
		}
	}
	
	public void inOrderedTraversal(Node focusNode){
		System.out.println(focusNode);
		inOrderedTraversal(focusNode.leftChild);
		inOrderedTraversal(focusNode.rightChild);
		
	}
	
	public void postOrderedTraversal(Node focusNode){
		postOrderedTraversal(focusNode.leftChild);
		postOrderedTraversal(focusNode.rightChild);
		System.out.println(focusNode);
	}
	
	class Node {
		int key; 
		String name;
		
		Node leftChild;
		Node rightChild;
		
		Node(int key, String name){
			this.key = key;
			this.name = name;
		}
		
		public String toString(){
			return name + key;
		}
	}
	
	
}
