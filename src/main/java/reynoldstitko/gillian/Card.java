package reynoldstitko.gillian;

import java.util.ArrayList;

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
    private int value;

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


    public int getRankValue() {
        //get the numerical value of the card's rank
        switch (rank) {
            case "Ace":
                value = 1;
                break;
            case "Two":
                value = 2;
                break;
            case "Three":
                value = 3;
                break;
            case "Four":
                value = 4;
                break;
            case "Five":
                value = 5;
                break;
            case "Six":
                value = 6;
                break;
            case "Seven":
                value = 7;
                break;
            case "Eight":
                value = 8;
                break;
            case "Nine":
                value = 9;
                break;
            case "Ten":
                value = 10;
                break;
            case "Jack":
                value = 11;
                break;
            case "Queen":
                value = 12;
                break;
            case "King":
                value = 13;
                break;
            default:
                value = 0;
                break;
        }
        return value;
    }
}
