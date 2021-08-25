public class Principal {

    public static void main(String[] args) {
        int disc = 3;

        hanoi(disc, 'A','B','C');
    }
    private static void hanoi(int disc, char origem, char aux, char destino){
        if (disc > 0){
            hanoi(disc -1,origem, destino, aux);
            System.out.print("Mover de "+origem + " para "+ destino +"\n");
            hanoi(disc -1, aux, origem, destino);
        }
    }
}
