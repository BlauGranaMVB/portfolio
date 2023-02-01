public class Cookie {
 //Metod dlya vypekaniya
 public void bake() {
   //Vyvodim tekst v konsol':
   System.out.println("Pechen'ka");
 }   
}

public class Main {
  //Metod, kotoryy startuyet vashu programmu, to yest' eto svoyego roda nachal'naya
  //tochka, s etogo metoda nachinayetsya vypolneniye koda
  public static void main(String[] args) {
    //Sozdayem ob"yekt na osnovanii klassa
    Cookie cookie = new Cookie();
    //Vyzyvayem metod nashego klassa, chtoby ispech' pechen'ku
    cookie.bake();
  }
}

///////////////////////////////////////////////////////
public class Car {
    public void build() {
        System.out.println("You must build a new car");
    }

}

public class Main {
    public static void main(String[] args){
        Car newCar = new Car();
        newCar.build();
    }
}
