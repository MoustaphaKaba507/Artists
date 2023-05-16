package be.intecbrussel;

public class Painter implements Artist,DigitalArtist{

 private boolean sensitive;


//Getters and setters
    public boolean isSensitive() {
        return sensitive;
    }

    public void setSensitive(boolean sensitive) {
        this.sensitive = sensitive;
    }

    @Override
    public void doArt() {
        System.out.println("Painters are rich");

    }

    @Override
    public String useSoftware(String software) {
     return  software;
    }

    @Override
    public String useMedium(String tool) {
        return tool;
    }

    @Override
    public boolean canBeDigital() {
        return false;
    }

    @Override
    public boolean earnMoney() {
        Artist.super.earnMoney();
        return false;
    }
}
