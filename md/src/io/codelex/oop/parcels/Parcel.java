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
        if (getxLength() + getyLength() + getzLength() < 300 &&
        getxLength() < 30 && getyLength() < 30 && getzLength() < 30) {
            return getWeight() < 30 && !isExpress() || getWeight() < 15 && isExpress();
        }
        return false;
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
