public class Zoo {
    public static void main(String[] args) {
        Vaca v = new Vaca();
        Gato g = new Gato();
        Carneiro c = new Carneiro();

        Animal bichos [] = {v, g, c};

        for(Animal animal : bichos){
            System.out.println(animal.nome + " É da classe " + animal.getClass().getName() + " tem " + animal.numeroPatas + " patas e faz ");
            animal.som();
            System.out.println();
        }
    }
}