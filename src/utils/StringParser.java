package utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import models.Calculatrice;

public class StringParser {
public static boolean checkInputUser(String input) {
String inputUserRegex = "^[1-3]";

if (input.matches(inputUserRegex)) {
    return true;
} else {
    throw new IllegalArgumentException("Error: Illegal character, choose between 1, 2 or 3");
}
}

public static boolean checkOperator(String operator) {
String operatorRegex = "^[+,-,*,/]";
if (operator.matches(operatorRegex)) {
    return true;
} else {
    throw new IllegalArgumentException("Incorrect value: choose between +, -, * or /");
}
}
}