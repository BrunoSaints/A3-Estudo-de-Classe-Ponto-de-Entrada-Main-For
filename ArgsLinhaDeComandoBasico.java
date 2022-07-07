public class ArgsLinhaDeComandoBasico {
    public static void main(String[] args) {
        System.out.printf("Quantidade de argumentos = %d%n", args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.printf("\targs[%d] = %d%n", i, args[i]);

        }
    }
}