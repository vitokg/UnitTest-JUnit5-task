package org.example.app.data;

import java.util.Scanner;

public class DataProvider {

    public int getTemperature() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        return scanner.nextInt();
    }
}
