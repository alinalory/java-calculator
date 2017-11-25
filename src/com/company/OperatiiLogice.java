package com.company;

public class OperatiiLogice {
    public double maximNumere(double primulNumar, double doileaNumar) {
        if (primulNumar > doileaNumar)
            return primulNumar;
        else
            return doileaNumar;
    }

    public double minimNumere(double primulNumar, double doileaNumar) {
        if (primulNumar < doileaNumar)
            return primulNumar;
        else
            return doileaNumar;
    }

    public boolean egalitate(double primulNumar, double doileaNumar) {
        if (primulNumar == doileaNumar)
            return true;
        else
            return false;
    }

    public static void listareLista(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public void ordonareCrescator() {
        CitireTastatura citire = new CitireTastatura();
        System.out.println(Mesaje.lista_numere);
        int[] numere = new int[citire.citireNumar()];
        System.out.println(Mesaje.marime_lista + numere.length + Mesaje.numere);
        for (int i = 0; i < numere.length; i++) {
            numere[i] = citire.citireNumar();
        }
        System.out.println(Mesaje.rezultat_ordonare_crescator);
        listareLista((sortArrayAsc(numere)));
        System.out.println("\n");
    }
    public void ordonareDescrescator() {
        CitireTastatura citire = new CitireTastatura();
        System.out.println(Mesaje.lista_numere);
        int[] numere = new int[citire.citireNumar()];
        System.out.println(Mesaje.marime_lista + numere.length + Mesaje.numere);
        for (int i = 0; i < numere.length; i++) {
            numere[i] = citire.citireNumar();
        }
        System.out.println(Mesaje.rezultat_ordonare_descrescator);


        listareLista((sortArrayDsc(numere)));
        System.out.println("\n");
    }

    private int[] sortArrayAsc(int[] numere){

        int casuta;
        for (int k = 0; k < numere.length; k++) {
            for (int i = 0; i < numere.length; i++) {
                if (i < numere.length - 1 &&
                        numere[i] > numere[i + 1]) {
                    casuta = numere[i + 1];
                    numere[i + 1] = numere[i];
                    numere[i] = casuta;

                }

            }
        }
        return numere;
    }

    private int[] sortArrayDsc(int[] numere){

        int casuta;
        for (int k = 0; k < numere.length; k++) {
            for (int i = 0; i < numere.length; i++) {
                if (i < numere.length - 1 &&
                        numere[i] < numere[i + 1]) {
                    casuta = numere[i + 1];
                    numere[i + 1] = numere[i];
                    numere[i] = casuta;
                }
            }
        }

        return numere;
    }
}

