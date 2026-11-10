import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Hvor mange spillere dere?");
        String antSpillere = sc.nextLine();

        List<Player> players = new ArrayList<Player>();
        for (int i = 0; i <= antSpillere.length(); i++) {
            Player player = new Player("sheinks");
        }


    }
}