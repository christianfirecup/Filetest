package TextOnline.main.game.player;

import TextOnline.main.game.items.tools.stonesword;
import TextOnline.main.game.items.tools.woodsword;
import TextOnline.main.game.superclasses.item;


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
    public void invopen(){



       for (int x =0; x<5; x++){
           itemloaders.woodswordadd();


       }
        Itemsinv.get(0).itemdesc();
        Itemsinv.get(1).itemdesc();
        Itemsinv.get(2).itemdesc();
        Itemsinv.get(3).itemdesc();
        Itemsinv.get(4).itemdesc();
        Itemsinv.get(0).itemdesc();

    }

    public class itemloaders {

            public static void woodswordadd(){
                item addwood = new woodsword();
                Itemsinv.add(addwood);
            }

        public item addstone = new stonesword();

    }
}
