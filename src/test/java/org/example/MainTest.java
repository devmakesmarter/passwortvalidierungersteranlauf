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

}