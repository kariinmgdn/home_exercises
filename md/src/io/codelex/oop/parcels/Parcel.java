package io.codelex.oop.parcels;

public class Parcel implements Validatable{

    private final int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    private boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength,
                  float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }


    @Override
    public boolean validate() {

        if (isTrue()) {
            return getWeight() < 30 && !isExpress() || getWeight() < 15 && isExpress();
        }
        return false;
    }

    private boolean isTrue() {

        final int max = 300;
        final int maxLength = 30;

        return getxLength() + getyLength() + getzLength() < max
                && getxLength() < maxLength && getyLength() < maxLength && getzLength() < maxLength;
    }

    public int getxLength() {
        return xLength;
    }

    public int getyLength() {
        return yLength;
    }

    public int getzLength() {
        return zLength;
    }

    public float getWeight() {
        return weight;
    }

    public boolean isExpress() {
        return isExpress;
    }
}
