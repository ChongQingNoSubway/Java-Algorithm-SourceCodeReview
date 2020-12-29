package Encapsulation;

public class Album {
    private String name;
    private String artist;
    private double price;
    private int numberOfCopies;

    public void sellCopies(){
        if(numberOfCopies > 0){
            numberOfCopies--;
            System.out.println("One album has sold!!");
        }else{
            System.out.println("No more album available!");
        }
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setArtist(String artist){
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setPrice(double price) {
        if (price < 0) {
            this.price = 0.0;
        } else {
            this.price = price;
        }
    }

    public double getPrice(){
        return price;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        if(numberOfCopies<0){
            this.numberOfCopies = 0;
        }else{
            this.numberOfCopies = numberOfCopies;
        }
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }


}
