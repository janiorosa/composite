
/**
 * Escreva uma descrição da classe Musica aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Musica extends ComponenteMusica
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio

    private String nomeMusica;
    private String nomeBanda;
    private int anoLancamento;
    public String getNomeMusica(){return nomeMusica;}
    public String getNomeBanda(){return nomeBanda;}
    public int getAno(){return anoLancamento;}
    /**
     * Construtor para objetos da classe Musica
     */
    public Musica(String _novaMusica, String _novaBanda, int _lanc)
    {
        // inicializa variáveis de instância
        nomeMusica=_novaMusica;
        nomeBanda=_novaBanda;
        anoLancamento=_lanc;
    }

    public  void exibeInformacoesMusica(){
        System.out.println("Música: " +getNomeMusica()+ " gravada por " +getNomeBanda()+ " - " + getAno() +"\n");
    }
}
