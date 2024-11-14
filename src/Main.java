import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean kondisi = true;
        while (kondisi) {
            System.out.println("masukan a: ");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.println("masukan b: ");
            int b = Integer.parseInt(scanner.nextLine());
            System.out.println("masukan operator: ");
            String operation = scanner.nextLine();
            
            main (a,b,op);

        } Scanner scanner2 = new Scanner(System.in);
        System.out.println("Aplikasi Calculator");
        String operation = scanner2.nextLine();

        if(operation.equals("x"))
        {System.out.println("a*b");
        }else if(operation.equals(":")){
            System.out.println("a/b");
        }
    }
    }



        //Calculator
//        String operation="";
//        while(!operation.equals("t")) {
//
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Aplikasi Calculator");
//            operation = scanner.nextLine();
//
//            if (operation.equals("Test")) {
//                System.out.println("Masukan angka 1");
//                int a = scanner.nextInt();
//                Scanner scanner2 = new Scanner(System.in);
//                System.out.println("Calculator Mini");
//                String operation2 = scanner2.nextLine();
//                System.out.println("Masukan angka 2");
//                int b = scanner.nextInt();
//
//                if (operation2.equals("tambah")) {
//                    System.out.println("hasilnya: " + (a + b));
//                } else if (operation2.equals("kurang")) {
//                    System.out.println("hasilnya: " + (a - b));
//                }
//            } else {
//                System.out.println("terima kasih");
//                scanner.close();


        // Input Variable
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Yossa Bhayangkara");
//        String nama = scanner.nextLine();
//
//        System.out.println("halo," + nama + "!");
//        if (nama.equals("Risa")) {
//            System.out.println("Apa Kabar");
//        } else {
//            System.out.println("kenalan yuk");
//        }
//    }
//}

  //    System.out.println("Hello and welcome!");
  //    System.out.println("i = " + i);

//        int a = 24;
//        int b = 16;
//
//        int kurang = a - b;
//        int kali = a * b;
//        int bagi = a / b;
//
//        System.out.println(a + b);
//        System.out.println(a % b);
//        System.out.println(kurang);
//        System.out.println(kali);
//        System.out.println(bagi);

        //operator logika, atau, dan, & bukan
//        System.out.println(true || true);
//        System.out.println(true || false);
//        System.out.println(false || true);
//        System.out.println(false || false);
//        System.out.println(true && true);
//        System.out.println(true && false);
//        System.out.println(false && true);
//        System.out.println(false && false);

//        int a = 31;
//        int b = 31;
//
//        System.out.println(a <= b);

//        int saldo = 500 ;
//        int tarik = 300 ;
//
//        if (tarik > 1000 && tarik =< saldo) {
//            System.out.println("saldo berhasil di tarik, tapi kena pajak");
//        }else if (tarik <=saldo) {
//            System.out.println("saldo berhasil di tarik");
//        }else {
//            System.out.println("saldo and kurang');

//


