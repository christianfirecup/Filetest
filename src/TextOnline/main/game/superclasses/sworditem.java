package TextOnline.main.game.superclasses;
import TextOnline.main.game.player.playerdata;

import java.util.Random;
public class sworditem extends item {
    public playerdata loc = new playerdata();
    public String Locationg = loc.location();



    public String Rdisplay(){

        return Rdisplay();
    }
    public static final String ANSI_YELLOW = "\\u001B[47m";
    public int stackamount(){
        return 1;
    }
    public int rareselect = 0;
    public void onpickup() {

        playerdata loc = new playerdata();
        Rareity();
        loc.location();
        itemdesc();

    }

   public Random rand = new Random();

    public void itemdesc(){

            playerdata loc = new playerdata();
            System.out.println("ITEM STAT: Common");
            System.out.println( " " + rareselect + " " + Locationg);


        }
        @Override
        public int Rareity(){
          int Rareityset = rand.nextInt(5);
          rareselect = Rareityset;
            return rareselect;
        }
        @Override
    public String Mat(){
        return "Wood";
    }
    @Override
    public int maxCount(){
        return 1;
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

