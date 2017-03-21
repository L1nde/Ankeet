import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ankeet {
    private String title;
    List<Küsimus> questions = new ArrayList<>();

    public Ankeet(String title) {
        this.title = title;
    }

    public void lisaKüsimus(Küsimus question){
        questions.add(question);
    }

    public String esitaKüsimusedJaTagastaRaport(){
        int counter = 1;
        String raport = title + "\n\n";
        Scanner sc = new Scanner(System.in);
        for (Küsimus question : questions) {
            System.out.println(question.tekst());
            raport += counter++ + ". " + question.tekst() + "\n";
            raport += " - " + question.küsiVastus(sc) + "\n\n";
        }
        return raport;
    }
}
