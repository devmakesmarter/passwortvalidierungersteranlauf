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
            String password = "EinszweiDrei";
            //When
            boolean actual = Main.checkForUpperCase(password);
            //Then
            assertTrue(actual);
        }

        @Test
        void checkForBigLettersFalse(){
            //Given
            String password = "keinegroßenbuchstabenimpasswort";
            //When
            boolean actual = Main.checkForUpperCase(password);
            //Then
            assertFalse(actual);
    }


        @Test
        void checkForLowerCase(){
            //Given
            String password ="Galloweltklinespasswort675";

            //When
            boolean actual = Main.checkForLowerCase(password);

            //Then

            assertTrue(actual);


        }
        @Test
        void checkForLowerCaseFalse() {
            //Given
            String password = "ALL879";

            //When
            boolean actual = Main.checkForLowerCase(password);

            //Then

            assertFalse(actual);
        }

        @Test
        void checkBlacklist(){
            //Given
            String password = "hallo789";

            //When

            boolean actual = Main.checkBlacklist(password);

            // Then

            assertTrue(actual);

        }

        @Test
        void checkBlacklistFalse(){
            //Given
            String password = "hallo";

            //When

            boolean actual = Main.checkBlacklist(password);

            //Then

            assertFalse(actual);



        }


}