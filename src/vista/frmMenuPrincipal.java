/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import config.sesion;

/**
 *
 * @author Pablo Gauto
 */
public class frmMenuPrincipal extends javax.swing.JFrame {
    
   sesion oSesion;
  
    
    public frmMenuPrincipal() {
        initComponents();
    }
    
    public frmMenuPrincipal(sesion pSesion){
        initComponents();
        oSesion = pSesion;
        txtUsuario.setText("USUARIO: " + oSesion.getNombreUsuario());
        PermisoDeAcceso();
    }
    
    public void PermisoDeAcceso(){
        String cargo = oSesion.getCargo();
        if(cargo.equals("Admin")){
            //ACCESO COMPLETO
        }else if(cargo.equals("Odontologa")){
            
        }else if(cargo.equals("Cajero")){
            
            mRegistro.setVisible(false);
            sm_compra.setVisible(false);
            sm_venta.setVisible(false);
            
        }else if(cargo.equals("Asistente")){
            
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        mRegistro = new javax.swing.JMenu();
        sm_Paciente = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        mOperacion = new javax.swing.JMenu();
        sm_compra = new javax.swing.JMenuItem();
        sm_venta = new javax.swing.JMenuItem();
        sm_caja = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 403, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));

        txtUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(356, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenuBar2.setBackground(new java.awt.Color(0, 102, 255));

        mRegistro.setText("Registro");

        sm_Paciente.setText("Paciente");
        mRegistro.add(sm_Paciente);

        jMenuItem2.setText("Servicios");
        mRegistro.add(jMenuItem2);

        jMenuBar2.add(mRegistro);

        mOperacion.setText("Operaciones");

        sm_compra.setText("Compra");
        mOperacion.add(sm_compra);

        sm_venta.setText("Venta");
        sm_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sm_ventaActionPerformed(evt);
            }
        });
        mOperacion.add(sm_venta);

        sm_caja.setText("Caja");
        mOperacion.add(sm_caja);

        jMenuBar2.add(mOperacion);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sm_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sm_ventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sm_ventaActionPerformed

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
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu mOperacion;
    private javax.swing.JMenu mRegistro;
    private javax.swing.JMenuItem sm_Paciente;
    private javax.swing.JMenuItem sm_caja;
    private javax.swing.JMenuItem sm_compra;
    private javax.swing.JMenuItem sm_venta;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
