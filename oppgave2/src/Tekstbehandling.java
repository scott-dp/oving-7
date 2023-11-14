import java.util.ArrayList;
public class Tekstbehandling {
    private String tekst;
    private final String ALFABET="abcdefghijklmnopqrstuvwxyz";

    public Tekstbehandling(String tekst){
        this.tekst=tekst;
    }

    public int finnAntallOrd(){
        return tekst.length();
    }

    public int avrgOrdLengde(){//rundet ned
        String tekstUtenSkilletegn="";

        for (int i=0;i<tekst.length();i++){//lager en ny string med kun bokstaver og mellomrom
            String element=String.valueOf(tekst.charAt(i));
            if(ALFABET.contains(element.toLowerCase()) || element.equals(" ")){
                tekstUtenSkilletegn+=element;
            }
        }

        String[] ordTabell=tekstUtenSkilletegn.split(" ");

        int sumBokstaver=0;
        for(int i=0;i<ordTabell.length;i++){//summerer antall bokstaver
            sumBokstaver+=ordTabell[i].length();
        }

        return sumBokstaver/ordTabell.length;


    }

    public int avrgPeriodLength(){//rundet ned
        int antallPerioder=0;

        String[] ord=tekst.split(" ");
        int antallOrd=ord.length;

        for(int i=0;i<tekst.length();i++){
            String element=String.valueOf(tekst.charAt(i));
            if(element.equals(".") || element.equals(":") || element.equals("!") || element.equals("?")){
                antallPerioder++;
            }
        }

        return antallOrd/antallPerioder;
    }

    public String skiftOrd(String fra,String til){
        String nyTekst="";

        if (tekst.contains(fra)){
            for (int i=0;i<tekst.length();i++){
                if (!(i>=(tekst.length()-fra.length())) && tekst.substring(i,i+fra.length()).equals(fra)){
                    nyTekst+=til;
                    i+=fra.length()-1;
                }else{
                    String element=String.valueOf(tekst.charAt(i));
                    nyTekst+=element;
                }
            }
            return nyTekst;
        }else {
            return tekst;
        }
    }

    public String getTekst(){
        return tekst;
    }

    public String getTekstUpper(){
        return tekst.toUpperCase();
    }
}
