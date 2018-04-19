
package jFram;
import Code.ConnectDB;

public class indexx extends javax.swing.JFrame {
   
    public indexx() {
        initComponents();
        ConnectDB.connectDB();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frame_sum = new javax.swing.JPanel();
        Logn_in = new javax.swing.JPanel();
        forgot = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPasswordField1 = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        tap_up = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Sign_up = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Show_icon_name = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        frame_sum.setBackground(new java.awt.Color(204, 204, 204));
        frame_sum.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logn_in.setBackground(new java.awt.Color(255, 88, 165));
        Logn_in.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        forgot.setBackground(new java.awt.Color(204, 255, 255));
        forgot.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        forgot.setForeground(new java.awt.Color(204, 204, 204));
        forgot.setText("Forgot password");
        Logn_in.add(forgot, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, 170, 20));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("password");
        Logn_in.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 147, 31));

        jButton1.setBackground(new java.awt.Color(255, 88, 165));
        jButton1.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Sign in");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Logn_in.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 610, 316, 52));

        jTextField1.setBackground(new java.awt.Color(255, 88, 165));
        jTextField1.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);
        jTextField1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField1CaretUpdate(evt);
            }
        });
        Logn_in.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 316, 40));
        Logn_in.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 312, 320, 0));

        jPasswordField1.setBackground(new java.awt.Color(255, 88, 165));
        jPasswordField1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setBorder(null);
        Logn_in.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 316, 38));

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        Logn_in.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 316, 20));

        jSeparator3.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setAlignmentX(2.0F);
        jSeparator3.setAlignmentY(2.0F);
        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        Logn_in.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 468, 316, -1));
        Logn_in.add(tap_up, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 30));

        jLabel3.setBackground(new java.awt.Color(204, 255, 255));
        jLabel3.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("username");
        Logn_in.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 147, 38));

        frame_sum.add(Logn_in, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 850));

        Sign_up.setBackground(new java.awt.Color(255, 88, 165));

        jLabel4.setBackground(new java.awt.Color(204, 255, 255));
        jLabel4.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 17)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("username");

        javax.swing.GroupLayout Sign_upLayout = new javax.swing.GroupLayout(Sign_up);
        Sign_up.setLayout(Sign_upLayout);
        Sign_upLayout.setHorizontalGroup(
            Sign_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Sign_upLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel4)
                .addContainerGap(404, Short.MAX_VALUE))
        );
        Sign_upLayout.setVerticalGroup(
            Sign_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Sign_upLayout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jLabel4)
                .addContainerGap(651, Short.MAX_VALUE))
        );

        frame_sum.add(Sign_up, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 850));

        Show_icon_name.setBackground(new java.awt.Color(255, 255, 255));
        Show_icon_name.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Show_icon_nameLayout = new javax.swing.GroupLayout(Show_icon_name);
        Show_icon_name.setLayout(Show_icon_nameLayout);
        Show_icon_nameLayout.setHorizontalGroup(
            Show_icon_nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Show_icon_nameLayout.createSequentialGroup()
                .addGap(0, 536, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Show_icon_nameLayout.setVerticalGroup(
            Show_icon_nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Show_icon_nameLayout.createSequentialGroup()
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 812, Short.MAX_VALUE))
        );

        frame_sum.add(Show_icon_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 570, 850));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(frame_sum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(frame_sum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 851, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField1CaretUpdate
      
    }//GEN-LAST:event_jTextField1CaretUpdate

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new indexx().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Logn_in;
    private javax.swing.JPanel Show_icon_name;
    private javax.swing.JPanel Sign_up;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel forgot;
    private javax.swing.JPanel frame_sum;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel tap_up;
    // End of variables declaration//GEN-END:variables
}
