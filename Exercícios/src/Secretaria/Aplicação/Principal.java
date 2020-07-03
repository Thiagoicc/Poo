package Secretaria.Aplicação;

import java.util.Locale;

public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Menu mn = new Menu();
        mn.digitar();
    }
}