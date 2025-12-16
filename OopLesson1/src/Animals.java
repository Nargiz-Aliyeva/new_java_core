import java.util.Scanner;
import java.util.concurrent.RecursiveTask;

public class Animals {
    public void ekranaYaz(){
        System.out.println("iT IS MY FIRST METHOD");

    }
    public void ekranaQirmiziYaz(){
        System.err.println("It is my first redx methods");
    }
    public void calc (int a){
        System.out.println(a);
    }
    public void calcs(int point , String name, int age){
        System.out.println("welcome "+ name+" your point " +point);
    }
    public void st (String name , String surname , String fathername ,int age ){
        if (age<20){
        System.err.println("Salam "+name+" " + surname+" " + fathername+" " +" qızı. Sizin yaşınız hələ çatmır");
    }
    else if(age>=21){
            System.out.println(
                    "Salam"+" "+name+" "+surname+" "+fathername+" "+"qızı. Səhifəyə xoş gəlmisiniz"
            );
        }
    else {
            System.out.println("Istifadeci tapilmadi");
        }


    }
    public void mult(int a, int b, String c ){
        if (c.equals("*")){
            System.out.println("a"+"*"+"b"+"="+a*b);
        }
        else if (c.equals("-")){
            System.out.println("a"+"-"+"b"+"="+ (a-b));

        }
        else if(c.equals("+")){
            System.out.println("a"+"+"+"b"+"="+ (a+b));
        }
        else if(c.equals("/")){
            System.out.println("a"+"/"+"b"+"="+ (a/b));
        }
        else {
            System.err.println("This operation is not found. Please try again");
        }


    }












































//    //OOP Object oriented programming
// void geriye hecne qaytarmir
//
//    public void ekranaYaz() {
//        System.out.println("its my first methods");
//    }
//
//    public void sendThisMessage() {
//        System.out.println("this is not first line");
//    }
//
//    public void writeSomething() {
//        System.out.println("This lesson's name is Oop1");
//    }
//
//    public void learn() {
//        System.out.println("i am learning");
//
//    }
//
//    public void sayHello() {
//        System.out.println("Hello world");
//    }
//
//    public void sayYourName() {
//        System.out.println("My name is Nargiz");
//    }
//
//    public void sayYouSurname() {
//        System.out.println("my surname is Aliyeva");
//    }
//
//    public void sayYourAge() {
//        System.out.println("i am 24");
//    }
//
//    public void whatIsYourLearning() {
//        System.out.println("I am learnin Java");
//    }
//
//    public void whatIsYourHobby() {
//        System.out.println("sfsfdfdc");
//
//    }
//
//    public void whyThisLineIsRed() {
//        System.err.println("Couse this is wrong choice");
//    }
//
//    public void whyThisLineIsNotRed() {
//        System.out.println("Cause this is correct");
//    }
//
//    public void calc(int a) {
//        System.out.println(a);
//    }
//
//    public void calcs(float b) {
//        System.out.println(b);
//    }
//
//    public void multip(float c) {
//        System.out.println(c);
//    }
//
//    public void mod(float d) {
//        System.out.println(d);
//    }
//
//    public void fl(float w) {
//        System.out.println(w);
//    }
//
//    public void dd(float e) {
//        System.out.println(e);
//    }
//
//    public void cals(int point, String name) {
//        System.out.println("welcome" + name + "point: " + point);
//    }
//
//    public void said(int day, String name) {
//        System.out.println("Welcome" + " " + name + " " + " today is:" + " " + day);
//    }
//
//    public void names(String name1, String name2) {
//        System.out.println("welcome" + " " + name1 + " " + "and" + " " + name2);
//    }
//
//    public void inn(int a, int b) {
//        System.out.println(a + b);
//    }
//
//    public void mainCalculator(int a, int b, String c) {
//        if ("*".equals(c)) {
//            System.out.println(a * b);
//
//        } else {
//            System.out.println("not found");
//        }
//
//
//    }
//
//    public void multiply(int a, int b, String c) {
//        if ("*".equals(c)) {
//            System.out.println(a * b);
//        }
//
//    }
//
//
//    public String mathamatics(int a, int b, String c) {
//
//        if ("*".equals(c)) {
//            return "result" + (a * b);
//        } else if ("+".equals(c)) {
//            return "result" + (a + b);
//        } else if ("-".equals(c)) {
//            return "result" + (a - b);
//        } else if ("/".equals(c)) {
//            return "result" + (a / b);
//
//        } else {
//            return ("not found");
//
//        }
//
//    }
//
//    public String character(String a) {
//        for (int i = 0; i < a.length(); i++) {
//            if("a".equals(a.charAt(i))){
//                return String.format("/s ");
//
//            }
//        }
//        return " a yoxdur";

    }


// class yaratmaq
// metod yaratmaq
//

