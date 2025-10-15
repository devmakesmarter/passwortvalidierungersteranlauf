package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static String password = "test7passwort";
    static int minPasswordLength = 8;
    static int[] digits = {0,1,2,3,4,5,6,7,8,9};



    public static void main(String[] args) {
        System.out.println("dasPasswortWirdValidiert");
        passwordLengthValidation(password);
   //   passwordContainsDigits(password);
   //   passwordContainsDigits(password);
        boolean test = passwordContainsDigits(password);
        System.out.println(test);
        boolean upper = checkForUpperCase(password);
        System.out.println(upper);



        }


     public static boolean passwordLengthValidation(String password){
        if(password.length() > minPasswordLength){
            return true;
        }else{
            return false;
        }

     }

     public static boolean passwordContainsDigits(String password){
        boolean status = false;

        for(int i=0;i <password.length();i++){
            char a = password.charAt(i);
            if(Character.isDigit(a)){
                System.out.println(a);
                int numberOfCharA = Character.getNumericValue(a);
                for(int x=0; x<digits.length;x++){
                    if(digits[x] == numberOfCharA){
                        System.out.println("innereschleife");
                        status = true;
                    }
                }
            }


                    }

        return status;

     }

     public static boolean checkForUpperCase(String password){
        boolean status = false;
        for(int i = 0; i<password.length();i++){
            char a = password.charAt(i);
            if(Character.isUpperCase(a)){
                status = true;
            }

        }
        return status;
     }



    }
