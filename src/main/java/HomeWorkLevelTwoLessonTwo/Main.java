package HomeWorkLevelTwoLessonTwo;

public class Main {
    public static void main(String[] args) {

    String  [][] arr = {{"1", "1", "1", "1"},{"2", "2", "2", "2" },{"3", "3", "3", "3"},{"4","4", "4", "4"}};

    try {
        System.out.println("сумма всех элементов массива = "+ summArray(arr));
    }  catch (MyArraySizeException e) {
            e.printStackTrace();
        }
        catch (MyArrayDataException e){
          e.printStackTrace();
    }
}

    public static int summArray (String [][] arr) throws MyArraySizeException, MyArrayDataException {
        for (int i=0; i< 4; i++) {
            if (arr.length != 4 || arr[i].length != 4) throw new MyArraySizeException();
        }
        System.out.println("array size is ok");

        int summ=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
               try {
                    summ += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e){
                   throw new MyArrayDataException( i, j);
               }
            }
        }
        return summ;
        }
    }




//1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4,
// при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
//2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
// Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
// должно быть брошено исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.
//3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и
// MyArrayDataException, и вывести результат расчета.