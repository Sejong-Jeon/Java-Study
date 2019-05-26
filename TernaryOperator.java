
/**
 * 조건 연산자
 * 
 * @author (전세종) 
 * @version (2019-05-26)
 */
public class TernaryOperator
{
    public static void main (String args[]){
        int a = 3, b = 5;
        
        System.out.println(((a>5)?(a-b):(b-a)));
        
        System.out.println(a-b);
        System.out.println(b-a);
    }
}
