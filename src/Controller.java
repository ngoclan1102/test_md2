import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    public static void showPhoneBook(List<PhoneBook> phoneBooks) {
        for (PhoneBook p : phoneBooks) {
            System.out.println(p);
        }
    }

    public static void addPhoneNumber(List<PhoneBook> phoneBooks) {
        phoneBooks.add(Create.CreatePhoneNUmber());
        writeFile("contacts.csv",phoneBooks);
    }

    public static void updatePhoneNumber(List<PhoneBook> phoneBooks) {
        int index = findPhoneNumber(phoneBooks);
        phoneBooks.set(index,Create.CreatePhoneNUmber());
        writeFile("contacts.csv",phoneBooks);
    }

    public static void deletePhoneNumber(List<PhoneBook> phoneBooks) {
        int index = findPhoneNumber(phoneBooks);
        phoneBooks.remove(index);
        writeFile("contacts.csv",phoneBooks);
    }

    public static void searchPhoneNumber(List<PhoneBook> phoneBooks) {
        int index = findPhoneNumber(phoneBooks);
        System.out.println(phoneBooks.get(index));
    }

public static void searchNamePhoneNumber(List<PhoneBook> phoneBooks) {
        List<PhoneBook> phoneBookList = findNamePhoneNumber(phoneBooks);
    for (PhoneBook p :
            phoneBookList) {
        System.out.println(p);
    }
    }

    public static void writeFile(String path,List<PhoneBook> phoneBooks) {
        try {
            FileWriter fileWriter = new FileWriter(path);
            for (PhoneBook phoneBook : phoneBooks) {
                String string = phoneBook.toString();
                fileWriter.write(string);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<PhoneBook> readFile(String path){
        List<PhoneBook> phoneBooks = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while (line != null){
                String[] split = line.split(",");
                PhoneBook phoneBook = new PhoneBook(split[0],split[1],split[2],split[3],split[4],split[5],split[6]);
                phoneBooks.add(phoneBook);
            }
            fileReader.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return phoneBooks;
    }


    public static int findPhoneNumber(List<PhoneBook> phoneBooks) {
        int index = 0,c = 1;
        boolean check = false;
        while (c != 0){
        System.out.println("Nhập số điện thoại muốn tìm");
        String phoneNumber = Validate.validate(Validate.number);
        for (int i = 0; i < phoneBooks.size(); i++) {
        if (phoneNumber.equals(phoneBooks.get(i).getPhoneNumber())){
            index = i;
            c = 0;
            check = true;
            break;
        }
    }if (!check){
                System.out.println("Số điện thoại không tồn tại");
            c = -1;
            }
        }
        return index;
    }
public static List<PhoneBook> findNamePhoneNumber(List<PhoneBook> phoneBooks) {
        List<PhoneBook> phoneBookList = new ArrayList<>();
    boolean check = false;
        int c = 1;
        while (c != 0){
        System.out.println("Nhập họ tên muốn tìm");
        String name = Create.scanner.nextLine();
            for (PhoneBook phoneBook : phoneBooks) {
                if (name.equals(phoneBook.getName())) {
                    phoneBookList.add(phoneBook);
                    check = true;
                }
            }
            if (!check){
                System.out.println("Số tên không tồn tại");
            c = -1;
            }else c = 0;
        }
        return phoneBookList;
    }

}
