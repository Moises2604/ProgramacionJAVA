import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class NewJFrame extends javax.swing.JFrame {
    
    JFileChooser Seleccionado = new JFileChooser();
    File Archivoc;
    Archivos OBJ_ARCHIVO = new Archivos();
    Maquina maquina = new Maquina();
        
    
    public NewJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        Texto = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextoAuxiliar = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        BtnAbrir = new javax.swing.JButton();
        BtnGuardar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        BtnEjecutar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editor Texto");

        Texto.setColumns(20);
        Texto.setRows(5);
        jScrollPane1.setViewportView(Texto);

        TextoAuxiliar.setColumns(20);
        TextoAuxiliar.setRows(5);
        jScrollPane2.setViewportView(TextoAuxiliar);

        jLabel1.setText("jLabel1");

        BtnAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/open_folder_yellow.png"))); // NOI18N
        BtnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAbrirActionPerformed(evt);
            }
        });

        BtnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        BtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gnome_edit_delete.png"))); // NOI18N
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application_exit (1).png"))); // NOI18N
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        BtnEjecutar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button_blue_play.png"))); // NOI18N
        BtnEjecutar.setToolTipText("");
        BtnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEjecutarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabel2.setText("Ejecutar analizador Lexico");

        jLabel3.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel3.setText("Analizador Lexico");

        jLabel4.setText("Lenguajes y Automatas I");

        jLabel5.setText("Moises Salvador Preciado Covarrubias");

        jLabel6.setText("15460643");

        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(BtnEjecutar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(164, 164, 164)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(BtnAbrir)
                                .addGap(18, 18, 18)
                                .addComponent(BtnGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(BtnEliminar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(164, 164, 164))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnGuardar)
                            .addComponent(BtnAbrir)
                            .addComponent(BtnEliminar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnEjecutar)
                    .addComponent(BtnSalir))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAbrirActionPerformed
        // TODO add your handling code here:
           if(Seleccionado.showDialog(null, "Abrir Archivo") == JFileChooser.APPROVE_OPTION){
            Archivoc = Seleccionado.getSelectedFile();
            if(Archivoc.canRead()){
                if(Archivoc.getName().endsWith("txt")){
                    String Contenido = OBJ_ARCHIVO.AbrirArchivo(Archivoc);
                    Texto.setText(Contenido);
                }else{
                    JOptionPane.showMessageDialog(null,"Error: Formato necesario(.txt)");
                }
            }
        }
    }//GEN-LAST:event_BtnAbrirActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        // TODO add your handling code here:
        if(Seleccionado.showDialog(null, "Guardar Texto") == JFileChooser.APPROVE_OPTION){
            Archivoc = Seleccionado.getSelectedFile();
            if(Archivoc.getName().endsWith("txt")){
                String contenido = Texto.getText();
                OBJ_ARCHIVO.GuardarArchivo(Archivoc, contenido);
            }else{
                JOptionPane.showMessageDialog(null,"Error: Formato necesario(.txt)");
            }
        }
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed

        // TODO add your handling code here:
         Texto.setText("");
        System.out.println("Eliminar Archivo");
        
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        // TODO add your handling code here:
         System.exit(0);
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEjecutarActionPerformed
        // TODO add your handling code here:
         String Codigo_Fuente = Texto.getText();
        int i = 0,p;
        ArrayList cadenas = new ArrayList();
        String aux = "";
        while(i < Codigo_Fuente.length()){
            if(Codigo_Fuente.codePointAt(i) != 13 && Codigo_Fuente.codePointAt(i) != 10 && Codigo_Fuente.codePointAt(i) != 32){
                aux = aux+Codigo_Fuente.charAt(i);
                p = i + 1;
                if(p < Codigo_Fuente.length()){
                    if(Codigo_Fuente.codePointAt(p) == 13 || Codigo_Fuente.codePointAt(p) == 10 || Codigo_Fuente.codePointAt(p) == 32){
                        cadenas.add(aux);
                        aux="";
                    }
                }else if(p == Codigo_Fuente.length()){
                    cadenas.add(aux);
                }
            }
            i++;
        }
        
        String fin = "";
        for(int j = 0; j < cadenas.size(); j++){
            while(true){
                if(maquina.MaquinaOperadorRelacional((String) cadenas.get(j))){
                    fin = fin + (String) cadenas.get(j) + "\t(OP. Relacional) "+"\n";
                    break;
                }else if(maquina.MaquinaOperadorAsignacion((String) cadenas.get(j))){
                    fin = fin + (String) cadenas.get(j) + "\t(OP. Asignacion) "+"\n";
                    break;
                }else if(maquina.MaquinaOperadorUnitario((String) cadenas.get(j))){
                    fin = fin + (String) cadenas.get(j) + "\t(OP. Unitario) "+"\n";
                    break;
                }else if(maquina.MaquinaOperadorLogico((String) cadenas.get(j))){
                    fin = fin + (String) cadenas.get(j) + "\t(OP. Logico) "+"\n";
                    break;
                }else if(maquina.MaquinaOperadorAritmetico((String) cadenas.get(j))){
                    fin = fin + (String) cadenas.get(j) + "\t(OP. Aritmetico) "+"\n";
                    break;
                }else if(maquina.MaquinaNumero((String) cadenas.get(j))){
                    fin = fin + (String) cadenas.get(j) + "\t(Numero) "+"\n";
                    break;
                }else if(maquina.MaquinaIdentificador((String) cadenas.get(j))){
                    fin = fin + (String) cadenas.get(j) + "\t(Identificador) "+"\n";
                    break;
                }else{
                    fin = fin + (String) cadenas.get(j) + "\t(ERROR LEXICO) "+"\n";
                    break;
                }
            }
    }//GEN-LAST:event_BtnEjecutarActionPerformed
            
        TextoAuxiliar.setText(fin);
    }   
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAbrir;
    private javax.swing.JButton BtnEjecutar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnSalir;
    private static javax.swing.JTextArea Texto;
    public static javax.swing.JTextArea TextoAuxiliar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
