package uni1;

public class animalshop {
    public static class Dog{
        private String name;
        private String breed;
        private String barkNoise="Woof";
        private double weight;


        //constuktor
        public Dog(String name,String breed,double weight){
            this.name = name;
            this.breed=breed;
            this.weight = weight;
        }
        //construktor
        public Dog(String name,String breed,String barkNoise,double weight){
            this.name = name;
            this.breed=breed;
            this.barkNoise=barkNoise;
            this.weight = weight;
        }
        //getter, accessor
        public String getName () {
            return name;
        }
        //getter, accessor
        public String getBreed(){ return breed;}
              //getter, accessor
        public double getWeight () {
            return weight;
        }
        //setter, mutator
        public void setName (String name) {
            this.name = name;
        }
        //setter, mutator
        public void setBreed(String breed){ this.breed=breed;}
        //setter, mutator
        public void setWeight (double weight) {
            this.weight = weight;
        }
        //print barknoise
        public void bark(){
            System.out.println (this.barkNoise );
        }
        //overloadet barknoise
        public  void bark(String barknoise){
            System.out.println (barkNoise );
        }
        public void printAll () {
            System.out.println ("Person name: "+this.getName () );
            System.out.println ( "Breed: "+this.getBreed ());
            this.bark ();
                 System.out.println ("Weight: "+this.getWeight () );

            System.out.println ( );
        }

    }
}
