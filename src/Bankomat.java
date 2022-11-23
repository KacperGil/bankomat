import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {
        int stankonta = 1000;
        while (stankonta >= 0) {
            System.out.println("Ile chcesz wypłacić?");
            Scanner scanner = new Scanner(System.in);
            int wycofanie = scanner.nextInt();
            stankonta = stankonta - wycofanie;
            if (stankonta>0){
                System.out.println("Wypłaciłeś " + wycofanie + " na koncie masz jeszcze: " + stankonta);
            }else if(stankonta<=0){
                System.out.println("Przekroczono limit");
            }
        }
    }
}
