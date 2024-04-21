package com.mycompany.trabalho1bim;

import com.mycompany.trabalho1bim.model.Carro;
import com.mycompany.trabalho1bim.model.Cliente;
import com.mycompany.trabalho1bim.model.OrdemServico;
import com.mycompany.trabalho1bim.model.Pecas;
import com.mycompany.trabalho1bim.model.TipoServico;
import java.util.ArrayList;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Gustavo H. Nava
 */
@Getter
@Setter
public class Arrays {
    
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Carro> carros = new ArrayList<>();
    private ArrayList<Pecas> pecas = new ArrayList<>();
    private ArrayList<TipoServico> servico = new ArrayList<>();
    private ArrayList<OrdemServico> ordemServico = new ArrayList<>();
            
}
