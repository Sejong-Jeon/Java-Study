
/**
 * 예제2-3(자동 타입 변환과 강제 타입 변환)
 * 
 * @author (전세종) 
 * @version (2019-05-07)
 */
public class TypeConversion
{
    public static void main(String args[]){
        byte b = 127;
        int i = 100;
        System.out.println(b+i);
        System.out.println(10/4);
        System.out.println(10.0/4);
        System.out.println((char)0x12340041);
        System.out.println((byte)(b+i));
        System.out.println((int)2.9+1.8);
        System.out.println((int)(2.9+1.8));
        System.out.println((int)2.9+(int)1.8);
        }
}
