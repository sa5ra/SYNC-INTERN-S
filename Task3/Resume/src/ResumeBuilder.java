
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ResumeBuilder extends javax.swing.JFrame {


    public ResumeBuilder() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameLabel = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        school1Label = new javax.swing.JLabel();
        school1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        marks1 = new javax.swing.JTextField();
        school2Label = new javax.swing.JLabel();
        school2 = new javax.swing.JTextField();
        percentage1Label = new javax.swing.JLabel();
        marks2Label = new javax.swing.JLabel();
        marks2 = new javax.swing.JTextField();
        college1Label = new javax.swing.JLabel();
        college1 = new javax.swing.JTextField();
        university1Label = new javax.swing.JLabel();
        university1 = new javax.swing.JTextField();
        cgpa1Label = new javax.swing.JLabel();
        cgpa1 = new javax.swing.JTextField();
        college2Label = new javax.swing.JLabel();
        college2 = new javax.swing.JTextField();
        university2Label = new javax.swing.JLabel();
        university2 = new javax.swing.JTextField();
        cgpa2Label = new javax.swing.JLabel();
        cgpa2 = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Submit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        projectNameField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        projectDescriptionField1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        projectNameField2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        projectDescriptionField2 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        projectNameField3 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        projectDescriptionField3 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        projectNameField4 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        projectDescriptionField4 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        contactNumber = new javax.swing.JTextField();
        Browse = new javax.swing.JButton();
        skillsField = new javax.swing.JTextField();
        skillsLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dateCollege2Field = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        dateCollege1Field = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        dateXIIField = new javax.swing.JTextField();
        dateXLabel = new javax.swing.JLabel();
        dateXField = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        openNewWindow = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nameLabel.setText("Name");

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        school1Label.setText("School (X)");

        school2Label.setText("HSC/Diploma");

        percentage1Label.setText("Percentage");

        marks2Label.setText("Percentage");

        marks2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marks2ActionPerformed(evt);
            }
        });

        college1Label.setText("Under-Graduation");

        college1.setText("Enter Institution name");
        college1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                college1ActionPerformed(evt);
            }
        });

        university1Label.setText("University");

        university1.setText("Enter university name");

        cgpa1Label.setText("CGPA");

        cgpa1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cgpa1KeyTyped(evt);
            }
        });

        college2Label.setText("Post-Graduation");

        college2.setText("Institution name");

        university2Label.setText("University");

        university2.setText("University name");

        cgpa2Label.setText("CGPA");

        cgpa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cgpa2ActionPerformed(evt);
            }
        });

        emailLabel.setText("Email");

        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emailKeyTyped(evt);
            }
        });

        jLabel1.setText("Add your projects here :");

        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        jLabel2.setText("Project Title");

        projectNameField1.setText(" ");

        projectDescriptionField1.setColumns(20);
        projectDescriptionField1.setRows(5);
        projectDescriptionField1.setText(" ");
        jScrollPane1.setViewportView(projectDescriptionField1);

        jLabel4.setText("Project Title");

        projectNameField2.setText(" ");

        projectDescriptionField2.setColumns(20);
        projectDescriptionField2.setRows(5);
        jScrollPane2.setViewportView(projectDescriptionField2);

        jLabel5.setText("Project Title");

        projectNameField3.setText(" ");

        projectDescriptionField3.setColumns(20);
        projectDescriptionField3.setRows(5);
        projectDescriptionField3.setText(" ");
        jScrollPane3.setViewportView(projectDescriptionField3);

        jLabel6.setText("Project Title");

        projectNameField4.setText(" ");

        projectDescriptionField4.setColumns(20);
        projectDescriptionField4.setRows(5);
        projectDescriptionField4.setText(" ");
        jScrollPane4.setViewportView(projectDescriptionField4);

        jLabel7.setText("Contact no.");

        contactNumber.setText(" ");
        contactNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactNumberActionPerformed(evt);
            }
        });

        Browse.setText("Cancel");
        Browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseActionPerformed(evt);
            }
        });

        skillsField.setText("   ");

        skillsLabel.setText("Skills");

        jLabel8.setText("Date");

        dateCollege2Field.setText("From - to - To");

        jLabel9.setText("Date");

        dateCollege1Field.setText("From - to - To");

        jLabel10.setText("Date");

        dateXIIField.setText("From - to - To");

        dateXLabel.setText("Date");

        dateXField.setText("From-to-To");

        jMenu1.setText("File");

        openNewWindow.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        openNewWindow.setText("New");
        openNewWindow.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                openNewWindowAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        openNewWindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openNewWindowActionPerformed(evt);
            }
        });
        jMenu1.add(openNewWindow);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem1.setText("Add Projects");
        jMenuItem1.setAutoscrolls(true);
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("About");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(cgpa1Label)
                                                        .addComponent(college2Label)
                                                        .addComponent(university2Label)
                                                        .addComponent(jLabel7)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(12, 12, 12)
                                                                .addComponent(skillsLabel))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(cgpa2Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addComponent(jLabel9))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(Browse)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                                                                .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(college2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                                                        .addComponent(cgpa1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                                                        .addComponent(university2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                                                        .addComponent(cgpa2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                                                        .addComponent(contactNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(skillsField)
                                                        .addComponent(dateCollege2Field)
                                                        .addComponent(dateCollege1Field, javax.swing.GroupLayout.Alignment.LEADING)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(nameLabel)
                                                        .addComponent(school1Label)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(74, 74, 74)
                                                                .addComponent(jLabel3))
                                                        .addComponent(percentage1Label)
                                                        .addComponent(school2Label)
                                                        .addComponent(marks2Label)
                                                        .addComponent(college1Label)
                                                        .addComponent(university1Label)
                                                        .addComponent(emailLabel)
                                                        .addComponent(jLabel10)
                                                        .addComponent(dateXLabel))
                                                .addGap(28, 28, 28)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(school1)
                                                        .addComponent(name)
                                                        .addComponent(marks1)
                                                        .addComponent(school2)
                                                        .addComponent(marks2)
                                                        .addComponent(college1, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                                                        .addComponent(university1)
                                                        .addComponent(email)
                                                        .addComponent(dateXIIField)
                                                        .addComponent(dateXField))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(projectNameField1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane1)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(projectNameField2))
                                        .addComponent(jScrollPane2)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(projectNameField3))
                                        .addComponent(jScrollPane3)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(projectNameField4))
                                        .addComponent(jScrollPane4))
                                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(name)
                                                .addComponent(jLabel1))
                                        .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(emailLabel)
                                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)
                                        .addComponent(projectNameField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(school1Label)
                                                        .addComponent(school1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(marks1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(percentage1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel4)
                                                        .addComponent(projectNameField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel5)
                                                        .addComponent(projectNameField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel6)
                                                        .addComponent(projectNameField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(99, 99, 99))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(0, 5, Short.MAX_VALUE)
                                                                .addComponent(dateXLabel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(school2)
                                                                        .addComponent(school2Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(dateXField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(dateXIIField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(marks2)
                                                        .addComponent(marks2Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(college1)
                                                        .addComponent(college1Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(university1)
                                                        .addComponent(university1Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel9)
                                                        .addComponent(dateCollege1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(cgpa1)
                                                        .addComponent(cgpa1Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(college2)
                                                        .addComponent(college2Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(university2)
                                                        .addComponent(university2Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(dateCollege2Field)
                                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(cgpa2)
                                                        .addComponent(cgpa2Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(contactNumber)
                                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(skillsField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(skillsLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(Browse, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                                .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    public Map getDetails() {
        Map details;                    //stores values from form
        details = new HashMap();        //to be passed to resumeGenerator.java

        String candidateName = name.getText();
        details.put("Name" , candidateName);

        String candidateEmail;
        candidateEmail = email.getText();
        details.put("Email" , candidateEmail);

        String schoolX;
        schoolX = school1.getText();
        details.put("SchoolX" , schoolX);

        String percentageX = marks1.getText();
        details.put("PercentageX" , percentageX);

        String dateX = dateXField.getText();
        details.put("Date X" , dateX);

        String schoolXII = school2.getText();
        details.put("SchoolXII" , schoolXII);

        String dateXII = dateXIIField.getText();
        details.put("Date XII" , dateXII);

        String percentageXII = marks2.getText();
        details.put("PercentageXII" , percentageXII);

        String graduateCollege = college1.getText();
        details.put("GraduationCollege" , graduateCollege);

        String graduateUniversity = university1.getText();
        details.put("GraduateUniversity" , graduateUniversity);

        String graduationDate = dateCollege1Field.getText();
        details.put("Graduation date" , graduationDate);

        String graduateCGPA = cgpa1.getText();
        details.put("GraduationCGPA", graduateCGPA);

        String postGraduateCollege = college2.getText();
        details.put("PostGraduationCollege" , postGraduateCollege);

        String postGraduateUniversity = university2.getText();
        details.put("PostGraduateUniversity" , postGraduateUniversity);

        String postGraduationDate = dateCollege2Field.getText();
        details.put("Post Graduation date" , postGraduationDate);

        String postGraduateCGPA = cgpa2.getText();
        details.put("PostGraduateCGPA", postGraduateCGPA);

        String contactNo = contactNumber.getText();
        details.put("ContactNumber" , contactNo);

        String projectName1 = projectNameField1.getText();
        String projectDescription1 = projectDescriptionField1.getText();
        details.put("ProjectName1" , projectName1);
        details.put("projectDescription1" , projectDescription1);

        String projectName2 = projectNameField2.getText();
        String projectDescription2 = projectDescriptionField2.getText();
        details.put("ProjectName2" , projectName2);
        details.put("projectDescription2" , projectDescription2);

        String projectName3 = projectNameField3.getText();
        String projectDescription3 = projectDescriptionField3.getText();
        details.put("ProjectName3" , projectName3);
        details.put("projectDescription3" , projectDescription3);

        String projectName4 = projectNameField4.getText();
        String projectDescription4 = projectDescriptionField4.getText();
        details.put("ProjectName4" , projectName4);
        details.put("projectDescription4" , projectDescription4);

        String skills = skillsField.getText();
        details.put("Skills" , skills);

        return details;
    }
    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void marks2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marks2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marks2ActionPerformed

    private void college1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_college1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_college1ActionPerformed

    private void cgpa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cgpa2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cgpa2ActionPerformed

    private void cgpa1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cgpa1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cgpa1KeyTyped
    public void clearForm() {
        name.setText("");
        email.setText("");
        cgpa1.setText("");
        cgpa2.setText("");
        college1.setText("");
        college2.setText("");
        university1.setText("");
        university2.setText("");
        school1.setText("");
        school2.setText("");
        marks1.setText("");
        marks2.setText("");
        skillsField.setText("");
        name.requestFocus();
        projectNameField1.setText("");
        contactNumber.setText("");
        projectNameField2.setText("");
        projectNameField3.setText("");
        projectNameField4.setText("");

    }
    private void openNewWindowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openNewWindowActionPerformed
        // TODO add your handling code here:
        clearForm();
    }//GEN-LAST:event_openNewWindowActionPerformed

    private void openNewWindowAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_openNewWindowAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_openNewWindowAncestorAdded

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:
        /* PDFTest pdftest = new PDFTest();
        try {
            pdftest.createPdf("blank.pdf");
        } catch (IOException ex) {
            Logger.getLogger(ResumeBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        Map details = getDetails();

        resumeGenerator resume;
        resume = new resumeGenerator(details);
        try {
            resume.createResume();
        } catch (IOException ex) {
            Logger.getLogger(ResumeBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SubmitActionPerformed

    private void contactNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactNumberActionPerformed

    private void BrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseActionPerformed
        // TODO add your handling code here:      
        System.exit(0);
    }//GEN-LAST:event_BrowseActionPerformed

    private void emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_emailKeyTyped


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ResumeBuilder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResumeBuilder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResumeBuilder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResumeBuilder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ResumeBuilder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Browse;
    private javax.swing.JButton Submit;
    private javax.swing.JTextField cgpa1;
    private javax.swing.JLabel cgpa1Label;
    private javax.swing.JTextField cgpa2;
    private javax.swing.JLabel cgpa2Label;
    private javax.swing.JTextField college1;
    private javax.swing.JLabel college1Label;
    private javax.swing.JTextField college2;
    private javax.swing.JLabel college2Label;
    private javax.swing.JTextField contactNumber;
    private javax.swing.JTextField dateCollege1Field;
    private javax.swing.JTextField dateCollege2Field;
    private javax.swing.JTextField dateXField;
    private javax.swing.JTextField dateXIIField;
    private javax.swing.JLabel dateXLabel;
    private javax.swing.JTextField email;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField marks1;
    private javax.swing.JTextField marks2;
    private javax.swing.JLabel marks2Label;
    private javax.swing.JTextField name;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JMenuItem openNewWindow;
    private javax.swing.JLabel percentage1Label;
    private javax.swing.JTextArea projectDescriptionField1;
    private javax.swing.JTextArea projectDescriptionField2;
    private javax.swing.JTextArea projectDescriptionField3;
    private javax.swing.JTextArea projectDescriptionField4;
    private javax.swing.JTextField projectNameField1;
    private javax.swing.JTextField projectNameField2;
    private javax.swing.JTextField projectNameField3;
    private javax.swing.JTextField projectNameField4;
    private javax.swing.JTextField school1;
    private javax.swing.JLabel school1Label;
    private javax.swing.JTextField school2;
    private javax.swing.JLabel school2Label;
    private javax.swing.JTextField skillsField;
    private javax.swing.JLabel skillsLabel;
    private javax.swing.JTextField university1;
    private javax.swing.JLabel university1Label;
    private javax.swing.JTextField university2;
    private javax.swing.JLabel university2Label;
    // End of variables declaration//GEN-END:variables
}