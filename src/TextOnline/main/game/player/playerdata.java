package TextOnline.main.game.player;
import TextOnline.main.game.superclasses.item;
import TextOnline.main.game.items.tools.*;


import java.util.ArrayList;

public class playerdata {
    public int Woodswordamount(){
        return 0;
    }
    public String location(){


        return "blank";
    }
    public int saturation(){
        int maxsat = 15;
        if(maxsat > 15){
            maxsat = 15;

        }
        return maxsat;
    }
    public static ArrayList<item> Itemsinv= new ArrayList<item>();
    public static void invopen(){










    }

    public class invfunctions {
            public static int gameitemchoice;

            public static void bswordadd(){
                    switch (gameitemchoice){
                        case 1:
                            item addwood = new woodsword();
                            Itemsinv.add(addwood);
                            break;
                        case 2:
                            item addstone = new stonesword();
                            Itemsinv.add(addstone);
                            break;
                        case 3:
                            item addgrass = new GrassSword();
                            Itemsinv.add(addgrass);
                            break;
                        case 4:
                            System.out.println("Thursday");
                            break;
                        case 5:
                            System.out.println("Friday");
                            break;
                        case 6:
                            System.out.println("Saturday");
                            break;
                        case 7:
                            System.out.println("Sunday");
                            break;
                    }


            }



    }
}
