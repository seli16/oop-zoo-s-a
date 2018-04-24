import java.util.ArrayList;

public class zoo {

    public static void main(String[] args){
        zoo animal= new zoo();
        animal.sleep("Monkey");
        Tiger tigger= new Tiger("Tigger");
        tigger.sleep();
        tigger.eat("kibble");
        Bear pooh= new Bear("Pooh");
        pooh.sleep();
        pooh.eat("fish");
        Unicorn rarity= new Unicorn("Rarity");
        rarity.eat("marshmellow");
        Giraffe gemma= new Giraffe("Gemma");
        gemma.eat("leaves");
        Bee stinger= new Bee("Stinger");
        stinger.eat("pollen");
        ArrayList<Animal> animals= new ArrayList<Animal>();
        animals.add(tigger);
        animals.add(stinger);
        Zookeeper zoebot= new Zookeeper("Zoebot");
        zoebot.feedAnimals(animals, "Spring Rolls");
    }

    public void sleep(String name){
        System.out.print(name + "sleeps for 8 hours");
    }

    String favoriteFood= "banana";

     public void eat(String name, String food){
         System.out.print(name + "eats" + favoriteFood);
         if(food==favoriteFood){
             System.out.print("YUM!!" + name + " wants more " + favoriteFood);
         }else{
             System.out.println(name + " sleeps for 8 hours");
         }

     }
    }


