package SoftuniFundamentals;
//You will receive 3 lines of input. On the first line, you will receive
// a title of an article. On the next line, you will receive the content
// of that article. On the next n lines, until you receive "end of comments",
// you will get the comments about the article. Print the whole information
// in HTML format. The title should be in "h1" tag (<h1></h1>); the content
// in article tag (<article></article>); each comment should be in div tag
// (<div></div>). For more clarification, see the example below

//SoftUni Article
//Some content of the SoftUni article
//some comment
//more comment
//last comment
//end of comments
import java.util.Scanner;

public class HTML {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String article = scanner.nextLine ( );
        String content = scanner.nextLine ( );
        String comment = scanner.nextLine ( );
        printHtml ( "h1",article );
        printHtml ( "article",content );
        while ( !comment.equals ( "end of comments" ) ){

            printHtml ( "div",comment );
            comment = scanner.nextLine ( );
        }
    }
    public static void printHtml(String type,String input){
        System.out.printf ( "<%s>%n",type );
        System.out.printf ( "    %s%n",input );
        System.out.printf ( "</%s>%n",type );
    }
}
