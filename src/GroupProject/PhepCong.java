package GroupProject;

import java.util.Scanner;

public class PhepCong extends GiaiToan{
    public int PhepCong() {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Bien a: ");
        a = sc.nextInt();
        System.out.print("Bien b: ");
        b = sc.nextInt();
        return a + b;
    }
}
