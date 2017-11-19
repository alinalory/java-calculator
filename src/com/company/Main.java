package com.company;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {
	Login login = new Login();
	Meniu meniu = new Meniu();

	if (login.login()){
	    meniu.runProgram();
    }
    }
}
