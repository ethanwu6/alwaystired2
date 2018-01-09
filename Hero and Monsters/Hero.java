import java.util.*;
public class Hero{
    private int health;
    private int daggerdamage;
    private int armor;
    private int herox;
    private int heroy;
    private int damage;
    public Hero(){
        health = 100;
        heroy = 0;
        herox = 9;
        daggerdamage = (int)(Math.random()*40)+50;
        armor = 0;
    }

    public void addHealth(int add){
        health = add + health;
    }

    public void addDamage(int add){
        daggerdamage = add + daggerdamage;
    }
    
    public int getequip(){
        return daggerdamage;
    }
    
    public void addDefence(int add){
        armor = add + armor;
    }
    
    public int getDefence(){
        return armor;
    }
    
    public void up(){
        herox = herox -1;
    }

    public void left(){
        heroy = heroy -1;
    }

    public void right(){
        heroy = heroy + 1;
    }

    public void  down(){
        herox = herox + 1;
    }

    public boolean checkup(){
        if (herox -1<0){
            System.out.println("You moved out of bounds");
            return false;
        }
        return true;
    }

    public boolean checkleft(){
        if (heroy -1<0){
            System.out.println("You moved out of bounds");
            return false;
        }
        return true;
    }

    public boolean checkright(){
        if (heroy +1>9){
            System.out.println("You moved out of bounds");
            return false;
        }
        return true;
    }

    public boolean checkdown(){
        if (herox +1>9){
            System.out.println("You moved out of bounds");
            return false;
        }
        return true;
    }

    public int getx(){
        return herox;
    }

    public int gety(){
        return heroy;
    }

    public int gethealth(){
        return health;
    }
    
    public int herodamage(){
        return daggerdamage;
    }
    
    public void updateHealth(int herohealth){
        health = herohealth;
    }
}