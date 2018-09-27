package UI;

import Datos.Elemento;
import Logica.BotonTablaPeriodica;
import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import tablaperiodica.main;

/**
 * @author Carlos Andres Montero
 * @author Justin Bogantes Rodriguez
 * @author Manuel Alejandro Arias Medina
 * @version 18/09/2018
 */
public class frmTablaPeriodica extends javax.swing.JFrame {
    //---------- Variables de la clase frmTablaPeriodica----------//

    /*Matatices que contienen los botones para la funcionalidad 
    *de la tabla Periodica
    *es [alto][ancho]
     */
    private BotonTablaPeriodica[][] MatrizBotones1 = new BotonTablaPeriodica[7][18];
    private BotonTablaPeriodica[][] MatrizBotones2 = new BotonTablaPeriodica[2][15];

    /*Matatices que contienen las etiquetas(JLabel) para la funcionalidad 
    *de Temperatura/Familia
    *es [alto][ancho]
     */
    private JLabel[][] MatrizEtiquetas1 = new JLabel[7][18];
    private JLabel[][] MatrizEtiquetas2 = new JLabel[2][15];

    /**
     * Contructor default de frmTablaPeriodica
     */
    public frmTablaPeriodica() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jpTablaPeriodica = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelMatriz1 = new javax.swing.JPanel();
        lblMatriz1 = new javax.swing.JLabel();
        jPanelMatriz2 = new javax.swing.JPanel();
        lblMatriz2 = new javax.swing.JLabel();
        jPanelInfo = new javax.swing.JPanel();
        lblElemento = new javax.swing.JLabel();
        lblNumeroAtomico = new javax.swing.JLabel();
        lblSimboloAtomico = new javax.swing.JLabel();
        lblPesoAtomico = new javax.swing.JLabel();
        lblCantIsotopos = new javax.swing.JLabel();
        lblNombreAtomico = new javax.swing.JLabel();
        lblFamiliaAtomica = new javax.swing.JLabel();
        lblTemperaturaMaxSolido = new javax.swing.JLabel();
        lblTemperaturaMaxLiquido = new javax.swing.JLabel();
        lblFondoMostrar = new javax.swing.JLabel();
        jpEstado = new javax.swing.JPanel();
        jpEstados1 = new javax.swing.JPanel();
        jpEstado2 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnTemperatura = new javax.swing.JButton();
        jSliderTemperatura = new javax.swing.JSlider();
        lblTempActual = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblFondoTemperatura = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbFamilias = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        taCaracteristicas = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tabla Periodica");

        jPanelMatriz1.setBackground(new java.awt.Color(255, 255, 255));

        lblMatriz1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/Fondos/M1.png"))); // NOI18N

        javax.swing.GroupLayout jPanelMatriz1Layout = new javax.swing.GroupLayout(jPanelMatriz1);
        jPanelMatriz1.setLayout(jPanelMatriz1Layout);
        jPanelMatriz1Layout.setHorizontalGroup(
            jPanelMatriz1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMatriz1Layout.createSequentialGroup()
                .addComponent(lblMatriz1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelMatriz1Layout.setVerticalGroup(
            jPanelMatriz1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMatriz1)
        );

        jPanelMatriz2.setBackground(new java.awt.Color(255, 255, 255));

        lblMatriz2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/Fondos/M2.png"))); // NOI18N

        javax.swing.GroupLayout jPanelMatriz2Layout = new javax.swing.GroupLayout(jPanelMatriz2);
        jPanelMatriz2.setLayout(jPanelMatriz2Layout);
        jPanelMatriz2Layout.setHorizontalGroup(
            jPanelMatriz2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMatriz2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblMatriz2, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelMatriz2Layout.setVerticalGroup(
            jPanelMatriz2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMatriz2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblMatriz2))
        );

        jPanelInfo.setBackground(new java.awt.Color(0, 102, 255));
        jPanelInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblElemento.setFont(new java.awt.Font("DejaVu Sans Mono", 2, 24)); // NOI18N
        lblElemento.setForeground(new java.awt.Color(254, 254, 254));
        lblElemento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblElemento.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelInfo.add(lblElemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 33, 80, 80));

        lblNumeroAtomico.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        lblNumeroAtomico.setForeground(new java.awt.Color(254, 254, 254));
        lblNumeroAtomico.setText("Numero Atomico:");
        jPanelInfo.add(lblNumeroAtomico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 228, -1));

        lblSimboloAtomico.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        lblSimboloAtomico.setForeground(new java.awt.Color(254, 254, 254));
        lblSimboloAtomico.setText("Simbolo Atomico:");
        jPanelInfo.add(lblSimboloAtomico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 228, -1));

        lblPesoAtomico.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        lblPesoAtomico.setForeground(new java.awt.Color(254, 254, 254));
        lblPesoAtomico.setText("Peso Atomico:");
        jPanelInfo.add(lblPesoAtomico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 228, -1));

        lblCantIsotopos.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        lblCantIsotopos.setForeground(new java.awt.Color(254, 254, 254));
        lblCantIsotopos.setText("Cantidad de Isotopos:");
        jPanelInfo.add(lblCantIsotopos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 228, -1));

        lblNombreAtomico.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        lblNombreAtomico.setForeground(new java.awt.Color(254, 254, 254));
        lblNombreAtomico.setText("Nombre:");
        jPanelInfo.add(lblNombreAtomico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 228, -1));

        lblFamiliaAtomica.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        lblFamiliaAtomica.setForeground(new java.awt.Color(254, 254, 254));
        lblFamiliaAtomica.setText("Familia:");
        jPanelInfo.add(lblFamiliaAtomica, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 228, -1));

        lblTemperaturaMaxSolido.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        lblTemperaturaMaxSolido.setForeground(new java.awt.Color(254, 254, 254));
        lblTemperaturaMaxSolido.setText("Temp. Max. Solido:");
        jPanelInfo.add(lblTemperaturaMaxSolido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 228, -1));

        lblTemperaturaMaxLiquido.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        lblTemperaturaMaxLiquido.setForeground(new java.awt.Color(254, 254, 254));
        lblTemperaturaMaxLiquido.setText("Temp. Max. Liquido:");
        jPanelInfo.add(lblTemperaturaMaxLiquido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 228, -1));
        jPanelInfo.add(lblFondoMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 630));

        javax.swing.GroupLayout jpTablaPeriodicaLayout = new javax.swing.GroupLayout(jpTablaPeriodica);
        jpTablaPeriodica.setLayout(jpTablaPeriodicaLayout);
        jpTablaPeriodicaLayout.setHorizontalGroup(
            jpTablaPeriodicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTablaPeriodicaLayout.createSequentialGroup()
                .addGroup(jpTablaPeriodicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpTablaPeriodicaLayout.createSequentialGroup()
                        .addGroup(jpTablaPeriodicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanelMatriz2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelMatriz1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
        );
        jpTablaPeriodicaLayout.setVerticalGroup(
            jpTablaPeriodicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTablaPeriodicaLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelMatriz1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelMatriz2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169))
            .addGroup(jpTablaPeriodicaLayout.createSequentialGroup()
                .addComponent(jPanelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tabla Periodica", jpTablaPeriodica);

        jpEstados1.setBackground(new java.awt.Color(254, 254, 254));

        javax.swing.GroupLayout jpEstados1Layout = new javax.swing.GroupLayout(jpEstados1);
        jpEstados1.setLayout(jpEstados1Layout);
        jpEstados1Layout.setHorizontalGroup(
            jpEstados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jpEstados1Layout.setVerticalGroup(
            jpEstados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        jpEstado2.setBackground(new java.awt.Color(254, 254, 254));

        javax.swing.GroupLayout jpEstado2Layout = new javax.swing.GroupLayout(jpEstado2);
        jpEstado2.setLayout(jpEstado2Layout);
        jpEstado2Layout.setHorizontalGroup(
            jpEstado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        jpEstado2Layout.setVerticalGroup(
            jpEstado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTabbedPane2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane2StateChanged(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTemperatura.setText("Provar Temperatura");
        btnTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTemperaturaActionPerformed(evt);
            }
        });
        jPanel1.add(btnTemperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 180, -1));

        jSliderTemperatura.setValue(288);
        jSliderTemperatura.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderTemperaturaStateChanged(evt);
            }
        });
        jPanel1.add(jSliderTemperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 281, 210, 30));

        lblTempActual.setText("Temperatura Actual");
        jPanel1.add(lblTempActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Solido");
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 80, 20));

        jLabel4.setBackground(new java.awt.Color(2, 217, 215));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Liquido");
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 80, -1));

        jLabel5.setBackground(new java.awt.Color(28, 253, 14));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Gas");
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 80, 20));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Desconocido");
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 80, 20));
        jPanel1.add(lblFondoTemperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 470));

        jTabbedPane2.addTab("Temperatura", jPanel1);

        jPanel2.setBackground(new java.awt.Color(254, 238, 238));

        jLabel2.setText("Familia:");

        cbFamilias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbFamilias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFamiliasActionPerformed(evt);
            }
        });

        taCaracteristicas.setEditable(false);
        taCaracteristicas.setColumns(20);
        taCaracteristicas.setRows(5);
        jScrollPane1.setViewportView(taCaracteristicas);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(132, 132, 132))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbFamilias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(27, 27, 27))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbFamilias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Familia", jPanel2);

        javax.swing.GroupLayout jpEstadoLayout = new javax.swing.GroupLayout(jpEstado);
        jpEstado.setLayout(jpEstadoLayout);
        jpEstadoLayout.setHorizontalGroup(
            jpEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEstadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpEstados1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpEstado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpEstadoLayout.setVerticalGroup(
            jpEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEstadoLayout.createSequentialGroup()
                .addGroup(jpEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpEstadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpEstadoLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jpEstados1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jpEstado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Temperatura/Familia", jpEstado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * este boton llama al metodo que colorea etiquetas
     *
     * @param evt: ActionEvent
     */
    private void btnTemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTemperaturaActionPerformed
        colorearEtiquetas(jSliderTemperatura.getValue());

    }//GEN-LAST:event_btnTemperaturaActionPerformed

    /**
     * Este metodo Actualisa el lblTempActual con la temperatura actual del
     * Slider
     *
     * @param evt: ActionEvent
     */
    private void jSliderTemperaturaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderTemperaturaStateChanged
        lblTempActual.setText("Temperatura Actual: " + jSliderTemperatura.getValue());
    }//GEN-LAST:event_jSliderTemperaturaStateChanged

    private void jTabbedPane2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane2StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane2StateChanged

    private void cbFamiliasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFamiliasActionPerformed
        colorearEtiquetasFamilia(cbFamilias.getItemAt(cbFamilias.getSelectedIndex()));
        taCaracteristicas.setText(main.miControlador.getMiTabla().
                MostrarInfoFamilia(cbFamilias.getItemAt(cbFamilias.getSelectedIndex())));
    }//GEN-LAST:event_cbFamiliasActionPerformed

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
            java.util.logging.Logger.getLogger(frmTablaPeriodica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTablaPeriodica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTablaPeriodica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTablaPeriodica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTablaPeriodica().setVisible(true);
            }
        });
    }

    /**
     * Metodo que genera y acomoda los botones que se utilisaran en la tabla
     * periodica ademas que genera las eiquetas llamando al metodo
     * AgregarEtiqueta(int i, int j, int cont, int Matriz)
     */
    public void GeneradorDeBotones() {

        int anchoYAlto = 50;
        int numeroBoton = 1;
        boolean agregarBoton = true;

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 18; j++) {
                if (i == 0) {
                    if (j > 0 && j < 17) {

                        MatrizBotones1[i][j] = null;
                        agregarBoton = false;
                    }
                }
                if (i == 1 || i == 2) {
                    if (j > 1 && j < 12) {
                        MatrizBotones1[i][j] = null;
                        agregarBoton = false;
                    }
                }
                if (i == 5 || i == 6) {
                    if (j == 2) {
                        MatrizBotones1[i][j] = null;
                        int y = 0;
                        if (i == 6) {
                            y = 1;
                        }
                        for (int x = 0; x < 15; x++) {
                            agregarBoton = false;
                            MatrizBotones2[y][x]
                                    = new BotonTablaPeriodica(anchoYAlto * x,
                                            anchoYAlto * y, anchoYAlto, anchoYAlto,
                                            numeroBoton);
                            jPanelMatriz2.add(MatrizBotones2[y][x]);
                            AgregarEtiqueta(y, x, numeroBoton, 2);
                            numeroBoton++;
                        }
                    }
                }
                if (agregarBoton) {

                    MatrizBotones1[i][j] = new BotonTablaPeriodica(anchoYAlto * j,
                            anchoYAlto * i, anchoYAlto, anchoYAlto, numeroBoton);
                    jPanelMatriz1.add(MatrizBotones1[i][j]);
                    AgregarEtiqueta(i, j, numeroBoton, 1);
                    numeroBoton++;

                }
                agregarBoton = true;
                //MatrizBotones1

            }
        }

    }

    /**
     * Este metodo es llamado desde GeneradorDeBotones() con el cual en un par
     * de matrices crea y pociciona las etiquetas(JLabel) en Temperatura/Famila
     * conla forma de una tabla periodica
     *
     * @param i: int
     * @param j: int
     * @param cont: int
     * @param Matriz: int
     */
    public void AgregarEtiqueta(int i, int j, int cont, int Matriz) {

        int anchoYAlto = 50;
        if (Matriz == 1) {
            MatrizEtiquetas1[i][j] = new JLabel(main.miControlador.getMiTabla().
                    MostrarElemento(cont).getSimboloAtomico());
            MatrizEtiquetas1[i][j].setBounds(anchoYAlto * j, anchoYAlto * i, anchoYAlto, anchoYAlto);
            MatrizEtiquetas1[i][j].setBorder(javax.swing.BorderFactory.createEtchedBorder());
            MatrizEtiquetas1[i][j].setBackground(Color.gray);
            MatrizEtiquetas1[i][j].setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            MatrizEtiquetas1[i][j].setOpaque(true);

            jpEstados1.add(MatrizEtiquetas1[i][j]);

            //BotonTablaPeriodica(anchoYAlto * j,
            //anchoYAlto * i, anchoYAlto, anchoYAlto, numeroBoton);
        } else {
            MatrizEtiquetas2[i][j] = new JLabel(main.miControlador.getMiTabla().
                    MostrarElemento(cont).getSimboloAtomico());
            MatrizEtiquetas2[i][j].setBounds(anchoYAlto * j, anchoYAlto * i, anchoYAlto, anchoYAlto);
            MatrizEtiquetas2[i][j].setBorder(javax.swing.BorderFactory.createEtchedBorder());
            MatrizEtiquetas2[i][j].setBackground(Color.GRAY);
            MatrizEtiquetas2[i][j].setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            MatrizEtiquetas2[i][j].setOpaque(true);

            jpEstado2.add(MatrizEtiquetas2[i][j]);

        }

    }

    /**
     * Este metoco Carga Imagenes de fondo Taambien establece valores
     * predeterminados a jSliderTemperatura y cbFamilias y Genera los Botones y
     * etiquetas con la forma de la table Periodica
     *
     */
    public void Cargador() {
        /*LLama el meto que genera Botones y etiquetas*/
        GeneradorDeBotones();

        /*Crea iconos y los coloca como fondos a etiquetas*/
        ImageIcon imagen = new ImageIcon("src/Multimedia/Fondos/fondoMenu2.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lblFondoMostrar.getWidth(),
                lblFondoMostrar.getHeight(), Image.SCALE_DEFAULT));
        lblFondoMostrar.setIcon(icono);

        ImageIcon imagen2 = new ImageIcon("src/Multimedia/Fondos/fondoMenu2.jpeg");
        Icon icono2 = new ImageIcon(imagen2.getImage().getScaledInstance(lblFondoTemperatura.getWidth(),
                lblFondoTemperatura.getHeight(), Image.SCALE_DEFAULT));
        lblFondoTemperatura.setIcon(icono2);

        /*Establese el vaor minio y maximo junto con el cual aparecera el 
          jSlider*/
        jSliderTemperatura.setMinimum(0);
        jSliderTemperatura.setMaximum(6000);
        jSliderTemperatura.setValue(300);

        /*Limpia y establese los valores con el cual aparecera el Combo Box*/
        cbFamilias.removeAllItems();
        cbFamilias.addItem("Ninguno");
        cbFamilias.addItem("No metales");
        cbFamilias.addItem("Gases Nobles");
        cbFamilias.addItem("Alcalinos");
        cbFamilias.addItem("Alcalinoterreos");
        cbFamilias.addItem("Metaloides");
        cbFamilias.addItem("Metales");
        cbFamilias.addItem("Metales de transicion");
        cbFamilias.addItem("Lantanidos");
        cbFamilias.addItem("Actinidos");
        cbFamilias.addItem("Desconocida");
    }

    /**
     * Este metodo recibe un elemento y los despliega en el frmTablaPeriodica
     *
     * @param Entrada: Elemento
     */
    public void MostrarElemento(Elemento Entrada) {

        /*carga en varias etiquetas la Informacion del elemento que recibio*/
        lblElemento.setText(Entrada.getSimboloAtomico());
        lblNumeroAtomico.setText("Numero Atomico: " + Entrada.getNumeroAtomico());
        lblSimboloAtomico.setText("Simbolo Atomico: " + Entrada.getSimboloAtomico());
        lblNombreAtomico.setText("Nombre Atomico: " + Entrada.getNombre());
        lblPesoAtomico.setText("Peso Atomico: " + Entrada.getPesoAtomico());
        lblFamiliaAtomica.setText("Familia: " + Entrada.getFamilia());
        lblTemperaturaMaxSolido.setText("Temp. Max. Solido: " + Entrada.getTemperaturaMaxSolido());
        lblTemperaturaMaxLiquido.setText("Temp. Max. Liquido: " + Entrada.getTemperaturaMaxLiquido());
        lblCantIsotopos.setText("Cant. Isotopos: " + Entrada.getCantidadIsotopos());
    }

    /**
     * Este metofo recibe un double temperatura balida si esta en una casilla
     * una etiqueta y si es una casilla balida colorea la etiqueta con el metodo
     * SeleccionadorColor(int cont, double temperatura)
     *
     * @param temperatura: double
     */
    public void colorearEtiquetas(double temperatura) {
        /*crea un contador ocn el cual sabra con cual etiqueta esta*/
        int numeroEtiqueta = 1;
        boolean colorear = true;

        /*doble for con el cual se recorrera la primera matriz de etiquetas*/
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 18; j++) {
                if (i == 0) {
                    if (j > 0 && j < 17) {
                        colorear = false;
                    }
                }
                if (i == 1 || i == 2) {
                    if (j > 1 && j < 12) {
                        colorear = false;
                    }
                }
                if (i == 5 || i == 6) {
                    if (j == 2) {

                        int y = 0;
                        if (i == 6) {
                            y = 1;
                        }
                        /*tercer for con el cual se recorrea la segunda matriz 
                        de etiquetas*/
                        for (int x = 0; x < 15; x++) {
                            colorear = false;
                            MatrizEtiquetas2[y][x].setBackground(
                                    SeleccionadorColor(numeroEtiqueta,
                                            temperatura));
                            numeroEtiqueta++;
                        }
                    }
                }
                if (colorear) {
                    MatrizEtiquetas1[i][j].setBackground(
                            SeleccionadorColor(numeroEtiqueta,
                                    temperatura));
                    numeroEtiqueta++;

                }
                /*reinicia la variable colorear para la siquiente iteracion*/
                colorear = true;
            }
        }

    }

    /**
     * Este metodo se encargara de buscar en ta tabla periodica desde
     * miControlador y segun la temperatura recibida devolvera un color con
     * recpecto al estado en el que se encuentra el elemento
     *
     * @param cont:int
     * @param temperatura: double
     * @return Color
     */
    public Color SeleccionadorColor(int cont, double temperatura) {

        /*llamada al controlador con el cual buscara el elemento y seguido 
        buscara el estado en el que se encuentra */
        Elemento temp = main.miControlador.getMiTabla().MostrarElemento(cont);
        String estado = temp.EstadoPorTemperatura(temperatura);
        switch (estado) {

            case "Solido":
                return Color.RED;

            case "Liquido":
                return Color.CYAN;

            case "Gas":
                return Color.GREEN;

            default:
                return Color.LIGHT_GRAY;
        }

    }

    /**
     * Este metodo Se encargara de buscar la etiquetas que contengan un ID que
     * conincida con los elemento que pertenescan a una familia determinada
     * pormedio de llamar al metodo SeleccionadorColorFamilia(int cont, String
     * Familia)
     *
     * @param Famila: String
     */
    public void colorearEtiquetasFamilia(String Famila) {

        /*crea un contador ocn el cual sabra con cual etiqueta esta*/
        int numeroEtiqueta = 1;
        boolean agregarColor = true;

        /*doble for con el cual se recorrera la primera matriz de etiquetas*/
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 18; j++) {
                if (i == 0) {
                    if (j > 0 && j < 17) {
                        agregarColor = false;
                    }
                }
                if (i == 1 || i == 2) {
                    if (j > 1 && j < 12) {
                        agregarColor = false;
                    }
                }
                if (i == 5 || i == 6) {
                    if (j == 2) {

                        int y = 0;
                        if (i == 6) {
                            y = 1;
                        }
                        /*tercer for con el cual se recorrea la segunda matriz 
                        de etiquetas*/
                        for (int x = 0; x < 15; x++) {
                            agregarColor = false;
                            MatrizEtiquetas2[y][x].setBackground(SeleccionadorColorFamilia(numeroEtiqueta, Famila));
                            numeroEtiqueta++;
                        }
                    }
                }
                if (agregarColor) {
                    MatrizEtiquetas1[i][j].setBackground(SeleccionadorColorFamilia(numeroEtiqueta, Famila));
                    numeroEtiqueta++;

                }
                /*reinicia la variable colorear para la siquiente iteracion*/
                agregarColor = true;
            }
        }

    }

    /**
     * Este metodo se encarga de buscar en ta tabla periodica desde
     * miControlador y si es la familia buscada retornara el color verde para
     * colorear la etiqueta de lo contrrio retornara el color gris
     *
     * @param cont: int
     * @param eFamilia: String
     * @return Color
     */
    public Color SeleccionadorColorFamilia(int cont, String eFamilia) {
        /*crea una variable elemento pata buscar con el elemento que coresponda
        dentra de la tabla periodica y luego consigue la familia a la que
        pertenece*/
        Elemento temp = main.miControlador.getMiTabla().MostrarElemento(cont);
        String miFamilia = temp.getFamilia();
        /*Valida si el elemento es de la misma familia que se desea colorear*/
        if (miFamilia.equals(eFamilia)) {
            return Color.GREEN;
        } else {
            return Color.GRAY;
        }

    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTemperatura;
    private javax.swing.JComboBox<String> cbFamilias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelInfo;
    private javax.swing.JPanel jPanelMatriz1;
    private javax.swing.JPanel jPanelMatriz2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSliderTemperatura;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JPanel jpEstado;
    private javax.swing.JPanel jpEstado2;
    private javax.swing.JPanel jpEstados1;
    private javax.swing.JPanel jpTablaPeriodica;
    private javax.swing.JLabel lblCantIsotopos;
    private javax.swing.JLabel lblElemento;
    private javax.swing.JLabel lblFamiliaAtomica;
    private javax.swing.JLabel lblFondoMostrar;
    private javax.swing.JLabel lblFondoTemperatura;
    private javax.swing.JLabel lblMatriz1;
    private javax.swing.JLabel lblMatriz2;
    private javax.swing.JLabel lblNombreAtomico;
    private javax.swing.JLabel lblNumeroAtomico;
    private javax.swing.JLabel lblPesoAtomico;
    private javax.swing.JLabel lblSimboloAtomico;
    private javax.swing.JLabel lblTempActual;
    private javax.swing.JLabel lblTemperaturaMaxLiquido;
    private javax.swing.JLabel lblTemperaturaMaxSolido;
    private javax.swing.JTextArea taCaracteristicas;
    // End of variables declaration//GEN-END:variables
}
