public class Human implements Runing, Jumping {
    private  int maxRunDistance = 5000;
    private  int maxJumpHeight = 2;

    @Override
    public boolean run(int distance) {
        boolean result = distance <= maxRunDistance;
        if (result) {
            System.out.println("Человек успешно пробежал " + distance + " м");
        } else {
            System.out.println("Человек не смог пробежать " + distance + " м");
        }
        return result;
    }

    @Override
    public boolean jump(int height) {
        boolean result = height <= maxJumpHeight;
        if (result) {
            System.out.println("Человек успешно прыгнул на " + height + " м");
        } else {
            System.out.println("Человек не смог прыгнуть на " + height + " м");
        }
        return result;
    }
}