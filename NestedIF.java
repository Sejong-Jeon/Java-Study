import java.util.Scanner;
/**
 * 중첩if-else문 사례
 * 
 * @author (전세종) 
 * @version (2019-07-24)
 */
public class NestedIF
{
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("점수를 입력하세요(1~100)");
        int score = scanner.nextInt();
        System.out.println("학년을 입력하세요(1~4)");
        int year = scanner.nextInt();
        
        if(score > 60){
            if(year != 4)
                System.out.println("합격!");
            else if (score >= 70)
                System.out.println("합격!!");
            else
                System.out.println("불합격!");
            }
        else
            System.out.println("불합격!!");
        scanner.close();
    }
}
