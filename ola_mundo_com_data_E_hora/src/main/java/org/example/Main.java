package org.example;

import java.awt.*;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Date relogio = new Date(); // data, aonde estou gerando o objeto

        Locale defaultLocale = Locale.getDefault();
        String language = defaultLocale.getLanguage();

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int largura = (int) screenSize.getWidth();
        int altura = (int) screenSize.getHeight();

        System.out.print("São exatamente: " + relogio.toString() + " " + language + " " + " e a largura da sua tela é "
        + largura + " " + "e a altura é " + altura);
    }
}