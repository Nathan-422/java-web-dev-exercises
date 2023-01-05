package org.launchcode.java.demos.lsn1datatypes;

public class Message {

    public static String getMessage(String lang) {

        switch (lang) {
            case "sp":
                return "¡Hola, Mundo!";
            case "fr":
                return "Bonjour, le monde!";
            case "fi":
                return "Hei maailma!";
            default:
                return "Hello world!";
        }

    }
}
