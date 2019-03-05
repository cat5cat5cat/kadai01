import java.util.Scanner;

public class java_kadai01 {

    public static void main(String[] args) {
        // 質問を格納する配列の宣言・初期化
        String[] questions = {"あなたは猫は好きですか？",
                "休日にプログラミングをよくする",
                "あなたはアボガドは好きですか？",
                "ごはんとパンならパン派だ",
                "あなたは旅行は好き？"};
        // スキャナー変数の宣言
        Scanner scanner = new Scanner(System.in);
        // 値の合計値を集計する変数の宣言
        int sum = 0;
        // 答えを答えた数を集計する変数の宣言
        int answer_count = 0;
        // 入力した内容を格納する変数の宣言
        int input_num = 0;


        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println("1: あてはまらない 2: あまりあてはらまらない 3: まあまああてはまる 4: あてはまる");

            input_num = scanner.nextInt();

            // 99と入力されたら抜ける
            if (input_num == 99) {
                break;
            }

            sum += input_num;
            answer_count++;
        }

        System.out.println("診断結果");
        if (sum <= 4 * answer_count && sum > 3 * answer_count) {
            System.out.println("あなたと私の相性は抜群です！めっちゃ相性最高vvv");
        } else if (sum <= 3 * answer_count && sum > 2 * answer_count) {
            System.out.println("あなたと私の相性はまあまあです！一緒にご飯を食べに行きましょう！");
        } else if (sum <= 2 * answer_count && sum > 1 * answer_count) {
            System.out.println("あなたと私の相性は微妙です。かなり微妙...");
        } else {
            System.out.println("あなたと私の相性は最悪です。必ずケンカするでしょう。");
        }
    }
}

