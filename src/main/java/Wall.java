public class Wall {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public boolean overcome(Jumping jumper) {
        return jumper.jump(height);
    }
}