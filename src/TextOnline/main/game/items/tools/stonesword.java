package TextOnline.main.game.items.tools;
import  TextOnline.main.game.superclasses.sworditem;
public class stonesword extends sworditem  {

    @Override
    public String name() {
        return "Stone Sword";
    }

    @Override
    public int stackamount() {
        return 1;
    }

    @Override
    public int Durab() {
        return 175;
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
        return "Stone";
    }

    @Override
    public double damage() {
       int send = damagemulti() + 3;
        return send;
    }

    @Override
    public int damagemulti() {
        return super.damagemulti();
    }
}
