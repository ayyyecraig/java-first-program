package com.h2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BestLoanRates {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
        System.out.println("Enter the loan term (in years)");
        int loanTermInYears = scanner.nextInt();
        getRates(loanTermInYears);


    }
    public static final Map<Integer, Float> bestRates;

    static {
        bestRates = new HashMap<>();
        bestRates.put(1, 5.50f);
        bestRates.put(2, 3.45f);
        bestRates.put(3, 2.67f);
    }

   public static float getRates(int loanTermInYears) {
      if (loanTermInYears == 1){
          return Float.parseFloat("best rate for '1 year' must be '5.50f'");
    } else if(loanTermInYears == 2){
          return Float.parseFloat("best rate for '2 year' must be '3.45f'");
      }else if(loanTermInYears == 3){
          return Float.parseFloat("best rate for '3 year' must be '2.67f'");
      }else {
          return Float.parseFloat("best rate for '100 year' must be '0.0ff'");
      }

      

}


}

