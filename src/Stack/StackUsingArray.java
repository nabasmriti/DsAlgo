package Stack;

public class StackUsingArray {
   int top =-1;
   int count = 1000;
   int ar[] = new int [count];
   void push(int n) {
	   ar[++top] = n;
   }
   int pop() {
	  return ar[top--]; 
   }
   int top() {
	   return ar[top];
	   
   }
   int size() {
	   return top + 1;
   }
}
