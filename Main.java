import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("jaka jest twoja ilosc punktow? ");
        int a = sc.nextInt();
        if (a <= 50){
            System.out.println("Musisz się jeszcze dużo nauczyć");
        }
        else if (a > 50 && a <=  70){
            System.out.println("Średni wynik, ale jesteś na dobrej drodze");
        }
        else if (a > 70){
            System.out.println("Świetnie! Dobrze Ci poszło.");
        }
        sc.close();
    }
}
// else if (bmi >= 18.5 && bmi < 24.9)
// okokkok