//Arthur Wirsching
public class Stack
{
   private Node head;
   public Stack()
   {
      head=null; //Stack is empty by default.
   }
   public void push(int i)
   {
      head = new Node (i,head); //Sets the head to a new Node, with the original Node as next.
   }
   public void pop()
   {
      if(head!=null)
         head = head.getNext(); //Sets head pointer to the next Node.
      else
         System.out.println("Stack already empty.");
   }
   public Node peek()
   {
      return head;
   }
   public boolean isEmpty()
   {
      if(head==null)
         return true;
      else
         return false;
   }
   public void printStack()
   {
      Node n = head;
      while(n!=null)
      {
         System.out.print(n.getNumber());
         n=n.getNext();
      }
   }
}


