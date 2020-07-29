package HomeWorkLevelTwoLessonOne;

import lombok.Getter;

@Getter
public class Robot implements Movement {

    private String model;
    private double maxRunLength;
    private double maxJumpHeight;
    boolean isDone;
    private double distanceLimit;

    public Robot (String model, double maxRunLength, double maxJumpHeight){
        this.model=model;
        this.maxRunLength=maxRunLength;
        this.maxJumpHeight=maxJumpHeight;
        this.isDone=true;
        this.distanceLimit=maxRunLength;
    }

    public void run (){
        System.out.printf("Robot %s is running \n", model);
    }

    public void jump () {
        System.out.printf("Robot %s is jumping \n", model);
    }

    public void runRunningTrack(Obstacle runningTrack){
        if (distanceLimit < runningTrack.getSize()){
            System.out.println("Robot " + getModel() + ": Running failed");
            isDone = false;
        } else {
            System.out.println("Robot " + getModel() + ": Running done");
            distanceLimit -= runningTrack.getSize();
        }
    }

    public void jumpOverWall(Obstacle wall){
        if (maxJumpHeight < wall.getSize()){
            System.out.println("Robot " + getModel() + ": Jumping failed");
            isDone = false;
        } else {
            System.out.println("Robot " + getModel() + ": Jumping done");
        }
    }
}
