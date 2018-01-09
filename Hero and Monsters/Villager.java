import java.util.ArrayList;
public class Villager{
    ArrayList<Monster>monsterArray;
    int villagerx;
    int villagery;
    public Villager(int num){
        villagerx = (int)(Math.random() * 10) ;
        villagery = (int)(Math.random() * 10);
    }

    public String Vi(int num, ArrayList monsterArray){
        if (num == 1){
            if(monsterArray.size()==4){
                return ("Four monsters remaining");
            }
            return("Thx for saving me...");
        }
        if (num ==0){
            if(monsterArray.size()==2){
                return ("Two monsters remaining");
            }
            return("You saved my life");
        }

        return "";
    }

    public int getx(){
        return villagery;
    }

    public int gety(){
        return villagerx;
    }

    public void resetx(){
        villagery = (int)(Math.random() * 10) ;
    }

    public void resety(){
        villagerx = (int)(Math.random() * 10);
    }
}