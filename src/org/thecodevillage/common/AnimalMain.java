package src.org.thecodevillage.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Administrator on 10/12/2017.
 */
public class AnimalMain {
    public static void main(String[] c) {
        int anmal = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of animals");
        anmal =scanner.nextInt();

        Animal animala = new Animal();
        animala.setName("Dog");
        animala.setAge("2");
        animala.setBark(true);
        animala.setKingdom("Mammal");
        animala.setPet(true);
        animala.setMove(true);

        Animal animalb = new Animal();
        animalb.setName("Whale");
        animalb.setAge("15");
        animalb.setBark(false);
        animalb.setKingdom("Fish");
        animalb.setPet(false);
        animalb.setMove(true);

        Animal animalc = new Animal();
        animalc.setName("Crocodile");
        animalc.setAge("10");
        animalc.setBark(false);
        animalc.setKingdom("Reptile");
        animalc.setPet(false);
        animalc.setMove(true);

        Animal animald = new Animal();
        animald.setName("Rabbit");
        animald.setAge("2");
        animald.setBark(false);
        animald.setKingdom("Rodent");
        animald.setPet(true);
        animald.setMove(true);

        Animal animale = new Animal();
        animale.setName("Hornbill");
        animale.setAge("5");
        animale.setBark(false);
        animale.setKingdom("Bird");
        animale.setPet(false);
        animale.setMove(true);

        List<Animal> listAnimal = new ArrayList<>();
        listAnimal.add(animala);
        listAnimal.add(animalb);
        listAnimal.add(animalc);
        listAnimal.add(animald);
        listAnimal.add(animale);


        for (int j=0; j<listAnimal.size(); j++) {
            System.out.println("Animal Details"+j+"\t Name:"+listAnimal.get(j).getName()+"\t Age:"+listAnimal.get(j).getAge()+"\t Kingdom:"+listAnimal.get(j).getKingdom());
            AnimalFunct.pets(listAnimal.get(j));
            AnimalFunct.moves(listAnimal.get(j));
            AnimalFunct.barks(listAnimal.get(j));
        }
    }
}
