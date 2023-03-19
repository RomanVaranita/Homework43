public abstract class House {
  private String address;


  public House(String address) {
    this.address = address;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void demolish(String address) {
  }

  public abstract void demolish();
}
