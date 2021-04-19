package Student;

import java.util.Scanner;

class Students {
    String name;
    String id;
  
    // Student(String name, String id) {
    //   this.name = name;
    //   this.id = id;
    // }
  
  public void nhapData (){
    Scanner scan = new Scanner(System.in);
    System.out.print("nhap ten  : ");
    this.name = scan.nextLine();
    System.out.print("nhap id  : ");
    this.id = scan.nextLine();
    scan.close();
  }
  
  
  public void xuatData(){
    System.out.println("Name: "+this.name);
    System.out.println("Id: "+this.id);
  }
  
  }
