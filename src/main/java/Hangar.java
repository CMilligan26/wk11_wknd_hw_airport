public class Hangar {

    private int hangarNumber;
    private Plane plane;

    public Hangar(int hangarNumber,Plane plane){
        this.hangarNumber = hangarNumber;
        this.plane = plane;
    }

    public int getHangarNumber() {
        return this.hangarNumber;
    }

    public Plane getPlane() {
        return this.plane;
    }
}
