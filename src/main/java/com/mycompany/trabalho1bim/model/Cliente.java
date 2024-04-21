package com.mycompany.trabalho1bim.model;

import lombok.Getter;
import lombok.Setter;

/*
 * @author Gustavo H. Nava
 */
@Getter
@Setter
public class Cliente {
    
    private int id;
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;

    @Override
    public String toString() {
        return id + "||" + nome + "||" + cpf + "||" + endereco + "||" + telefone;
    }
    
}
