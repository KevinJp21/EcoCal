/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

/**
 *
 * @author pinku
 */
public class Inicio extends javax.swing.JPanel {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPInicio = new javax.swing.JPanel();
        IMGInicio = new javax.swing.JLabel();
        TXTInicio = new javax.swing.JLabel();
        TXTInicio1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(2, 0, 8));

        JPInicio.setBackground(new java.awt.Color(2, 0, 8));
        JPInicio.setOpaque(false);

        IMGInicio.setBackground(new java.awt.Color(152, 76, 41));
        IMGInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/huella-de-carbono.png"))); // NOI18N

        TXTInicio.setBackground(new java.awt.Color(5, 0, 19));
        TXTInicio.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        TXTInicio.setForeground(new java.awt.Color(204, 204, 204));
        TXTInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TXTInicio.setText("ECOCAL");

        TXTInicio1.setBackground(new java.awt.Color(5, 0, 19));
        TXTInicio1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        TXTInicio1.setForeground(new java.awt.Color(204, 204, 204));
        TXTInicio1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TXTInicio1.setText(" Diseñado para cuidar nuestro planeta");

        javax.swing.GroupLayout JPInicioLayout = new javax.swing.GroupLayout(JPInicio);
        JPInicio.setLayout(JPInicioLayout);
        JPInicioLayout.setHorizontalGroup(
            JPInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPInicioLayout.createSequentialGroup()
                .addGap(0, 149, Short.MAX_VALUE)
                .addComponent(TXTInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
            .addGroup(JPInicioLayout.createSequentialGroup()
                .addGroup(JPInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPInicioLayout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(TXTInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPInicioLayout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(IMGInicio)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPInicioLayout.setVerticalGroup(
            JPInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPInicioLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(IMGInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TXTInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TXTInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(245, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        JPInicio.getAccessibleContext().setAccessibleName("PanelInicio");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IMGInicio;
    private javax.swing.JPanel JPInicio;
    private javax.swing.JLabel TXTInicio;
    private javax.swing.JLabel TXTInicio1;
    // End of variables declaration//GEN-END:variables
}