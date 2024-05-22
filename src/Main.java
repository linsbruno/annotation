public class Main {
    public static void main(String[] args) {
        Class<Aplicacao> classe = Aplicacao.class;
        TabelaAnnotation anotacaoClasse = classe.getAnnotation(TabelaAnnotation.class);

        System.out.println("Anotação da classe: " + anotacaoClasse.value());
    }
}