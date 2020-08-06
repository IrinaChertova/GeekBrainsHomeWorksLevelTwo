package HomeWorkLevelTwoLessonThree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
// задание 1
        String [] colors= new String[ ]{"White", "Silver", "Black", "Pink", "Green","Blue", "Orange","Gold", "Violet","Yellow", "Silver","Green", "Gold","Blue", "Silver","Red", "White","Emerald", "Brown", "White", "Black", "Orange", "Purple","Emerald", "White", "Pink", "Lilac", "Gray","Gold"};

        Set<String> setUniqueColors = new HashSet<>(Arrays.asList(colors));
        System.out.println(setUniqueColors);
        System.out.println("размер заданного массива: "+colors.length);
        System.out.println("размер уникального массива: "+ setUniqueColors.size());

        ArrayList<String> colorList = new ArrayList<>(Arrays.asList(colors));

            for (int i = colorList.size()-1; i >-1; i--) {
                int count = 1;
                String strList = colorList.get(i);
                colorList.remove(i);
                    for (int j=i-1; j>-1; j--){
                    if (strList.equals(colorList.get(j))){
                        count++;
                        colorList.remove(j);
                        }
                }
                    System.out.println("слово "+ strList + " встречается "+ count+" раз");
                    i=i-count+1;
                }
        System.out.println("****************");




            // задание 2
     PhoneBook phoneBook=new PhoneBook();
        phoneBook.add("Ivanov", "8-495-111-11-11");
        phoneBook.add("Ivanov", "8-495-111-11-12");
        phoneBook.add("Ivanov", "8-495-111-11-13");
        phoneBook.add("Petrov", "8-495-111-11-14");
        phoneBook.add("Sidorov", "8-495-111-11-15");
        phoneBook.add("Sidorov", "8-495-111-11-16");
        phoneBook.add("Smirnov", "8-495-111-11-17");
        phoneBook.add("Ivanov", "8-495-111-11-18");
        phoneBook.add("Orlov", "8-495-111-11-19");

        System.out.println(phoneBook.getPhone("Ivanov"));
    }
}


//        1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
//        Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
//        Посчитать сколько раз встречается каждое слово.
//        2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий
//        и телефонных номеров. В этот телефонный справочник с помощью метода add() можно добавлять записи.
//        С помощью метода get() искать номер телефона по фамилии. Следует учесть, что под одной фамилией
//        может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии
//        должны выводиться все телефоны.
//
//        Желательно как можно меньше добавлять своего, чего нет в задании (т.е. не надо в телефонную
//        запись добавлять еще дополнительные поля (имя, отчество, адрес), делать взаимодействие
//        с пользователем через консоль и т.д.). Консоль желательно не использовать (в том числе Scanner),
//        тестировать просто из метода main() прописывая add() и get().