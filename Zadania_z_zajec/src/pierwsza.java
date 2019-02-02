import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

//----LISTA ZADAN----
/*

1.  Oblicz pole powierzchni koła. Dane wprowadź od użytkownika z klawiatury.
2.  Napisz program, który sprawdza ile użytkownik ma lat, jeśli:
    mniej niż 18 - wyś	wietla się komunikat “nie możesz głosować”
    co najmniej 18, mniej niż 35 “możesz głosować, ale nie możesz zostać wybranym na prezydenta”
    co najmniej 35 “możesz kandydować na prezydenta miasta”
3.  Napisz program, który wczyta trzy liczby, następnie wyświetli je w kolejności od najmniejszej do największej
4.  Napisz program, który sprawdzi czy z podanych trzech liczb oznaczających długości boków można utworzyć trójkąt.
5.  Napisz program, który sprawdzi czy z podanych trzech liczb oznaczających długości boków można utworzyć trójkąt prostokątny.
6.  Wyświetl liczby od 10 do 1
7.  Wyświetl liczby od 1 do 100 podzielne bez reszty:
        przez 3
        przez 5
        przez 3 i 5 jednocześnie
8. Wyświetl liczby w pętli z przedziału podanego przez użytkownika
9. Wyświetl tabliczkę mnożenia (w wierszach i kolumnach)
10. Napisz program obliczający pierwiastki równania kwadratowego ax2+bx+c = 0
11. Wylosuj liczbę z podanego zakresu i wyświetl ją (zakres min i max wpisuje użytkownik).
12. Napisz program, który losuje liczbę. Użytkownik ma za zadanie odgadnąć liczbę wylosowaną przez komputer z określonego zakresu.  Program ma podpowiadać “za dużo”, “za mało” lub “odgadłeś za “+liczba_prób+”razem”.
13. Napisz program, który pobiera od użytkownika 6 liczb z 49. Program ma wziąć pod  uwagę zestaw unikalnych sześciu liczb.  Następnie program dokonuje losowań do czasu gdy wylosuje wybrane przez użytkownika zestawienie liczb. Program podaje po ilu latach i ilu dniach użytkownik wylosowałby liczby (np. potrzeba x lat i x dni). Zakładamy że losowania odbywają się codziennie (jedno losowanie na jeden dzień).

 */


public class pierwsza{
    public static void main (String[] args){
        for (;;) {
            System.out.println("Wybierz zadanie, ktorego dzialanie chcesz sprawdzic. Zadania 1 - 13. Wpisz 0 jesli chcesz zakonczyc sprawdzanie");
            Scanner inp = new Scanner(System.in);
            int numerZadania = inp.nextInt();
            if (numerZadania == 0){
                break;
            }
            task(numerZadania);
        }
    }

    private static void task(int numerZadania){
        switch (numerZadania){
            case 1:
                String zadanie = zadanie1();
                break;
            case 2:
                String zadanie2 = zadanie2();
                break;
            case 3:
                String zadanie3 = zadanie3();
                break;
            case 4:
                String zadanie4 = zadanie4();
                break;
            case 5:
                String zadanie5 = zadanie5();
                break;
            case 6:
                String zadanie6 = zadanie6();
                break;
            case 7:
                String zadanie7 = zadanie7();
                break;
            case 8:
                String zadanie8 = zadanie8();
                break;
            case 9:
                String zadanie9 = zadanie9();
                break;
            case 10:
                String zadanie10 = zadanie10();
                break;
            case 11:
                String zadanie11 = zadanie11();
                break;
            case 12:
                String zadanie12 = zadanie12();
                break;
            case 13:
                String zadanie13 = zadanie13();
                break;
            default: break;
        }
    }

    private static String zadanie1() {
        System.out.println("podaj promien");
        Scanner inp = new Scanner(System.in);
        double promien = inp.nextInt();
        double pole = Math.PI * Math.pow(promien, 2);
        String message = "Pole kole to: " + pole + " jednostek do kwadratu ;)";
        System.out.println(message);
        return message;
    }

    private static String zadanie2() {
        String message;
        System.out.println("Ile masz lat?");
        Scanner inp = new Scanner(System.in);
        int wiek = inp.nextInt();
        if (wiek < 18) {
            message = "Nie mozesz glosowac";
        }
        else if (wiek < 35){
            message = "Mozesz glosowac, nie mozesz byc prezydentem";
        }
        else message = "Mozesz wszystko!";

        System.out.println(message);
        return message;
    }

    private static String zadanie3() {
        String message;
        System.out.println("To zadanie wyswietla liczby 12 8 5 od najmniejszej, do najwiekszej");
        int[] tab = new int[]{12,8,5};
        int min, mid, max;
        min=tab[0];
        max=tab[0];
        mid=tab[0];
        for (int i=0; i<tab.length;i++){
            if (min>tab[i]) min = tab[i];
            if (max<tab[i]) max = tab[i];
        }
        for (int i=0; i<tab.length;i++){
            if (tab[i]<max && tab[i]>min) mid=tab[i];
        }
        message = "Kolejnosc liczb to "+min+" "+mid+" "+max;
        System.out.println(message);
        return message;
    }

    private static String zadanie4() {
        String message;
        System.out.println("Sprawdzmy czy stworzymy trojkat. Podaj przykladowa dlugosc boku 1");
        Scanner inp1 = new Scanner(System.in);
        int a = inp1.nextInt();
        System.out.println("Podaj przykladowa dlugosc boku 2");
        Scanner inp2 = new Scanner(System.in);
        int b = inp2.nextInt();
        System.out.println("Podaj przykladowa dlugosc boku 3");
        Scanner inp3 = new Scanner(System.in);
        int c = inp3.nextInt();

        if (a+b>c && b+c>a && a+c>b){
            message = "Tak, te boki stworza trojkat!";
        } else message = "Sorry, dude, z takich bokow nie stworzysz trojkata";

        System.out.println(message);
        return message;
    }

    private static String zadanie5() {
        String message;
        System.out.println("Sprawdzmy czy stworzymy trojkat PROSTOKATNY. Podaj przykladowa dlugosc boku 1");
        Scanner inp1 = new Scanner(System.in);
        int a = inp1.nextInt();
        System.out.println("Podaj przykladowa dlugosc boku 2");
        Scanner inp2 = new Scanner(System.in);
        int b = inp2.nextInt();
        System.out.println("Podaj przykladowa dlugosc boku 3");
        Scanner inp3 = new Scanner(System.in);
        int c = inp3.nextInt();

        if (Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2) || Math.pow(a,2)+Math.pow(c,2)==Math.pow(b,2) || Math.pow(b,2)+Math.pow(c,2)==Math.pow(a,2)){
            message = "Tak, te boki stworza trojkat prostokatny!";
        } else message = "Sorry, dude, z takich bokow nie stworzysz trojkata prostakatnego";

        System.out.println(message);
        return message;
    }

    private static String zadanie6() {
        String message = "Oto one: ";
        System.out.println("Wyswietle dla Ciebie liczby od 10 do 1");
        for (int i = 10; i>0; i--){
            message += i+ ", ";
        }
        System.out.println(message);
        return message;
    }

    private static String zadanie7() {
        System.out.println("Wyswietle dla Ciebie liczby od 1 do 100 podzielne bez reszty");
        String message = "Przez 3: ";
        for (int i = 1; i<=100; i++){
            if (i % 3 == 0) {
                message += i + ", ";
            }
        }
        System.out.println(message);
        message = "Przez 5: ";
        for (int i = 1; i<=100; i++){
            if (i % 5 == 0) {
                message += i + ", ";
            }
        }
        System.out.println(message);
        message = "Przez 3 & 5: ";
        for (int i = 1; i<=100; i++){
            if (i % 3 == 0 && i % 5 == 0) {
                message += i + ", ";
            }
        }
        System.out.println(message);
        return message;
    }

    private static String zadanie8() {
        String message = "";
        System.out.println("Podaj DOLNA liczbe z zakresu przedzialu, ktorego liczby mam wypisac");
        Scanner inp1 = new Scanner(System.in);
        int zakres1 = inp1.nextInt();
        System.out.println("Podaj GORNA liczbe z zakresu przedzialu, ktorego liczby mam wypisac");
        Scanner inp2 = new Scanner(System.in);
        int zakres2 = inp2.nextInt();

        if (zakres1 < zakres2){
            message = "Prosze uprzejmie: ";
            for (int i = zakres1; i <= zakres2; i++){
                message += i + ", ";
            }
        } else if (zakres2 < zakres1){
            System.out.println("Nieladnie tak oszukiwac! Podales liczby w odwrotnej kolejnosci! Ale sobie z tym poradze, spokojna Twoja glowa");
            message = "Prosze uprzejmie: ";
            for (int i = zakres1; i >= zakres2 ; i--){
                message += i + ", ";
            }
        } else message = "Serio, nie rob sobie jaj, ma po prostu wypisac "+zakres1+"?.... Slaaaabeeee";

        System.out.println(message);
        return message;
    }

    private static String zadanie9() {
        String message = "Troche krzywo, wiem...";
        System.out.println("Tabliczka mnozenia 9x9");
        int a = 9;
        for (int i = 1; i<=a; i++){
            for (int j = 1; j<=a; j++){
                System.out.print(i*j +" ");
            }
            System.out.println();
        }

        System.out.println(message);
        return message;
    }

    private static String zadanie10() {
        String message;
        System.out.println("Obliczmy pierwiastki rownania kwadratowego. Podaj wspolczynnik a");
        Scanner inp1 = new Scanner(System.in);
        int a = inp1.nextInt();
        System.out.println("Podaj wspolczynnik b");
        Scanner inp2 = new Scanner(System.in);
        int b = inp2.nextInt();
        System.out.println("Podaj wspolczynnik c");
        Scanner inp3 = new Scanner(System.in);
        int c = inp3.nextInt();

        double delta = Math.pow(b, 2) - (4*a*c);
        String bstring;
        String cstring;
        if (b<0){bstring = b+"x";}
        else if (b==0){bstring = "";}
        else {bstring = "+ "+b+"x";}

        if (c<0){cstring = " "+ c;}
        else if (c==0){cstring = "";}
        else {cstring = "+ "+c;}

        String rownanie = "y="+a+"x^2 "+bstring+cstring;

        if (delta < 0){


            message = "Rownanie "+rownanie+" nie ma pierwiastkow, delta < 0";
        }
        else if (delta == 0){
            double x0 = (-b) / (2*a);
            message = "Rownanie "+rownanie+" ma 1 pierwiastek, jest to "+x0;
        } else {
            double x1 = (-b) / (2*a);
            double x2 = (-b - Math.sqrt(delta))/ (2*a);
            message = "Rownanie "+rownanie+" ma 2 pierwiastki, sa to "+x1+" oraz "+x2;
        }

        System.out.println(message);
        return message;
    }


    private static String zadanie11() {
        String message = "";
        System.out.println("Wylosuje liczbe z podanego przez Ciebie przedzialu. Podaj DOLNA liczbe z zakresu przedzialu");
        Scanner inp1 = new Scanner(System.in);
        int zakres1 = inp1.nextInt();
        System.out.println("Podaj GORNA liczbe z zakresu przedzialu");
        Scanner inp2 = new Scanner(System.in);
        int zakres2 = inp2.nextInt();

        int min, max, zakres;

        if (zakres2 < zakres1){
            System.out.println("Nieladnie tak oszukiwac! Podales liczby w odwrotnej kolejnosci! Ale sobie z tym poradze, spokojna Twoja glowa");
            min = zakres2; max = zakres1;
        } else {min = zakres1; max = zakres2;}

        zakres = max - min;

        int liczbaWylosowana;
        Random los = new Random();

        liczbaWylosowana=los.nextInt(zakres)+min;
        message = "Liczba wylosowana to "+liczbaWylosowana;


        System.out.println(message);
        return message;
    }

    private static String zadanie12() {
        String message;
        System.out.println("Wylosuje liczbe z podanego przez Ciebie przedzialu. Nastepnie bedziesz musial odgadnac, jaka liczbe wylosowalam. Podaj DOLNA liczbe z zakresu przedzialu");
        Scanner inp1 = new Scanner(System.in);
        int zakres1 = inp1.nextInt();
        System.out.println("Podaj GORNA liczbe z zakresu przedzialu");
        Scanner inp2 = new Scanner(System.in);
        int zakres2 = inp2.nextInt();

        int min, max, zakres;

        if (zakres2 < zakres1){
            System.out.println("Nieladnie tak oszukiwac! Podales liczby w odwrotnej kolejnosci! Ale sobie z tym poradze, spokojna Twoja glowa");
            min = zakres2; max = zakres1;
        } else {min = zakres1; max = zakres2;}

        zakres = max - min;

        int liczbaWylosowana;
        Random los = new Random();

        liczbaWylosowana=los.nextInt(zakres)+min;
        System.out.println("Wylosowalam liczbe, zgaduj az zgadniesz");

        for (int i= 1; ;i++){
            Scanner inp = new Scanner(System.in);
            int liczba = inp.nextInt();
            if (liczba < liczbaWylosowana){
                System.out.println("Wylosowana liczba jest wieksza niz podadana przez Ciebie, probuj dalej");
            } else if (liczba > liczbaWylosowana){
                System.out.println("Wylosowana liczba jest mniejsza niz podadana przez Ciebie, probuj dalej");
            } else {
                message = "Brawo, odgadles za "+i+" razem, ze wylosowana liczba to "+liczbaWylosowana;
                break;
            }
        }

        System.out.println(message);
        return message;
    }


    private static String zadanie13() {
        String message = "";
        System.out.println("Zagrajmy w LOTTO.");
        System.out.println("Pobiore od Ciebie 6 unikalnych liczb z zakresu 1-49, po czym oszacuje po jakim czasie taki zestaw liczb moze byc trafiony - przy zalozeniu jednego losowania na dzien.");

        int[] LottoUzytkownika = new int[6];

        for(int i=0; i<6;i++){
            int liczba;
            System.out.println("Podaj liczbe "+(i+1)+" z zakresu 1 - 49");
            Scanner inp = new Scanner(System.in);
            liczba = inp.nextInt();

            //sprawdzam, czy w zakresie

            if (liczba < 1 || liczba > 49){
                do {
                    System.out.println("Powiedzialam \"z zakresu 1 - 49\", prawda? sprobuj jeszcze raz");
                    inp = new Scanner(System.in);
                    liczba = inp.nextInt();}
                while (liczba < 1 || liczba > 49);
            }

            //sprawdzam, czy unikalna

            int unikat = 0;

            for (int j = 0; j<=i; j++) {
                if (liczba == LottoUzytkownika[j]) {
                    unikat += 1;
                }
            }

            while (unikat > 0) {
                System.out.println("Miala byc unikalna, a taka juz wybrales, sprobuj jeszcze raz");
                inp = new Scanner(System.in);
                liczba = inp.nextInt();
                unikat = 0;
                for (int j = 0; j<=i; j++) {
                    if (liczba == LottoUzytkownika[j]) {
                        unikat += 1;
                    }
                }
            }

            //wpisuje liczbe to zakresu
            LottoUzytkownika[i] = liczba;

        }

        Arrays.sort(LottoUzytkownika);

        String message2 = "Wybrane przez Ciebie liczby to: ";
        for (int i = 0; i < LottoUzytkownika.length; i++){
            message2 += LottoUzytkownika[i]+", ";
        }
        System.out.println(message2 + " wiec skoro to juz wiemy, zaczynam losowanie...");


//Petla generujaca randomowe zakresy Lotto (Unikalne, w zakresie 1-49) i naliczajaca ilosc losowan.

        int[] Lotto = new int[6];

        for (int dzien = 1;;dzien++) {

            for (int i = 0; i < 6; i++) {

                int liczbaWylosowana;
                Random los = new Random();
                liczbaWylosowana = los.nextInt(49);

                //sprawdzam, czy unikalna

                int unikat = 0;

                for (int j = 0; j <= i; j++) {
                    if (liczbaWylosowana == Lotto[j]) {
                        unikat += 1;
                    }
                }

                while (unikat > 0) {
                    los = new Random();
                    liczbaWylosowana = los.nextInt(49);
                    unikat = 0;
                    for (int j = 0; j <= i; j++) {
                        if (liczbaWylosowana == Lotto[j]) {
                            unikat += 1;
                        }
                    }
                }

                //wpisuje liczbe to zakresu
                Lotto[i] = liczbaWylosowana;

            }

            Arrays.sort(Lotto);

            int check = 0;
            for (int g = 0;g<6;g++){
                if (Lotto[g]==LottoUzytkownika[g]){
                    check +=1;
                }
            }

            if(check==6){
                int lata = dzien/365;
                int reszta = dzien%365;
                message = "Losowanie, ktore dalo takie same wyniki jak Twoj wybor odbyloby sie po "+lata +" latach i "+reszta+" dniach! Liczby z wylosowanego Lotto to: ";
                for (int h = 0; h < Lotto.length; h++){
                    message += Lotto[h]+", ";
                }
                break;
            }

        }

        System.out.println(message);
        return message;

    }


}



