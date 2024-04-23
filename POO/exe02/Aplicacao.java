package exe02;

public class Aplicacao {
    public static void main(String[] args) {
        Toyota motoMarvel = new Toyota("2.0 felx", "toyota accord", 60000, "rosa");

        System.out.println(motoMarvel.getCor());
        System.out.println(motoMarvel.getPreco());
        System.out.println(motoMarvel.getModelo());
        System.out.println(motoMarvel.getDetalheEspecifico());
    }
}
