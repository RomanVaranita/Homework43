import java.util.ArrayList;
import java.util.List;

public class MainHouse {

  public static void main(String[] args) {
    List<House> houses = new ArrayList<>();

    PrivateHouse privateHouse1 = new PrivateHouse("Ludwigstr 25");
    PrivateHouse privateHouse2 = new PrivateHouse("Roemerstr 11");
    ApartmentHouse apartmentHouse = new ApartmentHouse("Haupstrasse 11",2);

    houses.add(privateHouse1);
    houses.add(privateHouse2);
    houses.add(apartmentHouse);

    for (House house : houses) {
      System.out.println(house.toString());
    }
  }
}
