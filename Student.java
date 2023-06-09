import java.util.Scanner;

public class Student {

  private String Name;
  private int Age;

  public Student(String name, int age) {
    this.Name = name;
    this.Age = age;
  }

  public String GetName() {
    return Name;
  }

  public int GetAge() {
    return Age;
  }

  public String ToString() {
    return Name + " " + Integer.toString(Age);
  }

  public void addStud(String name) {
    System.out.ptintln("Podaj imie: ");
    String name1 = scanner.nextLine();

    System.out.ptintln("Podaj wiek: ");
    String age = scanner.nextLine();

    Student student =new Student(name, age);
    Student.add(Student);
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if (data.length != 2)
      return new Student("Parse Error", -1);
    return new Student(data[0], Integer.parseInt(data[1]));
  }
}