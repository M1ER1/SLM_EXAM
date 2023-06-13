package com.example.slm_exam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HammingWeightControllerTest {

    private HammingWeightController controller;

    @Test
    public void calculateHammingWeightTest() {
        // Eingabe erstellen
        String input = "101001";
        // Methode aufrufen
        int result = controller.calculateHammingWeight(input);
        // Ergebnis überprüfen
        assertEquals(3, result);
    }

    @Test
    public void previousStringTest() {

        String input = "101001";

        controller.calculateHammingWeight(input);

        String result = controller.previousString();

        assertEquals(input, result);
    }
}

