package HomeWorkLevelTwoLessonOne;

public class Main {
    public static void main(String[] args) {

        // пункт 1
        Movement human1 = new Human("Alexey", 90, 1.5);
        Movement cat1 = new Cat("Findus", 200, 2);
        Movement robot1 = new Robot("AR0", 100, 0.5);
        RunningTrack runningTrack1 = new RunningTrack(100);
        Wall wall1 = new Wall(1);

        human1.run();
        human1.jump();
        cat1.run();
        cat1.jump();
        robot1.run();
        robot1.jump();
        System.out.println();

        //пункт 2
        human1.runRunningTrack(runningTrack1);
        human1.jumpOverWall(wall1);
        cat1.runRunningTrack(runningTrack1);
        cat1.jumpOverWall(wall1);
        robot1.runRunningTrack(runningTrack1);
        robot1.jumpOverWall(wall1);
        System.out.println();

        // пункт 3-4
        Movement[] sportsmens = new Movement[6];
        sportsmens[0] = new Human("Petr", 250, 1);
        sportsmens[1] = new Human("Ivan", 150, 0.7);
        sportsmens[2] = new Cat("Barsik", 200, 2);
        sportsmens[3] = new Cat("Mursik", 90, 1.5);
        sportsmens[4] = new Robot("AI100", 30, 3);
        sportsmens[5] = new Robot("AI200", 170, 1.2);

        Obstacle[] obstacleCourse = new Obstacle[5];
        obstacleCourse[0] = new RunningTrack(20);
        obstacleCourse[1] = new Wall(0.5);
        obstacleCourse[2] = new RunningTrack(100);
        obstacleCourse[3] = new Wall(1);
        obstacleCourse[4] = new RunningTrack(50);

        for (int i = 0; i < sportsmens.length; i++) {
            System.out.println("Sportsmen №" +(i+1) + " starts:");

            for (int j = 0; j < obstacleCourse.length; j++) {
                System.out.print("obstacle " + (j+1) + ": ");
                if (obstacleCourse[j] instanceof RunningTrack) {
                    sportsmens[i].runRunningTrack(obstacleCourse[j]);
                    if (!sportsmens[i].isDone()) {
                        System.out.println("Sportsmen got out of the race :(");
                        break;
                    }
                }
                if (obstacleCourse[j] instanceof Wall) {
                    sportsmens[i].jumpOverWall(obstacleCourse[j]);
                    if (!sportsmens[i].isDone()) {
                        System.out.println("Sportsmen got out of the race :(");
                        break;
                    }
                }
            }
            if (sportsmens[i].isDone()){
                System.out.println ("Sportsmen successfully completed the obstacle course! :)");
            }
            System.out.println();
        }
    }
}




//Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
// Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).

//Создайте два класса: беговая дорожка и стена, при прохождении через которые,
// участники должны выполнять соответствующие действия (бежать или прыгать),
// результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
// У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.

//Создайте два массива: с участниками и препятствиями, и заставьте всех участников
// пройти этот набор препятствий. Если участник не смог пройти одно из препятствий,
// то дальше по списку он препятствий не идет.

//* У препятствий есть длина (для дорожки) или высота (для стены),
// а участников ограничения на бег и прыжки. Если участник не смог
// пройти одно из препятствий, то дальше по списку он препятствий не идет.