import java.nio.CharBuffer;
import java.util.Scanner;

public class Login {
    public static void käyttäjänimi(String Nimi, String SNimi){
        String N = "";
        String SN = "";
        //Etunimestä otetaan max. 4 ensimmäistä kirjainta.
        if (Nimi.length() > 4){
            N = Nimi.substring(Nimi.length() + 4);                
        }
            else{
                N = Nimi;
            }   
        //Sukunimestä otetaan max. 4 viimeistä kirjainta.
            if (SNimi.length() > 4){
            SN = SNimi.substring(SNimi.length() - 4);                
        }
            else{
                SN = SNimi;
            }     
        //Käyttäjän syöte muutetaan pieniksi kirjaimiksi täysin.
        //Tulostus EI pidä Ä, Ö yms.
            System.out.print("Käyttäjänimesi on: '");
            System.out.println(N.toLowerCase()+SN.toLowerCase()+"'");
        }
    public static void sposti(String Nimi, String SNimi, String Vtunnus){ 
            //Nimet muutetaan pieniksi kirjaimiksi ja väliin laitetaan piste.
            //Verkkotunnus käytetään sellaisenaan.     
            System.out.print("Sähköpostiosoitteesi on: ");
            System.out.println(Nimi.toLowerCase()+"." + SNimi.toLowerCase() + "@" + Vtunnus);
        }
        
        
    
    public static void main(String[] args) throws Exception {
        Scanner kysy = new Scanner(System.in);
        //Ä, Ö, Å ja muut erikoisaakkoset eivät tulostu oikein.
        System.out.println("!!Käytä Ä ja Å tilalla A, ja Ö tilalla O!!");
        System.out.println("Nimen ja sukunimen tulee olla vähintään 4-merkkiä pitkä.");
        System.out.println("Anna etunimi:");
            String Enimi = kysy.nextLine();
        System.out.println("Anna Sukunimi");
            String Snimi = kysy.nextLine();
        System.out.println("Anna verkkotunnus:");
            String VT = kysy.nextLine();
        if (Enimi.equals("") || Snimi.equals("")){
            System.out.println("Virhe, jokin tiedoista puuttui!");
            System.exit(1);
        }
        if (Enimi.length() >= 4 && Snimi.length() >= 4 ){
            käyttäjänimi(Enimi, Snimi);
            sposti(Enimi, Snimi, VT);}
            else 
                System.out.println("Nimi tai sukunimi oli alle 4-merkkiä pitkä!");
                System.exit(1);
    }
}
