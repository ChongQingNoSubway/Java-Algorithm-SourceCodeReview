package Encapsulation;

public class StockKeeper {
    private static String name;

    public static String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    StockKeeper(String name){
        setName(name);
    }

    public static void manageAlbum(Album album, String name, String artist, double price, int numberOfCopies){
        album.setName(name);
        album.setArtist(artist);
        album.setNumberOfCopies(numberOfCopies);
        album.setPrice(price);

        System.out.println("Album managed by :"+ getName());
        System.out.println("Album details::::::::::");
        System.out.println("Album name : " + album.getName());
        System.out.println("Album artist : " + album.getArtist());
        System.out.println("Album price : " + album.getPrice());
        System.out.println("Album number of copies : " + album.getNumberOfCopies());
    }
}
