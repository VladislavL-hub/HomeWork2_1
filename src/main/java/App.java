public class App {
    public static void main(String[] args) {
        Human human = new Human();
        Robot robot = new Robot();
        Cat cat = new Cat();
        Runing[] participantsRun = {human, robot, cat};
        Jumping[] participantsJupm = {human, robot, cat};




        Treadmill treadmill1 = new Treadmill(1000);
        Treadmill treadmill2 = new Treadmill(4000);

        Wall wall1 = new Wall(1);
        Wall wall2 = new Wall(3);

        Wall[] obstaclesJump = {wall1, wall2};
        Treadmill[] obstaclesRun = {treadmill1, treadmill2};


//бег
        for (Runing participant : participantsRun) {
            boolean success = true;


           for (Treadmill obstacle : obstaclesRun) {
                if (obstacle.overcome(participant)) {

                } else {
                    success = false;
                    break;
                }
            }

            String participantType = participant instanceof Human ? "Человек" :
                    participant instanceof Robot ? "Робот" : "Кот";

            if (success) {
                System.out.println(participantType + " успешно пробежал все дистанции!");
            } else {
                System.out.println(participantType + " выбыл из соревнований по бегу.");
            }
            System.out.println("------------------------------");
        }

//стена
        for (Jumping participant : participantsJupm) {
            boolean success = true;

            for (Wall obstacle : obstaclesJump) {
                if (obstacle.overcome(participant)) {

                } else {
                    success = false;
                    break;
                }
            }



            String participantType = participant instanceof Human ? "Человек" :
                    participant instanceof Robot ? "Робот" : "Кот";

            if (success) {
                System.out.println(participantType + " успешно перепрыгнул все стены!");
            } else {
                System.out.println(participantType + " выбыл из соревнований по прыжкам.");
            }
            System.out.println("------------------------------");
        }


    }
}




/**
 public class App {
 public static void main(String[] args) {
 Human human = new Human();
 Robot robot = new Robot();
 Cat cat = new Cat();

 Object[] participants = {human, robot, cat};

 Treadmill treadmill1 = new Treadmill(1000);
 Wall wall1 = new Wall(1);
 Treadmill treadmill2 = new Treadmill(3000);
 Wall wall2 = new Wall(3);

 Object[] obstacles = {treadmill1, wall1, treadmill2, wall2};

 for (Object participant : participants) {
 boolean success = true;

 for (Object obstacle : obstacles) {
 if (obstacle instanceof Treadmill && participant instanceof Runing) {
 if (!((Treadmill) obstacle).overcome((Runing) participant)) {
 success = false;
 break;
 }
 } else if (obstacle instanceof Wall && participant instanceof Jumping) {
 if (!((Wall) obstacle).overcome((Jumping) participant)) {
 success = false;
 break;
 }
 }
 }

 String participantType = participant instanceof Human ? "Человек" :
 participant instanceof Robot ? "Робот" : "Кот";

 if (success) {
 System.out.println(participantType + " прошел все препятствия!");
 } else {
 System.out.println(participantType + " выбыл из соревнований.");
 }
 System.out.println("------------------------------");
 }
 }
 }
 */

