import java.util.Scanner;
/**
 * if-else 문을 이용하여 학점을 부여하는 프로그램
 * 
 * @author (전세종) 
 * @version (2019-06-10)
 */
public class Grading
{
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("성적을 입력하세요");
        int score = scanner.nextInt();

        if (score >= 90){
            System.out.println("학점은 A입니다.");
        }
        else if(score >=80){
            System.out.println("학점은 B입니다.");
        }
        else if(score >=70){
            System.out.println("학점은 C입니다.");
        }
        else if(score >=60){
            System.out.println("학점은 D입니다.");
        }
        else{
            System.out.println("학점은 F입니다.");
        }

    }

}
