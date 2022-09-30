package TextOnline.main.game.menus;
import TextOnline.main.game.items.tools.woodsword;
import TextOnline.main.game.superclasses.sworditem;
import java.util.ArrayList;
import TextOnline.main.game.superclasses.item;
import TextOnline.main.game.player.Inventory;
import TextOnline.main.game.player.playerdata;
import TextOnline.main.game.player.playerdata.invfunctions;

public class menu {
public String clonename(){
    return "hello";
}
    public static void menutest() {
    invfunctions.gameitemchoice = 1;
        invfunctions.woodswordadd();
            playerdata.Itemsinv.get(0).itemdesc();




    }
}