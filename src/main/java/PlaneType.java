public enum PlaneType {
    BOEING707(200);

    private final int capacity;

    PlaneType(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
