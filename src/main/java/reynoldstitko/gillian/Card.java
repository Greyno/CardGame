package reynoldstitko.gillian;

/**
 * Created by gillianreynolds-titko on 1/27/17.
 */
public class Card {

    //Create a constructor
    public Card(String rank, String suit){
        this.rank = rank;
        this.suit = suit;
    }

    public Card(String rank){
        this.rank = rank;
    }

    private String rank;
    private String suit;

    public String getRank() {

        return rank;
    }

    public void setRank(String rank) {

        this.rank = rank;
    }

    public String getSuit() {

        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    //Override the toString() method so that we can get unit testing to work properly
    @Override
    public String toString(){
        String temp = this.getRank() + " "+ this.getSuit();
        return temp;
    }
}
