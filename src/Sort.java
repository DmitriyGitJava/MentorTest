public class Sort {

    public static char operator = 0;
    public static int indexOperatora = 0;
    public static String vanNumber;
    public static String toNumber;
    public static int numberRimKir;


    public static void sortNumber(String number) {
        //Находим  индек оператора и сам оператор.
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '+' || number.charAt(i) == '-' || number.charAt(i) == '*' || number.charAt(i) == '/') {
                operator = number.charAt(i);
                indexOperatora = i;
            }
        }
        //Если оператор был не найден выдаем ошибку.
        if (indexOperatora == 0) {
            System.out.println("Некорректный ввод данных! ОШИБКА!");
            System.exit(0);
        }

         //Разделяем два числа друг от оператора
         vanNumber = number.substring(0, indexOperatora).trim();
         toNumber = number.substring(indexOperatora + 1, number.length()).trim();

        String[] numberMas = new String[]{vanNumber, toNumber};

        for (int i = 0; i < numberMas.length; i++) {
            String local = numberMas[i];
            if (local.matches("[a-z]") || local.matches("[а-я]")) {
                System.out.println("Некорректный ввод данных! ОШИБКА!");
                System.exit(0);
            }
        }
        //переменные для определения числа кириллица или римские
        int cauntKirilica = 0;
        int cauntRimskie = 0;

        //цикл подсчитывает сколько каких цифр
        for (int i = 0; i < numberMas.length; i++) {
            String local = numberMas[i];
            if (local.matches("[1-9]") || local.matches("10")) {
                cauntKirilica++;
            } else {
                cauntRimskie++;
            }
        }
        //Если переменая cauntKirilica равна двум то идет подсчет кирилицы
        if(cauntKirilica == 2) {

            int vanIntNumber = Integer.parseInt(vanNumber);
            int toIntNumber = Integer.parseInt(toNumber);

            try {
                Ouput.sumNumberRimKir(vanIntNumber,toIntNumber);
            } catch (ArithmeticException exception) {
                System.out.println("Ошибка! Деление на ноль.");
            }

            System.out.println(numberRimKir);
        }
        //Если cauntRimskie равна 2 то идет подсчет римские числа
        if(cauntRimskie == 2) {
                expressionSumRim.sumNumberRim();
        }

        //Если хоть одна переменная не равно двум, выдаем ошибку устанавливаем программу.
        if(cauntRimskie != 2 && cauntKirilica != 2) {
            System.out.println("Не коректный воод данных!");
            System.exit(0);
        }
        if(cauntKirilica == 0 && cauntRimskie == 0 ){
            System.out.println("Некорректный ввод данных! ОШИБКА!");
            System.exit(0);
        }


    }
}
