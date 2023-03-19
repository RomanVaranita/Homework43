public class PrivateHouse extends House {


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
}
