package test;
import  test.item;
import java.util.Random;
public class sworditem extends item {
    public String Rdisplay;
    public int rareselect = 0;
   public Random rand = new Random();
    @Override
    public int damage(){
        return 4;
    }
    public static void tiemdesc(){

        }
        @Override
        public int Rareity(){
          int Rareityset = rand.nextInt(4);
          rareselect = Rareityset;
            return Rareityset;
        }





}

