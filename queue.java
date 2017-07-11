public class queue {

	int max;
	int array[];
	int front = 0;
	int rear = 0; 
	int count = 0;
	public int peek(){
		return array[front];
	}
	
	public int isEmpty(){
		if(count == 0){
			return 0;
		} else {
			return 1;
		}
	}
	
	public int isFull(){
		if(count == max){
			return 0;
		} else {
			return 1;
		}
	}
	
	public int size(){
		return count;
	}
	
	public void enqueue(int data){
		if(isFull() != 0){
			if(rear == max-1){
				rear = -1;
			}
			array[++rear] = data;
			count++;
		}
	}
	
	public int dequeue(){
		int data = array[front++];
		if(front == max){
			front = 0;
		}
		count--;
		return data;
	}
	
}
