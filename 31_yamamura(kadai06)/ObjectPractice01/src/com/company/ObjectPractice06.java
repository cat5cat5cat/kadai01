package com.company;

import java.util.Scanner;

public class ObjectPractice06 {
    public static void main(String[] args) {

        CoinCase coins = new CoinCase();
        for (int i = 0; i < 6; i++) {

            System.out.println("硬貨の種類を入力してください。");
            Scanner scanner = new Scanner(System.in);

            String kind = scanner.nextLine();
            System.out.println("硬貨の枚数を入力してください。");
            String num = scanner.nextLine();
            coins.AddCoins(Integer.parseInt(kind), Integer.parseInt(num));
        }

        System.out.println("500円は"+ coins.GetCount(500) +"枚");
        System.out.println("100円は"+ coins.GetCount(100) +"枚");
        System.out.println("50円は"+ coins.GetCount(50) +"枚");
        System.out.println("10円は"+ coins.GetCount(10) +"枚");
        System.out.println("5円は"+ coins.GetCount(5) +"枚");
        System.out.println("1円は"+ coins.GetCount(1) +"枚");
        System.out.println("総額は"+ coins.GetAmunt() +"円です。");
    }
}