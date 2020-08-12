package HomeWorkLevelTwoLessonFive;

public class Main {

    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;
    float[] arr = new float[SIZE];
    float[] arr2 = new float[SIZE];

    public static void main(String[] args) {

        Main main = new Main();
        main.methodOne();
        main.methodTwo();
    }

    public void methodOne() {
        System.out.println("MethodOne start");
        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1;
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long end = System.currentTimeMillis();
        System.out.println("Скорость выполнения methodOne: " + (end-start) + " миллисекунд");
    }

    public synchronized void methodTwo() {
        System.out.println("MethodTwo start");

        for (int i = 0; i < SIZE; i++) {
            arr2[i] = 1;
        }

        float[] arr2Half1 = new float[HALF];
        float[] arr2Half2 = new float[HALF];

        long startSplit = System.currentTimeMillis();

        System.arraycopy(arr2, 0, arr2Half1, 0, HALF);
        System.arraycopy(arr2, HALF, arr2Half2, 0, HALF);

        long endSplit = System.currentTimeMillis();
        System.out.println("Скорость разделения массива на две части: " + (endSplit - startSplit) + " миллисекунд");

        Thread thread1 = new Thread(() ->this.methodTwoCalc(arr2Half1, 1));
        Thread thread2 = new Thread(() ->this.methodTwoCalc(arr2Half2, 2));

        thread1.start();
        thread2.start();

        long startJoin = System.currentTimeMillis();

        System.arraycopy(arr2Half1, 0, arr2, 0, HALF);
        System.arraycopy(arr2Half2, 0, arr2, HALF, HALF);

        long endJoin = System.currentTimeMillis();
        System.out.println("Скорость склейки массива: " + (endJoin - startJoin) + " миллисекунд");
    }

     private void methodTwoCalc(float[] array, int threadNumber) {
        long startInner = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            array[i] = (float) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long endInner = System.currentTimeMillis();
        System.out.println("Скорость просчета потока " + threadNumber + ": " + (endInner - startInner) + " миллисекунд");


    }
}



