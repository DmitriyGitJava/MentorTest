public class Ouput {
    public static void sumNumberRimKir(int van, int to) {
        switch (Sort.operator) {
            case '+':
               Sort.numberRimKir = van + to;
                break;
            case '-':
                Sort.numberRimKir = van - to;
                break;
            case '*':
                Sort.numberRimKir = van * to;
                break;
            case '/':
                Sort.numberRimKir = van / to;
                break;
        }
    }
}
