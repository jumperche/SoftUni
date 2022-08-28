package groomingSalon;

import java.util.ArrayList;
import java.util.List;

public class GroomingSalon {
    int capacity;
    List<Pet> salon=new ArrayList<> (this.capacity );

    public GroomingSalon ( int capacity ) {
        this.capacity = capacity;

    }

    public int getCapacity () {
        return capacity;
    }

    public void setCapacity ( int capacity ) {
        this.capacity = capacity;
    }

    public List< Pet > getSalon () {
        return salon;
    }

    public void setSalon ( List< Pet > salon ) {
        this.salon = salon;
    }
    public void add(Pet pet){
        if (capacity> salon.size ( )){
            salon.add ( pet );
        }
    }
    public boolean remove(String name){
        for ( int i = 0 ; i < salon.size ( ) ; i++ ) {
            if (salon.get ( i ).getName ().equals ( name )){
                salon.remove ( i );
                return true;
            }
        }
        return false;
    }
    public Pet getPet(String name, String owner){
        for ( int i = 0 ; i < salon.size ( ) ; i++ ) {
            if (salon.get ( i ).getName ().equals ( name )&&salon.get ( i ).getOwner ().equals ( owner )){
                return salon.get ( i );
            }

        }
        return null;
    }
    public int getCount(){
        return salon.size ();
    }
    public void getStatistics(){
        System.out.println (String.format("The grooming salon has the following clients:"));
        for ( int i = 0 ; i < salon.size ( ) ; i++ ) {
            System.out.println (salon.get ( i ).getName ()+" "+salon.get ( i ).getOwner () );
        }

    }
}
