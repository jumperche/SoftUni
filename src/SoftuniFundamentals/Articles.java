package SoftuniFundamentals;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Articles {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = Arrays.stream(scanner.nextLine().split(",")).map( value -> value)
                .collect( Collectors.toList());
        int n=Integer.parseInt ( scanner.nextLine () );
        Article ar=new Article ( list.get ( 0) , list.get ( 1) , list.get ( 2) );
        for ( int i = 0 ; i < n ; i++ ) {
            List<String> input = Arrays.stream(scanner.nextLine().split(":")).map( value -> value)
                    .collect( Collectors.toList());

            switch (input.get ( 0 )){
                case "Edit":
                    ar.edit ( input.get ( 1)  );
                    break;
                case "ChangeAuthor":
                    ar.changeAuthor ( input.get ( 1) );
                    break;
                case "Rename":
                    ar.rename ( input.get ( 1) );
                    break;

            }

        }
        System.out.println (ar.toString (  ));
    }
    public static class Article{
        private String title;
        private String content;
        private String author;

        public Article ( String title , String content , String author ) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public void setTitle ( String title ) {
            this.title = title;
        }

        public void setContent ( String content ) {
            this.content = content;
        }

        public void setAuthor ( String author ) {
            this.author = author;
        }

        public String getTitle () {
            return title;
        }

        public String getContent () {
            return content;
        }

        public String getAuthor () {
            return author;
        }
        public void edit(String content){
           this.setContent ( content );
        }
        public void changeAuthor(String author){
            this.setAuthor (author);
        }
        public void rename(String title){
            this.setTitle ( title );
        }
        @Override
        public String  toString( ){

           String print=this.title+" -"+this.content+":"+this.author ;
           return print;
        }
    }
}
