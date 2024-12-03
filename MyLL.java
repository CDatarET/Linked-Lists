public class MyLL{
  public StudentInfo front; //top
  public StudentInfo rear;
  public int num;

  public MyLL(){
    front = null;
    rear = null;
    num = 0;
  }

  public void displayList(){ //displayStack
    //displayQueue
    if (num == 0){
      System.out.println("\n\nList is empty\n\n");
    }
    else{
      System.out.println("\n\nList of Students from front to rear\n\n");
      StudentInfo current = front;
      while (current != null){
        if (current.midName != null) {
          System.out.println(current.studentNum + " " + current.firstName + " " + current.midName+ " " + current.lastName);
        }
        else{
          System.out.println(current.studentNum + " " + current.firstName + " " + current.lastName);
        }
        current = current.next;
      }  
    }
  }

  
  //
  public void addToFront(StudentInfo studentToAdd){ //push //enqueue
    if(num == 0){
      front = studentToAdd;
      num = 1;
    }
    else{
      studentToAdd.next = front;
      front = studentToAdd;
      num++;
    }
  
  }


  public void addToRear(StudentInfo studentToAdd) {
    if(num == 0) {
      rear = studentToAdd;
      front = rear;
      num = 1;
    } else {
      StudentInfo current = front;
      while (current.next != null) {
        current = current.next;
      }
      current.next = studentToAdd;
      rear = studentToAdd;
      num++;
    }
  }


  public StudentInfo removeFromFront() { //pop, and peek without removing
    //dequeue
    if (num == 0) {
        return null;
    }

    // If I get to here, then the list must not be empty!
    StudentInfo studentToRemove = front;
    front = front.next;
    num--;
    if (num == 0) {
        rear = null;
    }
    return studentToRemove;
    
  }


  public StudentInfo removeFromRear() {
    if (num == 0) {
      return null;
    }
    // If I get to here, then the list must not be empty!
    StudentInfo studentToRemove = rear;
    if (num == 1) {
      front = null;
      rear = null;
      num = 0;
    }
    else{
      StudentInfo current = front;
      while (current.next != rear){
        current = current.next;
      }
      current.next = null;
      rear = current;
      num--;
    }
    return studentToRemove;
  }  
  
}