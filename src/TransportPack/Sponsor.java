package TransportPack;


import lombok.Getter;

@Getter
public class Sponsor {
    private final String name;
    private final int gold;

    public Sponsor(String name, int gold) {
        this.name = name;
        this.gold = gold;
    }
    public void sponsorGold(){
        System.out.println("Спонсор" + this.getName() + " проспонсировал гонку на " + this.getGold());
    }

    @Override
    public String toString() {
        return "Спонсор " + name + ", с капиталом " + gold + ".";
    }
}
