package TransportPack;

import lombok.Getter;

@Getter
public class Mechanic<T extends Transport>{
    private final String name;
    private final String lastName;
    private final String company;

    public Mechanic(String name, String lastName, String company) {
        this.name = name;
        this.lastName = lastName;
        this.company = company;
    }
    public boolean diagnostoc(T d){
        return d.diagnistic();
    }
    public void repair(T r){
        r.repair();
    }
    @Override
    public String toString() {
        return "Механик " + name + " " + lastName + ", из компании " + company + ".";
    }
}
