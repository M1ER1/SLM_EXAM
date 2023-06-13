package com.example.slm_exam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HammingWeightController {

    @RequestMapping("/api/hamming")
    public int calculateHammingWeight(@RequestParam String number) {
        String letzteEingabe = number; //speichert den String (wird für die nächste User-Story gebraucht)

        int HammingWeight = 0;

        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) != '0') {
                HammingWeight++;
            }
        }

        return HammingWeight;
    }
}

