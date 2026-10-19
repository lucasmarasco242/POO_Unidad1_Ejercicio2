//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Mascota mascota1 = new Mascota("firulais","perro",5);
Mascota mascota2 = new Mascota("nemo", "pez", 3);
Mascota mascota3 =  new Mascota("juan","caballo",15);


        System.out.println("el nombre de la mascota 1 es " + mascota1.nombre +"  su especie es   " + mascota1.especie +"  y su edad es  " + mascota1.edad);
        System.out.println("el nombre de la  mascota 2 es " +mascota2.nombre + "  su especie es  " + mascota2.especie + "  y su edad es  " + mascota2.edad);
        System.out.println("el nombre de la  mascota 3 es " +mascota3.nombre + "  su especie es  " + mascota3.especie + "  y su edad es  " + mascota3.edad);
    }
}