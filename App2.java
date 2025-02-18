public class App2{
    publis static void main(Strng args[]) throws Exception{
        Jogos [] = new Jogo []{
            new OneTimeBuy ("Dead Space","Terror",89,00);
            new Assinatura ("PS Plus","Todos",120,00,"Gold");
        
    }
    
    for (Jogo j : jogos){
        System.out.println("------------------");
        j.cobrar();
        System.out.println("------------------");

    }
}
