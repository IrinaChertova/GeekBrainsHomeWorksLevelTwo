package HomeWorkLevelTwoLessonThree;

import lombok.Getter;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
public class PhoneBook {

    List<ArrayList> phoneBook = new ArrayList();

    public void add(String surname, String phoneNumber) {

        if (getPhone(surname) != null) {
            for (int i = 0; i < phoneBook.size(); i++) {
                if (phoneBook.get(i).contains(surname) && !phoneBook.get(i).contains(phoneNumber)) {
                    phoneBook.get(i).add(phoneNumber);
                    break;
                }
                else if (phoneBook.get(i).contains(surname) && phoneBook.get(i).contains(phoneNumber)){
                    System.out.println("запись с таким номером телефона и фамилией уже существует");
                    break;
                }
            }

        } else {
            ArrayList arr = new ArrayList(2);
            arr.add(surname);
            arr.add(phoneNumber);
            phoneBook.add(arr);
        }
    }

    public ArrayList<ArrayList> getPhone(String surname) {
        for (int i = 0; i < phoneBook.size(); i++) {
            if (phoneBook.get(i).contains(surname)) {
                return phoneBook.get(i);
            }
        }return null;

    }
}




