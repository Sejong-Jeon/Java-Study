
/**
 * 비교연산자와 논리연산자의 사례
 * 
 * @author (전세종) 
 * @version (2019-05-26)
 */
public class LogicalOperator
{
    public static void main(String args[]){
        System.out.println('a'>'b');
        System.out.println(3 >= 2);
        System.out.println(-1 < 0);
        System.out.println(3.45 <= 2);
        System.out.println(3 == 2);
        System.out.println(3 != 2);
        System.out.println(!(3 != 2));

        System.out.println((3 > 2) && (3 > 4));
        System.out.println((3 != 2) || (-1 > 0));
        System.out.println((3 != 2) ^ (-1 > 0));
    }
}
