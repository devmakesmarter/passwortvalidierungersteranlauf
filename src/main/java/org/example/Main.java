package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static String password = "Testpasswort";
    static int minPasswordLength = 8;


    public static void main(String[] args) {
        System.out.println("dasPasswortWirdValidiert");
        passwordLengthValidation(password);


        }


     public static Boolean passwordLengthValidation(String password){
        if(password.length() > minPasswordLength){
            return true;
        }else{
            return false;
        }

     }

    }
