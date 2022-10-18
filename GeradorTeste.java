
/**
 * Escreva uma descrição da classe GeradorTeste aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class GeradorTeste
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    

    /**
     * Construtor para objetos da classe GeradorTeste
     */
    public GeradorTeste()
    {
        // inicializa variáveis de instância
        
    }


    public static void main(String[] args){
        ComponenteMusica industrial = new GrupoMusica("Industrial","");
        ComponenteMusica heavyMetal = new GrupoMusica("Heavy Metal","");
        ComponenteMusica dubstep = new GrupoMusica("Dubstep","");
        
        ComponenteMusica todas = new GrupoMusica("Lista de Músicas","Todas as músicas disponíveis");
        todas.add(industrial);
        industrial.add(new Musica("Head Like a Hole","NIN", 1990));
        industrial.add(new Musica("Headhunter","Front 242", 1988));
        
        industrial.add(dubstep);
        dubstep.add(new Musica("Centipede","Knife Party",2012));
        dubstep.add(new Musica("Tetris","Doctor P",2011));
        
        todas.add(heavyMetal);
        heavyMetal.add(new Musica("War Pigs","Black Sabath",1970));
        heavyMetal.add(new Musica("Ace of Spades","Motorhead",1980));
        
        Discoteca crazy = new Discoteca(todas);
        crazy.getListaMusicas();        
    }
}
