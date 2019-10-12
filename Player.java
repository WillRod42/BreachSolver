public class Player {
   private Pilot pilot;
   private Weapon[] weapons;
   private int curHealth;
   private int maxMove;
   private int curMove;

   public Player(Pilot pilot, Weapon[] weapons, int curHealth, int maxMove, int curMove) {
      this.pilot = pilot;
      this.weapons = weapons;
      this.curHealth = curHealth;
      this.maxMove = maxMove;
      this.curMove = curMove;
   }
}