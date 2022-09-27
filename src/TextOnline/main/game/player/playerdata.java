package TextOnline.main.game.player;

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
    public void invopen(){

        ArrayList<item> Itemsinv= new ArrayList<item>();
        woodsword woodsword1 = new woodsword();
        Itemsinv.add(woodsword1);
        Itemsinv.get(0).itemdesc();

    }
}
