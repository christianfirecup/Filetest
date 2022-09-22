package test;
import test.sworditem;
public class menu {
    public String location(){
        return "work";
    }

    public static void menutest() {
        System.out.println("Menu Options:");
        sworditem.oncall();
    }
}