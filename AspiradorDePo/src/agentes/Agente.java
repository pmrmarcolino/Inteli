package agentes;

import acoes.Acao;
import percepcoes.Percepcao;

/**
 *
 * @author a11221BCC014
 */
public interface Agente {
   
    public Acao executarAcao(Percepcao percepcao);
}
