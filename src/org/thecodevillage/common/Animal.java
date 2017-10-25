package src.org.thecodevillage.common;

/**
 * Created by Administrator on 10/12/2017.
 */
public class Animal {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getKingdom() {
        return kingdom;
    }

    public void setKingdom(String kingdom) {
        this.kingdom = kingdom;
    }

    public Boolean getMove() {
        return move;
    }

    public void setMove(Boolean move) {
        this.move = move;
    }

    public Boolean getBark() {
        return bark;
    }

    public void setBark(Boolean bark) {
        this.bark = bark;
    }

    public Boolean getPet() {
        return pet;
    }

    public void setPet(Boolean pet) {
        this.pet = pet;
    }

    String name;
    String age;
    String kingdom;
    Boolean move;
    Boolean bark;
    Boolean pet;
}
