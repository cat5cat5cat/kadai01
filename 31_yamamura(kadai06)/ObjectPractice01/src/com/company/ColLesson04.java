package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ColLesson04 {public static void main(String[] args) {
    ArrayList<Word> words = new ArrayList<>();
    System.out.println("わからなかった単語とその意味をスペースで区切って入力してください。");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();

    int index = 0;
    while (!input.equals("e")) {
        String[] tmp = input.split(" ");
        Word wd = new Word(tmp[0], tmp[1]);
        try {
            words.add(wd);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("登録制限を超えました。登録済みのデータは以下になります。");
            break;
        }
        index++;
        System.out.println("次の単語と意味を入力してください。eで終了します。");
        input = scanner.nextLine();
    }
    for(int i = 0; i < words.size(); i++){
        System.out.println(words.get(i));
    }
    System.out.println(index + "件登録しました。");
}
}
