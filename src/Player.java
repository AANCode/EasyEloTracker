public class Player {
    String name;
    double eloRate;

    public Player(String name){
        this.name=name;
        this.eloRate=1500;
    }

   public void setEloRate(double eloRate){
        this.eloRate=eloRate;
   }
}
