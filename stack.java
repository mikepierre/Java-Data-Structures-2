package cs;

public class Stack {
	
	int top = -1;
	int max = 10;
	int stack[];
	
	public int push(int data){
		if(isFull() == 1){
			top = top + 1;
			stack[top]  =data;
			return data;
		} else {
			return 0;
		}
	}
	
	public int pop(){
		int data;
		
		if(isEmpty() != -1){
			data = stack[top];
			top = top - 1;
			return data;
		} else {
			return 0;
		}
	}
	
	public int peek(){
		return stack[top];
	}
	
	public  int isEmpty(){
		if(top == -1){
			return 1;
		} else {
			return 0;
		}
	}
	
	public int isFull(){
		if(top == max){
			return 1;
		} else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			while(isEmpty() != 1){
				int data = pop();
				System.out.println(data);
			}
	}

}
