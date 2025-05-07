public class Cat implements Runing, Jumping {
    private  int maxRunDistance = 11000;
    private  int maxJumpHeight = 10;

    @Override
    public boolean run(int distance) {
        boolean result = distance <= maxRunDistance;
        if (result) {
            System.out.println("Кот успешно пробежал " + distance + " м");
        } else {
            System.out.println("Кот не смог пробежать " + distance + " м");
        }
        return result;
    }

    @Override
    public boolean jump(int height) {
        boolean result = height <= maxJumpHeight;
        if (result) {
            System.out.println("Кот успешно прыгнул на " + height + " м");
        } else {
            System.out.println("Кот не смог прыгнуть на " + height + " м");
        }
        return result;
    }
}