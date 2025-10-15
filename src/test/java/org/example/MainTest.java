package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MainTest {

        @Test
        void passwordLengthValidationTest(){
        //Given
            String password ="HalloPasswort";
            boolean expected = true;
        //When
            boolean actual = Main.passwordLengthValidation(password);
        //Then
            assertEquals(expected,actual);
            assertTrue(actual);
        }

        @Test
        void passwordLengthValidationsTestFalse(){
            //Given
            String password = "Hallo";
            boolean expected = false;
            //When
            boolean actual = Main.passwordLengthValidation(password);
            //Then
            assertFalse(actual);
        }

        @Test
        void passwordContainsDigitsTest(){
            //Given
            String password = "Ha8l7l546oWelt8";
            boolean expected = true;
            //When
            boolean actual = Main.passwordContainsDigits(password);

            //Then
            assertTrue(actual);
        }

         @Test
         void passwordContainsDigitsTestFalse(){
            //Given
            String password = "HalloWelt";
            boolean expected = false;
            //When
            boolean actual = Main.passwordContainsDigits(password);

            //Then
            assertFalse(actual);
    }

        @Test
        void checkForUpperCase(){
            //Given
            String password = "HalloWelt";
            //When
            boolean actual = Main.checkForUpperCase(password);
            //Then
            assertTrue(actual);
        }


    void checkForBigLettersFalse(){
        //Given
        String password = "hallowelt";
        //When
        boolean actual = Main.checkForUpperCase(password);
        //Then
        assertFalse(actual);
    }





}