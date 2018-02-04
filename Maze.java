//Arthur Wirsching

public class Maze
{
   
   public static void main(String[] args) 
   {  
      int size = 50;
      Graph G = new Graph(size);
      G.createGrid(size);
      G.DFS();
      G.repaint();
     // G.shortestPath(99);
   }

}
