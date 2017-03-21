import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ValikvastusegaKüsimus implements Küsimus{
    private String question;
    List<String> options;

    public ValikvastusegaKüsimus(String question, List<String> options) {
        this.question = question;
        this.options = options;
    }

    @Override
    public String tekst() {
        return question;
    }

    @Override
    public String küsiVastus(Scanner sc) {
        int counter = 1;
        int answer = -1;
        System.out.println("Valikud:");
        for (String option : options) {
            System.out.println(counter++ + ". " + option);
        }
        while (answer <= 0 || answer > options.size()){
            try{
                answer = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e){
                System.out.println("Sisesta valiku number!");
                continue;
            }
            if (answer <= 0 || answer >= options.size()){
                System.out.println("Palun sisesta valiku number!");
            }
        }
        return options.get(answer-1);
    }
}
