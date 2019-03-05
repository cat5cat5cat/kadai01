import java.util.Random;
public class Main02 {
    public static void main(String[] arms){
        Random r = new Random();
        int number = r.nextInt(100);

        System.out.println(number);

        number = r.nextInt(100);

        System.out.println(number);
    }
}
