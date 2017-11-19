package com.company;

public class Meniu {
    CitireTastatura citire = new CitireTastatura();
    Calculator calc = new Calculator();


    public void afiseazaMeniu(){
        System.out.println("Selecteaza o optiune: \n" +
            "1. Adunare\n" +
            "2. Scadere\n" +
            "3. Inmultire\n" +
            "4. Impartire\n");
    }

    public void runProgram(){
        boolean otherOperation = true;

        do {
            afiseazaMeniu();
            int numarUtilizator = citire.citireNumar();
            boolean optiuneCorecta = true;

            switch (numarUtilizator) {
                case 1:
                    adunare();
                    break;
                case 2:
                    scadere();
                    break;
                case 3:
                    inmultire();
                    break;
                case 4:
                    impartire();
                    break;
                default:
                    optiuneCorecta = false;
            }

            if (optiuneCorecta) {
                afiseazaMeniuNouaOperatie();
                int optiune = citire.citireNumar();
                if (2 == optiune) {
                    otherOperation = false;
                    System.out.println(Constante.LOGOUT);
                }

            } else {
                System.out.println(Constante.INVALIDSELECTION);
            }

        } while (otherOperation);

    }
    public  void afiseazaMeniuNouaOperatie(){
        System.out.println("Selecteaza o noua optiune! \n " +
                "1. Alta operatie matematica \n " +
                "2. Iesire din program! "
        );

    }
    public void adunare(){
        System.out.println("Introdu primul numar");
        double primulNumar = citire.citireNumar();
        System.out.println("Introdu al doilea numar:");
        double doileaNumar = citire.citireNumar();
        System.out.println("Rezultatul adunarii este : " + calc.adunare(primulNumar,doileaNumar));
    }
    public void scadere(){
        System.out.println("Introdu primul numar");
        double primulNumar = citire.citireNumar();
        System.out.println("Introdu al doilea numar:");
        double doileaNumar = citire.citireNumar();
        System.out.println("Rezultatul scaderii este : " + calc.scadere(primulNumar,doileaNumar));
    }
    public void inmultire(){
        System.out.println("Introdu primul numar");
        double primulNumar = citire.citireNumar();
        System.out.println("Introdu al doilea numar:");
        double doileaNumar = citire.citireNumar();
        System.out.println("Rezultatul inmultirii este : " + calc.inmultire(primulNumar,doileaNumar));
    }
    public void impartire(){
        System.out.println("Introdu primul numar");
        double primulNumar = citire.citireNumar();
        System.out.println("Introdu al doilea numar:");
        double doileaNumar = citire.citireNumar();
        System.out.println("Rezultatul impartirii este : " + calc.impartire(primulNumar,doileaNumar));
    }
}
