
import com.sun.org.apache.xerces.internal.impl.dv.xs.DecimalDV;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.BadLocationException;
import java.math.*;

public class CalculatorForm extends javax.swing.JFrame {
    boolean dc=false,pr=false,ps=false,ms=false,my=false,de=false,e=false,n=false,lg=false,sq=false;
      ArrayList<String> al =new ArrayList<String>();
      double sum;
      String Answer=null;
      double poWer= 0,sQroot=0;
      public CalculatorForm() 
      {
        initComponents();
        on.setEnabled(false);
     }
    public void disable()
    {
        on.setEnabled(true);
        off.setEnabled(false);
        zero.setEnabled(false);
        one.setEnabled(false);
        two.setEnabled(false);
        three.setEnabled(false);
        four.setEnabled(false);
        five.setEnabled(false);
        six.setEnabled(false);
        seven.setEnabled(false);
        eight.setEnabled(false);
        nine.setEnabled(false);
        delete.setEnabled(false);
        multiply.setEnabled(false);
        plus.setEnabled(false);
        minus.setEnabled(false);
        divide.setEnabled(false);
        answer.setEnabled(false);
        dot.setEnabled(false);
        plusminus.setEnabled(false);
        ac.setEnabled(false);
        equalto.setEnabled(false);
    }  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        display = new javax.swing.JTextField();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        seven = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        ac = new javax.swing.JButton();
        four = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        dot = new javax.swing.JButton();
        answer = new javax.swing.JButton();
        equalto = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        multiply = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        plusminus = new javax.swing.JButton();
        on = new javax.swing.JRadioButton();
        off = new javax.swing.JRadioButton();
        log = new javax.swing.JButton();
        ln = new javax.swing.JButton();
        antilog = new javax.swing.JButton();
        power = new javax.swing.JButton();
        sqroot = new javax.swing.JButton();
        sin = new javax.swing.JButton();
        cos = new javax.swing.JButton();
        tan = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 0));

        display.setEditable(false);
        display.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        display.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        seven.setText("7");
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        eight.setText("8");
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });

        nine.setText("9");
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });

        delete.setText("DEL");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        ac.setText("AC");
        ac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acActionPerformed(evt);
            }
        });

        four.setText("4");
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        five.setText("5");
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });

        six.setText("6");
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        one.setText("1");
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        two.setText("2");
        two.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twoMouseClicked(evt);
            }
        });
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        three.setText("3");
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        zero.setText("0");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        dot.setText(".");
        dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotActionPerformed(evt);
            }
        });

        answer.setText("Ans");
        answer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerActionPerformed(evt);
            }
        });

        equalto.setText("=");
        equalto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equaltoActionPerformed(evt);
            }
        });

        divide.setText("/");
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });

        minus.setText("-");
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });

        multiply.setText("*");
        multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyActionPerformed(evt);
            }
        });

        plus.setText("+");
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });

        plusminus.setText("+/-");
        plusminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusminusActionPerformed(evt);
            }
        });

        buttonGroup1.add(on);
        on.setText("ON");
        on.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onActionPerformed(evt);
            }
        });

        buttonGroup1.add(off);
        off.setText("OFF");
        off.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offActionPerformed(evt);
            }
        });

        log.setText("log");
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });

        ln.setText("ln");
        ln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnActionPerformed(evt);
            }
        });

        antilog.setText("e");
        antilog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                antilogActionPerformed(evt);
            }
        });

        power.setText("^");
        power.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powerActionPerformed(evt);
            }
        });

        sqroot.setText("sqroot");
        sqroot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqrootActionPerformed(evt);
            }
        });

        sin.setText("sin");

        cos.setText("cos");

        tan.setText("tan");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(seven)
                                .addGap(18, 18, 18)
                                .addComponent(eight)
                                .addGap(18, 18, 18)
                                .addComponent(nine))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(four)
                                .addGap(18, 18, 18)
                                .addComponent(five)
                                .addGap(18, 18, 18)
                                .addComponent(six))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(one)
                                        .addGap(18, 18, 18)
                                        .addComponent(two))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(zero)
                                        .addGap(18, 18, 18)
                                        .addComponent(dot)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(three)
                                    .addComponent(plusminus, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(log)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ln)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(antilog)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(multiply)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(divide))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(plus)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(minus))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(answer)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(equalto))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(delete)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ac)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(on)
                                    .addComponent(off))
                                .addGap(23, 23, 23))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(power)
                                .addGap(18, 18, 18)
                                .addComponent(sqroot)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(sin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cos)
                        .addGap(18, 18, 18)
                        .addComponent(tan)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seven)
                    .addComponent(eight)
                    .addComponent(nine)
                    .addComponent(delete)
                    .addComponent(ac)
                    .addComponent(on))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(four)
                    .addComponent(five)
                    .addComponent(six)
                    .addComponent(divide)
                    .addComponent(multiply)
                    .addComponent(off))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(one)
                    .addComponent(two)
                    .addComponent(three)
                    .addComponent(minus)
                    .addComponent(plus))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zero)
                    .addComponent(dot)
                    .addComponent(answer)
                    .addComponent(equalto)
                    .addComponent(plusminus))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(log)
                    .addComponent(ln)
                    .addComponent(antilog)
                    .addComponent(power)
                    .addComponent(sqroot))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sin)
                    .addComponent(cos)
                    .addComponent(tan))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jDesktopPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        exit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(exit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(exit)))
                .addGap(60, 60, 60)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onActionPerformed
        on.setEnabled(false);
        off.setEnabled(true);
        zero.setEnabled(true);
        one.setEnabled(true);
        two.setEnabled(true);
        three.setEnabled(true);
        four.setEnabled(true);
        five.setEnabled(true);
        six.setEnabled(true);
        seven.setEnabled(true);
        eight.setEnabled(true);
        nine.setEnabled(true);
        delete.setEnabled(true);
        multiply.setEnabled(true);
        plus.setEnabled(true);
        minus.setEnabled(true);
        divide.setEnabled(true);
        answer.setEnabled(true);
        dot.setEnabled(true);
        plusminus.setEnabled(true);
        ac.setEnabled(true);
        equalto.setEnabled(true);
    }//GEN-LAST:event_onActionPerformed

    private void offActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offActionPerformed
       disable();
    }//GEN-LAST:event_offActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
       display.setText(display.getText()+"1");
      
    }//GEN-LAST:event_oneActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        display.setText(display.getText()+"0");
         
    }//GEN-LAST:event_zeroActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
       display.setText(display.getText()+"2");
        //al.add(display.getText());
    }//GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
         display.setText(display.getText()+"3");
        // al.add(display.getText());
    }//GEN-LAST:event_threeActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        display.setText(display.getText()+"4");  
         //al.add(display.getText());
    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        
        display.setText(display.getText()+"5");
         //al.add(display.getText());
    }//GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
       
        display.setText(display.getText()+"6");
      //   al.add(display.getText());
    }//GEN-LAST:event_sixActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
     
        display.setText(display.getText()+"7");
        // al.add(display.getText());
    }//GEN-LAST:event_sevenActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
       
        
        display.setText(display.getText()+"8");
         //al.add(display.getText());
    }//GEN-LAST:event_eightActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
  
        display.setText(display.getText()+"9");
         //al.add(display.getText());
    }//GEN-LAST:event_nineActionPerformed

    private void acActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acActionPerformed
       display.setText("");
       al.clear();
       dc=false;
       Answer=null;
       ps=false;
       ms=false;
       my=false;
       de=false;
       
    }//GEN-LAST:event_acActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        
        int i = display.getText().length();
       int d=i;
       
        i=i-1;
        
        
        
       
     try {
         if(display.getText().charAt(d-1)=='.')
       {
           dc=false;
       }
       else
       {
           dc=true;
       }
        String del = display.getText(0, i);
         display.setText(del);
         
        } 
        catch (BadLocationException ex) {
            Logger.getLogger(CalculatorForm.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_deleteActionPerformed

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
      if(Answer==null)
      {
      
      al.add(display.getText());
      display.setText("");
      dc=false;
      ps=true;
      }
      else
      {
      display.setText("");
      dc=false;
      ps=true;   
      }
    }//GEN-LAST:event_plusActionPerformed

    private void dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotActionPerformed
        if(!dc){ 
        display.setText(display.getText()+".");
        dc=true;
        }
    }//GEN-LAST:event_dotActionPerformed

    private void plusminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusminusActionPerformed
       double pm= Double.parseDouble(display.getText());
       pm=pm*(-1);
       String pM = String.valueOf(pm);
       display.setText(pM);
    }//GEN-LAST:event_plusminusActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
        if(Answer==null)
      {
          al.add(display.getText());
      display.setText("");
      dc=false;
      ms=true;
      }
      else
      {
      display.setText("");
      dc=false;
      ms=true;   
      }
    }//GEN-LAST:event_minusActionPerformed

    private void multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyActionPerformed
        if(Answer==null)
      {
           al.add(display.getText());
      display.setText("");
      dc=false;
      my=true;
      }
      else
      {
      display.setText("");
      dc=false;
      my=true;   
      }
    }//GEN-LAST:event_multiplyActionPerformed

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideActionPerformed
      if(Answer==null)
      {
         
        al.add(display.getText());
        display.setText("");
        dc=false;
        de=true;
           
      }
      else
      {
      display.setText("");
      dc=false;
      de=true;   
      }
    }//GEN-LAST:event_divideActionPerformed

    private void equaltoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equaltoActionPerformed
            if(Answer==null)
            {
              
                if(ps)
            {   
                al.add(display.getText());
                sum=0;
                for(int i=0 ;i<al.size();i++)
                {
                sum=sum+(Double.parseDouble(al.get(i)));
                }
                Answer=String.valueOf(sum);
                display.setText(Answer);
                ps=false;
            }
            if(ms)
            {
                al.add(display.getText());
                sum=0;
                for(int i=0 ;i<al.size();i++)
                {
              sum=(Double.parseDouble(al.get(i)))-sum;
              
                }
                sum=sum*(-1);
                Answer=String.valueOf(sum);
                display.setText(Answer);
                ms=false;
            }
            if(my)
            {
                al.add(display.getText());
                sum=1;
                for(int i=0 ;i<al.size();i++)
                {
              sum=sum*(Double.parseDouble(al.get(i)));
              
                }
               Answer=String.valueOf(sum);
                display.setText(Answer);
                my=false;
            }
            if(de)
            {
                if(display.getText().equals("0"))
                {
                    display.setText("ERROR");
                }
                else{
                    
                 al.add(display.getText());
                sum=1;
                for(int i=al.size()-1 ;i>=0;i--)
                {
                   sum=(Double.parseDouble(al.get(i)))/sum;
                    }
                    
              
                
                display.setText(String.valueOf(sum));
                de=false;
            }
            
            }
            if(pr)
            {
                Double temp=Double.parseDouble(display.getText());
               temp=Math.pow(poWer, temp);
               display.setText(String.valueOf(temp));
            }
            
            
            
            }
            else
            {
               // System.out.println("noo");
                
                
                if(ps)
            {
             sum=Double.parseDouble(Answer);
                String temp= display.getText();   
                sum=sum+Double.parseDouble(temp);
                
                Answer=String.valueOf(sum);
                display.setText(Answer);
               
               
                
                ps=false;
            }
            if(ms)
            {
             sum=Double.parseDouble(Answer);
                String temp= display.getText();   
                sum=sum-Double.parseDouble(temp);
                
                Answer=String.valueOf(sum);
                display.setText(Answer);
               
               
                
                ms=false;
            }
            if(my)
            {
                sum=Double.parseDouble(Answer);
                String temp= display.getText();
                sum=sum*Double.parseDouble(temp);
                
                Answer=String.valueOf(sum);
                display.setText(Answer);
               
               
                
                my=false;
            }
            if(de)
            {
                sum=Double.parseDouble(Answer);
                String temp= display.getText();
                if(display.getText().equals("0"))
                {
                    display.setText("ERROR");
                }
                else
                {
                 sum=sum/Double.parseDouble(temp);
                }
                Answer=String.valueOf(sum);
                display.setText(Answer);
                de=false;
            }
            if(pr)
            {
                Double temp=Double.parseDouble(display.getText());
               temp=Math.pow(poWer, temp);
               display.setText(String.valueOf(temp));
            }
            }
            
    }//GEN-LAST:event_equaltoActionPerformed

    private void answerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerActionPerformed
        display.setText(Answer);
        System.out.println(Answer);
    }//GEN-LAST:event_answerActionPerformed

    private void twoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_twoMouseClicked

    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
        if(Answer==null){
        Double LoG=Double.parseDouble(display.getText());
        LoG=Math.log10(LoG);
        display.setText(String.valueOf(LoG));
            lg=true;
        }
        else
        {
            Double LoG=Double.parseDouble(Answer);
            LoG=Math.log10(LoG);
            display.setText(String.valueOf(LoG));
               lg=true;
        }
    }//GEN-LAST:event_logActionPerformed

    private void lnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnActionPerformed
       if(Answer==null){
        Double LN=Double.parseDouble(display.getText());
        LN=Math.log(LN);
        display.setText(String.valueOf(LN));
        n=true;
       }
        else
        {
            Double LN=Double.parseDouble(Answer);
            LN=Math.log10(LN);
            display.setText(String.valueOf(LN));
            n=true;
        }
    }//GEN-LAST:event_lnActionPerformed

    private void antilogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_antilogActionPerformed
        if(Answer==null){
        Double LN=Double.parseDouble(display.getText());
        LN=Math.exp(LN);
        display.setText(String.valueOf(LN));
        e=true;
        }
        else
        {
            Double LN=Double.parseDouble(Answer);
            LN=Math.exp(LN);
            display.setText(String.valueOf(LN));
            e=true;
        }
    }//GEN-LAST:event_antilogActionPerformed

    private void powerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powerActionPerformed
        if(Answer==null){
       poWer=Double.parseDouble(display.getText());
        display.setText("");
        pr=true;
        }
        else
        {
            poWer=Double.parseDouble(Answer);
            display.setText("");
            pr=true;
        }
    }//GEN-LAST:event_powerActionPerformed

    private void sqrootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sqrootActionPerformed
        if(Answer==null){
       sQroot=Math.sqrt(Double.parseDouble(display.getText()));
       display.setText(String.valueOf(sQroot));
        
        //display.setText("");
        sq=true;
        }
        else
        {
            System.out.println(Answer);
            sQroot=Math.sqrt(Double.parseDouble(Answer));
            Answer=String.valueOf(sqroot);
            display.setText(String.valueOf(sQroot));
            sq=true;
        }
    }//GEN-LAST:event_sqrootActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(CalculatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

             java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                new CalculatorForm().setVisible(true);    
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ac;
    private javax.swing.JButton answer;
    private javax.swing.JButton antilog;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cos;
    private javax.swing.JButton delete;
    private javax.swing.JTextField display;
    private javax.swing.JButton divide;
    private javax.swing.JButton dot;
    private javax.swing.JButton eight;
    private javax.swing.JButton equalto;
    private javax.swing.JButton exit;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton ln;
    private javax.swing.JButton log;
    private javax.swing.JButton minus;
    private javax.swing.JButton multiply;
    private javax.swing.JButton nine;
    private javax.swing.JRadioButton off;
    private javax.swing.JRadioButton on;
    private javax.swing.JButton one;
    private javax.swing.JButton plus;
    private javax.swing.JButton plusminus;
    private javax.swing.JButton power;
    private javax.swing.JButton seven;
    private javax.swing.JButton sin;
    private javax.swing.JButton six;
    private javax.swing.JButton sqroot;
    private javax.swing.JButton tan;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
