package be.intecbrussel;

public class Sculptor implements Artist{

private boolean sensitive;








    @Override
    public void doArt() {

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
        return true;
    }
}
