package pl.idzikpro.enums;

public enum MobilePhone {
    ANDROID(5,8), IOS(7,8), WINDOWS(5,8);
    private int size;
    private int ram;

    public int getSize() {
        return size;
    }

    public int getRam() {
        return ram;
    }

    MobilePhone(int size, int ram) {
        this.size = size;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "size=" + size +
                ", ram=" + ram +
                '}';
    }
}
