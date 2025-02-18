public class OneTimeBuy extends Jogo {
    public OneTimeBuy(Sting nome , String tipo, double valor){
        super(nome, tipo, valor);
    }
    @Override
    public void cobrar(){
        System.out.println("Enviando cobrança para seu cartão de crédito");
        System.out.println("dados do jogo adquirido");
        System.out.println(super.toString());
    }

}
