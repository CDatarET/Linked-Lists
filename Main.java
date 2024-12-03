public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    
    MyLL theLL = new MyLL();
    
    theLL.displayList();
    
    StudentInfo astudent = new StudentInfo(111111, "Daffy", null, "Duck");
    theLL.addToFront(astudent);
    theLL.displayList();
    
    astudent = new StudentInfo(222222, "Elmer", null, "Fudd");
    theLL.addToFront(astudent);
    theLL.displayList();

    astudent = new StudentInfo(333333, "Bugs", null, "Bunny");
    theLL.addToFront(astudent);
    theLL.displayList();

    astudent = new StudentInfo(444444, "Thomas", "Jasper", "Cat");
    theLL.addToRear(astudent);
    theLL.displayList();

    astudent = new StudentInfo(555555, "Gerald", "Jinx", "Mouse");
    theLL.addToRear(astudent);
    theLL.displayList();

    theLL.removeFromFront();
    theLL.displayList();

    theLL.removeFromRear();
    theLL.displayList();
  }
}