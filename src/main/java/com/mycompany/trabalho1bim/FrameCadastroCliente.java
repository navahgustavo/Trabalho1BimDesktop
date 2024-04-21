/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.trabalho1bim;

import com.mycompany.trabalho1bim.model.Cliente;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gustavo H. Nava
 */
public class FrameCadastroCliente extends javax.swing.JFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    private int linhaSelecionada = -1;
    private FrameMenu janela = new FrameMenu();
    private Arrays arrayClientes = new Arrays();
    private ArrayList<Cliente> clientes = arrayClientes.getClientes();
    
    public FrameCadastroCliente() {
        initComponents();
        setLocationRelativeTo(this);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        carregarTabela();
    }
    
    public void carregarTabela() {
        modelo.addColumn("Nome");
        modelo.addColumn("CPF");
        modelo.addColumn("Telefone");
        modelo.addColumn("Endereço");
        tbClientes.setModel(modelo);
        tbClientes.getColumnModel().getColumn(0).setPreferredWidth(120);
        tbClientes.getColumnModel().getColumn(1).setPreferredWidth(30);
        tbClientes.getColumnModel().getColumn(2).setPreferredWidth(30);
        tbClientes.getColumnModel().getColumn(3).setPreferredWidth(120);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfCpf = new javax.swing.JTextField();
        tfEndereco = new javax.swing.JTextField();
        tfTelefone = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();
        btSalvar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });

        jLabel1.setText("Cadastro de Clientes");

        jLabel2.setText("Nome");

        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });

        jLabel3.setText("CPF");

        jLabel4.setText("Endereço");

        jLabel5.setText("Telefone");

        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tbClientes);

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        jButton1.setText("Carregar Clientes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tfNome)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSalvar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed

    }//GEN-LAST:event_tfNomeActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        
        Cliente cliente = new Cliente();
        
        String nome = tfNome.getText();
        String cpf = tfCpf.getText();
        String telefone = tfTelefone.getText();
        String endereco = tfEndereco.getText();
        
        cliente.setId(clientes.size());
        cliente.setNome(nome);
        cliente.setCpf(cpf);
        cliente.setTelefone(telefone);
        cliente.setEndereco(endereco);
        
        clientes.add(cliente);
        
        if (linhaSelecionada >= 0) {
            modelo.removeRow(linhaSelecionada);
            modelo.insertRow(linhaSelecionada, new Object[] {nome, cpf, telefone, endereco});
        } else {
            modelo.addRow(new Object[] {nome, cpf, telefone, endereco});
        }
        
        JOptionPane.showMessageDialog(this, "Cliente Cadastrado com Sucesso!");
        tfNome.setText("");
        tfCpf.setText("");
        tfTelefone.setText("");
        tfEndereco.setText("");
        tfNome.requestFocus();
        linhaSelecionada = -1;
        
        arrayClientes.setClientes(clientes);
    }//GEN-LAST:event_btSalvarActionPerformed

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        for (int i = 0; i < tbClientes.getRowCount(); i++) {
            modelo.removeRow(i);
        }
        
        for (Cliente cliente : clientes) {
            String nome = cliente.getNome();
            String cpf = cliente.getCpf();
            String telefone = cliente.getTelefone();
            String endereco = cliente.getEndereco();

            if (linhaSelecionada >= 0) {
                modelo.removeRow(linhaSelecionada);
                modelo.insertRow(linhaSelecionada, new Object[]{nome, cpf, telefone, endereco});
            } else {
                modelo.addRow(new Object[]{nome, cpf, telefone, endereco});
            }

            linhaSelecionada = -1;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbClientes;
    private javax.swing.JTextField tfCpf;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfTelefone;
    // End of variables declaration//GEN-END:variables
}
