import BuilderCasa.Casa;
import BuilderCasa.CasaBuilder;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Person> pesonas = new ArrayList<>();
        Person juan = new Person("Ana");
        Person soe = new Person("Soe");;
        soe.setName("Anton");

        pesonas.add(juan);
        pesonas.add(soe);

        String name = "Juan";
        int age = 25;

        System.out.println(juan);

    }
}