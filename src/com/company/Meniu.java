package com.company;

public class Meniu {
    CitireTastatura citire = new CitireTastatura();
    Calculator calc = new Calculator();
    OperatiiLogice op = new OperatiiLogice();


    public void afiseazaMeniu(){
        System.out.println(Constante.MENIU_OPTIUNI);
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
                case 5:
                    modulo();
                    break;
                case 6:
                    maxim();
                    break;
                case 7:
                    minim();
                    break;
                case 8:
                    egalitate();
                    break;
                case 9:
                    sortareAsc();
                    break;
                case 10:
                    sortareDsc();
                    break;
                default:
                    optiuneCorecta = false;
            }

            if (optiuneCorecta) {
                afiseazaMeniuNouaOperatie();
                int optiune = citire.citireNumar();
                if (0 == optiune) {
                    otherOperation = false;
                    System.out.println(Mesaje.logout);
                }

            } else {
                System.out.println(Mesaje.invalid_selection);
            }

        } while (otherOperation);

    }

    public  void afiseazaMeniuNouaOperatie(){
        System.out.println(Constante.MENIU_IESIRE);
    }

    public void adunare(){
        System.out.print(Mesaje.primul_numar);
        double primulNumar = citire.citireNumar();
        System.out.print(Mesaje.doilea_numar);
        double doileaNumar = citire.citireNumar();
        System.out.println(Mesaje.rezultat + calc.adunare(primulNumar,doileaNumar));
    }

    public void scadere(){
        System.out.print(Mesaje.primul_numar);
        double primulNumar = citire.citireNumar();
        System.out.print(Mesaje.doilea_numar);
        double doileaNumar = citire.citireNumar();
        System.out.println(Mesaje.rezultat + calc.scadere(primulNumar,doileaNumar));
    }

    public void inmultire(){
        System.out.print(Mesaje.primul_numar);
        double primulNumar = citire.citireNumar();
        System.out.print(Mesaje.doilea_numar);
        double doileaNumar = citire.citireNumar();
        System.out.println(Mesaje.rezultat + calc.inmultire(primulNumar,doileaNumar));
    }

    public void impartire(){
        System.out.print(Mesaje.primul_numar);
        double primulNumar = citire.citireNumar();
        System.out.print(Mesaje.doilea_numar);
        double doileaNumar = citire.citireNumar();
        System.out.println(Mesaje.rezultat + calc.impartire(primulNumar,doileaNumar));
    }

    public void modulo(){
        System.out.print(Mesaje.primul_numar);
        double primulNumar = citire.citireNumar();
        System.out.print(Mesaje.doilea_numar);
        double doileaNumar = citire.citireNumar();
        System.out.println(Mesaje.rezultat + calc.modulo(primulNumar,doileaNumar));

    }

    public void maxim(){
        System.out.print(Mesaje.primul_numar);
        double primulNumar = citire.citireNumar();
        System.out.print(Mesaje.doilea_numar);
        double doileaNumar = citire.citireNumar();
        System.out.println(Mesaje.rezultat_max + op.maximNumere(primulNumar,doileaNumar));
    }

    public void minim(){
        System.out.print(Mesaje.primul_numar);
        double primulNumar = citire.citireNumar();
        System.out.print(Mesaje.doilea_numar);
        double doileaNumar = citire.citireNumar();
        System.out.println(Mesaje.rezultat_min + op.minimNumere(primulNumar,doileaNumar));
    }

    public void egalitate(){
        System.out.print(Mesaje.primul_numar);
        double primulNumar = citire.citireNumar();
        System.out.print(Mesaje.doilea_numar);
        double doileaNumar = citire.citireNumar();
        System.out.println(Mesaje.rezultat_op);
        if (op.egalitate(primulNumar,doileaNumar))
            System.out.println(Mesaje.rezultat_egal_pozitiv);
        else
            System.out.println(Mesaje.rezultat_egal_negativ);
    }

    public void sortareAsc(){
        op.ordonareCrescator();

    }
    public void sortareDsc(){
        op.ordonareDescrescator();

    }

}
