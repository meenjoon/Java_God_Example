package Part3;

public class CarManager {

    public static void main(String args[]) {

         Car aCar = new Car();

         Car bCar = new Car();

         aCar.speedUp();

         bCar.breakDown();
  

         System.out.println(aCar.getCurrentSpeed());

         System.out.println(bCar.getCurrentSpeed());

         bCar.speedUp();

         System.out.println(bCar.getCurrentSpeed());

    }


}