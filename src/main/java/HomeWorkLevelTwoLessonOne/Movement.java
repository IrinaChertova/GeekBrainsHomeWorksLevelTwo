package HomeWorkLevelTwoLessonOne;

import lombok.Getter;

public interface Movement {
    void run ();
    void jump();
    void runRunningTrack(Obstacle runningTrack);
    void jumpOverWall(Obstacle wall);
    boolean isDone();
}
