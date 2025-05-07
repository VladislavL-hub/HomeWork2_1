public class Robot implements Runing, Jumping {
    private  int maxRunDistance = 3000;
    private  int maxJumpHeight = 5;

    @Override
    public boolean run(int distance) {
        boolean result = distance <= maxRunDistance;
        if (result) {
            System.out.println("Робот успешно пробежал " + distance + " м");
        } else {
            System.out.println("Робот не смог пробежать " + distance + " м");
        }
        return result;
    }

    @Override
    public boolean jump(int height) {
        boolean result = height <= maxJumpHeight;
        if (result) {
            System.out.println("Робот успешно прыгнул на " + height + " м");
        } else {
            System.out.println("Робот не смог прыгнуть на " + height + " м");
        }
        return result;
    }
}