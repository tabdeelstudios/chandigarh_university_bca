import java.util.Scanner;

class Person{
    String email;
    String address;
    
    Person(){
        address = "Some address";
    }
    
    public void showInfo(){
        System.out.println("Address : "+address);
    }
}

class Student extends Person{
    String name;
    int age;
    
    Student(){
        name = "Default";
        age = 0;
    }
    
    Student(String n, int a){
        name = n;
        age = a;
    }
    
    //polymorphism example
    public void grantAccess(int studentID, int studentPhone)
    {
        System.out.println("Student access granted!");
    }
    
    public void grantAccess(int facultyID, String password)
    {
        System.out.println("Faculty access granted!");
    }
    
    public void grantAccess(String adminPassword)
    {
        System.out.println("Admin access granted!");
    }
    
    //getter method
    public void displayData()
    {
        System.out.print("Student data : \nName : "+name+"\nAge : "+age);
    }
    
    //setter method
    public void saveData()
    {
        Scanner input = new Scanner(System.in);
        name = input.next();
        age = input.nextInt();
    }
}

class PHDStudent extends Student{
    String stream;
    
    PHDStudent()
    {
        stream = "Science";   
    }
    // overriding
    public void displayData()
    {
        System.out.print("Student data : \nName : "+name+"\nAge : "+age+"\nStream : "+stream);
    }
}

class MtechStudent extends Student{
    
}

public class MyClass {
    public static void main(String args[]) {
      Student aquib = new Student("John", 30);
      aquib.displayData();
    //   Student aquib = new Student();
    //   aquib.saveData();
    System.out.println();
    System.out.println();
      
    // aquib.grantAccess("password");
    PHDStudent ph1 = new PHDStudent();
    ph1.grantAccess("Gjegk");
    ph1.displayData();
    

    }
}