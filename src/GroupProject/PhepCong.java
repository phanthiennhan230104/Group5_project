package GroupProject;

import java.util.Scanner;

public class PhepCong extends GiaiToan{
    public int PhepCong() {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        a = sc.nextInt();
        System.out.print("Nhap b: ");
        b = sc.nextInt();
        return a + b;
    }
}
