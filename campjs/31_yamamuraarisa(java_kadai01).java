import java.util.Scanner;
import java.util.Random;

public class java_kadai01 {
    public static void main(String[] args) {
//        String[] hello = new String[4];
//        int a = 1;
//        int b = 2;
//        int c = 3;
//        int d = 4;
//
        String[] five = new String[5];
        Random r = new Random();
        five[0] = "Question1　あなたは猫は好きですか？1.そうは思わない。2.あまりそうは思わない。3.普通4.少しそう思う5.そう思う";
        five[1] = "Question2　あなたの年齢はいくつですか？1.０歳～１０歳　2.１１歳～２０歳　3.２１歳～３０歳　4.３１歳～４０歳　5.４１歳～５０歳";
        five[2] = "Question3　あなたはアボガドは好きですか？1.嫌い2.あまり好きではない。3.普通4.好き。5.とても好き";
        five[3] = "Question4　あなたの出身はどちらですか？1.九州2.中国・四国3.中部・関西4.関東5.東北・北海道";
        five[4] = "Question5　あなたは旅行は好き？1.嫌い2.あまり好きではない3.普通4.あまり好きではない5.とても好き";
        System.out.println(five.length);

//        for(int i = 0; i < five.length; i++){
//            System.out.println(five[i]);
//            r.nextInt(5);
//            int random = r.nextInt(5);
//            System.out.println(five[random]);

        for(int i = 0; i < five.length; i++){
            r.nextInt(5);
            int random = r.nextInt(5);
            System.out.println(five[random]);

            Scanner scanner = new Scanner(System.in);
            String str = scanner.next();


//            int sum = 0;
//            int input =
//            sum  = sum + input;

        }
//            System.out.println("相性占い");
//        System.out.println("あなたは猫は好きですか？1.そうは思わない。2.あまりそうは思わない。3.普通4.少しそう思う5.そう思う");
//        String name = new java.util.Scanner(System.in).nextLine();
//        System.out.println("あなたの年齢はいくつですか？1.０歳～１０歳　2.１１歳～２０歳　3.２１歳～３０歳　4.３１歳～４０歳　5.４１歳～５０歳");
//        String age = new java.util.Scanner(System.in).nextLine();
//        System.out.println("あなたはアボガドは好きですか？1.嫌い2.あまり好きではない。3.普通4.好き。5.とても好き");
//        String abogado = new java.util.Scanner(System.in).nextLine();
//        System.out.println("あなたの出身はどちらですか？1.九州2.中国・四国3.中部・関西4.関東5.東北・北海道");
//        String from = new java.util.Scanner(System.in).nextLine();
//        System.out.println("あなたは旅行は好き？1.嫌い2.あまり好きではない3.普通4.あまり好きではない5.とても好き");
//        String fire  = new java.util.Scanner(System.in).nextLine();



    }

    }
