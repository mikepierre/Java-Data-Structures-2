public class LinkedList {
	public Node link; // first link
	
	class Node{
		int key;
		int value;
		Node next;
		
		Node(int key, int value){
			this.key = key;
			this.value = value;	
		}
		
		public void show(){
			System.out.println(this.value);
		}
	}
	
	public void insert(int key, int value){
		Node node = new Node(key, value);
		node.next = link;	
		link = node;
	}
	
	// Delete first
	public Node deleteFirst(){
		Node node = link;
		if(!isEmpty()){
			// Removes the Linke from the list
			link = node.next;
		} else {
			System.out.println("Link Empty ");
		}
		return node; // the node reference
	}
	
	// Delete Link 
	public Node deleteLink(int key){
		Node first = link;
		Node last = link;
		
		while(first.key != key){
			
			if(first.next == null){
				return null;
			} else {
				last = first;
				first = first.next;
			}
			
			if(last == first){
				first = first.next;
			} else {
				last.next = first.next;
			}	
		}
		return link;
	}
	
	// Go through the list
	public void traverse(){
		Node node = link;
		
		while(node != null){
			node.show();
			System.out.println(node.next);
			node = node.next;
		}
	}
	
	public Node find(int key){
		Node node = link;
		
		if(!isEmpty()){
				while(node.key != key){
					if(node.next == null){
						return null;
					} else {
						node = node.next;
					}
			}
		}
		return link;
	}
	
	public boolean isEmpty(){
		return link == null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
}
