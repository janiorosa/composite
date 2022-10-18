
/**
 * Escreva uma descrição da classe Discoteca aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Discoteca
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    ComponenteMusica lista;

    /**
     * Construtor para objetos da classe Discoteca
     */
    public Discoteca(ComponenteMusica _newLista)
    {
        // inicializa variáveis de instância
        lista=_newLista;
    }

    public void getListaMusicas(){
        lista.exibeInformacoesMusica();
    }
}
