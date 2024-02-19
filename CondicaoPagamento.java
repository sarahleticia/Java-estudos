public class CondicaoPagamento {
    public static void main(String[] args) {
        double valorProduto, valorProdutoFinal;
        String formaPagamento;

        valorProduto= 25.00; //set valor na variavel
        formaPagamento = "credito"; //set valor na variavel

        if(formaPagamento == ""){
            System.out.println("Por favor, você precisa escolhe uma forma de pagamento!");
        }

        if (formaPagamento == "dinheiro" || formaPagamento == "pix") {
            valorProdutoFinal = valorProduto - (valorProduto*0.15);
            System.out.println("Valor do produto: "+valorProduto + ", Valor do produto com desconto de 15%: "+valorProdutoFinal);
        }

        if (formaPagamento == "credito"){
            System.out.println("Voce escolheu pagar com cartão de credito!");
            System.out.println("Escolha uma opção: 1- credito a vista / 2- credito 2x / " +
                    "3- credito 3x");

            int escolhaCredito; //declarando variavel
            escolhaCredito=3; //set valor na variavel

            System.out.println("Voce escolheu a opcão: " +escolhaCredito);

            switch (escolhaCredito){
                case 1:
                    valorProdutoFinal = valorProduto - (valorProduto*0.10);
                    System.out.println("Valor do produto: "+valorProduto + ", Valor do produto com desconto desconto de 10%: "+valorProdutoFinal);
                    break;

                case 2:
                    System.out.println("Valor do produto sem juros: "+valorProduto);
                    break;

                case 3:
                    valorProdutoFinal = valorProduto + (valorProduto*0.10);
                    System.out.println("Valor do produto: "+valorProduto + ", Valor do produto com juros de 10%: "+valorProdutoFinal);
                    break;
            }

        }

    }
}



