import java.util.Locale;

public class CalculatorMain {
    public static void main(String[] args) {
        System.out.println("Калькулятор");
        String textScan = Window.Win();
        Sort.sortNumber(textScan.toUpperCase());
    }
}

