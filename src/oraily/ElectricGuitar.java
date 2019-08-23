package oraily;

public class ElectricGuitar {
    private String brand;
    private int numOfPickups;
    private boolean isRockStarUsesIt;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String aBrand) {
        brand = aBrand;
    }

    public int getNumOfPickups() {
        return numOfPickups;
    }

    public void setNumOfPickups(int num) {
        numOfPickups = num;
    }

    public boolean getIsRockStarUsesIt() {
        return isRockStarUsesIt;
    }

    public void setIsRockStarUsesIt(boolean isUseIt) {
        isRockStarUsesIt = isUseIt;
    }
}
