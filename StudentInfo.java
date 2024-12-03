public class StudentInfo{
  public int studentNum;
  public String firstName;
  public String midName;
  public String lastName;
  public StudentInfo next;

  public StudentInfo(int studentNum, String firstName, String midName, String lastName){
    this.studentNum = studentNum;
    this.firstName = firstName;
    this.midName = midName;
    this.lastName = lastName;
    next = null;
  }
}