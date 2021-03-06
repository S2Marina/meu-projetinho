package jogo;

import audio.Audio;
import dao.PerguntaDAO;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import modelo.Jogador;
import modelo.JogoCompleto;
import modelo.Pergunta;
import imagens.ManipularImagem;

public class Jogo extends javax.swing.JFrame {

    private Integer nivel;
    private Integer premio;
    private Jogador jogador;
    private Integer err = 0;
    private Integer acert = 0;
    private Integer clique = 0;
    private Integer agora = 0;
    private static Integer y;
    private JogoCompleto completo;
    ButtonGroup bg;

    public static Integer getiY() {
        return y;
    }

    public static void setY(Integer y) {
        Jogo.y = y;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    List<Pergunta> perguntas;
    Pergunta at; //perguntaAtual

    public Jogo() {
        initComponents();
        bg = new ButtonGroup();
        bg.add(btA);
        bg.add(btB);
        bg.add(btC);
        bg.add(btD);
        nivel = 1;
        y = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btA = new javax.swing.JRadioButton();
        btB = new javax.swing.JRadioButton();
        btC = new javax.swing.JRadioButton();
        btD = new javax.swing.JRadioButton();
        btConfirma = new javax.swing.JButton();
        btPular = new javax.swing.JButton();
        btParar = new javax.swing.JButton();
        btCartas = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblPergunta = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        acertar = new javax.swing.JLabel();
        errar = new javax.swing.JLabel();
        parar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/download.jpg"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        btA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAMouseClicked(evt);
            }
        });
        btA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAActionPerformed(evt);
            }
        });

        btB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBActionPerformed(evt);
            }
        });

        btC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCActionPerformed(evt);
            }
        });

        btD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDActionPerformed(evt);
            }
        });

        btConfirma.setText("Confirma");
        btConfirma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btConfirmaMouseClicked(evt);
            }
        });
        btConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmaActionPerformed(evt);
            }
        });

        btPular.setText("Pular");
        btPular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPularActionPerformed(evt);
            }
        });

        btParar.setText("Parar");
        btParar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPararActionPerformed(evt);
            }
        });

        btCartas.setText("Cartas");
        btCartas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCartasActionPerformed(evt);
            }
        });

        lblPergunta.setForeground(new java.awt.Color(0, 0, 204));
        lblPergunta.setText("Pergunta");

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 3, true));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("jogador");

        jLabel7.setText("Errar");

        jLabel8.setText("Parar");

        jLabel9.setText("Acertar");

        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel5.setDoubleBuffered(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(errar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(49, 49, 49)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(parar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(acertar))
                        .addGap(22, 22, 22))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acertar)
                    .addComponent(errar)
                    .addComponent(parar))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btConfirma)
                        .addGap(37, 37, 37)
                        .addComponent(btPular)
                        .addGap(37, 37, 37)
                        .addComponent(btParar)
                        .addGap(30, 30, 30)
                        .addComponent(btCartas)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPergunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btC, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btD, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btA, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btB, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel2)))
                                .addGap(0, 78, Short.MAX_VALUE)))
                        .addGap(35, 35, 35)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(lblPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(btA))
                        .addGap(18, 18, 18)
                        .addComponent(btB)
                        .addGap(18, 18, 18)
                        .addComponent(btC)
                        .addGap(18, 18, 18)
                        .addComponent(btD)
                        .addGap(92, 92, 92))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConfirma)
                    .addComponent(btPular)
                    .addComponent(btParar)
                    .addComponent(btCartas))
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

    }//GEN-LAST:event_jLabel1MouseClicked


    private void btConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmaActionPerformed
        clique++;

        PerguntaDAO dao = new PerguntaDAO();
        Audio audio = new Audio();
        //confere qual eu marquei
        boolean acertou = false;
        String x = null;

        if (btA.isSelected() == true) {
            x = "A";
        } else if (btB.isSelected() == true) {
            x = "B";
        } else if (btC.isSelected() == true) {
            x = "C";
        } else if (btD.isSelected() == true) {
            x = "D";
        }

        //se eu errei
        if (!x.equals(at.getCerta())) {
            acertou = false;
            JOptionPane.showMessageDialog(null, "Errada");

            Fim f = new Fim();
            completo.setJogador(jogador);
            agora = completo.getGanhos() / 2;
            f.completo = completo;
            f.setVisible(true);
            this.setVisible(false);

        } else {
            //se eu acertei
            audio.tocar("certa.wav");
            acertou = true;
            JOptionPane.showMessageDialog(null, "Certa");

            agora = completo.getGanhos() + premio;

            //passa pra proxima pergunta
            perguntas.remove(0);

            if (clique == 3 || clique == 6 || clique == 9 || clique == 12 || clique == 13) {
                nivel++;

                if (nivel == 2) {
                    premio = 30000;
                } else if (nivel == 3) {
                    premio = 50000;
                } else if (nivel == 4) {
                    premio = 100000;
                } else if (nivel == 5) {
                    premio += 315000;
                } else {
                    Fim tela = new Fim();
                    completo.setGanhos(agora);
                    tela.completo = completo;
                    tela.setVisible(true);
                    this.setVisible(false);
                    return;
                }
                perguntas = dao.listarNivel(nivel);
            }

            at = perguntas.get(0);//pega pergunta atual

            //mostra a proxima pergunta
            lblPergunta.setText(at.getEnunciado());

            btA.setText(at.getA());
            btB.setText(at.getB());
            btC.setText(at.getC());
            btD.setText(at.getD());
           

            //mostrar pontuação nos labels
            if (nivel == 5) {
                btCartas.setEnabled(false);
                btParar.setEnabled(false);
                btPular.setEnabled(false);
                parar.setText("0");
                errar.setText("0");
                acertar.setText("1000000");
                
            } else //se eu acertar
            {
                acert = agora + premio;
                acertar.setText(acert.toString());

                //se eu parar
                parar.setText(agora.toString());

                //se eu errar
                err = agora / 2;
                errar.setText(err.toString());
            }

            bg.clearSelection();
        }

        completo.setGanhos(agora);
    }//GEN-LAST:event_btConfirmaActionPerformed

    private void btPularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPularActionPerformed
        perguntas.remove(0);

        at = perguntas.get(0);

        lblPergunta.setText(at.getEnunciado());
        btA.setText(at.getA());
        btB.setText(at.getB());
        btC.setText(at.getC());
        btD.setText(at.getD());
       

        btPular.setEnabled(false);
    }//GEN-LAST:event_btPularActionPerformed

    private void btPararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPararActionPerformed
        Fim f = new Fim();
        completo.setJogador(jogador);
        completo.setGanhos(agora);
        f.completo = completo;
        f.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btPararActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        completo = new JogoCompleto();
        completo.setJogador(jogador);

        btCartas.setEnabled(true);

        ManipularImagem.exibiImagemLabel(jogador.getImagem(), jLabel5);
        jLabel4.setText(jogador.getLogin());

        premio = 15000;

        PerguntaDAO dao = new PerguntaDAO();
        perguntas = dao.listarNivel(nivel);
        at = perguntas.get(0);

        lblPergunta.setText(at.getEnunciado());
        btA.setText(at.getA());
        btB.setText(at.getB());
        btC.setText(at.getC());
        btD.setText(at.getD());
       

        acertar.setText(premio.toString());
        parar.setText("0");
        errar.setText("0");
    }//GEN-LAST:event_formWindowOpened

    private void btAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAMouseClicked

    }//GEN-LAST:event_btAMouseClicked

    private void btBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBActionPerformed
        Audio audio = new Audio();
        if (btA.isSelected() == true || btB.isSelected() == true || btC.isSelected() == true || btD.isSelected() == true) {
            audio.tocar("certeza.wav");
        }
    }//GEN-LAST:event_btBActionPerformed

    private void btAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAActionPerformed
        Audio audio = new Audio();
        if (btA.isSelected() == true || btB.isSelected() == true || btC.isSelected() == true || btD.isSelected() == true) {
            audio.tocar("certeza.wav");
        }
    }//GEN-LAST:event_btAActionPerformed

    private void btCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCActionPerformed
        Audio audio = new Audio();
        if (btA.isSelected() == true || btB.isSelected() == true || btC.isSelected() == true || btD.isSelected() == true) {
            audio.tocar("certeza.wav");
        }
    }//GEN-LAST:event_btCActionPerformed

    private void btDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDActionPerformed
        Audio audio = new Audio();
        if (btA.isSelected() == true || btB.isSelected() == true || btC.isSelected() == true || btD.isSelected() == true) {
            audio.tocar("certeza.wav");
        }
    }//GEN-LAST:event_btDActionPerformed

    private void btConfirmaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btConfirmaMouseClicked

    }//GEN-LAST:event_btConfirmaMouseClicked

    private void btCartasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCartasActionPerformed
        Cartas c = new Cartas();
        c.setVisible(true);
        btCartas.setEnabled(false);
    }//GEN-LAST:event_btCartasActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        carta(y);
    }//GEN-LAST:event_formWindowGainedFocus

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Jogo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jogo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jogo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jogo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jogo().setVisible(true);
            }
        });

    }

    public void carta(Integer x) {
        if (x == 1) {
            switch (at.getCerta()) {
                case "A":
                    btB.setEnabled(false);
                    break;
                case "B":
                    btC.setEnabled(false);
                    break;
                case "C":
                    btD.setEnabled(false);
                    break;
                default:
                    btA.setEnabled(false);
                    break;
            }
        } else if (x == 2) {
            switch (at.getCerta()) {
                case "A":
                    btB.setEnabled(false);
                    btC.setEnabled(false);
                    break;
                case "B":
                    btC.setEnabled(false);
                    btD.setEnabled(false);
                    break;
                case "C":
                    btD.setEnabled(false);
                    btA.setEnabled(false);
                    break;
                default:
                    btA.setEnabled(false);
                    btB.setEnabled(false);
                    break;
            }
        } else if (x == 3) {
            switch (at.getCerta()) {
                case "A":
                    btB.setEnabled(false);
                    btC.setEnabled(false);
                    btD.setEnabled(false);
                    break;
                case "B":
                    btC.setEnabled(false);
                    btD.setEnabled(false);
                    btA.setEnabled(false);
                    break;
                case "C":
                    btD.setEnabled(false);
                    btA.setEnabled(false);
                    btB.setEnabled(false);
                    break;
                default:
                    btA.setEnabled(false);
                    btB.setEnabled(false);
                    btC.setEnabled(false);
                    break;
            }
        } else {
            btA.setEnabled(true);
            btB.setEnabled(true);
            btC.setEnabled(true);
            btD.setEnabled(true);

        }
        y = 0;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acertar;
    private javax.swing.JRadioButton btA;
    private javax.swing.JRadioButton btB;
    private javax.swing.JRadioButton btC;
    private javax.swing.JButton btCartas;
    private javax.swing.JButton btConfirma;
    private javax.swing.JRadioButton btD;
    private javax.swing.JButton btParar;
    private javax.swing.JButton btPular;
    private javax.swing.JLabel errar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPergunta;
    private javax.swing.JLabel parar;
    // End of variables declaration//GEN-END:variables
}
