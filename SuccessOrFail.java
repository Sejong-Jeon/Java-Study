import java.util.Scanner;
/**
 * 80점이상이면 합격하는 판별 프로그램
 * 
 * @author (전세종) 
 * @version (2019-06-04)
 */
public class SuccessOrFail
{
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("점수를 입력하세요");
        int score = scanner.nextInt();
        if(score >= 80){
            System.out.println("축하합니다! 합격입니다");
        }
            else {
                System.out.println("불합격입니다");
            }
    }
}
