package com.mycompany.trabalho1bim.model;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

/*
 * @author Gustavo H. Nava
 */
@Getter
@Setter
public class TipoServico {
    
    private int id;
    private String descricaoServico;
    private BigDecimal valorServico;
    
}
