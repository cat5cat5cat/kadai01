package com.company;

public class Person {
    public String name;
    public String syusshin;
    public Person(String input_name, String input_syusshin) {

        name = input_name;
        syusshin = input_syusshin;
    }
    //文字列の出力
    public String getSelfIntroduction(){
        return("私の名前は" + name + "です。" + syusshin + "出身" );
    }
}

