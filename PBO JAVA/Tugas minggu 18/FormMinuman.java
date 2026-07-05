/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Praktikum29062026;

/**
 *
 * @author Abiem Mayu
 */
public class FormMinuman extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormMinuman.class.getName());

    private FormUtama kedua;
    public FormMinuman() {
        initComponents();
    }

    public FormMinuman(FormUtama kedua) {
        this.kedua = kedua;
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        ckbJeruk = new javax.swing.JCheckBox();
        ckbTeh = new javax.swing.JCheckBox();
        ckbBuah = new javax.swing.JCheckBox();
        txtJeruk = new javax.swing.JTextField();
        txtTeh = new javax.swing.JTextField();
        txtBuah = new javax.swing.JTextField();
        cbJeruk = new javax.swing.JComboBox<>();
        cbTeh = new javax.swing.JComboBox<>();
        cbBuah = new javax.swing.JComboBox<>();
        txtTotalJeruk = new javax.swing.JTextField();
        txtTotalTeh = new javax.swing.JTextField();
        txtTotalBuah = new javax.swing.JTextField();
        btnHarga = new javax.swing.JButton();
        txtTotalMinuman = new javax.swing.JTextField();
        btnKembali = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Pilihan Menu Minuman");

        ckbJeruk.setText("Jus Jeruk");
        ckbJeruk.addActionListener(this::ckbJerukActionPerformed);

        ckbTeh.setText("Teh Es");
        ckbTeh.addActionListener(this::ckbTehActionPerformed);

        ckbBuah.setText("Es Buah");
        ckbBuah.addActionListener(this::ckbBuahActionPerformed);

        txtJeruk.setText("0");
        txtJeruk.addActionListener(this::txtJerukActionPerformed);

        txtTeh.setText("0");

        txtBuah.setText("0");

        cbJeruk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jumlah", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbJeruk.addActionListener(this::cbJerukActionPerformed);

        cbTeh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jumlah", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbTeh.addActionListener(this::cbTehActionPerformed);

        cbBuah.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jumlah", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbBuah.addActionListener(this::cbBuahActionPerformed);

        txtTotalJeruk.setText("0");

        txtTotalTeh.setText("0");

        txtTotalBuah.setText("0");
        txtTotalBuah.addActionListener(this::txtTotalBuahActionPerformed);

        btnHarga.setText("Total Harga");
        btnHarga.addActionListener(this::btnHargaActionPerformed);

        txtTotalMinuman.setText("0");

        btnKembali.setText("Kembali");
        btnKembali.addActionListener(this::btnKembaliActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(198, 198, 198)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ckbJeruk, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ckbTeh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ckbBuah, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtJeruk, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                                            .addComponent(cbJeruk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtTeh, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cbTeh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtBuah, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cbBuah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(128, 128, 128)
                                        .addComponent(btnHarga)))))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTotalJeruk, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalTeh, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalBuah, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalMinuman, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(btnKembali)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckbJeruk)
                    .addComponent(txtJeruk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbJeruk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalJeruk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckbTeh)
                    .addComponent(txtTeh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTeh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalTeh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckbBuah)
                    .addComponent(txtBuah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbBuah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalBuah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHarga)
                    .addComponent(txtTotalMinuman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(btnKembali)
                .addGap(111, 111, 111))
        );

        pack();
    }// </editor-fold>                        

    private void ckbBuahActionPerformed(java.awt.event.ActionEvent evt) {                                        
        txtBuah.setText("15000");
    }                                       

    private void txtJerukActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void txtTotalBuahActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void ckbJerukActionPerformed(java.awt.event.ActionEvent evt) {                                         
       txtJeruk.setText("10000");
    }                                        

    private void ckbTehActionPerformed(java.awt.event.ActionEvent evt) {                                       
        txtTeh.setText("5000");
    }                                      

    private void cbJerukActionPerformed(java.awt.event.ActionEvent evt) {                                        
        int jumlah = (int)cbJeruk.getSelectedIndex();
        double harga = Double.parseDouble(txtJeruk.getText());
        double total = jumlah * harga;
        txtTotalJeruk.setText(Double.toString(total));
    }                                       

    private void cbTehActionPerformed(java.awt.event.ActionEvent evt) {                                      
       int jumlah = (int)cbTeh.getSelectedIndex();
        double harga = Double.parseDouble(txtTeh.getText());
        double total = jumlah * harga;
        txtTotalTeh.setText(Double.toString(total));
    }                                     

    private void cbBuahActionPerformed(java.awt.event.ActionEvent evt) {                                       
       int jumlah = (int)cbBuah.getSelectedIndex();
        double harga = Double.parseDouble(txtBuah.getText());
        double total = jumlah * harga;
        txtTotalBuah.setText(Double.toString(total));
    }                                      

    private void btnHargaActionPerformed(java.awt.event.ActionEvent evt) {                                         
        double a = Double.parseDouble(txtTotalJeruk.getText());
        double b = Double.parseDouble(txtTotalTeh.getText());
        double c = Double.parseDouble(txtTotalBuah.getText());
        double total = a+b+c;
        txtTotalMinuman.setText(Double.toString(total));
    }                                        

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {                                           
        String total = txtTotalMinuman.getText();
        kedua.setTotalMakanan(total);
        this.dispose();
    }                                          

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FormMinuman().setVisible(true));
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnHarga;
    private javax.swing.JButton btnKembali;
    private javax.swing.JComboBox<String> cbBuah;
    private javax.swing.JComboBox<String> cbJeruk;
    private javax.swing.JComboBox<String> cbTeh;
    private javax.swing.JCheckBox ckbBuah;
    private javax.swing.JCheckBox ckbJeruk;
    private javax.swing.JCheckBox ckbTeh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBuah;
    private javax.swing.JTextField txtJeruk;
    private javax.swing.JTextField txtTeh;
    private javax.swing.JTextField txtTotalBuah;
    private javax.swing.JTextField txtTotalJeruk;
    private javax.swing.JTextField txtTotalMinuman;
    private javax.swing.JTextField txtTotalTeh;
    // End of variables declaration                   
}
