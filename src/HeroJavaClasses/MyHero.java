package HeroJavaClasses;

import java.util.ArrayList;

public class MyHero {
    private String heroName;
    private String special_power;
    private String flaw;
    private int age;
    private int id;
    private static ArrayList<MyHero> instances = new ArrayList<>();

    public MyHero(String heroName, String special_power, String flaw, Integer age, Integer id){
        this.heroName = heroName;
        this.special_power = special_power;
        this.flaw = flaw;
        this.age = age;
        instances.add(this);
        this.id = instances.size();
    }

    public String getHeroName(){return this.heroName;}
    public String getSpecial_power(){return this.special_power;}
    public String getFlaw(){return this.flaw;}
    public int getAge(){return this.age;}
    public int getId(){return this.id;}
    public static ArrayList<MyHero> getAllInstances(){return instances;}
    public static MyHero findHeroById(int id){return instances.get(id);}

    public static MyHero newHeroCharacter(){
        return new MyHero("IceBreath", "ice breath", "heat",17, 1);
    }
}
