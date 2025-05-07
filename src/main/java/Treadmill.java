public class Treadmill {
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public boolean overcome(Runing runner) {
        return runner.run(length);
    }
}