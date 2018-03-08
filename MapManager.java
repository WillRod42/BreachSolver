import java.util.*;

public class MapManager {
   private String[][] map;
   
   public MapManager(Scanner readMap) {
      map = new String[8][8];
      for(int i = 7; i >= 0; i--) {
         String line = readMap.nextLine();
         Scanner readLine = new Scanner(line);
         for(int l = 0; l < 8; l++) {
            map[i][l] = readLine.next();
         }
      }
   }
   
   public MapManager(String[][] map) {
      this.map = map;
   }
   
   public void printMap() {
      for(int i = 7; i >= 0; i--) {
         for(int l = 0; l < 8; l++) {
            System.out.print(map[i][l] + "   ");
         }
         System.out.println("\n");
      }
   }
}