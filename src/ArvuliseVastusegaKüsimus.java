import java.util.InputMismatchException;
import java.util.Scanner;

public class ArvuliseVastusegaKüsimus implements Küsimus {
    private String question;
    private String min;
    private String max;

    public ArvuliseVastusegaKüsimus(String question, double min, double max) {
        this.question = question;
        this.min = String.valueOf(min);
        this.max = String.valueOf(max);
    }

    public ArvuliseVastusegaKüsimus(String question, String min, double max) {
        this.question = question;
        this.min = null;
        this.max = String.valueOf(max);
    }

    public ArvuliseVastusegaKüsimus(String question, double min, String max) {
        this.question = question;
        this.min = String.valueOf(min);
        this.max = null;
    }

    public ArvuliseVastusegaKüsimus(String question) {

        this.question = question;
    }

    @Override
    public String tekst() {
        return question;
    }

    @Override
    public String küsiVastus(Scanner sc) {
        boolean correct = false;
        double  answer = Math.PI;
        while (!correct){
            try{
                 answer = Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e){
                System.out.println("Palun sisesta arv!");
                continue;
            }
            if (min != null && Double.parseDouble(min) > answer) {
                System.out.println("Arv ei tohi olla väiksem kui " + min);
                continue;
            }
            if (max != null && Double.parseDouble(max) < answer){
                System.out.println("Arv ei tohi olla suurem kui " + max);
                continue;
            }
            correct = true;
        }
        return String.valueOf(Math.round(answer));
    }
}
