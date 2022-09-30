package TextOnline.main.game.superclasses;
import TextOnline.main.game.player.playerdata;
public class fooditem extends item{

    @Override
    public double damage() {
        return -1;
    }

    @Override
    public int Durab() {
        return -1;
    }

    @Override
    public int Rareity() {
        return -1;
    }

    @Override
    public int maxDamage() {
        return -1;
    }

    @Override
    public String name() {
        return super.name();
    }

    @Override
    public int maxCount() {
        return super.maxCount();
    }

    @Override
    public boolean IsFood() {
        return true;
    }

    @Override
    public boolean IsEnchanted() {
        return false;
    }
    public int satamount(){
        return satamount();
    }

}
