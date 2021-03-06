//Arthur Wirsching
public class Node {
   
   
   private int number;
   private Node next;
   private Node prev;
   private Edge edge;
   public Node(int i, Node link) {
      setNumber(i);
      setNext(link);
   }
   public Node(Edge e, Node link)
   {
      setEdge(e);
      setNext(link);
   }
   //Setters and Getters...
   public void setNumber(int i) {
      this.number=i;
   }
   public int getNumber() {
      return number;
   }
   
   public void setNext(Node next) {
      this.next=next;
   }
   public Node getNext() {
      return next;
   }
   public void setPrev(Node prev){
      this.prev=prev;
   }
   public Node getPrev(){
      return prev;
   }
   public Edge getEdge(){
      return edge;
   }
   public void setEdge(Edge e)
   {
      edge=e;
   }
   public void setEdgeB(int i)
   {
      edge.setB(i);
   }
   public void setEdgeP(int i)
   {
      edge.setP(i);
   }
   
}
