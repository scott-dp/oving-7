public class Main {
    public static void main(String[] args) {
        NyString tekst=new NyString("Hei jeg heter scott!");

        String nyTekst=tekst.fjernTegn("e");
        String forkortaString=tekst.forkortString();

        System.out.println(nyTekst);
        System.out.println(forkortaString);
    }
}