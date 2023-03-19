public class ApartmentHouse extends House {

//  Создайте классы "Частный дом" и "Многоквартирный дом" - наследники класса "Дом".
//При создании многоквартирного дома дополнительно принимайте в конструкторе целое число - количество подъездов.
  private int entrances;

  public ApartmentHouse(String address, int entrances) {
    super(address);
    this.entrances = entrances;
  }

  public int getEntrances() {
    return entrances;
  }

  public void setEntrances(int entrances) {
    this.entrances = entrances;
  }

//В методе toString() выводите в удобном виде всю известную информацию о доме.
  public String toString() {
    return "ApartmentHouse " + getAddress() + "with " + entrances + "entrances";
  }

  @Override
  public void demolish() {
    System.out.printf("Вы снесли многоквартирный дом." + getAddress() + getAddress());

  }

}
