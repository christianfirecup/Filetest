package TextOnline.main.game.items.tools;
import TextOnline.main.game.superclasses.sworditem;
public class woodsword extends sworditem{

    public woodsword(String Name) {
        super(Name);
    }

    @Override
    public String Name() {
        return Rdisplay() +" Wood Sword";
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
        return "Unknown";
    }
}
