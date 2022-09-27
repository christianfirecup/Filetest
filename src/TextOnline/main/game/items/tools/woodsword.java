package TextOnline.main.game.items.tools;
import TextOnline.main.game.player.playerdata;
import TextOnline.main.game.superclasses.sworditem;
public class woodsword extends sworditem{


    @Override
    public String name() {
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

    @Override
    public int Rareity() {
        return super.Rareity();
    }

    @Override
    public String Rdisplay() {

       return super.Rdisplay();
    }

    @Override
    public String Mat() {
        return "Wood";
    }
}
