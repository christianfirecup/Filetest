package test;
import  test.item;
import test.inter.playerlocation;
import test.menu;
import java.util.Random;
public class sworditem extends item{
    public String Rdisplay;
    public static final String ANSI_YELLOW = "\\u001B[47m";
    public int rareselect = 0;
    public static void oncall() {
        sworditem call = new sworditem();
        playerdata loc = new playerdata();
        call.damage();
        call.Rareity();
        call.itemdesc();
        call.Mat();
        loc.location();

    }

   public Random rand = new Random();
    @Override
    public int damage(){
        return 4;
    }
    public void itemdesc(){
        if(rareselect == 0){
            System.out.println(  "ITEM STAT: Common");

        }
        }
        @Override
        public int Rareity(){
          int Rareityset = rand.nextInt(4);
          rareselect = 0;
            return Rareityset;
        }






}

