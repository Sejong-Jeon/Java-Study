import java.util.Scanner;
/**
 * 초단위의 정수를 입력받고, 몇 시간, 몇 분, 몇 초인지 출력하는 프로그램
 * 
 * @author (전세종) 
 * @version (2019-05-14)
 */
public class ArithmeticOperator
{
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("초를 입력하세요");
        int time = scanner.nextInt();
        int second = time % 60;
        int minute = (time / 60) % 60;
        int hour = (time / 60) / 60;
        
        System.out.print(time + "초는");
        System.out.print(hour + "시간,");
        System.out.print(minute + "분,");
        System.out.println(second + "초입니다.");
        scanner.close();
    }
}
