package Student;

import java.util.Scanner;

public class Students {
    String name,classes;
    int age;

    public void nhapData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        this.name = sc.nextLine();
        System.out.println("Nhap lop: ");
        this.classes = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        this.age = sc.nextInt();

    }
    public void xuatData(){
        System.out.println("name:"+this.name);
    }
}
