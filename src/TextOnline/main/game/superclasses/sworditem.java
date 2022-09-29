package TextOnline.main.game.superclasses;
import TextOnline.main.game.player.playerdata;

import java.util.Random;
public class sworditem extends item {
    public String choice = null;

    public sworditem(){


    }
    public void objectcreation(){

    }
    public Random rand(){
        return new Random();
    }
   public int Rareityset = rand().nextInt(5);
    public playerdata loc = new playerdata();
    public String Locationg = loc.location();



    public String Rdisplay(){

            if (Rareityset == 0) {
                choice = "Common";

            } else if (Rareityset == 1) {
                choice = "Uncommon";

            } else if (Rareityset == 2) {
                choice = "Rare";

            } else if (Rareityset == 3) {
                choice = "Very Rare";

            } else if (Rareityset == 4) {
                choice = "Legendary";

            }else{
                choice = "ERROR";

            }



        return choice;

    }
    @Override
    public String name() {
        return Rdisplay() + name();
    }
    public static final String ANSI_YELLOW = "\\u001B[47m";
    public int stackamount(){
        return 1;
    }
    public int rareselect = 0;



@Override
    public void itemdesc(){
        playerdata loc = new playerdata();
        String locdata = loc.location();
            System.out.println("Item Stats:");
            System.out.println(name());
            System.out.println("Rarity: "+ Rdisplay());
            System.out.println("Damage: " + damage());
            System.out.println("Material: " + Mat());
            System.out.println("Durabillity: "+ Durab());
            System.out.println("Location Found: "+ locdata);
            System.out.println("_______________________________________");




        }

        @Override
    public String Mat(){
        return null;
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

    @Override
    public int damage() {
        int damageamount = 0;
        if (Rareityset == 0) {
            damageamount = damageamount + 2;

        } else if (Rareityset == 1) {
            damageamount = damageamount + 3;

        } else if (Rareityset == 2) {
            damageamount = damageamount + 3;

        } else if (Rareityset == 3) {
            damageamount = damageamount+ 5;

        } else if (Rareityset == 4) {
            damageamount =damageamount+ 6;

        }else{
            damageamount =damageamount+ 2;

        }
        return damageamount;
    }
    public  int damagemulti(){
        int damageamount = 0;
        if (Rareityset == 0) {
            damageamount = 2;

        } else if (Rareityset == 1) {
            damageamount =  3;

        } else if (Rareityset == 2) {
            damageamount = 4;

        } else if (Rareityset == 3) {
            damageamount = 5;

        } else if (Rareityset == 4) {
            damageamount =6;

        }else{
            damageamount =2;

        }
    return  damageamount;
    }
}


