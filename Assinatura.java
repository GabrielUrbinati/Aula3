public class Assinatura extends Jogo {
    public Assinatura(Sting nome , String tipo, double valor){
            super(nome, tipo, valor);
        }
        @Override
        public void cobrar(){
            System.out.println("Enviando cobrança automatica mensal");
            System.out.println("dados do jogo adquirido");
            System.out.println(super.toString());
        }
}
