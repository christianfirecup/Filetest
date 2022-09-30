package TextOnline.main.game.items.tools;

import TextOnline.main.game.superclasses.sworditem;

public class GrassSword extends sworditem  {

    @Override
    public String name() {
        return "Grass Sword";
    }

    @Override
    public int stackamount() {
        return 1;
    }

    @Override
    public int Durab() {
        return 25;
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
        return "Grass";
    }

    @Override
    public double damage() {
       double send = damagemulti() + 1.5;
        return send;
    }

    @Override
    public int damagemulti() {
        return super.damagemulti();
    }
}
