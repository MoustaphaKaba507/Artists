package be.intecbrussel;

public class Dancer implements Artist{

private boolean sensitive;


    @Override
    public void doArt() {
        System.out.println("Dancing ia an amazing art ");

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
