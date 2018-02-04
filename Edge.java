//Arthur Wirsching
public class Edge
{
   private int a; //Where the edge points
   private int b; //Weight of the edge
   private int p; //Source or parent of edge
   public Edge(int a, int b, int p)
   {
      this.a=a;
      this.b=b;
      this.p=p;
   }
   public Edge(int a, int b)
   {
      this.a=a;
      this.b=b;
   }
   
   public int getA()
   {
      return a;
   }
   public int getB()
   {
      return b;
   }
   public int getP()
   {
      return p;
   }
   public void setA(int i)
   {
      a=i;
   }
   public void setB(int i)
   {
      b=i;
   }
   public void setP(int i)
   {
      p=i;
   }
}