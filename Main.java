package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner rd = new Scanner(System.in);
        alumno al = new alumno("202010020044");
        al.setNombre("Axel");

        System.out.println(al.getCuenta());
    }
}
