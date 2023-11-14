public class NyString {
    private String tekst;

    public NyString(String tekst){
        this.tekst=tekst;
    }

    public String forkortString(){
        String[] ordITekst=tekst.split(" ");
        String forkortaTekst="";

        for(int i=0;i<ordITekst.length;i++){
            forkortaTekst+=ordITekst[i].charAt(0);
        }

        return forkortaTekst;
    }

    public String fjernTegn(String tegn){
        String tekstUtenTegn="";

        for (int i=0;i<tekst.length();i++){
            String element=String.valueOf(tekst.charAt(i));
            if(element.equals(tegn)){
                continue;
            }
            else{
                tekstUtenTegn+=element;
            }

        }

        return tekstUtenTegn;
    }
}
