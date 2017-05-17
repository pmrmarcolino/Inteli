package ambientes;

import agentes.Agente;
import java.util.ArrayList;
import java.util.List;
import percepcoes.Percepcao;

/**
 *
 * @author a11221BCC014
 */
public abstract class AmbienteAbstrato implements Ambiente{

    private List<Agente> agentes = new ArrayList<>();
    
    //retornar estado atual
    public abstract EstadoAmbiente retornarEstadoAtualAmbiente();
    
    //retornar percepçao do agente
    public abstract Percepcao retornarPercpcaoVistaPeloAgente();
    
    
    
    public void adicionarAgente(Agente agente){
        agentes.add(agente);
    }
    
    public void removerAgente(Agente agente){
        agentes.remove(agente);
    }
    
}
