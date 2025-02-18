public class Assinatura extends Jogo {
    private String plano;
    public Assinatura(Sting nome , String tipo, double valor, String plano){
            super(nome, tipo, valor);
            this.plano=plano;
        }
        @Override
        public void cobrar(){
            System.out.println("Enviando cobrança automatica mensal");
            System.out.println("dados do produto adquirido");
            System.out.println(super.toString());
            System.out.println("Plano " + plano);
        }
        public String getPlano(){
            return plano;
        }
}
