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
                    maxim();
                    break;
                case 6:
                    minim();
                    break;
                case 7:
                    egalitate();
                    break;
                case 8:
                    sortareAsc();
                    break;
                case 9:
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
                    System.out.println(Constante.LOGOUT);
                }

            } else {
                System.out.println(Constante.INVALIDSELECTION);
            }

        } while (otherOperation);

    }
    public  void afiseazaMeniuNouaOperatie(){
        System.out.println(Constante.MENIU_IESIRE);

    }
    public void adunare(){
        System.out.println(Constante.PRIMUL_NUMAR);
        double primulNumar = citire.citireNumar();
        System.out.println(Constante.DOILEA_NUMAR);
        double doileaNumar = citire.citireNumar();
        System.out.println(Constante.REZULTAT + calc.adunare(primulNumar,doileaNumar));
    }
    public void scadere(){
        System.out.println(Constante.PRIMUL_NUMAR);
        double primulNumar = citire.citireNumar();
        System.out.println(Constante.DOILEA_NUMAR);
        double doileaNumar = citire.citireNumar();
        System.out.println(Constante.REZULTAT + calc.scadere(primulNumar,doileaNumar));
    }
    public void inmultire(){
        System.out.println(Constante.PRIMUL_NUMAR);
        double primulNumar = citire.citireNumar();
        System.out.println(Constante.DOILEA_NUMAR);
        double doileaNumar = citire.citireNumar();
        System.out.println(Constante.REZULTAT + calc.inmultire(primulNumar,doileaNumar));
    }
    public void impartire(){
        System.out.println(Constante.PRIMUL_NUMAR);
        double primulNumar = citire.citireNumar();
        System.out.println(Constante.DOILEA_NUMAR);
        double doileaNumar = citire.citireNumar();
        System.out.println(Constante.REZULTAT + calc.impartire(primulNumar,doileaNumar));
    }
    public void maxim(){
        System.out.println(Constante.PRIMUL_NUMAR);
        double primulNumar = citire.citireNumar();
        System.out.println(Constante.DOILEA_NUMAR);
        double doileaNumar = citire.citireNumar();
        System.out.println(Constante.REZULTAT_MAX + op.maximNumere(primulNumar,doileaNumar));
    }
    public void minim(){
        System.out.println(Constante.PRIMUL_NUMAR);
        double primulNumar = citire.citireNumar();
        System.out.println(Constante.DOILEA_NUMAR);
        double doileaNumar = citire.citireNumar();
        System.out.println(Constante.REZULTAT_MIN + op.minimNumere(primulNumar,doileaNumar));
    }
    public void egalitate(){
        System.out.println(Constante.PRIMUL_NUMAR);
        double primulNumar = citire.citireNumar();
        System.out.println(Constante.DOILEA_NUMAR);
        double doileaNumar = citire.citireNumar();
        System.out.println(Constante.REZULTAT_OP);
        if (op.egalitate(primulNumar,doileaNumar))
            System.out.println(Constante.REZULTAT_EGAL_POZITIV);
        else
            System.out.println(Constante.REZULTAT_EGAL_NEGATIV);
    }

    public void sortareAsc(){
        op.ordonareCrescator();

    }
    public void sortareDsc(){
        op.ordonareDescrescator();

    }

}
