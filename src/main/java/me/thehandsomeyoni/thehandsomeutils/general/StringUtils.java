package me.thehandsomeyoni.thehandsomeutils.general;

public class StringUtils {
    private String string;

    public StringUtils(String string) {
        this.string = string;
    }

    public String removeFirst(String toRemove) {
        if (string.startsWith(toRemove)) {
            return string.substring(toRemove.length());
        }
        return string;
    }

    public String removeLast(String toRemove) {
        if (string.endsWith(toRemove)) {
            return string.substring(0, string.length() - toRemove.length());
        }
        return string;
    }

    public String removeFirstAndLast(String toRemove) {
        string = removeFirst(toRemove);
        string = removeLast(toRemove);
        return string ;
    }


    public String capitalizeFirstLetter() {
        return string.substring(0, 1).toUpperCase() + string.substring(1);
    }

    public String replaceAt(int index, String text) {
        return string.substring(0, index) + text + string.substring(index + 1);
    }

    public String replace(String toReplace, String replacement) {
        return string.replace(toReplace, replacement);
    }

    //returns a list of strings that separates numbers and letters
    public String[] splitByNumbersAndLetters() {
        String[] split = string.split("(?<=[0-9])(?=[a-zA-Z])|(?<=[a-zA-Z])(?=[0-9])");
        return split;
    }

    //returns a string without special characters or numbers
    public String removeSpecialCharactersAndNumbers() {
        String[] split = string.split("[0-9!@#$%^&*()_+-=\\[\\]{};:'\"<>/?.,]");
        StringBuilder sb = new StringBuilder();
        for (String s : split) {
            sb.append(s);
        }
        return sb.toString();
    }

    //returns a string with only the numbers of the original string
    public String removeLettersAndCharacters() {
        String[] split = string.split("[a-zA-Z!@#$%^&*()_+-=\\[\\]{};:'\"\\\\|,.<>/?]");
        StringBuilder sb = new StringBuilder();
        for (String s : split) {
            sb.append(s);
        }
        return sb.toString();
    }

    //returns a string with only the special characters of the original string
    public String removeNumbersAndLetters() {
        String[] split = string.split("[0-9A-Za-z]");
        StringBuilder sb = new StringBuilder();
        for (String s : split) {
            sb.append(s);
        }
        return sb.toString();
    }


    public String getString() {
        return string;
    }
}
