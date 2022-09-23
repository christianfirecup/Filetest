package TextOnline.main.game.superclasses;
import TextOnline.main.game.player.playerdata;

import java.util.Random;
public class sworditem extends item {
    public playerdata loc = new playerdata();
    public String Locationg = loc.location();
    public String Rdisplay;
    public static final String ANSI_YELLOW = "\\u001B[47m";
    public int stackamount(){
        return 1;
    }
    public int rareselect = 0;
    public void oncall() {
        sworditem call = new sworditem();
        playerdata loc = new playerdata();
        call.damage();
        call.Rareity();
        loc.location();
        call.itemdesc();

    }

   public Random rand = new Random();
    @Override
    public int damage(){
        return 0;
    }
    public void itemdesc(){
        if(rareselect == 0){
            playerdata loc = new playerdata();
            System.out.println("ITEM STAT: Common");
            System.out.println(damage() + " " + rareselect + " " + Locationg);

        }
        }
        @Override
        public int Rareity(){
          int Rareityset = rand.nextInt(4);
          rareselect = 0;
            return Rareityset;
        }
    public String Mat(){
        return "blank";
    }

    @Override
    public String Name() {
        return super.Name();
    }

    @Override
    public final boolean IsFood(){
        return false;
    }
    @Override
    public boolean IsEnchanted(){
        return false;
    }






}

