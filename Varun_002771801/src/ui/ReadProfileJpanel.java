/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import Employee_Details.EmProfile;
import java.util.ArrayList;
import java.util.List;
import static ui.CreateProfileJPanel.emp1;
//import ui.CreateProfileJPanel;


public class ReadProfileJpanel extends javax.swing.JPanel {
    EmProfile emp4=new EmProfile();
    //CreateProfileJPanel cps=new CreateProfileJPanel();
    
    
  
    //ArrayList<EmployeeProfile> emps=new ArrayList<>(List.copyOf(CreateProfileJPanel.emp1));
    
    
    
    //emp4=emp1.get
    /**
     * Creates new form ViewProfileJpanel
     * @param emp
     */
    public ReadProfileJpanel(EmProfile emp) {
        initComponents();
        this.emp4 = emp;
        //displayEmpProfile();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtage = new javax.swing.JTextField();
        txtsdate = new javax.swing.JTextField();
        lblpostitle = new javax.swing.JLabel();
        lblcontact = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtempid = new javax.swing.JTextField();
        txtgender = new javax.swing.JTextField();
        lblteaminfo = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        lblsdate = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblgender = new javax.swing.JLabel();
        txtlevel = new javax.swing.JTextField();
        txtpostitle = new javax.swing.JTextField();
        lblemail = new javax.swing.JLabel();
        lblempid = new javax.swing.JLabel();
        lblPhoto = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtphone = new javax.swing.JTextField();
        lblcellno = new javax.swing.JLabel();
        lbllevel = new javax.swing.JLabel();
        txtteaminfo = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        btnPhoto = new javax.swing.JButton();
        btnsearch = new javax.swing.JButton();
        comboforse = new javax.swing.JComboBox<>();
        jTextField3 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(250, 250, 204));
        setPreferredSize(new java.awt.Dimension(800, 800));

        txtage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtageActionPerformed(evt);
            }
        });

        txtsdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsdateActionPerformed(evt);
            }
        });

        lblpostitle.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        lblpostitle.setText("Position Title");

        lblcontact.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        lblcontact.setText("Contact Info");

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        txtempid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtempidActionPerformed(evt);
            }
        });

        txtgender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgenderActionPerformed(evt);
            }
        });

        lblteaminfo.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        lblteaminfo.setText("Team Info");

        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });

        lblsdate.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        lblsdate.setText("Start Date");

        lblAge.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        lblAge.setText("Age");

        lblgender.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        lblgender.setText("Gender");

        txtlevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlevelActionPerformed(evt);
            }
        });

        txtpostitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpostitleActionPerformed(evt);
            }
        });

        lblemail.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        lblemail.setText("Email");

        lblempid.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        lblempid.setText("EmpID");

        lblPhoto.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        lblPhoto.setText("Photo:");

        lblName.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        lblName.setText("Name:");

        txtphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtphoneActionPerformed(evt);
            }
        });

        lblcellno.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        lblcellno.setText("Cell no");

        lbllevel.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        lbllevel.setText("Level");

        txtteaminfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtteaminfoActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitle.setText("                                                                                               View Profile");

        btnPhoto.setText("View Image");
        btnPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhotoActionPerformed(evt);
            }
        });

        btnsearch.setBackground(new java.awt.Color(255, 255, 0));
        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        comboforse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Emp ID", "Name", "Level", "Contact Number" }));
        comboforse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboforseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblName)
                                    .addComponent(lblempid))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtname, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                                    .addComponent(txtempid))
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblAge)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblgender)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtgender, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblsdate)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtsdate, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(64, 64, 64)
                                        .addComponent(lbllevel)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtlevel, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblteaminfo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtteaminfo, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(lblpostitle)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtpostitle, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(comboforse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(74, 74, 74)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblPhoto)
                                                    .addComponent(lblemail)
                                                    .addComponent(lblcellno))
                                                .addGap(32, 32, 32)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btnPhoto))
                                                .addGap(144, 144, 144))))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(366, 366, 366)
                        .addComponent(lblcontact))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(btnsearch)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAge)
                    .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblempid)
                    .addComponent(txtempid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblgender)
                    .addComponent(txtgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbllevel)
                    .addComponent(txtlevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblsdate))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblteaminfo)
                    .addComponent(txtteaminfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblpostitle)
                    .addComponent(txtpostitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(lblcontact)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblcellno)
                    .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblemail))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPhoto)
                    .addComponent(lblPhoto))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboforse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(btnsearch)
                .addContainerGap(260, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtageActionPerformed

    private void txtsdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsdateActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtempidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtempidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtempidActionPerformed

    private void txtgenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgenderActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void txtlevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlevelActionPerformed

    private void txtpostitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpostitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpostitleActionPerformed

    private void txtphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtphoneActionPerformed

    private void txtteaminfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtteaminfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtteaminfoActionPerformed

    private void btnPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhotoActionPerformed
       try{
           EmProfile pemp=new EmProfile();
           for(EmProfile emp:emp1){
        if(emp.getEmpid().equals(jTextField3.getText()) || emp.getName().equals(jTextField3.getText())|| emp.getLevel().equals(jTextField3.getText())|| emp.getCellno().equals(jTextField3.getText()) ){
            pemp=emp;
            break;
        }}
           BufferedImage photo = ImageIO.read(new ByteArrayInputStream(pemp.getPhoto()));
            JFrame viewImgFrame = new JFrame();
            ImageIcon icon = new ImageIcon(photo);
            JLabel label = new JLabel(icon);
            viewImgFrame.add(label);
            viewImgFrame.pack();
            viewImgFrame.setVisible(true);
         }catch (IOException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(btnPhoto, "Error while displaying Image");
        }
    }//GEN-LAST:event_btnPhotoActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
             String Search = jTextField3.getText();
        //EmployeeProfile employeeDetails = new EmProfile();
        //emps=getEmployeeDetails();
        for(EmProfile emp:emp1){
        if(emp.getEmpid().equals(Search) || emp.getName().equals(Search) || emp.getLevel().equals(Search) || emp.getCellno().equals(Search)){
            //employeeDetails = emp;
            txtname.setText(emp.getName());
            txtempid.setText(emp.getEmpid());
            txtage.setText(emp.getAge());
            txtgender.setText(emp.getGender());
            txtsdate.setText(emp.getStartdate());
            txtlevel.setText(emp.getLevel());
            txtteaminfo.setText(emp.getTeaminfo());
            txtpostitle.setText(emp.getPositiontitle());
            txtphone.setText(emp.getCellno());
            txtemail.setText(emp.getEmail());
            break;
        }
       
        
            }
        
        
        
        
    }//GEN-LAST:event_btnsearchActionPerformed

    private void comboforseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboforseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboforseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPhoto;
    private javax.swing.JButton btnsearch;
    private javax.swing.JComboBox<String> comboforse;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblcellno;
    private javax.swing.JLabel lblcontact;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblempid;
    private javax.swing.JLabel lblgender;
    private javax.swing.JLabel lbllevel;
    private javax.swing.JLabel lblpostitle;
    private javax.swing.JLabel lblsdate;
    private javax.swing.JLabel lblteaminfo;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtempid;
    private javax.swing.JTextField txtgender;
    private javax.swing.JTextField txtlevel;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtphone;
    private javax.swing.JTextField txtpostitle;
    private javax.swing.JTextField txtsdate;
    private javax.swing.JTextField txtteaminfo;
    // End of variables declaration//GEN-END:variables

    /**private void displayEmpProfile() {
        txtname.setText(emp4.getName());
        txtempid.setText(emp4.getEmpid());
        txtage.setText(emp4.getAge());
        txtgender.setText(emp4.getGender());
        txtsdate.setText(emp4.getStartdate());
        txtlevel.setText(emp4.getLevel());
        txtteaminfo.setText(emp4.getTeaminfo());
        txtpostitle.setText(emp4.getPositiontitle());
        txtcellno.setText(emp4.getCellno());
        txtemail.setText(emp4.getEmail());
        
    }**/
}
