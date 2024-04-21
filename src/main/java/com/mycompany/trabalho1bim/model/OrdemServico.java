package com.mycompany.trabalho1bim.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/*
 * @author Gustavo H. Nava
 */
@Getter
@Setter
public class OrdemServico {
    
    private int id;
    private String carro;
    private String problemasRelatados;
    private String descricao;
    private BigDecimal valorTotal;
    
}
