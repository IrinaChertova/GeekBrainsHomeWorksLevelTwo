package HomeWorkLevelTwoLessonTwo;

public class MyArraySizeException extends RuntimeException {
    public MyArraySizeException(){
        super("некорректный размер массива");
    }
}
