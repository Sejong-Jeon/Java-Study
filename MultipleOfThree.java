import java.util.Scanner;
/**
 * 입력된 수가 3의 배수인지 판단하는 프로그램
 * 
 * @author (전세종) 
 * @version (2019-06-09)
 */
public class MultipleOfThree
{
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자를 입력하세요");
        int a = scanner.nextInt();

        if(a % 3 == 0){
            System.out.println("3의 배수입니다.");
        }
        else{
            System.out.println("3의 배수가 아닙니다.");
        }
    }
}
