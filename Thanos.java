import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
        ArrayList<Hero> heroes = new ArrayList<>() ;

        // TODO 2 : Add those heroes to the list
        // name: Black Widow, age: 34
        heroes.add(new Hero("Black Widow", 34));
        // name: Captain America, age: 100
        heroes.add(new Hero("Captain America",100));
        // name: Vision, age: 3
        heroes.add(new Hero("Vision",3));
        // name: Iron Man, age: 48
        heroes.add(new Hero("Iron Man",48));
        // name: Scarlet Witch, age: 29
        heroes.add(new Hero("Scarlet Witch",29));
        // name: Thor, age: 1500
        heroes.add(new Hero("Thor",1500));
        // name: Hulk, age: 49
        heroes.add(new Hero("Hulk",49));
        // name: Doctor Strange, age: 42
        heroes.add(new Hero("Doctor Strange",42));

        System.out.println(AfficheHeros(heroes));
        System.out.println("");

        // TODO 3 : It's Thor birthday, now he's 1501
        for (Hero hero : heroes) {
            if (hero.getName() == "Thor") {
                hero.setAge( hero.getAge() + 1 );
                System.out.println(hero.getName() + " a maintenant " + hero.getAge() + " an(s).");
            }
        }
        System.out.println(AfficheHeros(heroes));
        System.out.println("");

        // TODO 4 : Shuffle the heroes list
        System.out.println("On mélange...");
        Collections.shuffle(heroes);
        System.out.println(AfficheHeros(heroes));
        System.out.println("");

        // TODO 5 : Keep only the half of the list
        System.out.println("On supprime la moitié ");
        
        //le code ci-dessous peut paraitre bizarre mais il ne faut pas oublier que
        //la suppression d'un index décale la liste et du coup la raccourci :D
        for (int i = 0 ; i< heroes.size() ; i++) {
            heroes.remove(i);
        }

        System.out.println(AfficheHeros(heroes));
        System.out.println("");


        // TODO 6 : Loop throught the list and display the name of the remaining heroes
        System.out.println(" Il ne reste que : ");
        for (Hero hero : heroes) {
            System.out.println( "   " + hero.getName() );
        }

    }

    //fonction pour afficher la liste des héros recue en paramètre
    private static String AfficheHeros(ArrayList<Hero> pHeroes) {
        String res = "";
        for (Hero hero : pHeroes) {
            if  (res != "" ) { res += ", "; }
            res += hero.getName() + " " + hero.getAge();
        }
        return res;

    }
}
