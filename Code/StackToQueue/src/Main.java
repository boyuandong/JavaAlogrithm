
public class Main {
	
	 public static void main(String[] args){
		 MyQueue q = new MyQueue();
		 // push the queue should be ]1,2,3
		 q.push(1);
		 q.push(2);
		 q.push(3);
		// pop the queue should be ]1,2,3
		 System.out.print(q.pop() + "\n"); // 1
		// pop the queue should be ]2,3
		 System.out.print(q.pop()+ "\n"); // 2
		// pop the queue should be ]3
		 System.out.print(q.pop()+ "\n"); // 3
		 
	 }
}
