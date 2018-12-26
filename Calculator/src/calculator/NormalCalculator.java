package calculator;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class NormalCalculator extends javax.swing.JFrame {

    String operation = "";
    String firstValue = "";
    String secondValue = "";

    public NormalCalculator() {
        initComponents();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (;;) {
                    Calendar c = new GregorianCalendar();
                    int hours = c.get(Calendar.HOUR);
                    int minute = c.get(Calendar.MINUTE);
                    int second = c.get(Calendar.SECOND);
                    digitalWatch.setText(hours + ":" + minute + ":" + second);
                }
            }
        }).start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        MainTextField = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnPoint = new javax.swing.JButton();
        btnEqual = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnMult = new javax.swing.JButton();
        btnSub = new javax.swing.JButton();
        Title = new javax.swing.JLabel();
        digitalWatch = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setBackground(new java.awt.Color(204, 255, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(500, 250));
        setResizable(false);

        MainTextField.setFont(new java.awt.Font("Monaco", 0, 18)); // NOI18N
        MainTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        MainTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainTextFieldActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnDiv.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        btnDiv.setText("/");
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 102, 102));
        btnDelete.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn0.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnPoint.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        btnPoint.setText(".");
        btnPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPointActionPerformed(evt);
            }
        });

        btnEqual.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        btnEqual.setText("=");
        btnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        btnAdd.setText("+");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnMult.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        btnMult.setText("*");
        btnMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultActionPerformed(evt);
            }
        });

        btnSub.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        btnSub.setText("-");
        btnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubActionPerformed(evt);
            }
        });

        Title.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        Title.setText("Mini Calulator");

        digitalWatch.setBackground(new java.awt.Color(153, 255, 153));
        digitalWatch.setText("HH:MM:SS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnMult))
                            .addComponent(Title)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDiv))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn0)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPoint)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnEqual))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn8)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAdd)
                                    .addComponent(btnSub)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(MainTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(digitalWatch)
                        .addGap(8, 8, 8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MainTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(digitalWatch)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnDiv)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn2)
                    .addComponent(btn3)
                    .addComponent(btn1)
                    .addComponent(btn4)
                    .addComponent(btnMult))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSub)
                    .addComponent(btn5)
                    .addComponent(btn6)
                    .addComponent(btn7)
                    .addComponent(btn8))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btn9)
                    .addComponent(btnPoint)
                    .addComponent(btnEqual)
                    .addComponent(btn0))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        String str = MainTextField.getText() + btn4.getText();
        MainTextField.setText("");
        MainTextField.setText(str);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        String str = MainTextField.getText() + btn8.getText();
        MainTextField.setText("");
        MainTextField.setText(str);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualActionPerformed
        secondValue = MainTextField.getText();
        MainTextField.setText("");
        calculation();
               
    }//GEN-LAST:event_btnEqualActionPerformed
    public void calculation(){
        double firstNumber = Double.valueOf(firstValue);
        double secondNumber = Double.valueOf(secondValue);
        double result = 0.0;
        
        switch(operation){
            case "add":
                result = firstNumber + secondNumber;
                break;
            case "sub":
                result = firstNumber - secondNumber;
                break;
            case "mult":
                result = firstNumber * secondNumber;
                break;
            case "div":
                result = firstNumber/secondNumber;
        }
        MainTextField.setText(String.valueOf(result));
    }
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        operation = "add";
        firstValue = MainTextField.getText();
        MainTextField.setText("");
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultActionPerformed
        operation = "mult";
        firstValue = MainTextField.getText();
        MainTextField.setText("");
    }//GEN-LAST:event_btnMultActionPerformed

    private void btnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubActionPerformed
        operation = "sub";
        firstValue = MainTextField.getText();
        MainTextField.setText("");
    }//GEN-LAST:event_btnSubActionPerformed

    private void MainTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MainTextFieldActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        String str = MainTextField.getText() + btn0.getText();
        MainTextField.setText("");
        MainTextField.setText(str);

    }//GEN-LAST:event_btn0ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        String str = MainTextField.getText() + btn9.getText();
        MainTextField.setText("");
        MainTextField.setText(str);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        String str = MainTextField.getText() + btn7.getText();
        MainTextField.setText("");
        MainTextField.setText(str);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        String str = MainTextField.getText() + btn6.getText();
        MainTextField.setText("");
        MainTextField.setText(str);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        String str = MainTextField.getText() + btn5.getText();
        MainTextField.setText("");
        MainTextField.setText(str);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        String str = MainTextField.getText() + btn3.getText();
        MainTextField.setText("");
        MainTextField.setText(str);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        String str = MainTextField.getText() + btn2.getText();
        MainTextField.setText("");
        MainTextField.setText(str);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        String str = MainTextField.getText() + btn1.getText();
        MainTextField.setText("");
        MainTextField.setText(str);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed
        operation = "div";
        firstValue = MainTextField.getText();
        MainTextField.setText("");
    }//GEN-LAST:event_btnDivActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        MainTextField.setText(null);
        firstValue = "";
        secondValue = "";
        operation = "";
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String store;
        if (MainTextField.getText().length() > 0) {
            StringBuilder str = new StringBuilder(MainTextField.getText());
            str.deleteCharAt(MainTextField.getText().length() - 1);
            store = str.toString();
            MainTextField.setText(store);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPointActionPerformed
        if (!MainTextField.getText().toString().contains(".")) {
            MainTextField.setText(MainTextField.getText() + ".");
        }
    }//GEN-LAST:event_btnPointActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NormalCalculator().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField MainTextField;
    private javax.swing.JLabel Title;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnEqual;
    private javax.swing.JButton btnMult;
    private javax.swing.JButton btnPoint;
    private javax.swing.JButton btnSub;
    private javax.swing.JLabel digitalWatch;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
