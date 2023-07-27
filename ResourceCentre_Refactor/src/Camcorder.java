<<<<<<< HEAD
								
=======
>>>>>>> branch 'master' of https://github.com/hassankhan0206/ResourceCentre_Refactor.git
public class Camcorder extends Item{
  private int opticalZoom;

  public Camcorder(String assetTag, String description, int opticalZoom) {
    super(assetTag, description);
    this.opticalZoom = opticalZoom;
  }

  public int getOpticalZoom() {
    return opticalZoom;
  }
  
  public String toString(){
    String output = super.toString();
    return String.format("%-63s -%20s", output, opticalZoom);
  }
}