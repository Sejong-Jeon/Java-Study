import java.util.Scanner;
/**
 * Scanner를 이용한 키 입력 연습
 * 
 * @author (전세종) 
 * @version (2019-05-13)
 */
public class ScannerEx
{
    public static void main(String args[]){
        System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");
        Scanner scanner = new Scanner(System.in);
        
        String name = scanner.next();
        System.out.println("이름은" + name + ",");
        
        String city = scanner.next();
        System.out.println("도시는" + city + ",");
        
        int age = scanner.nextInt();
        System.out.println("나이는" + age + "살,");
        
        double weight = scanner.nextDouble();
        System.out.println("체중은" + weight + "kg,");
        
        boolean isSingle = scanner.nextBoolean();
        System.out.println("독신 여부는" + isSingle + "입니다.");
        
        scanner.close();
    }
}
