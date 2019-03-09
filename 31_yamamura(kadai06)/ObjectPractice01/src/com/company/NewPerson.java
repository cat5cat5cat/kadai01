package com.company;

public class NewPerson {
    public String name;
    public String shussin;


    public NewPerson() {
        name = "森田";
        shussin = "奈良";
    }


    public NewPerson (String input_name, String input_shussin){
        name = input_name;
        shussin =  input_shussin;

    }

    public void getSelfIntroduction() {
        System.out.println(name + "は" + shussin + "出身です。よろしくね！");


    }
}
