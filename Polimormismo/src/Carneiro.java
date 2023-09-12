public class Carneiro extends Animal{
    public Carneiro(){
        this.nome = "Shaun o Carneiro";
        this.numeroPatas = 4;
    }

    @Override
    public void som() {
        System.out.println("BÉÉÉÉÉEEEE");
    }
}
