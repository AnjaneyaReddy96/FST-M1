public class Activity1 {

    public static void main(String[] args) {
        Car tata = new Car();
        tata.make = 2014;
        tata.color = "white";
        tata.transmission = "Manual";
    
        //using Car class method
        tata.displayCharacterstics();
        tata.accelerate();
        tata.brake();
    }

}
