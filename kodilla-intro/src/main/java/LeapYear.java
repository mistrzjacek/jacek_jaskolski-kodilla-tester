import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int rok;
        //wyswietlic tekst: podaj rok aby sprawdzic czy to rok przestepny
        //wprowadz rok z konsoli
        //sprawdz czy rok jest przestepny
        System.out.println("Podaj rok aby sprawdzić czy jest przestępny:");
        Scanner sc = new Scanner(System.in);
        String year = sc.nextLine();
        rok = Integer.parseInt(year);
        System.out.println(year);
        boolean isLeap = checkIfYearIsLeap(rok);

        if (isLeap) {
            System.out.println("Podany rok jest przestępny");
        }
        else{
            System.out.println("Podany rok nie jest przestępny");
        }
    }

    private static boolean checkIfYearIsLeap(int year) {
        if (year%4 ==0 || year%100 ==0 || year%400 ==0){
            return true;

        }
        else{return false;}




    }
}