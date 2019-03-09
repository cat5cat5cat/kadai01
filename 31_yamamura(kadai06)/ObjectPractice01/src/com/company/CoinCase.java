package com.company;

public class CoinCase {

        //フィールドの定義
        public int count500;
        public int count100;
        public int count50;
        public int count10;
        public int count5;
        public int count1;

    public CoinCase() {
            count500 = 0;
            count100 = 0;
            count50 = 0;
            count10 = 0;
            count5 = 0;
            count1 = 0;
        }

        public void AddCoins ( int kind, int num){
            int AddCoins = kind + num;
            if (kind == 500) {
                count500 = count500 + num;
            } else if (kind == 100) {
                count100 = count100 + num;
            } else if (kind == 50) {
                count50 = count50 + num;
            } else if (kind == 10) {
                count10 = count10 + num;
            } else if (kind == 5) {
                count5 = count5 + num;
            } else if (kind == 1) {
                count1 = count1 + num;
            }
        }

        public int GetCount ( int kind){
            if (kind == 1) {
                return count1;
            } else if (kind == 5) {
                return count5;
            } else if (kind == 10) {
                return count10;
            } else if (kind == 50) {
                return count50;
            } else if (kind == 100) {
                return count100;
            } else if (kind == 500) {
                return count500;
            }
            return 0;
        }

        public int GetAmunt () {
            return (count500 * 500) + (count100 * 100) + (count50 * 50) + (count10 * 10) + (count5 * 5) + count1;
        }
    }
