public class App2{
    publis static void main(Strng args[]) throws Exception{
        Jogos [] = new Jogo []{
            new OneTimeBuy ("Dead Space","Terror",89,00);
            new Assinatura ("PS Plus","Todos",120,00,"Gold");
        j1.cobrar();
        j2.cobrar();
    }
    
    for (Jogo j : jogos){
        System.out.println("------------------");
        j.cobrar();
        if(j instanceof Assinatura){
            String p = ((Assinatura)j).getPlano();
            System.out.println("Plano assinatura" + plano);

        }

    }
}
