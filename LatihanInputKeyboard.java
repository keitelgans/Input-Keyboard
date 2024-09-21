import java.util.Scanner;

public class LatihanInputKeyboard {
    public static void main(String[] args) {
        Scanner inputKeyboard = new Scanner(System.in);
        String nama, NIM, ps;
        //String NIM;
        //String Program_Studi;

        System.out.println("========== Input ==========");
        System.out.print("Nama: ");
        nama = inputKeyboard.nextLine();
        System.out.print("NIM: ");
        NIM = inputKeyboard.nextLine();
        System.out.print("Program Studi: ");
        ps = inputKeyboard.nextLine();
        System.out.println();

        System.out.println("==========Output==========");
        System.out.println("Hi " + nama + ", Anda terdaftar dengan NIM: " + NIM + " di Program Studi " + ps);

       // System.out.println("Hi " + nama + ", Anda terdaftar dengan NIM: " + NIM + "di Program Studi " + ps);

    }
}
