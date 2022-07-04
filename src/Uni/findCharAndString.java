package Uni;

import java.util.*;

public class findCharAndString {
    private String StringArray[] = { "abAlaaaababablaab", "gddabababddfds", "January", "June", "Autumn", "Similarity" }; //Масив от стрингове
    private char whatToFind; // единичния символ
    private String whatToFindString; //стринга, който ще търсим


    public findCharAndString(char f, String s) {//параметризиран конструктор с две променливи char и String
        this.whatToFind = f;
        whatToFindString = s;
        System.out.println(Arrays.toString(StringArray));
    }

    public void findAllAs() {
        for (int i = 0; i < StringArray.length; i++) { //цикъл for, който да върти по елементите на масива
            System.out.println("Processing string: " + (i+1));
            int count = 0; //зануляваме брояча
            for (int j = 0; j < StringArray[i].length(); j++) {//завъртаме цикъл по символите на стринга от масива
                if (whatToFind == StringArray[i].charAt(j)) //проверяваме с if какъв символ имаме на дадената позиция и дали съвпада с този върнат от charAt(int) на класа String.
                    count++; //ако да увеличаваме брояча с единица, защото имаме попадение.
            }
            System.out.println("Count: " + count);
        }
    }

    public void findAllStrings() {
        for (int i = 0; i < StringArray.length; i++) {//цикъл for, който да върти по елементите на масива
            System.out.println("Processing string: " + (i+1));
            int count = 0; //брояч на попаденията
            int found = 0; //променлива, която ще връща индекса на попадението
            for (int j = 0; j < StringArray[i].length(); ) {//завъртаме цикъл по символите на стринга от масива, но управлението на j ще бъде ръчно
                found = StringArray[i].indexOf(whatToFindString, j); //търсим с indexOf търсения стринг от позиция j (в началото е 0)
                if (found != -1) {//ако found е -1, означава, че нямаме попадение и отиваме в else
                    j = found + whatToFindString.length(); //имаме попадение и преместваме j с текущата позиция и добавяме дължината на стринга + 1;
                    count++;
                }
                else
                    j++; //където придвижваме j++ напред с 1
            }
            System.out.println("Count: " + count);
        }
    }

    public static void main(String args[]) {
        findCharAndString se = new findCharAndString('a', "ab");
        //se.findAllAs();
        se.findAllStrings();
        String s="hello";
        System.out.println( Arrays.toString(s.split("^(?:([A-Za-z])(?!.*\\1))*$")));
    }
}
