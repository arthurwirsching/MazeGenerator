//Arthur Wirsching
public class Queue
{
   private Node head;
   public Queue()
   {
      head=null; //Queue is empty by default.
   }
   public void enqueue(Edge i)
   {
      head = new Node (i,head); //Sets the head to a new Node, with the original Node as next.
      if(Length()>1)
         minHead();
   }
   public void addHead(Edge i)
   {
      head = new Node (i,head); //Sets the head to a new Node, with the original Node as next.
   }
   public void dequeue()
   {
      if(head!=null)
      {
         head = head.getNext(); //Sets head pointer to the next Node.
         if(Length()>1)
         minHead();
      }
      else
         System.out.println("Queue already empty.");
   }
   public Node getHead()
   {
      return head;
   }

   public void minHead() //Sets the edge with the smallest weight in the queue to the head.
   { 
      Node M=head;
      Node O=null;
      Edge E=head.getEdge();
      int m=E.getB();
      int i=1;
      int j=1;
      M=M.getNext();
      while(M!=null)
      {
         //System.out.println(M.getEdge().getB());
         i++;
         if(M.getEdge().getB()<m)
         {
            m=M.getEdge().getB();
            E=M.getEdge();
            O=M;
            j=i;
         }
         M=M.getNext();
      }
      if(j!=1)
      {
         //Remove(j);
         addTail(head.getEdge());
         Node N;
         if(head.getNext()==O)
         {
            N = new Node(E,head.getNext().getNext());
         }
         else
         {
            N = new Node(E,head.getNext());
         }
         head=N;
      }
      
      

   }
   
   public int getWeight(int x)
      {
         Node N = head;
         int w=0;
         while (N!=null)
         {
            if(N.getEdge().getA()==x)
               w=N.getEdge().getB();
            N=N.getNext();
         }
         return w;
   }
   public void updateEdge(int x,int b,int p) //Recursively updates an edge that has 'x' as its 'a' value.
   {
      head=updateEdge(head,x,b,p);
      minHead(); //After updating, need to keep the minimum weight at the head.
   }
   private Node updateEdge(Node N, int x,int b, int p)
   {
      if(N==null)
      {
      }
      else if (N.getEdge().getA()==x)
      {
         N.setEdgeB(b);
         N.setEdgeP(p);
      }
      else
         N.setNext(updateEdge(N.getNext(),x,b,p));
      return N;
   }
   
   public void Remove(int i){ //removes the 'i'th node in the linked list
      if (i==1)
         head=head.getNext();
      else
      {
         Node newhead=head;
         for (int z=1;z<i;z++)
         {
            newhead=newhead.getNext();
         }
         Node nexthead = newhead.getNext();
         newhead.setNext(nexthead.getNext());
         
      }
   }
   
   
   public void addTail(Edge i) //Inserts into the end of the Linked List
   {
      head = addTail(head,i);
   }
   
   private Node addTail(Node L, Edge i)
   {
      if (L == null)
      {
         L = new Node (i,null);
      }
      else
      {
         L.setNext(addTail(L.getNext(),i));
      }
      return L;
   }
   
   public int Length() {
    return length(head);
  }
  private static int length(Node N)
  {
    int L;
    if(N==null) { //Easiest case, is 0 Nodes long.
      L=0;
    }
    else {
      L=1+length(N.getNext()); //Recursively calls itself while adding 1.
    }
    return L;
  }
  public void printList() //Prints the points each edge connects to. Does not print weight.
   {
      Node N=head;
      while(N!=null)
      {
         System.out.print(N.getEdge().getP() + " to " +N.getEdge().getA() + " || ");
         N=N.getNext();
      }
      System.out.println();
   }
  public boolean isEmpty()
  {
     return (head==null);
  }
}


