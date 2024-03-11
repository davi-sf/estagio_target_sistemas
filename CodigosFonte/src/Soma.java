// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Soma {
    public static void main(String[] args) {
        int indice = 13;
        int result = somarecursiva(0, indice);
        System.out.println(result);

    }

    private static int somarecursiva(int k, int indice) {
        if (k == indice) {
            return k;
        } else {
            return k + somarecursiva(k + 1, indice);
        }
    }
}