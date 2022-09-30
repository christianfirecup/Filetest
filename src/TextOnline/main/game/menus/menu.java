package TextOnline.main.game.menus;
import TextOnline.main.game.player.playerdata;
import TextOnline.main.game.player.playerdata.invfunctions;
import java.util.Scanner;

public class menu {
public String clonename(){
    return "hello";
}
    public static void menutest() {
    for(int i = 0; i<5; i++) {
        Scanner lmaohaha = new Scanner(System.in);
        System.out.println("Pick a number for test");
        invfunctions.gameitemchoice = lmaohaha.nextInt();
        invfunctions.bswordadd();
        playerdata.Itemsinv.get(invfunctions.gameitemchoice - 1).itemdesc();
    }




    }
}