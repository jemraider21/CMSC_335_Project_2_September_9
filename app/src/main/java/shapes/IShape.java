package shapes;

public abstract class IShape {
    private int numberOfSides;

    public IShape(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }
}