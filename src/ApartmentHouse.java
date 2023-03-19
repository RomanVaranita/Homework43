public class ApartmentHouse extends House {
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
  public String toString() {
    return "ApartmentHouse " + getAddress() + "with " + entrances + "entrances";
  }
}
