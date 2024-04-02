package GroupProject;

import java.util.Scanner;

public class MainClass{
    public static void main(String[] args) {
        MainClass m = new MainClass();
        int select = 0;
        Scanner sc = new Scanner(System.in);
        OUTER:
        while(true){
            System.out.println("===GIAI TOAN===");
            System.out.println("1. +");
            System.out.println("2. -");
            System.out.println("3. Nhan");
            System.out.println("4. Chia");
            System.out.println("0. Thoat");
            while(true){
                try {
                    System.out.println("Nhap lua chon cua ban: ");
                    select = Integer.parseInt(sc.nextLine());
                    if (select >= 0 && select <= 4) {
                        break;
                    }
                } catch (Exception e) {
                    System.err.println("Nhap lai!!!");
                }
            }
            switch(select){
                case 1:{
                    System.out.println("===PHEP CONG===");
                    PhepCong phepCong = new PhepCong();
                    System.out.println("Ket qua la: " + phepCong.PhepCong());
                    break;
                }
                case 2:{
                    System.out.println("===PHEP TRU===");
                    PhepTru phepTru = new PhepTru();
                    System.out.println("Ket qua la: " + phepTru.PhepTru());
                    break;
                }
                case 3:{
                    System.out.println("===PHEP NHAN===");
                    PhepNhan phepNhan = new PhepNhan();
                    System.out.println("Ket qua la: " + phepNhan.PhepNhan());
                    break;
                }
                case 4:{
                    System.out.println("===PHEP CHIA===");
                    PhepChia phepChia = new PhepChia();
                    System.out.println("Ket qua la: " + phepChia.PhepChia());
                    break;
                }
                case 0:{
                    break OUTER;
                }
            }
        }
    }
}
