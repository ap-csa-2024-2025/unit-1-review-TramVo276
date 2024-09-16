public class GradeCalculator
{
  public static void main(String[] args)
  {
    String course = "AP Computer Science A";
    int AmountTime = ((50 *4) + 37);
    System.out.println("Average time spent in a week for this course in minues is: " + AmountTime + " mintunes.");
    int HomeWork = 50;
    int HW2 = 90;
    int HW3 = 95;
    int HW4 = 99;
    int HW5 = 100;
    System.out.println("Homework grades for this course is:");
    System.out.println(HomeWork);    
    System.out.println(HW2);
    System.out.println(HW3);
    System.out.println(HW4);
    System.out.println(HW5);
    double QuizGrade = 89.7;
    double QuizGrade2 = 90.6;
    System.out.println("Quiz grades for this course:");
    System.out.println(QuizGrade);
    System.out.println(QuizGrade2);
    double FinalGrade = 94.53;
    System.out.println("Final exam grase for this course:");
    System.out.println(FinalGrade);
    System.out.println("Weekly time spent: " + AmountTime / 60.0);
    System.out.println("Average homework grade: " + ((HomeWork + HW2 + HW3 + HW4 + HW5) / 5));

  

  }
}
