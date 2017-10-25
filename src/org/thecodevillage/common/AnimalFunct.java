package src.org.thecodevillage.common;

/**
 * Created by Administrator on 10/12/2017.
 */
public class AnimalFunct {

    public static void  moves(Animal moves) {


        if (moves.getMove()) {
            System.out.println(moves.getName() + "is moving");
        } else {
            System.out.println(moves.getName() + "is not moving");
        }
    }

    public static void  pets(Animal pets) {


        if (pets.getPet()) {
            System.out.println(pets.getName() + "is pet");
        } else {
            System.out.println(pets.getName() + "is not a pet");
        }
    }

    public static void  barks(Animal barks){


        if (barks.getBark()) {
            System.out.println(barks.getName()+"is Barking");
        } else {
            System.out.println(barks.getName()+"is not Barking");
        }

    }

}
