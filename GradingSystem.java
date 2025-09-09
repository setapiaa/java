import java.util.Scanner;
        
public class GradingSystem 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        double gradeExam1, gradeExam2, averageExams;
        String a, b, c, d, f;
        
        System.out.println("Enter your 1st score: ");
        gradeExam1 = input.nextDouble();
        
        System.out.println("Enter your 2nd score: ");
        gradeExam2 = input.nextDouble();
        
        averageExams = (gradeExam1 + gradeExam2) /2;
        System.out.println("Your score is: " + averageExams);
        
        if (averageExams >= 95 && averageExams < 100){
            System.out.print("Your grade is A+ ");}
        else if (averageExams >= 90 && gradeExam1 < 95){
            System.out.print("Your grade is A- ");}
        else if (averageExams >= 85 && gradeExam1 < 90){
            System.out.print("Your grade is B+ ");}
        else if (averageExams >= 80 && gradeExam1 < 85){
            System.out.print("Your grade is B- ");}
        else if (averageExams >= 75 && gradeExam1 < 80){
            System.out.print("Your grade is C+ ");}
        else if (averageExams >= 70 && gradeExam1 < 75){
            System.out.print("Your grade is C- ");}
        else if (averageExams >= 65 && gradeExam1 < 70){
            System.out.print("Your grade is D+ ");}
        else if (averageExams >= 60 && gradeExam1 < 65){
            System.out.print("Your grade is D- ");}
        else if (averageExams < 60){
            System.out.print("Your grade is F. You Failed. ");}
                    
        
        
    }
}
