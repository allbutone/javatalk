import java.util.Random;
import java.util.Scanner;

/**
 * 猜数字
 */
public class GuessNumber {
    public static void main(String[] args) {
        Random r = new Random();
        int sjNum = r.nextInt(13) + 1;

        System.out.println("请猜一个数字");

        Scanner scanner = new Scanner(System.in);


        while (true) {
            int cNum = scanner.nextInt();

            if(sjNum > cNum){
                System.out.println("小了");
            }else if(sjNum < cNum){
                System.out.println("大了");
            }else{
                System.out.println("对了");
                break;
            }
        }
    }
}
