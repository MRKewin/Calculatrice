import models.Calculatrice;
import utils.StringParser;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
public static void main(String[] args) throws Exception {
Calculatrice calculette = new Calculatrice();
BufferedReader scanf = new BufferedReader(new InputStreamReader(System.in));
double a, b;
String op;
String chose;

do {
    try {
        System.out.print("a = ");
        a = Double.parseDouble(scanf.readLine());

        System.out.print("Choose between [+,-,*,/]: ");
        op = scanf.readLine();
        StringParser.checkOperator(op);

        System.out.print("b = ");
        b = Double.parseDouble(scanf.readLine());

        calculette.addCalculToHistoryList(a, b, op);
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
        continue;
    }

    try {
        System.out.print("Choose between 1 (Calcul), 2 (Display History), 3 (Quit): ");
        chose = scanf.readLine();
        StringParser.checkInputUser(chose);
    } catch (Exception e) {
        System.out.println(e.getMessage());
        continue;
    }

    if (chose.equals("1")) {
        continue;
    }
    if (chose.equals("2")) {
        calculette.displayCalculHistory();
    }
    if (chose.equals("3")) {
        break;
    }
} while (true);
}

}