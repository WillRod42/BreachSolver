import java.util.*;
import java.io.*;

public class SolverMain {
   private static MapManager manager;
   private static Scanner console;
   
   public static final String VERSION = "0.0.2";
   
   public static void main(String[] args) throws FileNotFoundException {
      console = new Scanner(System.in);
   
      System.out.println("Breach Solver " + VERSION);
      System.out.print("Create(c) or load(l) map?: ");
      
      if(console.next().equals("c")) {
         manager = buildMap();
      } else {
         System.out.print("Input file name: ");
         manager = new MapManager(new Scanner(new File(console.next())));
      }
      
      System.out.println();
      manager.printMap();
   }
   
   public static MapManager buildMap() {
      String[][] map = new String[8][8];
   
      System.out.println("---Build Map---");
      for(int i = 0; i < 8; i++) {
         for(int l = 0; l < 8; l++) {
            map[i][l] = getString("Tile (" + i + "," + l + "): ");
         }
      }
      System.out.println("---------------");
      return new MapManager(map);
   }
   
   private static String getString(String prompt) {
      System.out.print(prompt);
      String input = console.next();
      
      while(!input.equals("g") && !input.equals("w") && !input.equals("b") && 
            !input.equals("e") && !input.equals("m") && !input.equals("p")) {
         System.out.println("***ERROR: Invalid tile type***\n");
         System.out.print(prompt);
         input = console.next();
      }
      
      return input;
   }
}