
package InstrukcjaBreak.Continue;
/**
 * 
 * @author pawelstradomski
 */

public class InstrukcjaBreakContinue {

    
    public static void main(String[] args) {
         /* Instrukcja: Break, Continue
        Continue - kończy wykonywanie aktualnej iteracji pętli. 
                   Jeżeli warunek w pętli będzie dalej spełniony, 
                   aplikacja przejdzie do wykonywania dalszych iteracji.
        
        Break - po wykonaniu instrukcji break kończone jest wykonywanie aktualnej 
                iteracji oraz całej pętli. Niezależnie od wartości warunku pętli kolejna iteracja 
                nie będzie już wykonana – warunek pętli nie będzie w tym wypadku już nawet sprawdzany.
        */
        
        // Przyklad dla continue; - wykluczenie liczby 7 i kontynuacja dla reszty
        for (int l =10; l>=1; l--)
        {
            if (l == 7)
                continue;
            System.out.println("l" + l);            
        }
        // Przyklad dla break; wychodzi calkowicie z petli od liczby 13 wlacznie
        for (int m=11; m<=20; m++)
        {
            if (m==13)
                break;
            System.out.println("m"+ m);
        }
        // Przyklad dla break; wypisanie liczb nieparzystych. Parzyste wyrzuca,
        // nieparzyste zostawia
        
        for (int n = 1; n <= 5; n++)
            {
            if (n % 2 == 0)
                continue;
            System.out.println("n" + n);
            }
    }
    
}
