package admin;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Jogador;

public class jogadorManter extends javax.swing.JFrame {
    
    List<Jogador> lista;
    int posicao = 0;
    
    public jogadorManter() {
        initComponents();
        initComponents();
        lista = new ArrayList<Jogador>();
    }
    
    public void Limpar(){
        txtLogin.setText(null);
        txtSenha.setText(null);
        txtEmail.setText(null);
    }

       @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtEmail = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btPrimeiro = new javax.swing.JButton();
        btAnterior = new javax.swing.JButton();
        btProximo = new javax.swing.JButton();
        btUltimo = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btCons = new javax.swing.JButton();
        btExc = new javax.swing.JButton();
        btLimp = new javax.swing.JButton();
        btCad = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btListagem = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Navegação")));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        btPrimeiro.setText("Primeiro");
        btPrimeiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPrimeiroActionPerformed(evt);
            }
        });
        jPanel1.add(btPrimeiro);

        btAnterior.setText("Anterior");
        btAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnteriorActionPerformed(evt);
            }
        });
        jPanel1.add(btAnterior);

        btProximo.setText("Próximo");
        btProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProximoActionPerformed(evt);
            }
        });
        jPanel1.add(btProximo);

        btUltimo.setText("Último");
        btUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUltimoActionPerformed(evt);
            }
        });
        jPanel1.add(btUltimo);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Ações"));
        jPanel3.setLayout(new java.awt.GridLayout());

        btCons.setText("Consultar");
        btCons.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsActionPerformed(evt);
            }
        });
        jPanel3.add(btCons);

        btExc.setText("Excluir");
        btExc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btExc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcActionPerformed(evt);
            }
        });
        jPanel3.add(btExc);

        btLimp.setText("Limpar");
        btLimp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btLimp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpActionPerformed(evt);
            }
        });
        jPanel3.add(btLimp);

        btCad.setText("Cadastrar");
        btCad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadActionPerformed(evt);
            }
        });
        jPanel3.add(btCad);

        jLabel1.setText("Login:");

        jLabel2.setText("Email:");

        btListagem.setText("Listagem");
        btListagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListagemActionPerformed(evt);
            }
        });

        jLabel4.setText("Jogador");

        jLabel5.setText("Senha:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(369, 369, 369)
                            .addComponent(btListagem))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(79, 79, 79))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jLabel4)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btListagem)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrimeiroActionPerformed
        btPrimeiro.setEnabled(true);
        btAnterior.setEnabled(false);
        btProximo.setEnabled(true);
        btUltimo.setEnabled(true);

        posicao = 0;

        Jogador p = lista.get(0);
        if (lista.size()>0){
            txtEmail.setText(p.getEmail());
            txtLogin.setText(p.getLogin());
            txtSenha.setText(p.getSenha());
           

            if (lista.size() == 1)
            {
                btProximo.setEnabled(false);
                btAnterior.setEnabled(false);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, " Não há nenhum jogador cadastrado!!!");
        }

    }//GEN-LAST:event_btPrimeiroActionPerformed

    private void btAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnteriorActionPerformed

        btPrimeiro.setEnabled(true);
        btAnterior.setEnabled(true);
        btProximo.setEnabled(true);
        btUltimo.setEnabled(true);

        if(posicao > 0){
            posicao = posicao - 1;
            Jogador p = lista.get(posicao);
            txtEmail.setText(p.getEmail());
            txtLogin.setText(p.getLogin());
            txtSenha.setText(p.getSenha());
        }
        else{
            JOptionPane.showMessageDialog(null, " Não há nenhum jogador cadastrado!!!");
        }

    }//GEN-LAST:event_btAnteriorActionPerformed

    private void btProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProximoActionPerformed
        btPrimeiro.setEnabled(true);
        btAnterior.setEnabled(true);
        btProximo.setEnabled(true);
        btUltimo.setEnabled(true);

        posicao = posicao + 1;

        Jogador p = lista.get(posicao);
        txtEmail.setText(p.getEmail());
        txtLogin.setText(p.getLogin());
        txtSenha.setText(p.getSenha());

        if (posicao == lista.size() - 1) {
            btProximo.setEnabled(false);
            btUltimo.setEnabled(true);
        }
    }//GEN-LAST:event_btProximoActionPerformed

    private void btUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUltimoActionPerformed
        btPrimeiro.setEnabled(true);
        btAnterior.setEnabled(true);
        btProximo.setEnabled(false);
        btUltimo.setEnabled(false);

        posicao = lista.size() - 1;

        Jogador p = lista.get(posicao);
        txtEmail.setText(p.getEmail());
        txtLogin.setText(p.getLogin());
        txtSenha.setText(p.getSenha());

    }//GEN-LAST:event_btUltimoActionPerformed

    private void btConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsActionPerformed
        Jogador p = new Jogador();
        String nome = JOptionPane.showInputDialog("Informe o nome a ser pesquisado:");
        int posicaoachou = 0;
        boolean enc = false;
        for (Jogador pessoa : lista) {
            if(nome.equals(pessoa.getNome())){
                posicao = posicaoachou;
                enc = true;
                 txtEmail.setText(p.getEmail());
                 txtLogin.setText(p.getLogin());
                 txtSenha.setText(p.getSenha());
                break;
            }
            posicaoachou++;
        }
        if (enc == false){
            JOptionPane.showMessageDialog(null, "Esse jogador não está cadastrado!!!");
        }
    }//GEN-LAST:event_btConsActionPerformed

    private void btExcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcActionPerformed
        lista.remove(lista.get(posicao));
        Limpar();
    }//GEN-LAST:event_btExcActionPerformed

    private void btLimpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpActionPerformed
        Limpar();
    }//GEN-LAST:event_btLimpActionPerformed

    private void btCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadActionPerformed
        Jogador p = new Jogador();

        Boolean x = false;

        if(txtLogin.getText().isEmpty() || txtEmail.getText().isEmpty()|| txtSenha.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos!!!");
        }
     

        p.setLogin(txtLogin.getText());
        p.setEmail(txtEmail.getText());
        p.setSenha(txtSenha.getText());

        if (x==true){
            lista.add(p);
            JOptionPane.showMessageDialog(rootPane, "Cadastrado com sucesso!!!" );
        }
        Limpar();
    }//GEN-LAST:event_btCadActionPerformed

    private void btListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListagemActionPerformed
        jogadorListar lista = new jogadorListar();
        lista.setVisible(true);

        dispose();
    }//GEN-LAST:event_btListagemActionPerformed

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
            java.util.logging.Logger.getLogger(jogadorManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jogadorManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jogadorManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jogadorManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jogadorManter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAnterior;
    private javax.swing.JButton btCad;
    private javax.swing.JButton btCons;
    private javax.swing.JButton btExc;
    private javax.swing.JButton btLimp;
    private javax.swing.JButton btListagem;
    private javax.swing.JButton btPrimeiro;
    private javax.swing.JButton btProximo;
    private javax.swing.JButton btUltimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables
}