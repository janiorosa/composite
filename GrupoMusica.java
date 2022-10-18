
/**
 * Escreva uma descrição da classe GrupoMusica aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.ArrayList;
import java.util.Iterator;

public class GrupoMusica extends ComponenteMusica
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    ArrayList componentes = new ArrayList();
    private String nomeGrupo;
    private String descricaoGrupo;
    
    /**
     * Construtor para objetos da classe GrupoMusica
     */
    public GrupoMusica(String _nomeGrupo, String _descricaoGrupo)
    {
        nomeGrupo=_nomeGrupo;
        descricaoGrupo=_descricaoGrupo;
        // inicializa variáveis de instância
    }
    public String getNomeGrupo(){return nomeGrupo;}
    public String getDescricaoGrupo(){ return descricaoGrupo;}

    
    public  void add(ComponenteMusica _new){
        componentes.add(_new);
    }
    public  void remove(ComponenteMusica _remover){
        componentes.remove(_remover);
    }
    public  ComponenteMusica getComponente(int indice){
        return (ComponenteMusica)componentes.get(indice);
    }
    
    public  void exibeInformacoesMusica(){
        System.out.println("Banda: " +getNomeGrupo()+ " " +getDescricaoGrupo()+"\n");
        Iterator musicaIterador = componentes.iterator();
        while(musicaIterador.hasNext()){
            ComponenteMusica infoMusica = (ComponenteMusica)musicaIterador.next();
            infoMusica.exibeInformacoesMusica();
        }
    }

    
}
