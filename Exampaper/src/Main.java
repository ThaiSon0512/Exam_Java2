import java.util.HashMap;
import java.util.Scanner;

public class Main {
public static HashMap<String, Contact> add(String name,String phone,HashMap<String, Contact> list){
    Contact c = new Contact(name,phone);
    list.put(name,c);
    return list;
}
    public static void main(String[] args) {

        HashMap<String, Contact> ListStudent = new HashMap<String, Contact>();

        Scanner scan = new Scanner(System.in);
        while (true) {
            displayMenu();
            int n = Integer.parseInt(scan.nextLine());
            if (n == 1) {
                System.out.println("Thuc hien tinh nang them mot contact moi");
                //viet code add
                System.out.println("Nhap ten");
                String name =  scan.nextLine();
                System.out.println("Nhap so dien thoai");
                String phoneNumber =  scan.nextLine();
                add(name,phoneNumber,ListStudent);
            }
            if(n==2){
                System.out.println("Tinh nang tim kiem theo ten");
                System.out.println("Xin moi nhap ten");
                String name = scan.nextLine();
                if(ListStudent.containsKey(name)){
                    System.out.println(ListStudent.get(name));
                }else{
                    System.out.println("Khong co");
                }
            }
            if(n==3){
                System.out.println("----- Address Book -----");
                System.out.println("Contact Name ---------- Phone number");
                for (HashMap.Entry<String, Contact> entry : ListStudent.entrySet()) {
                    System.out.println(entry.getKey() + "              " + entry.getValue().phoneNumber);
                }
            }
            if(n==4){
                break;
            }

        }
    }

        static void displayMenu () {
            System.out.println("1.Add new contact");
            System.out.println("2.Find a contact by name");
            System.out.println("3.Display contact");
            System.out.println("4.Exit");
        }





    }


