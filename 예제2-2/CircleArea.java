
/**
 * 예제2-2(상수 PI를 선언하고 원의 면적을 구하는 프로그램)
 * 
 * @author (전세종) 
 * @version (2019-05-07)
 */
public class CircleArea
{
    public static void main(String args[]){
        final double PI = 3.14;

        double radius = 10.0;
        double circleArea = PI * radius * radius;

        System.out.println(circleArea);
    }
}
