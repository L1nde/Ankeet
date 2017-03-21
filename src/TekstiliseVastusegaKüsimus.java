import java.util.Scanner;

public class TekstiliseVastusegaKüsimus implements Küsimus {
    private String question;
    private int len = 0;

    public TekstiliseVastusegaKüsimus(String question, int len) {
        this.question = question;
        this.len = len;
    }

    public TekstiliseVastusegaKüsimus(String question) {
        this.question = question;
    }

    @Override
    public String tekst() {
        return question;
    }

    @Override
    public String küsiVastus(Scanner sc) {
        String answer = sc.nextLine();
        if (len != 0){
            while(answer.length() > len){
                System.out.println("Palun piirdu vastamisel " + len + " sümboliga!");
                answer = sc.nextLine();
            }
        }
        return answer;
    }
}
