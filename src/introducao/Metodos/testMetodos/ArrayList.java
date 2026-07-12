import java.util.List;

public static void main(String[] args) {

    List<String> carros = new java.util.ArrayList<>();

    carros.add("primeiro");
    carros.add("fusca");
    carros.add("ferrari");
    carros.add("fusca");
    carros.add("fusca");
    carros.add("fusca");
    carros.add("fusca");
    carros.add("gol");
    carros.add("gol");

    carros.add (5,"ferrari");
    carros.remove("gol");
    String primeiro = carros.get(0);

    System.out.println(carros);
    System.out.println(carros);
    carros.set(1, "Uno");
    System.out.println();

    int total = carros.size();

    System.out.println(total);
    System.out.println(primeiro);
    boolean vazia = carros.isEmpty();
    System.out.println(vazia);

    }
