package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {

        return (Character.toUpperCase(word.charAt(0)) + word.substring(1));

    }

    public String generateInitials(String firstName, String lastName) {

        String out = Character.toUpperCase(firstName.charAt(0)) + "." + lastName.substring(0, 1).toUpperCase();
        return out;
    }

    public double addVat(double originalPrice, double vatRate) {

        double percent = vatRate / 100;
        double vat = percent * originalPrice;
        double total = originalPrice + vat;

        // total = roundToTwo(originalPrice + vat); Doesn't work in java so instead....
        total = Math.round(total * 100);
        return (total / 100);

    }

    public String reverse(String sentence) {


        byte[] byte_array = sentence.getBytes();
        byte[] result = new byte[byte_array.length];

        for (int i = 0; i < byte_array.length; i++) {
            result[i] = byte_array[byte_array.length - i - 1];
        }
        ;

        return new String(result);

    }

    public int countLinuxUsers(List<User> users) {

        int count = 0;

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getType().equals("Linux")) {
                count += 1;
            }
            ;
        }
        ;

        return count;

    }
}
