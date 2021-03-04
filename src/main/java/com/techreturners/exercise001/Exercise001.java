package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        // Add your code here
        return (Character.toUpperCase(word.charAt(0)) + word.substring(1)); 

    }

    public String generateInitials(String firstName, String lastName) {
        // Add your code here
        String out = Character.toUpperCase(firstName.charAt(0)) + "." + lastName.substring(0, 1).toUpperCase();
        return out; 
    }

    public double addVat(double originalPrice, double vatRate) {
        // Add your code here
        double percent = vatRate/100;
        double vat = percent*originalPrice;
        double total = originalPrice + vat;

        //total = roundToTwo(originalPrice + vat); Doesn't work in java so instead....
        total = Math.round(total * 100);
        return (total / 100);

    }

    public String reverse(String sentence) {
        // Add your code here
        
        // This reverses the order of the WORDS in a sentence, not letters, Try again!
        // String s[] = sentence.split(" "); 
        // String ans = ""; 
        // for (int i = s.length - 1; i >= 0; i--) 
        // { 
        //     ans += s[i] + " "; 
        // } 
        // return ans; 
    
        byte[] byte_array = sentence.getBytes();
        byte[] result = new byte[byte_array.length];

        for (int i = 0; i < byte_array.length; i++)
        {
            result[i] = byte_array[byte_array.length - i - 1];
        };

        return new String(result);
    
    }

    public int countLinuxUsers(List<User> users) {
        // Add your code here
        // Lesson on "classes" - pay attention to them!
        
        int count = 0; 

        for (int i = 0; i < users.size(); i++)
        {
            if (users.get(i).getType() == "Linux")
            {
                count +=1;
            };
        };
        
        return count;

        

    }
}
