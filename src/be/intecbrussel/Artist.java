package be.intecbrussel;

public interface Artist {

    boolean sensitive = false;


    void doArt();
    String useMedium(String tool);

    boolean canBeDigital();

    default boolean earnMoney(){
        System.out.println("Artist are poor");
        return false;
    }
}
