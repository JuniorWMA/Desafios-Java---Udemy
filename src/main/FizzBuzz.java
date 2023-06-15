package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//FizzBuzz

public class FizzBuzz {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma valor e veremos a palavra Fizz para os divisíveis por 3, Buzz para os divisíveis por 5 e FizzBuzz para os dois");
        int numero = sc.nextInt();

        List<String> lista = new ArrayList<>();

        for (int i = 0; i <= numero; i++) {
            if (i %3 == 0 && i%5 == 0) {
                lista.add("FizzBuzz");
            } else if(i %3 == 0) {
                lista.add("Fizz");
            } else if(i%5==0){
                lista.add("Buzz");
            } else if (i %3 != 0 && i%5 != 0){
                lista.add(Integer.toString(i));
            }
        }

        System.out.println(lista);

        sc.close();
    }

    
    
}