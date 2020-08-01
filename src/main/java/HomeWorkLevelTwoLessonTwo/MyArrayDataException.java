package HomeWorkLevelTwoLessonTwo;

public class MyArrayDataException extends RuntimeException {

    public MyArrayDataException(int i, int j){
       super("некорректные данные в массиве (не число!) в строке " + i + ", в столбце "+ j);
    }

}
