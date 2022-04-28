import java.util.Scanner;

public class Create {
    static Scanner scanner = new Scanner(System.in);

    public static PhoneBook CreatePhoneNUmber() {
        System.out.println("Nhập số điện thoại");
        String phoneNumber = Validate.validate(Validate.number);

        System.out.println("Nhập nhóm");
        String group = Validate.validate(Validate.string);

        System.out.println("Nhập họ và tên");
        String name = Validate.validate(Validate.string);

        System.out.println("Nhập giới tính");
        String gender = Validate.validate(Validate.string);

        System.out.println("Nhập ngày sinh");
        String birthday = Validate.validate(Validate.date);

        System.out.println("Nhập địa chỉ");
        String address = Validate.validate(Validate.string);

        return new PhoneBook(phoneNumber,group,name,gender,address,birthday,address);

    }
}
