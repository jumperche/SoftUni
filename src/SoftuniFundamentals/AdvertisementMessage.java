package SoftuniFundamentals;
//Write a program that generates random fake advertisement message to extol some product. The messages must consist of 4 parts: laudatory phrase + event + author + city. Use the following predefined parts:
//•	Phrases – {"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."}
//•	Events – {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"}
//•	Authors – {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"}
//•	Cities – {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"}
//The format of the output message is: {phrase} {event} {author} – {city}.
//As an input, you take the number of messages to be generated. Print each random message on a separate line.
import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        for ( int i = 0 ; i < n ; i++ ) {
            Message message =new Message (  );
            System.out.println (message.randomMessage () );
        }
    }


    public static class Message{
        String [] phases={"Excellent product.", "Such a great product.",
                "I always use that product.", "Best product of its category.",
                "Exceptional product.", "I can’t live without this product."};
        String [] events={"Now I feel good.", "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.", "I feel great!"};
        String [] authors={"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String [] cities={"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};
        Random random=new Random (  );
        public String randomMessage(){
            return String.format ( "%s %s %s- %s",phases [random.nextInt ( getPhases ( ).length)],events[random.nextInt (getEvents ().length)],authors[random.nextInt ( getAuthors ( ).length)],cities[random.nextInt ( getCities ( ).length)]  );
        }



        public String[] getPhases () {
            return phases;
        }

        public void setPhases ( String[] phases ) {
            this.phases = phases;
        }

        public String[] getEvents () {
            return events;
        }

        public void setEvents ( String[] events ) {
            this.events = events;
        }

        public String[] getAuthors () {
            return authors;
        }

        public void setAuthors ( String[] authors ) {
            this.authors = authors;
        }

        public String[] getCities () {
            return cities;
        }

        public void setCities ( String[] cities ) {
            this.cities = cities;
        }

    }
}
