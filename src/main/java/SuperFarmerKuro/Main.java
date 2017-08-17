package SuperFarmerKuro;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static Random dice = new Random();
    static int liczbaKrolikow = 0;
    static int liczbaOwiec = 0;
    static int liczbaSwin = 0;
    static int liczbaKrow = 0;
    static int liczbaKoni = 0;
    static int liczbaMalychPsow = 0;
    static int liczbaDuzychPsow = 0;
    static int wynikZoltej = 0;
    static int wynikCzerwonej = 0;
    static int liczbaRzutow = 0;
    static String zolta;
    static String czerwona;
    static int nagrodaKrolik = 0;
    static int nagrodaOwca = 0;
    static int nagrodaSwinia = 0;
    static int nagrodaKrowa = 0;
    static int nagrodaKon = 0;

    public static void main(String[] args){

        System.out.println("Witaj w tej cudownej grze kolego. Celem gry jest zdobycie conajmniej 1 królika, 1 owcy, 1 świni, 1 krowy oraz 1 konia.");
        System.out.println("Przeszkodzić Ci w tym mogą grasujące w okolicy wilki i lisy.");
        System.out.println("Przeciwko lisowi obronić Cię może mały pies, przeciwko wilkowi duży pies.");
        System.out.println("Aktualny stan Twojej hodowli: króliki: "+ liczbaKrolikow+ ", owce: "+ liczbaOwiec+", świnie: "+liczbaSwin+", krowy: "+liczbaKrow+", konie: "+liczbaKoni);
        System.out.println("By rzucić kostkami wćisnij 1");

        while(liczbaKrolikow*liczbaOwiec*liczbaSwin*liczbaKrow*liczbaKoni<1) {

            Scanner input = new Scanner(System.in);
            String temp = input.nextLine();


            if (temp.equals("1")) {
                rzutKostka();
                nagrodaZaRzut();
                atakLisa();
                atakWilka();
            }
            else if (temp.equals("2")) {
                if (liczbaKrolikow >= 6)
                    zamianaKrolikowNaOwce();
                else
                    System.out.println("Hola, hola, nie oszukuj, kolego.");
            }
            else if (temp.equals("3")) {
                if (liczbaOwiec >= 1)
                    zamianaOwcyNaKroliki();
                else
                    System.out.println("Hola, hola, nie oszukuj, kolego.");
            }
            else if (temp.equals("4")) {
                if (liczbaOwiec >= 2)
                    zamianaOwiecNaSwinie();
                else
                    System.out.println("Hola, hola, nie oszukuj, kolego.");
            }
            else if (temp.equals("5")) {
                if (liczbaSwin >= 1)
                    zamianaSwiniNaOwce();
                else
                    System.out.println("Hola, hola, nie oszukuj, kolego.");
            }
            else if (temp.equals("6")) {
                if (liczbaSwin >= 3)
                    zamianaSwinNaKrowy();
                else
                    System.out.println("Hola, hola, nie oszukuj, kolego.");
            }
            else if (temp.equals("7")) {
                if (liczbaKrow >= 1)
                    zamianaKrowyNaSwinie();
                else
                    System.out.println("Hola, hola, nie oszukuj, kolego.");
            }
            else if (temp.equals("8")) {
                if (liczbaKrow >= 2)
                    zamianaKrowNaKonia();
                else
                    System.out.println("Hola, hola, nie oszukuj, kolego.");
            }
            else if (temp.equals("9")) {
                if (liczbaKoni >= 1)
                    zamianaKoniaNaKrowy();
                else
                    System.out.println("Hola, hola, nie oszukuj, kolego.");
            }
            else if (temp.equals("10")) {
                if (liczbaOwiec >= 1)
                    zamianaOwcyNaMalegoPsa();
                else
                    System.out.println("Hola, hola, nie oszukuj, kolego.");
            }
            else if (temp.equals("11")) {
                if (liczbaKrow >= 1)
                    zamianaKrowyNaDuzegoPsa();
                else
                    System.out.println("Hola, hola, nie oszukuj, kolego.");
            }

            System.out.println("Aktualny stan Twojej hodowli: króliki: " + liczbaKrolikow + ", owce: " + liczbaOwiec + ", świnie: " + liczbaSwin + ", krowy: " + liczbaKrow + ", konie: " + liczbaKoni+" (dodatkowo: małe psy: "+liczbaMalychPsow+", duże psy: "+liczbaDuzychPsow+")");
            System.out.println("Wciśnij 1 by rzucić kostkami");
            System.out.println("Wciśnij 2 by wymienić 6 królików na 1 owcę");
            System.out.println("Wciśnij 3 by wymienić 1 owcę na 6 królików");
            System.out.println("Wciśnij 4 by wymienić 2 owce na 1 świnię");
            System.out.println("Wciśnij 5 by wymienić 1 świnię na 2 owce");
            System.out.println("Wciśnij 6 by wymienić 3 świnie na 1 krowę");
            System.out.println("Wciśnij 7 by wymienić 1 krowę na 3 świnie");
            System.out.println("Wciśnij 8 by wymienić 2 krowy na 1 konia");
            System.out.println("Wciśnij 9 by wymienić 1 konia na 2 krowy");
            System.out.println("Wciśnij 10 by wymienić 1 owcę na 1 małego psa");
            System.out.println("Wciśnij 11 by wymienić 1 krowę na 1 dużego psa");

        }

        System.out.println("Gratulacje, udało Ci się wypełnić zadanie. Potrzebowałeś do tego "+liczbaRzutow+" rzutów kostkami.");
    }

    public static void rzutKostka(){
        wynikZoltej = dice.nextInt(12);

        if(wynikZoltej<=5)
            zolta = "królik";
        else if(wynikZoltej>5&&wynikZoltej<=8)
            zolta = "owca";
        else if(wynikZoltej==9)
            zolta = "świnia";
        else if(wynikZoltej==10)
            zolta = "krowa";
        else if(wynikZoltej==11)
            zolta = "wilk";
        System.out.println("Kostka żółta: "+ zolta);

        wynikCzerwonej = dice.nextInt(12);

        if(wynikCzerwonej<=5)
            czerwona = "królik";
        else if(wynikCzerwonej==6||wynikCzerwonej==7)
            czerwona = "owca";
        else if(wynikCzerwonej==8||wynikCzerwonej==9)
            czerwona = "świnia";
        else if(wynikCzerwonej==10)
            czerwona = "koń";
        else if(wynikCzerwonej==11)
            czerwona = "lis";
        System.out.println("Kostka czerwona: "+czerwona);
        liczbaRzutow++;
    }

    public static void nagrodaZaRzut(){
        int roboczyKrolik = 0;
        int roboczaOwca = 0;
        int roboczaSwinia = 0;
        int roboczaKrowa = 0;
        int roboczyKon = 0;

        if(czerwona.equals("królik")){
            roboczyKrolik +=1;
        }
        else if(czerwona.equals("owca")){
            roboczaOwca +=1;
        }
        else if(czerwona.equals("świnia")){
            roboczaSwinia +=1;
        }
        else if(czerwona.equals("koń")){
            roboczyKon +=1;
        }

        if(zolta.equals("królik")){
            roboczyKrolik +=1;
        }
        else if(zolta.equals("owca")){
            roboczaOwca +=1;
        }
        else if(zolta.equals("świnia")){
            roboczaSwinia +=1;
        }
        else if(zolta.equals("krowa")){
            roboczaKrowa +=1;
        }

        if(roboczyKrolik>0)
            nagrodaKrolik = (roboczyKrolik + liczbaKrolikow)/2;
        else
            nagrodaKrolik = 0;
        if(roboczaOwca>0)
            nagrodaOwca = (roboczaOwca + liczbaOwiec)/2;
        else
            nagrodaOwca = 0;
        if(roboczaSwinia>0)
            nagrodaSwinia = (roboczaSwinia + liczbaSwin)/2;
        else
            nagrodaSwinia = 0;
        if(roboczaKrowa>0)
            nagrodaKrowa = (roboczaKrowa + liczbaKrow)/2;
        else
            nagrodaKrowa = 0;
        if(roboczyKon>0)
            nagrodaKon = (roboczyKon + liczbaKoni)/2;
        else
            nagrodaKon = 0;

        liczbaKrolikow += nagrodaKrolik;
        liczbaOwiec += nagrodaOwca;
        liczbaSwin += nagrodaSwinia;
        liczbaKrow += nagrodaKrowa;
        liczbaKoni += nagrodaKon;
    }

    public static void atakLisa(){
        if(czerwona.equals("lis")){
            if(liczbaMalychPsow<1){
                System.out.println("Sprytny lis zakradł się do zagrody i zjadł Twoje króliki w ilości: "+liczbaKrolikow+", innymi słowy - wszystkie");
                liczbaKrolikow = 0;
            }
            else {
                liczbaMalychPsow -= 1;
                System.out.println("Dzięki bohaterskiej postawie małego psa, udało się obronić Twoje króliki, co jednak przypłacił życiem");
            }
        }
    }

    public static void atakWilka(){
        if(zolta.equals("wilk")){
            if(liczbaDuzychPsow<1){
                System.out.println("Zły wilk zakradł się do zagrody i zjadł wszystkie Twoje zwierzęta, tzn króliki: " + liczbaKrolikow + ", owce: " + liczbaOwiec + ", świnie: " + liczbaSwin + ", krowy: " + liczbaKrow);
                liczbaKrolikow = 0;
                liczbaOwiec = 0;
                liczbaSwin = 0;
                liczbaKrow = 0;
            }
            else {
                liczbaDuzychPsow -= 1;
                System.out.println("Dzięki bohaterskiej postawie dużego psa, udało się obronić Twoje zwierzęta, co jednak przypłacił życiem");
            }
        }
    }

    public static void zamianaKrolikowNaOwce(){
        liczbaKrolikow -=6;
        liczbaOwiec +=1;
        System.out.println("Wymieniłeś 6 królików na 1 owcę");
    }
    public static void zamianaOwcyNaKroliki(){
        liczbaKrolikow +=6;
        liczbaOwiec -=1;
        System.out.println("Wymieniłeś 1 owcę na 6 królików");
    }
    public static void zamianaOwiecNaSwinie(){
        liczbaSwin +=1;
        liczbaOwiec -=2;
        System.out.println("Wymieniłeś 2 owce na 1 świnię");
    }
    public static void zamianaSwiniNaOwce(){
        liczbaSwin -=1;
        liczbaOwiec +=2;
        System.out.println("Wymieniłeś 1 świnię na 2 owce");
    }
    public static void zamianaOwcyNaMalegoPsa(){
        liczbaMalychPsow +=1;
        liczbaOwiec -=1;
        System.out.println("Wymieniłeś 1 owcę na 1 małego psa");
    }
    public static void zamianaSwinNaKrowy(){
        liczbaKrow +=1;
        liczbaSwin -=3;
        System.out.println("Wymieniłeś 3 świnie na 1 krowę");
    }
    public static void zamianaKrowyNaSwinie(){
        liczbaKrow -=1;
        liczbaSwin +=3;
        System.out.println("Wymieniłeś 1 krowę na 6 świń");
    }
    public static void zamianaKrowyNaDuzegoPsa(){
        liczbaKrow -=1;
        liczbaDuzychPsow +=1;
        System.out.println("Wymieniłeś 1 krowę na 1 dużego psa");
    }
    public static void zamianaKrowNaKonia(){
        liczbaKrow -=2;
        liczbaKoni +=1;
        System.out.println("Wymieniłeś 2 krowy na 1 konia");
    }
    public static void zamianaKoniaNaKrowy(){
        liczbaKrow +=2;
        liczbaKoni -=1;
        System.out.println("Wymieniłeś 1 konia na 2 krowy");
    }
}
