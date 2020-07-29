package HomeWorkLevelTwoLessonOne;

import lombok.Getter;

@Getter
public class Human implements Movement{

    private String name;
    private double maxRunLength;
    private double maxJumpHeight;
    private boolean isDone;
    private double distanceLimit;

    public Human (String name, double maxRunLength, double maxJumpHeight){
        this.name=name;
        this.maxRunLength=maxRunLength;
        this.maxJumpHeight=maxJumpHeight;
        this.isDone=true;
        this.distanceLimit=maxRunLength;
    }

    public void run (){
        System.out.printf("Human %s is running \n", name);
    }

    public void jump () {
        System.out.printf("Human %s is jumping\n", name);
    }

    public void runRunningTrack(Obstacle runningTrack){

        if (distanceLimit < runningTrack.getSize()){
            System.out.println("Human "+ getName() + ": Running failed");
            isDone = false;
        } else {
            System.out.println("Human "+ getName() + ": Running done");
            distanceLimit -= runningTrack.getSize();
        }
    }

    public void jumpOverWall(Obstacle wall){
        if (maxJumpHeight < wall.getSize()){
            System.out.println("Human "+ getName() + ": Jumping failed");
            isDone = false;
        } else {
            System.out.println("Human "+ getName() + ": Jumping done");
        }
    }
}
