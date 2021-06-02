package day14_multi_branch_if_statements;

import javax.sound.midi.Soundbank;

public class ChooseLanguage {
    public static void main(String[] args) {
        System.out.println("******Hello Thank you for your call******"+"\n\n"+"Please select your language");
        int section = 3;

        if (section == 1) {
            System.out.println("hello, thank for your call");
        } else if (section == 2) {
            System.out.println("Hola, gracias para llamar");
        } else if (section == 3) {
            System.out.println("merhaba aradığınız için teşekkür ederim");
        } else if (section == 4) {
            System.out.println("merhaba aradığınız için teşekkür ederim");
        } else if (section == 5) {
            System.out.println("Meeci, pour votre appel");
        }
        System.out.println();
        System.out.println("*******then, Let talk java******");
    }
}

/*
what if we have 2 TRUE conditions? Will it execute first one top to bottom and exit? Ignoring second true condition?
yes, Cuz it already found the true one
 */