package com.mycompany.trabalho1bim;

import com.mycompany.trabalho1bim.model.Carro;
import com.mycompany.trabalho1bim.model.Pecas;
import com.mycompany.trabalho1bim.model.TipoServico;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gustavo H. Nava
 */
public class FrameNovaOrdemServico extends javax.swing.JFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    private int linhaSelecionada = -1;
    private FrameMenu janela = new FrameMenu();
    private Arrays array = new Arrays();
    private ArrayList<Carro> carros = array.getCarros();
    private ArrayList<Pecas> pecas = array.getPecas();
    private ArrayList<TipoServico> servicos = array.getServico();
    
    public FrameNovaOrdemServico() {
        initComponents();
        setLocationRelativeTo(this);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        carregarTabela();
    }

    public void carregarTabela() {
        modelo.addColumn("Peça / Serviço");
        modelo.addColumn("Valor");
        tbOrdemServico.setModel(modelo);
        tbOrdemServico.getColumnModel().getColumn(0).setPreferredWidth(120);
        tbOrdemServico.getColumnModel().getColumn(1).setPreferredWidth(30);
    }
    
    public void popularComboBox() {
        cbCarro.removeAllItems();
        cbPecaServico.removeAllItems();
        for (Carro carro : carros) {
            cbCarro.addItem(carro.getModelo() + " - " + carro.getCliente());
        }
        for (Pecas peca : pecas) {
            cbPecaServico.addItem(peca.getNomePeca() + " - " + peca.getValorPeca());
        }
        for (TipoServico servico : servicos) {
            cbPecaServico.addItem(servico.getDescricaoServico()+ " - " + servico.getValorServico());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbOrdemServico = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        labelValor = new javax.swing.JLabel();
        tfProblemas = new javax.swing.JTextField();
        cbPecaServico = new javax.swing.JComboBox<>();
        cbCarro = new javax.swing.JComboBox<>();
        btAdicionar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nova Ordem de Serviço");

        jLabel2.setText("Carro");

        jLabel3.setText("Problemas");

        jLabel4.setText("Peças / Serviços");

        tbOrdemServico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbOrdemServico);

        jLabel5.setText("Valor total: ");

        cbPecaServico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbCarro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btAdicionar.setText("Adicionar");

        btSalvar.setText("Salvar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(tfProblemas, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbCarro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbPecaServico, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelValor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSalvar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfProblemas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbPecaServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAdicionar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(labelValor)
                    .addComponent(btSalvar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox<String> cbCarro;
    private javax.swing.JComboBox<String> cbPecaServico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelValor;
    private javax.swing.JTable tbOrdemServico;
    private javax.swing.JTextField tfProblemas;
    // End of variables declaration//GEN-END:variables
}
