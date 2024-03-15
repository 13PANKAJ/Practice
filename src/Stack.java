import java.util.EmptyStackException;

public class Stack<C> {

    static StackNode top;
   static  int length;
    public C pop;

    static class StackNode{
        int data;
        StackNode next;

        public StackNode(int data) {
            this.data = data;
        }


    }

    public  void push(int data)
    {
        StackNode temp = new StackNode(data);
        temp.next=top;
        top=temp;
        length++;
    }

    public void pop()
    {
        if(isEmpty())
        {
            throw new EmptyStackException();
        }
        int result = top.data;
            top = top.next;
            length--;

    }

    public boolean isEmpty() {

        return length==0;
    }

    public char peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        StackNode curr=top;
        while(curr != null) {
            System.out.println("print stack" + curr.data);
            curr=curr.next;
        }

        return 0;
    }
    public void main(String[] args) {
        Stack<C> stk = new Stack<C>();
        stk.push(10);
        stk.push(20);
        stk.push(40);
        stk.peek();
       stk.pop();
        System.out.println("new stack");
       stk.peek();

    }
}
