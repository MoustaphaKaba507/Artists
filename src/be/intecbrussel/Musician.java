package be.intecbrussel;

public class Musician implements Artist,DigitalArtist
{

  private boolean sensitive;



    @Override
    public void doArt() {

    }

    @Override
    public String useSoftware(String software) {
        return software;
    }

    @Override
    public String useMedium(String tool) {
        return  tool;
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
