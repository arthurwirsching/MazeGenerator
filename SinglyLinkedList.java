//Arthur Wirsching
public class SinglyLinkedList {
   private Node head;
   public SinglyLinkedList()
   {
      head=null;
   }
   public SinglyLinkedList(int size)
   {
      head=new Node(1,null);
      Node newhead=null;
      newhead=head;
      for (int z=1;z<size-1;z++)
      {
         newhead.setNext(new Node (z,null));
         newhead=newhead.getNext();
      }
   }
   
   public void Insert(int i) //Adds a node to the end of the Linked List
   {
      if(head==null)
      {
         head=new Node(i,null);
      }
      else
      {
         Node newhead=head;
         while(newhead.getNext() != null)
         {
            newhead=newhead.getNext();
         }
         newhead.setNext(new Node(i,null));
      }
   }
   
   public int Get(int i){ //gets the 'i'th node in the linked list
      if (i==1)
         return head.getNumber();
      Node newhead=head;
      for (int z=1;z<=i;z++)
      {
         newhead=newhead.getNext();
      }
      return newhead.getNumber();
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
   public void addHead(int i)
   {
      head = new Node (i,head); //Sets the head to a new Node, with the original Node as next.
   }
   public Node getHead()
   {
      return head;
   }
   
   public void addTail(int i) //Inserts into the end of the Linked List
   {
      head = addTail(head,i);
   }
   private Node addTail(Node L, int i)
   {
      if (L == null){
         L = new Node (i,null);}
      else
      {
         L.setNext(addTail(L.getNext(),i));
      }
      return L;
   }
   public void addTail(Edge e) //Inserts into the end of the Linked List
   {
      head = addTail(head,e);
   }
   private Node addTail(Node L, Edge e)
   {
      if (L == null){
         L = new Node (e,null);}
      else
      {
         L.setNext(addTail(L.getNext(),e));
      }
      return L;
   }
   public int Get2(int n) //gets the nth node's Number in the linked list
   {
      return Get2(head,n);
   }
   private int Get2(Node L, int n)
   {
      if(n==0)  //If n is zero, desired node has been reached.
         return L.getNumber();
      else
         return Get2(L.getNext(),n-1); // Else move to next node, countdown n
   }
   public void Remove2(int n) //removes the nth Node in the Linked List
   {
      Remove2(head,n-1);
   }
   private void Remove2(Node L,int n)
   {
      if(n-1==0)
      {
         Node N = L.getNext();
         L.setNext(N.getNext());
      }
      else
         Remove2(L.getNext(),n-1);
   }
   
   public int listLength()
   {
      Node N=head;
      int L=0;
      if (N==null)
         return 0;
      else
      {
         while(N!=null)
         {
            L+=1;
            N=N.getNext();
         }
      }
      return L;
   }
   
   public void printList()
   {
      Node N=head;
      while(N!=null)
      {
         System.out.print(N.getNumber() + " ");
         N=N.getNext();
      }
   }
   
   public int[] getArray() //Sends an array version of the Linked List
   {
      int[] a = new int[Length()];
      Node N=head;
      for(int i=0;i<a.length;i++)
      {
         a[i]=N.getNumber();
         N=N.getNext();
      }
      return a;
   }
   

   
   public int Length() {
    return length(head);
  }
  private static int length(Node N)
  {
    int L;
    if(N==null) { //Easiest case, is 0 Nodes/letters long.
      L=0;
    }
    else {
      L=1+length(N.getNext()); //Recursively calls itself while adding 1.
    }
    return L;
  }
   
}
