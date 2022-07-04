package Uni;

public class StringSubstringFind {
    public static void main ( String[] args ) {
        //String text="Hello. I’m travelling to Bulgaria today. During the exam session I’ll be in the <> Turkish Airline Istanbul <>";

        StringBuilder text=new StringBuilder ( "Hello. I’m travelling to Bulgaria today. During the exam session I’ll be in the <> Turkish Airline Istanbul <>" );
         int start=text.indexOf ( "<" );
        int end= text.lastIndexOf (  ">");
        String isUp = "";
        for(int y = start; y < text.length (); y++){
            if(Character.isUpperCase(text.charAt(y))){
                char w = text.charAt(y);

                       isUp= isUp + w ;
            }

        }
        StringBuilder deleted=text.delete (start, text.length ());
StringBuilder append=text.append ( isUp );
        //System.out.printf ("%d %d %s %s",start,end,isUp,text );
        System.out.printf ("%s",text );
    }
}
