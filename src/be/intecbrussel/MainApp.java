package be.intecbrussel;

public class MainApp {
    public static void main(String[] args) {
        Painter painter = new Painter();
        System.out.println("Painting is efficient with " + painter.useSoftware("adobe"));
        System.out.println("Painter paint with a " + painter.useMedium("Brush"));

        System.out.println("---------------");


        Musician musician= new Musician();
        System.out.println("Music mastering is done with a " + musician.useSoftware("MastersSoftware"));
        System.out.println("Music is a made with a " +musician.useMedium("Mic"));


        System.out.println("------");

        ComicArtist comicArtist = new ComicArtist();
        System.out.println("ComicArtist artist makes comic stories with " + comicArtist.useSoftware("ComicSoftware"));
        System.out.println("Comics are created with a "+comicArtist.useMedium("ComicTool"));

        System.out.println("----------");

        Sculptor sculptor=new Sculptor();
        System.out.println("Sculptors design with a " +sculptor.useMedium("SculptorTool"));
        System.out.println(sculptor.canBeDigital());
        System.out.println(sculptor.earnMoney());

        System.out.println("-----------");

        Dancer dancer = new Dancer();
        System.out.println("dancing is an amazing art with the help of " +dancer.useMedium("DancingShoes") );
        System.out.println();
    }
}
