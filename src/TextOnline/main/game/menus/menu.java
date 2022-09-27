package TextOnline.main.game.menus;
import TextOnline.main.game.items.tools.woodsword;
import TextOnline.main.game.superclasses.sworditem;
import java.util.ArrayList;
import TextOnline.main.game.superclasses.item;

public class menu {
public String clonename(){
    return "hello";
}
    public static void menutest() {
            ArrayList<item> Itemsinv = new ArrayList<item>();
        woodsword woodsword1 = new woodsword();
        Itemsinv.add(woodsword1);

        Itemsinv.get(0).itemdesc();
        Itemsinv.get(0).itemdesc();

    }
}