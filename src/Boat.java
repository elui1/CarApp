public final class Boat extends Vehicle {
    private String name;
    private int numCabins;
    private int length;

    public Boat() {

    }

    public Boat(String name, int numCabins, int length) {
        this.name = name;
        this.numCabins = numCabins;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumCabins() {
        return numCabins;
    }

    public void setNumCabins(int numCabins) {
        this.numCabins = numCabins;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
