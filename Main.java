import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scannner(System.in);

    while (true) {
      System.out.println("Wybierz opcje");
      System.out.println("Dodaj studenta");
      System.out.println("Wyślwietl liste");

      int choice = scanner.nextInt();

      switch(choice){
        case 1:
          
          break;
        case 2:
          Student.addStud();
          break;
      }
    }

    try {
      Service s = new Service();
      s.addStudent(new Student("Krzysztof", 20));
      s.addStudent(new Student("Janusz", 40));

      var students = s.getStudents();
      for (Student current : students) {
        System.out.println(current.ToString());
      }
    } catch (IOException e) {

    }
  }
}