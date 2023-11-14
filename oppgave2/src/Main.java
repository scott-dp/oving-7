import static javax.swing.JOptionPane.*;
public class Main {
    public static void main(String[] args) {
        boolean fortsett = true;
        while (fortsett) {
            String readInput = showInputDialog("Skriv inn teksten du vil skal bli behandlet: ");
            Tekstbehandling behandle = new Tekstbehandling(readInput);

            String readChoice = showInputDialog("Antall ord(a), Gjennomsnittlig ordlengde(g), antall ord per periode(o), skifte ord med annet(s), hent ut teksten(h), Hent tekst i caps(c),avslutt(x)");
            switch (readChoice) {
                case "a":
                    showMessageDialog(null, behandle.finnAntallOrd());
                    break;
                case "g":
                    showMessageDialog(null, behandle.avrgOrdLengde());
                    break;
                case "o":
                    showMessageDialog(null, behandle.avrgPeriodLength());
                    break;
                case "s":
                    String fra = showInputDialog("Skriv inn hva du vil bytte fra");
                    String til = showInputDialog("Skriv hva du vil bytte til");
                    showMessageDialog(null, behandle.skiftOrd(fra, til));
                    break;
                case "h":
                    showMessageDialog(null, behandle.getTekst());
                    break;
                case "c":
                    showMessageDialog(null, behandle.getTekstUpper());
                    break;
                case "x":
                    fortsett = false;
                    break;
                default:
                    showMessageDialog(null, "Du skrev ikke inn gyldig input");
            }


        }
    }
}