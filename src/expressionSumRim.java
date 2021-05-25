import java.sql.SQLOutput;

public class expressionSumRim {
    public static void sumNumberRim(){
        int cauntRim = 0;
        try {
            numberRim vanNumberArab = numberRim.valueOf(Sort.vanNumber);
            numberRim toNumberArab  = numberRim.valueOf(Sort.toNumber);

            int vanInt = vanNumberArab.getKiriliza();
            int toInt = toNumberArab.getKiriliza();

            if(vanInt > 10 || toInt > 10) {
                System.out.println("Не коректный воод данных!");
                System.exit(0);
            }

            try {
                Ouput.sumNumberRimKir(vanInt,toInt);
            } catch (ArithmeticException exception) {
                System.out.println("Ошибка! Деление на ноль.");
            }



            if(Sort.numberRimKir == 0) {
                System.out.println(0);
                System.exit(0);
            }

            for(int i = 0; i < ArrayNumberRim.array.length; i++) {
                if(i == Sort.numberRimKir){
                    cauntRim = i - 1;
                    break;
                }
            }

            System.out.println(ArrayNumberRim.array[cauntRim]);
        } catch (IllegalArgumentException exception) {
            System.out.println("Не коректный воод данных!");
            System.exit(0);
        }



    }
}
