import java.nio.CharBuffer;
import java.util.Scanner;

public class Login {
    public static void käyttäjänimi(String Nimi, String SNimi){
        String N = "";
        String SN = "";
        if (Nimi.length() > 4){
            N = Nimi.substring(Nimi.length() + 4);                
        }
            else{
                N = Nimi;
            }   
        if (SNimi.length() > 4){
            SN = SNimi.substring(SNimi.length() - 4);                
        }
            else{
                SN = SNimi;
            }     
            System.out.print("Käyttäjänimesi on: '");
            System.out.println(N.toLowerCase()+SN.toLowerCase()+"'");
        }
        
    
    public static void main(String[] args) throws Exception {
        Scanner kysy = new Scanner(System.in);
        System.out.println("!!Käytä Ä tilalla A ja Ö tilalla O!!");
        System.out.println("Anna etunimi:");
        String Enimi = kysy.nextLine();
        System.out.println("Anna Sukunimi");
        String Snimi = kysy.nextLine();
        käyttäjänimi(Enimi, Snimi);
    }
}
