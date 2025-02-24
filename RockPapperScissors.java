import java.util.Random;
import java.util.Scanner;
public class RockPapperScissors {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			String[] rps = {"r", "p", "s"};
			String computerChoice = rps[new Random().nextInt(rps.length)];

			String player;

			while(true) {
				System.out.println("Please enter your choice['r','p' or's']");
				player = scanner.nextLine();
				if(player.equals("r") || player.equals("p") || player.equals("s")) {
					break;
				}
				System.out.println(player + "You entered wrong value.");
			}

			System.out.println("Computer choice: " + computerChoice);

			if(player.equals(computerChoice)) {
				System.out.println("The game is a tie!!!");
			}
			else if(player.equals("r")) {
				if(computerChoice.equals("p")) {
					System.out.println("Computer win...");
				}
				else if(computerChoice.equals("s")) {
					System.out.println("Hurray! You win...");
				}
			}
			else if(player.equals("p")) {
				if(computerChoice.equals("r")) {
					System.out.println("Hurray! You win...");
				}
				else if(computerChoice.equals("s")) {
					System.out.println("Computer win...");
				}
			}
			else if(player.equals("s")) {
				if(computerChoice.equals("p")) {
					System.out.println("Hurray! You win...");
				}
				else if(computerChoice.equals("r")) {
					System.out.println("Computer win...");
				}
			}
			System.out.println("Play again? (y/n)");
			String playAgain = scanner.nextLine();

			if(!playAgain.equals("y")) {
				break;
			}
		}
	}
}