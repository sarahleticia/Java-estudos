package exe02;

public class Toyota extends Carro {
    private String detalheEspecifico;
    public Toyota(String detalheEspecifico, String modelo, double preco, String cor) {
            super(modelo, preco, cor);
            this.detalheEspecifico = detalheEspecifico;
        }
    public String getDetalheEspecifico() {
        return detalheEspecifico;
    }
}
