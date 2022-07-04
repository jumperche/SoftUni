/** class person with name, weight, height and eyecolor.
 * @autor Rosalina Gramatikov
 * @ver 1.1
 * @14.6.2022
 */

package uni1;

public class Person {
    private String eyeColor;
    private String name;
    private double weight;
    private double height;

    //default constructor
    public Person () {
        this.name = "Person";
        this.weight = 0;
        this.height = 0;

    }

    //overloaded constructor
    public Person ( String name ) {
        this.name = name;
        this.weight = 0;
        this.height = 0;
        this.eyeColor = "nothing";
    }

    //overloaded constructor
    public Person ( String name , double weight ) {
        this.name = name;
        this.weight = weight;
        this.height = 0;
        this.eyeColor = "nothing";
    }

    //overloaded constructor
    public Person ( String name , double weight , double height ) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.eyeColor = "nothing";
    }

    //overloaded constructor
    public Person ( String name , double weight , double height , String eye ) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.eyeColor = eye;
    }

    //getter, accessor
    public String getName () {
        return name;
    }

    //getter, accessor
    public double getWeight () {
        return weight;
    }

    //getter, accessor
    public double getHeight () {
        return height;
    }

    //getter, accessor
    public String getEyeColor () {
        return eyeColor;
    }

    //setter, mutator
    public void setName (String name) {
        this.name = name;
    }

    //setter, mutator
    public void setWeight (double weight) {
        this.weight = weight;
    }

    //setter, mutator
    public void setHeight (double height) {
        this.height = height;
    }

    //setter, mutator
    public void setEyeColor (String eyeColor) {
        this.eyeColor = eyeColor;
    }

    //setter, mutator
    public void setParameter ( String name , double weight , double height , String eyeColor ) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.eyeColor = eyeColor;
    }

    //print method
    public void displayEyeColor () {
        System.out.printf ( "Eye color: %s%n",this.getEyeColor () );
    }

    //print method
    public void displayAll () {
        System.out.println ("Person name: "+this.getName () );
        System.out.println ( "Height: "+this.getHeight ());
        System.out.println ("Weight: "+this.getWeight () );
        this.displayEyeColor ();
        System.out.println ( );
    }
}

