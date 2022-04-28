import java.util.ArrayList;
import java.util.List;

public class Menu {
    public static void main() {
        List<PhoneBook> phoneBooks = new ArrayList<>();
        int i = -1;
        while (i != 0){
        menu();
        int choice = Integer.parseInt(Create.scanner.nextLine());

        switch (choice) {
            case 1 :
                Controller.showPhoneBook(phoneBooks);
                break;
            case 2 :
                Controller.addPhoneNumber(phoneBooks);
                break;
            case 3 :
                Controller.updatePhoneNumber(phoneBooks);
                break;
            case 4 :
                Controller.deletePhoneNumber(phoneBooks);
                break;
            case 5 :
                System.out.println("1. Tìm kiếm theo số điện thoại");
                System.out.println("2. Tìm kiếm theo tên");
                System.out.println("Chọn chức năng :");
                int choice1 = Integer.parseInt(Create.scanner.nextLine());
                switch (choice1){
                    case 1 :
                        Controller.searchPhoneNumber(phoneBooks);
                        break;
                    case 2 :
                        Controller.searchNamePhoneNumber(phoneBooks);
                        break;
                    default:
                }
            case 6 :
                Controller.readFile("contacts.csv");
                break;
            case 7 :
                Controller.writeFile("contacts.csv",phoneBooks);
                break;
            case 8 :
                i = 0;
                break;
            default:
        }
        }
    }
    public static void menu() {
        System.out.println("--- CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM ---");
        System.out.println("1. Xem danh sách");
        System.out.println("2. Thêm mới");
        System.out.println("3. Cập nhật");
        System.out.println("4. Xóa");
        System.out.println("5. Tìm kiếm");
        System.out.println("6. Đọc từ file");
        System.out.println("7. Ghi từ file");
        System.out.println("8. Thoát");
        System.out.println("Chọn chức năng :");
    }
}
