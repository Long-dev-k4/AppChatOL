package appchatol_damhailong_th27.pkg30;

import javax.swing.JOptionPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.PlainDocument;


public class Login extends javax.swing.JFrame {

    
    public Login() {
        initComponents();
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_SignIn = new javax.swing.JButton();
        btn_Exit = new javax.swing.JButton();
        jtxt_User = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jcb_ShowPass = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jpwf_Pass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 25)); // NOI18N
        jLabel1.setText("LOGIN");

        btn_SignIn.setBackground(new java.awt.Color(51, 255, 255));
        btn_SignIn.setFont(new java.awt.Font("Segoe UI Black", 2, 16)); // NOI18N
        btn_SignIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/home-4-24.png"))); // NOI18N
        btn_SignIn.setText("SIGN IN");
        btn_SignIn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_SignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SignInActionPerformed(evt);
            }
        });

        btn_Exit.setFont(new java.awt.Font("Segoe UI Black", 2, 16)); // NOI18N
        btn_Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/door-8-24.png"))); // NOI18N
        btn_Exit.setText("EXIT");
        btn_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExitActionPerformed(evt);
            }
        });

        jtxt_User.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/manager-24.png"))); // NOI18N
        jLabel2.setText("Username");

        jcb_ShowPass.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jcb_ShowPass.setText("Show Password");
        jcb_ShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_ShowPassActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/868320_people_128x128.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/lock-24.png"))); // NOI18N
        jLabel5.setText("Password");

        jpwf_Pass.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(btn_SignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(btn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpwf_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_User, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jcb_ShowPass, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(229, 229, 229))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_User, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jpwf_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jcb_ShowPass, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_SignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SignInActionPerformed
        try {
            // Thực hiện các thao tác không liên quan đến kết nối SQL
            String taiKhoan = "lol";
            String matKhau = "123abc";

            // Giới hạn số kí tự nhập vào cho trường người dùng
            int maxLength = 10; // Số kí tự tối đa cho phép
            PlainDocument doc = (PlainDocument) jtxt_User.getDocument();
            doc.setDocumentFilter(new DocumentFilter() {
                @Override
                public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
                        throws BadLocationException {
                    int currentLength = fb.getDocument().getLength();
                    int insertLength = text.length();
                    if (currentLength - length + insertLength <= maxLength) {
                        super.replace(fb, offset, length, text, attrs);
                    } else {
                        JOptionPane.showMessageDialog(null, "Số kí tự vượt quá giới hạn cho phép (" + maxLength + ").");
                    }
                }
            });

            // Giới hạn số kí tự nhập vào cho trường mật khẩu
            int maxLengthPass = 15; // Số kí tự tối đa cho phép cho trường mật khẩu
            PlainDocument docPass = (PlainDocument) jpwf_Pass.getDocument();
            docPass.setDocumentFilter(new DocumentFilter() {
                @Override
                public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
                        throws BadLocationException {
                    int currentLength = fb.getDocument().getLength();
                    int insertLength = text.length();
                    if (currentLength - length + insertLength <= maxLengthPass) {
                        super.replace(fb, offset, length, text, attrs);
                    } else {
                        JOptionPane.showMessageDialog(null, "Số kí tự vượt quá giới hạn cho phép (" + maxLengthPass + ").");
                    }
                }
            });

            // Kiểm tra tài khoản và mật khẩu
            if (jtxt_User.getText().equals(taiKhoan) && jpwf_Pass.getText().equals(matKhau)) {
                JOptionPane.showMessageDialog(null, "Đăng nhập thành công !");
                Server srv = new Server();
                srv.show();
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Đăng nhập thất bại !");
                jtxt_User.setText("");
                jpwf_Pass.setText("");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_SignInActionPerformed

    private void btn_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExitActionPerformed
        dispose();
    }//GEN-LAST:event_btn_ExitActionPerformed

    private void jcb_ShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_ShowPassActionPerformed
        if (jcb_ShowPass.isSelected()) {
            jpwf_Pass.setEchoChar((char)0);
        }
        else {
            jpwf_Pass.setEchoChar('*');
        }
    }//GEN-LAST:event_jcb_ShowPassActionPerformed

    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Exit;
    private javax.swing.JButton btn_SignIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JCheckBox jcb_ShowPass;
    private javax.swing.JPasswordField jpwf_Pass;
    private javax.swing.JTextField jtxt_User;
    // End of variables declaration//GEN-END:variables

    
}
