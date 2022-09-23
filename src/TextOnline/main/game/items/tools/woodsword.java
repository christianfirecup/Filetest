package TextOnline.main.game.items.tools;
import TextOnline.main.game.superclasses.sworditem;
public class woodsword extends sworditem{

    @Override
    public String Name() {
        return "Wood Sword";
    }

    @Override
    public int stackamount() {
        return 1;
    }

    @Override
    public int Durab() {
        return 50;
    }
}
