import java.util.*;

class Checker implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2) {
       if (o1.sc > o2.sc) {
           return -1;
       } if (o1.sc < o2.sc) {
           return 1;
       } if (o1.sc == o2.sc) {
           return o1.nm.compareTo(o2.nm);
       }
    return 0;
    } 
}
class Player{
    String nm;
    int sc;
    
    Player(String nm, int sc){
        this.nm = nm;
        this.sc = sc;
    }
}

public class EXC4_4 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();

	        Player[] player = new Player[n];
	        Checker checker = new Checker();
	        
	        for(int i = 0; i < n; i++){
	            player[i] = new Player(scan.next(), scan.nextInt());
	        }
	        scan.close();
	     
	        Arrays.sort(player, checker);
	        for(int i = 0; i < player.length; i++){
	            System.out.printf("%s- %s\n", player[i].nm, player[i].sc);
	        }

	}

}
