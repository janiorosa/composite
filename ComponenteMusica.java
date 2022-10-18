
/**
 * Escreva a descrição da interface ComponenteMusica aqui.
 * 
 * @author (seu nome aqui) 
 * @version (um número da versão ou data aqui)
 */

public abstract class ComponenteMusica
{
    /**
     * Exemplo de um cabeçalho de método - substitua este comentário pelo seu
     * 
     * @param  y    exemplo de um parâmetro de método
     * @return        o resultado produzido pelo sampleMethod 
     */
    public  void add(ComponenteMusica newSongComponent){}
    public  void remove(ComponenteMusica newSongComponent){}
    public  ComponenteMusica getComponente(int indice){
        throw new UnsupportedOperationException();
    }
    public  String getNomeMusica (){
        throw new UnsupportedOperationException();
    }
    public  String getNomeBanda(){
        throw new UnsupportedOperationException();
    }
    public  String getAnoLancamento(){
        throw new UnsupportedOperationException();
    }
    public  void exibeInformacoesMusica(){}
}
