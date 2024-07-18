//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Musician musician = new Musician();
        Guitar guitar = new Guitar();
        Flute flute = new Flute();
        Piano piano = new Piano();

        musician.perform(guitar);
        musician.perform(flute);
        musician.perform(piano);


    }
}