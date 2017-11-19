package com.company;

import org.omg.CORBA.CODESET_INCOMPATIBLE;

import java.util.HashMap;

public class Login {
    public boolean login(){
        CitireTastatura citire = new CitireTastatura();
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("Alina","456");
        hashMap.put("Ioana","111");
        hashMap.put("Cosmin","123");
        hashMap.put("Alex","000");
        boolean loggedIn = false;
        int counter = 1;
        do {
            System.out.print(Constante.USER);
            String username = citire.citireText();
            System.out.print(Constante.PAROLA);
            String password = citire.citireText();
            if (password.equals(hashMap.get(username))) {
                System.out.println(username + Constante.WELCOME);
                loggedIn = true;
            } else {
                System.out.println(Constante.EROARE_LOGIN);
                System.out.println("Mai ai " + (3 - counter) + " incercari ramase!");
                counter++;
            }
        }while (!loggedIn && counter < 4);
        return loggedIn;

    }

}
