/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beco.guilherme.vista;

import com.beco.guilherme.modelo.DadosAplicacao;
import com.beco.guilherme.modelo.Data;
import com.beco.guilherme.modelo.Dono;
import com.beco.guilherme.modelo.Marca;
import com.beco.guilherme.modelo.Marca.MARCA;
import com.beco.guilherme.modelo.Utilizador;
import com.beco.guilherme.modelo.Veiculo;
import static java.lang.System.in;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author guilherme
 */
public class DetalhesVeiculo extends javax.swing.JDialog {

    /**
     * Creates new form DetalhesVeiculo
     */
    private DadosAplicacao data;
    private ArrayList<MARCA> marcas;
    public DetalhesVeiculo(java.awt.Frame parent, boolean modal,Utilizador utilizador) {
        super(parent, modal);
        initComponents();
        data=DadosAplicacao.getInstance();
        atualizarMarcas();
        atualizarUtilizador(utilizador);
    }
    
    public void atualizarUtilizador(Utilizador utilizador){
        lblUtilizador.setText(utilizador.getNome());
    }
    public void atualizarMarcas(){
        marcas= new ArrayList();
        cbMarca.removeAllItems();
        for (MARCA m : MARCA.values()){
            marcas.add(m);
            cbMarca.addItem(m.toString());
        }
        
    }
    public void mostrar(){
        this.setVisible(true);
    }
    public void fechar(){
        ResumoVeiculos resumo= new ResumoVeiculos();
        this.setVisible(false);
        resumo.setVisible(true);
        resumo.atualizarVeiculos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblUtilizador = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAceitar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtNumeroSerie = new javax.swing.JTextField();
        cbMarca = new javax.swing.JComboBox<>();
        txtData = new javax.swing.JFormattedTextField();
        jCheckBoxDono = new javax.swing.JCheckBox();
        txtNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMorada = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNif = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Utilizador: ");

        jLabel2.setText("Numero Serie: ");

        jLabel3.setText("Marca: ");

        jLabel4.setText("Data: ");

        btnAceitar.setText("Aceitar");
        btnAceitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceitarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        cbMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jCheckBoxDono.setText("Com dono");

        jLabel5.setText("Nome:");

        jLabel6.setText("Morada:");

        jLabel7.setText("NIF:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAceitar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBoxDono)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(lblUtilizador))
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumeroSerie)
                            .addComponent(cbMarca, 0, 268, Short.MAX_VALUE)
                            .addComponent(txtData)
                            .addComponent(txtNome)
                            .addComponent(txtMorada)
                            .addComponent(txtNif))))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblUtilizador))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNumeroSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jCheckBoxDono)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtMorada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtNif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceitar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceitarActionPerformed
        
        if(!txtNumeroSerie.getText().equals("")||!txtData.getText().equals("")){
            int num=Integer.parseInt(txtNumeroSerie.getText());
            if(num>=10000 && num<=99999){
                System.out.println("primeiro if");
                if(!data.procurarNumeroSerie(num)){
                    Data datee = Data.parse(txtData.getText());                                    
                    System.out.println(datee);
                    Data com= new Data (1,1,1970);
                    System.out.println(com.toString());
                    if(datee.getCalendar().compareTo(com.getCalendar())>0){
                        Dono dono= new Dono("","",111111111);
                        if(jCheckBoxDono.isSelected()){
                            dono.setNome(txtNome.getText());
                            dono.setMorada(txtMorada.getText());
                            dono.setNif(Integer.parseInt(txtNif.getText()));
                            data.addDono(dono);
                        }
                        System.out.println("terceiro if");
                        Veiculo veiculo = new Veiculo(num, marcas.get(cbMarca.getSelectedIndex()),datee,dono);
                        data.adicioarVeiculo(veiculo);
                        JOptionPane.showMessageDialog(null, "Carro inserirdo", "Carro", JOptionPane.INFORMATION_MESSAGE);
                        fechar();
                    }else{
                        mostraErro(4);
                    }
                }else{
                    mostraErro(3);
                }
            }else{
                mostraErro(2);
            }
        }else{
            mostraErro(1);
        }
     
    }//GEN-LAST:event_btnAceitarActionPerformed

    public void mostraErro(int num){
        switch(num){
            case 1:
                 JOptionPane.showMessageDialog(null, "Campo(s) não preenchido(s)", "Erro", JOptionPane.INFORMATION_MESSAGE);
                 break;
            case 2:
                JOptionPane.showMessageDialog(null, "Nº de série inválido, entre 10000 e 99999", "Erro", JOptionPane.INFORMATION_MESSAGE);
                 break;
            case 3:
                JOptionPane.showMessageDialog(null, "O numero de série já existe, escolha outro", "Erro", JOptionPane.INFORMATION_MESSAGE);
                 break;
            case 4:
                JOptionPane.showMessageDialog(null, "Data inválida, tem de ser superior a 1970/01/01", "Erro", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    }
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        fechar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DetalhesVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetalhesVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetalhesVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetalhesVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Utilizador user = new Utilizador("Gui");
                DetalhesVeiculo dialog = new DetalhesVeiculo(new javax.swing.JFrame(), true,user);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceitar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cbMarca;
    private javax.swing.JCheckBox jCheckBoxDono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblUtilizador;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtMorada;
    private javax.swing.JTextField txtNif;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumeroSerie;
    // End of variables declaration//GEN-END:variables
}
