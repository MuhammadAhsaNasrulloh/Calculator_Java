/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kalkulator;

import java.util.Scanner;

/**
 *
 * @author mhaki
 */
public class Kalkulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan angka pertama");
        double angka1 = scanner.nextDouble();

        System.out.println("Masukkan angka kedua");
        double angka2 = scanner.nextDouble();

        System.out.println("Pilih operasi (+, -, /, *)");
        char operator1 = scanner.next().charAt(0);

        System.out.println("Ingin menambah angka? (y/N)");
        char option = scanner.next().charAt(0);

        double hasil = 0;

        // Meminta input angka ketiga
        System.out.println("Masukkan angka ketiga");
        double angka3 = scanner.nextDouble();

        // Memilih operasi kedua
        System.out.println("Pilih operasi kedua (+, -, /, *)");
        char operator2 = scanner.next().charAt(0);

        switch (operator1) {
            case '+':
                if (option == 'y') {
                    switch (operator2) {
                        case '+':
                            hasil = angka1 + angka2 + angka3;
                            break;
                        case '-':
                            hasil = angka1 + angka2 - angka3;
                            break;
                        case '/':
                            if (angka3 != 0) {
                                hasil = angka1 + angka2 / angka3;
                            } else {
                                System.out.println("Error!");
                            }
                            break;
                        case '*':
                            hasil = angka1 + angka2 * angka3;
                            break;
                        default:
                            System.out.println("Operasi kedua tidak valid");
                    }
                } else if (option == 'N') {
                    hasil = angka1 + angka2;
                }
                break;
            case '-':
                if (option == 'y') {
                    switch (operator2) {
                        case '+':
                            hasil = angka1 - angka2 + angka3;
                            break;
                        case '-':
                            hasil = angka1 - angka2 - angka3;
                            break;
                        case '/':
                            if (angka3 != 0) {
                                hasil = angka1 - angka2 / angka3;
                            } else {
                                System.out.println("Error!");
                            }
                            break;
                        case '*':
                            hasil = angka1 - angka2 * angka3;
                            break;
                        default:
                            System.out.println("Operasi kedua tidak valid!");
                    }
                } else if (option == 'N') {
                    hasil = angka1 - angka2;
                }
                break;
            case '/':
                if (option == 'y') {
                    switch (operator2) {
                        case '+':
                            hasil = angka1 / angka2 + angka3;
                            break;
                        case '-':
                            hasil = angka1 / angka2 - angka3;
                            break;
                        case '/':
                            if (angka3 != 0) {
                                hasil = angka1 / angka2 / angka3;
                            } else {
                                System.out.println("Error!");
                            }
                            break;
                        case '*':
                            hasil = angka1 / angka2 * angka3;
                            break;
                        default:
                            System.out.println("Operasi kedua tidak valid!");
                    }
                } else if (option == 'N') {
                    hasil = angka1 / angka2;
                }
                break;
            case '*':
                if (option == 'y') {
                     switch(operator2){
                         case '+':
                             hasil = angka1 * angka2 + angka3;
                             break;
                         case '-' :
                             hasil = angka1 * angka2 - angka3;
                             break;
                         case '/':
                             if(angka3 != 0){
                                 hasil = angka1 * angka2 / angka3;
                             }else{
                                 System.out.println("Error!");
                             }
                             break;
                         case '*':
                             hasil = angka1 * angka2 * angka3;
                     }
                } else if (option == 'N') {
                    hasil = angka1 * angka2;
                }
                break;
            default:
               System.out.println("Operasi pertama tidak valid!");  
        }
        System.out.println("Hasil\t" + hasil);
    }

}
