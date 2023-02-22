/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//프록시 패턴 구현-채연
package GUI;

import BOOK.Book;
import GO.jeju;
import GO.kimpo;
import GO.plane;
import LoadBookproxy.LoadBookAirLineProxy;
import LoadBookproxy.LoadBookAirLineProxyImpl;
import Observer.A100;
import Observer.A200;
import Observer.A300;
import Observer.Observer;
import Observer.seatobserv;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.table.DefaultTableModel;

/**
 *
 */
public class BookAirLine extends javax.swing.JFrame {

    File stayfile = new File("C:\\DB\\AirLine.txt");
    File booking = new File("C:\\DB\\Book.txt");
    Seat1 s1 = new Seat1();
    Seat2 s2 = new Seat2();
    Seat3 s3 = new Seat3();
    ArrayList readInfo = new ArrayList<>();
    login lg = new login();

    seatobserv seat = new seatobserv();
    Observer name1 = new A100();
    Observer name2 = new A200();
    Observer name3 = new A300();

    plane pl = new plane();
    jeju jj = new jeju();
    kimpo kp = new kimpo();
    String s;

    /**
     * Creates new form BookAirLine
     */
    public BookAirLine() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BT_Search = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Combo_Year = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        Combo_Month = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        Combo_Day = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        Combo_go = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "비행기", "출발시간", "도착시간"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        BT_Search.setText("검색");
        BT_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_SearchActionPerformed(evt);
            }
        });

        jButton1.setText("예약");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("날짜");

        Combo_Year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2021", "2022", "2023" }));
        Combo_Year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo_YearActionPerformed(evt);
            }
        });

        jLabel8.setText("년");

        Combo_Month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jLabel9.setText("월");

        Combo_Day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel10.setText("일");

        Combo_go.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "부산->제주", "부산->김포" }));

        jLabel11.setText("경로");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(10, 10, 10)
                        .addComponent(Combo_go, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(Combo_Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Combo_Month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Combo_Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BT_Search))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(Combo_Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Combo_Month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Combo_Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9)
                        .addComponent(jLabel10)
                        .addComponent(jLabel11)
                        .addComponent(Combo_go, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BT_Search))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BT_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_SearchActionPerformed

        String year = Combo_Year.getSelectedItem().toString();
        String month = Combo_Month.getSelectedItem().toString();
        String day = Combo_Day.getSelectedItem().toString();
        String go = Combo_go.getSelectedItem().toString();
        String busan = "부산";
        String jeju = "제주";
        String kimpo = "김포";

        if (go == "부산->제주") {
            pl.setgo(new jeju());
            pl.dogo();
            s = jj.A;
        } else if (go == "부산->김포") {
            pl.setgo(new kimpo());
            pl.dogo();
            s = kp.B;
        }

        DefaultTableModel search;
        search = (DefaultTableModel) jTable1.getModel();
        // 파일 입출력을 대신하는 proxy 구현체 생성
        LoadBookAirLineProxyImpl proxyImpl = new LoadBookAirLineProxy();
        // DB\AirLine.txt 경로의 파일을 읽어 들이는 것을 proxy 구현체에게 위임한다.
        List<String[]> list = proxyImpl.loadBookAirLine("C:\\\\DB\\\\AirLine.txt");
        // proxy 구현체에서 반환된 리스트 값을 가지고 화면에 적절히 배치한다.
        for (String[] result : list) {
            if (go == "부산->제주") {
                if (busan.equals(result[8]) && jeju.equals(result[9]) && year.equals(result[5]) && month.equals(result[6]) && day.equals(result[7])) {
                    search.insertRow(search.getRowCount(), new Object[]{
                        result[1],
                        result[3],
                        result[4],});
                }
            } else if (go == "부산->김포") {
                if (busan.equals(result[8]) && kimpo.equals(result[9]) && year.equals(result[5]) && month.equals(result[6]) && day.equals(result[7])) {
                    search.insertRow(search.getRowCount(), new Object[]{
                        result[1],
                        result[3],
                        result[4],});
                }
            }
        }
    }//GEN-LAST:event_BT_SearchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String e = lg.a;
        String year = Combo_Year.getSelectedItem().toString();
        String month = Combo_Month.getSelectedItem().toString();
        String day = Combo_Day.getSelectedItem().toString();
        Book write = new Book();
        int row = jTable1.getSelectedRow();
        int col = jTable1.getSelectedColumn();

        String bookummy = "";
        String a = (String) jTable1.getValueAt(row, 0);
        String b = (String) jTable1.getValueAt(row, 1);
        String c = (String) jTable1.getValueAt(row, 2);

        try {
            if (row == -1 && col == -1) {
                System.out.println("선택된 값이 없습니다.");
            } else {
                bookummy = e + " " + a + " " + s + " " + year + " " + month + " " + day + " " + b + " " + c;
                write.DBWrite(bookummy);
                write.Split();

                if (a.equals("A-100")) {
                    seat.check(name1);
                    seat.putregistseat();
                    s1.setVisible(true);
                    dispose();
                } else if (a.equals("A-200")) {
                    seat.check(name2);
                    seat.putregistseat();
                    s2.setVisible(true);
                    dispose();
                } else if (a.equals("A-300")) {
                    seat.check(name3);
                    seat.putregistseat();
                    s3.setVisible(true);
                    dispose();
                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(admain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(admain.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void Combo_YearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo_YearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Combo_YearActionPerformed

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
            java.util.logging.Logger.getLogger(BookAirLine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookAirLine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookAirLine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookAirLine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BookAirLine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_Search;
    private javax.swing.JComboBox<String> Combo_Day;
    private javax.swing.JComboBox<String> Combo_Month;
    private javax.swing.JComboBox<String> Combo_Year;
    private javax.swing.JComboBox<String> Combo_go;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}