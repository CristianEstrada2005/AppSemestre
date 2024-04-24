/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

/**
 *
 * @author usuario
 */
public class VistaGestionUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form GestionUsuarios
     */
    private String dato;
    
    public VistaGestionUsuarios() {
        initComponents();
        
    }
    
     public void setDato(String dato){
        this.dato = dato;
        lblDato.setText("Bienvenido: " +dato);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsuario1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblEps = new javax.swing.JLabel();
        lblEps1 = new javax.swing.JLabel();
        lblEps2 = new javax.swing.JLabel();
        lblDato = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsuario1.setBackground(new java.awt.Color(204, 204, 255));
        lblUsuario1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUsuario1.setForeground(new java.awt.Color(0, 0, 204));
        lblUsuario1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lapiz-de-usuario.png"))); // NOI18N
        lblUsuario1.setText("Tipos Identificación");
        lblUsuario1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblUsuario1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblUsuario1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblUsuario1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lblUsuario1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUsuario1MouseClicked(evt);
            }
        });
        getContentPane().add(lblUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 58, 140, 110));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/casa.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(694, 0, 50, 38));

        lblEps.setBackground(new java.awt.Color(204, 204, 255));
        lblEps.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEps.setForeground(new java.awt.Color(0, 0, 204));
        lblEps.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEps.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lapiz-de-usuario.png"))); // NOI18N
        lblEps.setText("Tipos EPS");
        lblEps.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblEps.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEps.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblEps.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lblEps.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEpsMouseClicked(evt);
            }
        });
        getContentPane().add(lblEps, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 58, 140, 110));

        lblEps1.setBackground(new java.awt.Color(204, 204, 255));
        lblEps1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEps1.setForeground(new java.awt.Color(0, 0, 204));
        lblEps1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEps1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lapiz-de-usuario.png"))); // NOI18N
        lblEps1.setText("Tipos Sexo");
        lblEps1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblEps1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEps1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblEps1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lblEps1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEps1MouseClicked(evt);
            }
        });
        getContentPane().add(lblEps1, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 58, 140, 110));

        lblEps2.setBackground(new java.awt.Color(204, 204, 255));
        lblEps2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEps2.setForeground(new java.awt.Color(0, 0, 204));
        lblEps2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEps2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lapiz-de-usuario.png"))); // NOI18N
        lblEps2.setText("Tipos Rol");
        lblEps2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblEps2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEps2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblEps2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lblEps2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEps2MouseClicked(evt);
            }
        });
        getContentPane().add(lblEps2, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 58, 140, 110));

        lblDato.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblDato, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 220, 32));

        jLabel2.setBackground(new java.awt.Color(0, 0, 255));
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 750, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblEpsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEpsMouseClicked
        this.setVisible(false);
        VistaEps veps = new VistaEps();
        veps.setDato(dato);
        veps.setVisible(true);

    }//GEN-LAST:event_lblEpsMouseClicked

    private void lblUsuario1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsuario1MouseClicked
        this.setVisible(false);
        VistaTiposIdentificacion vti = new VistaTiposIdentificacion();
        vti.setDato(dato);
        vti.setVisible(true);
    }//GEN-LAST:event_lblUsuario1MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.setVisible(false);
        VistaAdministrador vad = new VistaAdministrador();
        vad.setDato(dato);
        vad.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void lblEps1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEps1MouseClicked
        this.setVisible(false);
        Vistas.VistaSexo vs = new VistaSexo();
        vs.setDato(dato);
        vs.setVisible(true);
    }//GEN-LAST:event_lblEps1MouseClicked

    private void lblEps2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEps2MouseClicked
        this.setVisible(false);
        VistaRol vr = new VistaRol();
        vr.setDato(dato);
        vr.setVisible(true);
    }//GEN-LAST:event_lblEps2MouseClicked

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
            java.util.logging.Logger.getLogger(VistaGestionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaGestionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaGestionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaGestionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaGestionUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblDato;
    private javax.swing.JLabel lblEps;
    private javax.swing.JLabel lblEps1;
    private javax.swing.JLabel lblEps2;
    private javax.swing.JLabel lblUsuario1;
    // End of variables declaration//GEN-END:variables
}
