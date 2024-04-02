package GroupProject;

import java.util.Scanner;

public class PhepChia {
    public float PhepChia() {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap bien a: ");
        a = sc.nextInt();
        System.out.print("Nhap bien b: ");
        b = sc.nextInt();
        return (float)a / b;
    }
}
