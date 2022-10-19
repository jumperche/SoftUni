package SoftuniFundamentals;
//You got your hands on the most recent update on the best MMORPG of all time – Heroes of Code and Logic. You want to play it all day long! So cancel all other arrangements and create your party!
//On the first line of the standard input, you will receive an integer n – the number of heroes that you can choose for your party. On the next n lines, the heroes themselves will follow with their hit points and mana points separated by a single space in the following format:
//"{hero name} {HP} {MP}"
//-	HP stands for hit points and MP for mana points
//-	a hero can have a maximum of 100 HP and 200 MP
//After you have successfully picked your heroes, you can start playing the game. You will be receiving different commands, each on a new line, separated by " – ", until the "End" command is given.
//There are several actions that the heroes can perform:
//"CastSpell – {hero name} – {MP needed} – {spell name}"
//•	If the hero has the required MP, he casts the spell, thus reducing his MP. Print this message:
//o	"{hero name} has successfully cast {spell name} and now has {mana points left} MP!"
//•	If the hero is unable to cast the spell print:
//o	"{hero name} does not have enough MP to cast {spell name}!"
//"TakeDamage – {hero name} – {damage} – {attacker}"
//•	Reduce the hero HP by the given damage amount. If the hero is still alive (his HP is greater than 0) print:
//o	"{hero name} was hit for {damage} HP by {attacker} and now has {current HP} HP left!"
//•	If the hero has died, remove him from your party and print:
//o	"{hero name} has been killed by {attacker}!"
//"Recharge – {hero name} – {amount}"
//•	The hero increases his MP. If it brings the MP of the hero above the maximum value (200), MP is increased to 200. (the MP can't go over the maximum value).
//•	 Print the following message:
//o	"{hero name} recharged for {amount recovered} MP!"
//"Heal – {hero name} – {amount}"
//•	The hero increases his HP. If a command is given that would bring the HP of the hero above the maximum value (100), HP is increased to 100 (the HP can't go over the maximum value).
//•	 Print the following message:
//o	"{hero name} healed for {amount recovered} HP!"


//2
//Solmyr 85 120
//Kyrre 99 50
//Heal - Solmyr - 10
//Recharge - Solmyr - 50
//TakeDamage - Kyrre - 66 - Orc
//CastSpell - Kyrre - 15 - ViewEarth
//End
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesOfCodeAndLogic7 {
    public static void main ( String[] args ) {
        Map< String, Hero > map = new LinkedHashMap<> ( );

        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        for ( int i = 0 ; i < n ; i++ ) {
            String[] input = scanner.nextLine ( ).split ( " " );
            Hero hero = new Hero ( input[ 0 ] , Integer.parseInt ( input[ 1 ]), Integer.parseInt(input[2])  );
            map.put ( input[ 0 ] , hero );
        }

        String[] input = scanner.nextLine ( ).split ( " - " );
        while ( !input[ 0 ].equals ( "End" ) ) {
            switch (input[ 0 ]) {
                case "CastSpell": {
if (map.get ( input[1] ).mp>Integer.parseInt(input[2])){
    int mp=map.get(input[1]).mp-Integer.parseInt(input[2]);
    Hero hero=new Hero ( input[1], map.get(input[1]).hp,mp );
    map.put(input[1],hero);
    System.out.printf ( "%s has successfully cast %s and now has %d MP!%n",input[1],input[3],mp );
}
else {
    System.out.printf ( "%s does not have enough MP to cast %s!%n",input[1],input[3] );
}
                    break;
                }
                case "TakeDamage": {
Hero hero=new Hero ( input[1],map.get(input[1]).hp-Integer.parseInt ( input[2] ),map.get ( input[1]).mp ) ;
map.put ( input[1],hero );
if (map.get ( input[1] ).hp>0){
    System.out.printf ( "%s was hit for %d HP by %s and now has %d HP left!%n",input[1],Integer.parseInt ( input[2]),input[3],map.get(input[1]).hp );

}
else {
    System.out.printf ( "%s has been killed by %s!%n",input[1],input[3] );
    map.remove(input[1]);
}
                    break;
                }
                case "Recharge": {
                    int helper;
        if (map.get(input[1]).mp+Integer.parseInt(input[2])>=200){
            helper=200-map.get(input[1]).mp;
            Hero hero=new Hero ( input[1],map.get(input[1]).hp,200 )  ;
            map.put ( input[1],hero );
        }else {
            helper=Integer.parseInt(input[2]);
            Hero hero = new Hero ( input[ 1 ] , map.get ( input[ 1 ] ).hp , map.get ( input[ 1 ] ).mp + Integer.parseInt ( input[ 2] ) );
            map.put ( input[1],hero );
        }
        System.out.printf ( "%s recharged for %d MP!%n",input[1],helper );
        break;
    }
                case "Heal": {
                    int helper=100-map.get(input[1]).hp;
        if (map.get(input[1]).hp+Integer.parseInt(input[2])>=100){

            Hero hero=new Hero ( input[1],100,map.get(input[1]).mp )  ;
            map.put ( input[1],hero );
        }else {
            helper=Integer.parseInt ( input[ 2 ] );
            Hero hero = new Hero ( input[ 1 ] , map.get ( input[ 1 ] ).hp + Integer.parseInt ( input[ 2 ] ), map.get ( input[ 1 ] ).mp  );
            map.put ( input[1],hero );
        }
        System.out.printf ( "%s healed for %d HP!%n",input[1],helper );
        break;
    }
}
            input = scanner.nextLine ( ).split ( " - " );
                    }
                    map.entrySet ( ).stream ( )
                    .forEach ( entry -> {
                    System.out.printf ( "%s%n  HP: %d%n  MP: %d%n" ,entry.getKey (), entry.getValue().hp,entry.getValue().mp  );

                    } );
                    }

static class Hero {
    String name;
    int hp;
    int mp;

    public Hero ( String name , int hp , int mp ) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }
}

}
