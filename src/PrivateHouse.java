public class PrivateHouse extends House {

//Создайте классы "Частный дом" и "Многоквартирный дом" - наследники класса "Дом".
  public PrivateHouse(String address) {
    super(address);
  }

  @Override
  public String getAddress() {
    return super.getAddress();
  }

  @Override
  public void setAddress(String address) {
    super.setAddress(address);
  }

  @Override
  public String toString() {
    return super.getAddress();
  }

  @Override
  public void demolish() {
    System.out.println("Вы снесли частный дом " + getAddress());
  }
}
