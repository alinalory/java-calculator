package com.company;

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
            System.out.print(Mesaje.user);
            String username = citire.citireText();
            System.out.print(Mesaje.parola);
            String password = citire.citireText();
            if (password.equals(hashMap.get(username))) {
                System.out.println(username + Mesaje.welcome);
                loggedIn = true;
            } else {
                System.out.println(Mesaje.eroare_login);
                System.out.println("Mai ai " + (3 - counter) + " incercari ramase!");
                counter++;
            }
        }while (!loggedIn && counter < 4);
        return loggedIn;

    }

}
