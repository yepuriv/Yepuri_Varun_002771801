/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import Employee_Details.EmProfile;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import static ui.CreateProfileJPanel.emp1;

/**
 *
 * @author sreej
 */
public class UpdateJPanel extends javax.swing.JPanel {
    EmProfile emp4=new EmProfile();
    //CreateProfileJPanel cps=new CreateProfileJPanel();
    
    
  
    //ArrayList<EmployeeProfile> emps=new ArrayList<>(List.copyOf(CreateProfileJPanel.emp1));
    

    /**
     * Creates new form UpdateJPanel
     */
    
    UpdateJPanel(EmProfile emp) {
     initComponents();
     this.emp4=emp;

    }/**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAge = new javax.swing.JLabel();
        lblgender = new javax.swing.JLabel();
        txtlevel = new javax.swing.JTextField();
        txtpostitle = new javax.swing.JTextField();
        lblemail = new javax.swing.JLabel();
        lblPhoto = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtcellno = new javax.swing.JTextField();
        lblcellno = new javax.swing.JLabel();
        lbllevel = new javax.swing.JLabel();
        txtteaminfo = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        txtsdate = new javax.swing.JTextField();
        btnPhoto = new javax.swing.JButton();
        lblpostitle = new javax.swing.JLabel();
        lblsempid = new javax.swing.JLabel();
        lblcontact = new javax.swing.JLabel();
        btnupdate = new javax.swing.JButton();
        txtname = new javax.swing.JTextField();
        txtsempid = new javax.swing.JTextField();
        txtgender = new javax.swing.JTextField();
        lblteaminfo = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        lblsdate = new javax.swing.JLabel();
        btnviewd = new javax.swing.JButton();
        updatePhotoBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(250, 250, 204));

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

        lblPhoto.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        lblPhoto.setText("Photo:");

        lblName.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        lblName.setText("Name:");

        txtcellno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcellnoActionPerformed(evt);
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

        txtage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtageActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Update Profile");

        txtsdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsdateActionPerformed(evt);
            }
        });

        btnPhoto.setText("View Image");
        btnPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhotoActionPerformed(evt);
            }
        });

        lblpostitle.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        lblpostitle.setText("Position Title");

        lblsempid.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        lblsempid.setText("Emp ID (for updation)");

        lblcontact.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        lblcontact.setText("Contact Info");

        btnupdate.setBackground(new java.awt.Color(255, 255, 0));
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        txtsempid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsempidActionPerformed(evt);
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

        btnviewd.setText("View Details");
        btnviewd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewdActionPerformed(evt);
            }
        });

        updatePhotoBtn.setText("Update Photo");
        updatePhotoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePhotoBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(429, 429, 429)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblsdate)
                    .addComponent(lblgender)
                    .addComponent(lblteaminfo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtgender, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtteaminfo, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsdate, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblName)
                                        .addComponent(lblAge))
                                    .addComponent(lbllevel))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtlevel)
                                    .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblsempid)
                                .addGap(36, 36, 36)
                                .addComponent(txtsempid, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(455, 455, 455))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblpostitle)
                        .addGap(40, 40, 40)
                        .addComponent(txtpostitle, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblemail)
                            .addComponent(lblcellno)
                            .addComponent(lblPhoto))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtemail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84))
                            .addComponent(txtcellno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnviewd)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(updatePhotoBtn)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnPhoto))))))
                .addGap(315, 315, 315))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(376, 376, 376)
                        .addComponent(lblcontact)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName)
                    .addComponent(lblgender)
                    .addComponent(txtgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(lblsdate)
                    .addComponent(txtsdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtlevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblteaminfo)
                    .addComponent(txtteaminfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbllevel))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpostitle)
                    .addComponent(txtpostitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(lblcontact)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcellno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcellno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblemail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhoto)
                    .addComponent(updatePhotoBtn)
                    .addComponent(btnPhoto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnupdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblsempid)
                    .addComponent(txtsempid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnviewd))
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtlevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlevelActionPerformed

    private void txtpostitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpostitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpostitleActionPerformed

    private void txtcellnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcellnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcellnoActionPerformed

    private void txtteaminfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtteaminfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtteaminfoActionPerformed

    private void txtageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtageActionPerformed

    private void txtsdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsdateActionPerformed

    private void btnPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhotoActionPerformed
        try{
           EmProfile pemp=new EmProfile();
           for(EmProfile emp:emp1){
        if(emp.getEmpid().equals(txtsempid.getText())){
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

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        String name=txtsempid.getText();
        EmProfile employeeDetails = new EmProfile();
      // ArrayList<EmployeeProfile> empt=new ArrayList<EmployeeProfile>();
       //ArrayList<EmployeeProfile> empt=new ArrayList<>(List.copyOf(CreateProfileJPanel.emp1));
        //emps=getEmployeeDetails();
        for(EmProfile emp:emp1){
            if(emp.getEmpid().equals(name)){
            emp.setName(txtname.getText());
            emp.setAge(txtage.getText());
            emp.setGender(txtgender.getText());
            emp.setStartdate(txtsdate.getText());
            emp.setLevel(txtlevel.getText());
            emp.setTeaminfo(txtteaminfo.getText());
            emp.setPositiontitle(txtpostitle.getText());
            emp.setCellno(txtcellno.getText());
            emp.setEmail(txtemail.getText());
                break;
            }
            for(EmProfile emp3:emp1){
            if(!emp3.getEmpid().equals(name)){
                 JOptionPane.showMessageDialog(this, "Employee Does not exist");
            }
        }

        }
        
            CreateProfileJPanel.setArrayLst(emp1);
            JOptionPane.showMessageDialog(this, "Updated Successfully");
    }//GEN-LAST:event_btnupdateActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtsempidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsempidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsempidActionPerformed

    private void txtgenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgenderActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void btnviewdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewdActionPerformed
        // TODO add your handling code here:
        String name=txtsempid.getText();
        EmProfile employeeDetails = new EmProfile();
        for(EmProfile emp:emp1){
            if(emp.getEmpid().equals(name)){
             txtname.setText(emp.getName());
          //txtempid.setText(emp.getEmpid());
            txtage.setText(emp.getAge());
            txtgender.setText(emp.getGender());
            txtsdate.setText(emp.getStartdate());
            txtlevel.setText(emp.getLevel());
            txtteaminfo.setText(emp.getTeaminfo());
            txtpostitle.setText(emp.getPositiontitle());
            txtcellno.setText(emp.getCellno());
            txtemail.setText(emp.getEmail());
           
                break;
            }

        }
        
    }//GEN-LAST:event_btnviewdActionPerformed

    private void updatePhotoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePhotoBtnActionPerformed
        // TODO add your handling code here:
        JFileChooser fileUploader = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
        "JPG & GIF Images", "jpg", "gif");
        fileUploader.setFileFilter(filter);
        fileUploader.setDialogTitle("Choose Your Photo");
        fileUploader.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnval = fileUploader.showOpenDialog(this);
        if (returnval == JFileChooser.APPROVE_OPTION)
        {
            File uploadedFile = fileUploader.getSelectedFile();
            BufferedImage bufferedImageObj;
            try {
                bufferedImageObj = ImageIO.read(uploadedFile);
                ByteArrayOutputStream byteArrayOs = new ByteArrayOutputStream();
                ImageIO.write(bufferedImageObj, "jpg", byteArrayOs);
                byte[] photoBytes = byteArrayOs.toByteArray();
                emp4.setPhoto(photoBytes);
                emp1.add(emp4);
                JOptionPane.showMessageDialog(fileUploader, "Photo Updated Successfully");
            } catch(IOException e) {
               e.printStackTrace();
               JOptionPane.showMessageDialog(fileUploader, "Error while uploading Photo");
            }
        }
    }//GEN-LAST:event_updatePhotoBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPhoto;
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton btnviewd;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblcellno;
    private javax.swing.JLabel lblcontact;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblgender;
    private javax.swing.JLabel lbllevel;
    private javax.swing.JLabel lblpostitle;
    private javax.swing.JLabel lblsdate;
    private javax.swing.JLabel lblsempid;
    private javax.swing.JLabel lblteaminfo;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtcellno;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtgender;
    private javax.swing.JTextField txtlevel;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpostitle;
    private javax.swing.JTextField txtsdate;
    private javax.swing.JTextField txtsempid;
    private javax.swing.JTextField txtteaminfo;
    private javax.swing.JButton updatePhotoBtn;
    // End of variables declaration//GEN-END:variables
}
