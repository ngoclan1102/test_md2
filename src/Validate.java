public class Validate {
    static String date = "^[0-9]{2}$";
    static String string = "^[a-z Ạ-ỹ A-Z]+\\s*$";
    static String number = "^[0-9]{10}$";
    static boolean check;

    public static boolean isCheck(String s,String string){
        check = string.matches(s);
        if (!check){
            System.out.println("Sai dữ liệu");
            System.out.println("Nhập lại");
        }
        return check;
    }

    public static String validate(String s){
        String s1;
        boolean check1;
        do {
            s1 = Create.scanner.nextLine();
            check1 = isCheck(s, s1);
        }while (!check1);
        return s1;
    }
}
