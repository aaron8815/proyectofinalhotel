/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import ACCESODATOS.ABMhuesped;

/**
 *
 * @author pc
 */
public class GRAN_HOTEL_NUEVO extends javax.swing.JFrame {

    /**
     * Creates new form GRAN_HOTEL_NUEVO
     */
    public GRAN_HOTEL_NUEVO() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        JMbuscar = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        JMtipoDeHabitacion = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        JMbuscarReserva = new javax.swing.JMenuItem();
        JMcrear = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 825, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 502, Short.MAX_VALUE)
        );

        jMenu1.setText("HUESPED");

        JMbuscar.setText("BUCAR");
        JMbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMbuscarActionPerformed(evt);
            }
        });
        jMenu1.add(JMbuscar);

        jMenuItem2.setText("NUEVO");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("HABITACION");

        JMtipoDeHabitacion.setText("tipo");
        JMtipoDeHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMtipoDeHabitacionActionPerformed(evt);
            }
        });
        jMenu2.add(JMtipoDeHabitacion);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("RESERVA");

        JMbuscarReserva.setText("buscar");
        JMbuscarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMbuscarReservaActionPerformed(evt);
            }
        });
        jMenu3.add(JMbuscarReserva);

        JMcrear.setText("crear");
        JMcrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMcrearActionPerformed(evt);
            }
        });
        jMenu3.add(JMcrear);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMbuscarActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        BuscarHuesped h = new BuscarHuesped();
        h.setVisible(true);
        escritorio.add(h);
        escritorio.moveToFront(h);
        
               
    }//GEN-LAST:event_JMbuscarActionPerformed

    private void JMtipoDeHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMtipoDeHabitacionActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        HabitacionEstado he= new HabitacionEstado();
        he.setVisible(true);
        escritorio.add(he);
        escritorio.moveToFront(he);
    }//GEN-LAST:event_JMtipoDeHabitacionActionPerformed

    private void JMbuscarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMbuscarReservaActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        BuscarReserva br= new BuscarReserva();
        br.setVisible(true);
        escritorio.add(br);
        escritorio.moveToFront(br);
    }//GEN-LAST:event_JMbuscarReservaActionPerformed

    private void JMcrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMcrearActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        CrearReserva cr= new CrearReserva();
        cr.setVisible(true);
        escritorio.add(cr);
        escritorio.moveToFront(cr);
        
    }//GEN-LAST:event_JMcrearActionPerformed

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
            java.util.logging.Logger.getLogger(GRAN_HOTEL_NUEVO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GRAN_HOTEL_NUEVO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GRAN_HOTEL_NUEVO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GRAN_HOTEL_NUEVO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GRAN_HOTEL_NUEVO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JMbuscar;
    private javax.swing.JMenuItem JMbuscarReserva;
    private javax.swing.JMenuItem JMcrear;
    private javax.swing.JMenuItem JMtipoDeHabitacion;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}