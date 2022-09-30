package TextOnline.main.game.player;

import TextOnline.main.game.items.tools.stonesword;
import TextOnline.main.game.items.tools.woodsword;
import TextOnline.main.game.superclasses.item;


import java.time.temporal.ValueRange;
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

            public static void woodswordadd(){
                if(ValueRange.of(0, 10).isValidIntValue(gameitemchoice)) {
                    switch (gameitemchoice){
                        case 1:
                            item addwood = new woodsword();
                            Itemsinv.add(addwood);
                            break;
                        case 2:
                            System.out.println("Tuesday");
                            break;
                        case 3:
                            System.out.println("Wednesday");
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

        public item addstone = new stonesword();

    }
}
