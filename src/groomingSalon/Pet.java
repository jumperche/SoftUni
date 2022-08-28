package groomingSalon;

public class Pet {
    String name;
    int age;
    String owner;

    public Pet ( String name , int age , String owner ) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public int getAge () {
        return age;
    }

    public void setAge ( int age ) {
        this.age = age;
    }

    public String getOwner () {
        return owner;
    }

    public void setOwner ( String owner ) {
        this.owner = owner;
    }

    @Override
    public String toString () {

        return String.format(this.getName ()+" "+this.getAge ()+" - ("+this.getOwner ()+")" );
    }
}
