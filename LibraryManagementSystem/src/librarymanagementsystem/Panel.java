package librarymanagementsystem;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *This Panel class extends from JFrame, using JFrame and other GUI components
 * This defaults creates 3 data structure (array list) to store records of our Library Management System
 * @author JohnnyKaime
 */
public class Panel extends javax.swing.JFrame {

    private final ArrayList<User> userList = new ArrayList<>();
    private final ArrayList<Book> bookList = new ArrayList<>();
    private final ArrayList<Admin> adminList = new ArrayList<>();
    DefaultListModel<String> model;
/**
 * This method initializes all the GUI components for Library Management System
 * 
 */
    public Panel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login = new javax.swing.JPanel();
        LGAdminNameLbl = new javax.swing.JLabel();
        LGPasswordLbl = new javax.swing.JLabel();
        LGPasswordTxf = new javax.swing.JPasswordField();
        LGAdminNameTxf = new javax.swing.JTextField();
        LGSubmitBtn = new javax.swing.JButton();
        LGSep = new javax.swing.JSeparator();
        LGSearchLbl = new javax.swing.JLabel();
        LGSearchTxf = new javax.swing.JTextField();
        LGSearchSubmitBtn = new javax.swing.JButton();
        LGBook = new javax.swing.JScrollPane();
        LGBookLst = new javax.swing.JList<>();
        LGAdminLbl = new javax.swing.JLabel();
        LGTxa = new javax.swing.JScrollPane();
        LGHelpTxa = new javax.swing.JTextArea();
        Admin = new javax.swing.JPanel();
        ADStd = new javax.swing.JScrollPane();
        ADStdLst = new javax.swing.JList<>();
        ADBook = new javax.swing.JScrollPane();
        ADBookLst = new javax.swing.JList<>();
        ADDeleteBtn = new javax.swing.JButton();
        ADStudentLbl = new javax.swing.JLabel();
        ADBookLbl = new javax.swing.JLabel();
        ADSep1 = new javax.swing.JSeparator();
        ADSep2 = new javax.swing.JSeparator();
        ADStdNameLbl = new javax.swing.JLabel();
        ADStdSurnameLbl = new javax.swing.JLabel();
        ADStdCellLbl = new javax.swing.JLabel();
        ADStdBorrowLbl = new javax.swing.JLabel();
        ADStdNameTxf = new javax.swing.JTextField();
        ADStdCellTxf = new javax.swing.JTextField();
        ADStdSurnameTxf = new javax.swing.JTextField();
        ADStdAddBtn = new javax.swing.JButton();
        ADStdCanelBtn = new javax.swing.JButton();
        ADBkTitleLbl = new javax.swing.JLabel();
        ADBkAuthorLbl = new javax.swing.JLabel();
        ADBkISBNLbl = new javax.swing.JLabel();
        ADBkCatLbl = new javax.swing.JLabel();
        ADBkISBNTxf = new javax.swing.JTextField();
        ADBkAuthorTxf = new javax.swing.JTextField();
        ADBkTitleTxf = new javax.swing.JTextField();
        ADBkCatCombo = new javax.swing.JComboBox<>();
        ADBkAddBtn = new javax.swing.JButton();
        ADBkCanelBtn = new javax.swing.JButton();
        ADGenerateBtn = new javax.swing.JButton();
        ADBackBtn = new javax.swing.JButton();
        ADStdBorrowCombo = new javax.swing.JComboBox<>();
        ADBkAvailabilityLbl = new javax.swing.JLabel();
        ADBkAvailabilityRBtn = new javax.swing.JRadioButton();
        ADStdModifyBtn = new javax.swing.JButton();
        ADBkModifyBtn = new javax.swing.JButton();
        ADBorrowBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Login.setPreferredSize(new java.awt.Dimension(276, 396));

        LGAdminNameLbl.setText("Admin name");

        LGPasswordLbl.setText("Password");

        LGPasswordTxf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LGPasswordTxfActionPerformed(evt);
            }
        });

        LGAdminNameTxf.setToolTipText("Please enter admin username");
        LGAdminNameTxf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LGAdminNameTxfActionPerformed(evt);
            }
        });

        LGSubmitBtn.setText("Submit");
        LGSubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LGSubmitBtnActionPerformed(evt);
            }
        });

        LGSearchLbl.setText("Search");

        LGSearchTxf.setText("Search for book");
        LGSearchTxf.setToolTipText("Please enter title of the book");
        LGSearchTxf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LGSearchTxfActionPerformed(evt);
            }
        });

        LGSearchSubmitBtn.setText("GO");
        LGSearchSubmitBtn.setToolTipText("Click to Search");
        LGSearchSubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LGSearchSubmitBtnActionPerformed(evt);
            }
        });

        LGBookLst.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        LGBook.setViewportView(LGBookLst);

        LGAdminLbl.setFont(new java.awt.Font("Arial Narrow", 3, 18)); // NOI18N
        LGAdminLbl.setText("Admin Login");

        LGHelpTxa.setEditable(false);
        LGHelpTxa.setColumns(20);
        LGHelpTxa.setFont(new java.awt.Font("Mongolian Baiti", 0, 14)); // NOI18N
        LGHelpTxa.setForeground(new java.awt.Color(255, 0, 0));
        LGHelpTxa.setLineWrap(true);
        LGHelpTxa.setRows(5);
        LGHelpTxa.setText("The Library Management System will allow\nadmin (Librian) to manage the system, they can add books and students into the database, modifyand update existing records, delete and generate reports.\n\nFeel free to hit enter instead of clicking on buttons in a text field to submit :)");
        LGHelpTxa.setWrapStyleWord(true);
        LGTxa.setViewportView(LGHelpTxa);

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LGSep)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LGTxa)
                    .addComponent(LGBook, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, LoginLayout.createSequentialGroup()
                        .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LGSubmitBtn)
                            .addComponent(LGAdminLbl))
                        .addGap(0, 326, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, LoginLayout.createSequentialGroup()
                        .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(LoginLayout.createSequentialGroup()
                                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LGAdminNameLbl)
                                    .addComponent(LGPasswordLbl))
                                .addGap(18, 18, 18)
                                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LGAdminNameTxf)
                                    .addComponent(LGPasswordTxf)))
                            .addGroup(LoginLayout.createSequentialGroup()
                                .addComponent(LGSearchLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LGSearchTxf)))
                        .addGap(18, 18, 18)
                        .addComponent(LGSearchSubmitBtn)))
                .addContainerGap())
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(LGAdminLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LGAdminNameLbl)
                    .addComponent(LGAdminNameTxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LGPasswordTxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LGPasswordLbl))
                .addGap(18, 18, 18)
                .addComponent(LGSubmitBtn)
                .addGap(12, 12, 12)
                .addComponent(LGSep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LGSearchLbl)
                    .addComponent(LGSearchTxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LGSearchSubmitBtn))
                .addGap(18, 18, 18)
                .addComponent(LGBook, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LGTxa, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );

        Admin.setPreferredSize(new java.awt.Dimension(276, 396));

        ADStdLst.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ADStdLst.setToolTipText("Please select one item, to un-select click the Canel Button on the right");
        ADStdLst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ADStdLstMouseClicked(evt);
            }
        });
        ADStd.setViewportView(ADStdLst);

        ADBookLst.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ADBookLst.setToolTipText("Please select one item, to un-select click the Canel Button on the right");
        ADBookLst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ADBookLstMouseClicked(evt);
            }
        });
        ADBook.setViewportView(ADBookLst);

        ADDeleteBtn.setText("Delete");
        ADDeleteBtn.setToolTipText("Please select  either Student or Book from the list");
        ADDeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDeleteBtnActionPerformed(evt);
            }
        });

        ADStudentLbl.setFont(new java.awt.Font("Arial Narrow", 3, 18)); // NOI18N
        ADStudentLbl.setText("Students");

        ADBookLbl.setFont(new java.awt.Font("Arial Narrow", 3, 18)); // NOI18N
        ADBookLbl.setText("Books");

        ADStdNameLbl.setText("First name");

        ADStdSurnameLbl.setText("Surname");

        ADStdCellLbl.setText("Cell number");

        ADStdBorrowLbl.setText("Borrow books");

        ADStdNameTxf.setToolTipText("Enter student firstname");
        ADStdNameTxf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADStdNameTxfActionPerformed(evt);
            }
        });

        ADStdCellTxf.setToolTipText("Enter student cell number");

        ADStdSurnameTxf.setToolTipText("Enter student surname");
        ADStdSurnameTxf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADStdSurnameTxfActionPerformed(evt);
            }
        });

        ADStdAddBtn.setText("Add");
        ADStdAddBtn.setToolTipText("Add a new Student");
        ADStdAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADStdAddBtnActionPerformed(evt);
            }
        });

        ADStdCanelBtn.setText("Cancel");
        ADStdCanelBtn.setToolTipText("Canel your current operation");
        ADStdCanelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADStdCanelBtnActionPerformed(evt);
            }
        });

        ADBkTitleLbl.setText("Title");

        ADBkAuthorLbl.setText("Author");

        ADBkISBNLbl.setText("ISBN");

        ADBkCatLbl.setText("Category");

        ADBkAuthorTxf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADBkAuthorTxfActionPerformed(evt);
            }
        });

        ADBkCatCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computer Science", "Mathematics", "Statistics", "Information Systems","Other"}));

        ADBkAddBtn.setText("Add");
        ADBkAddBtn.setToolTipText("Add a new Book");
        ADBkAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADBkAddBtnActionPerformed(evt);
            }
        });

        ADBkCanelBtn.setText("Cancel");
        ADBkCanelBtn.setToolTipText("Canel your current operation");
        ADBkCanelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADBkCanelBtnActionPerformed(evt);
            }
        });

        ADGenerateBtn.setText("Generate");
        ADGenerateBtn.setToolTipText("To export data in CSV form");
        ADGenerateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADGenerateBtnActionPerformed(evt);
            }
        });

        ADBackBtn.setText("Back");
        ADBackBtn.setToolTipText("Go back to Login screen");
        ADBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADBackBtnActionPerformed(evt);
            }
        });

        ADStdBorrowCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0","1","2","3","4","5" }));
        ADStdBorrowCombo.setToolTipText("Select amount of borrowed books");

        ADBkAvailabilityLbl.setText("Availability");

        ADBkAvailabilityRBtn.setText("Yes");

        ADStdModifyBtn.setText("Modify");
        ADStdModifyBtn.setToolTipText("Modify an existing Student");
        ADStdModifyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADStdModifyBtnActionPerformed(evt);
            }
        });

        ADBkModifyBtn.setText("Modify");
        ADBkModifyBtn.setToolTipText("Modify an existing Book");
        ADBkModifyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADBkModifyBtnActionPerformed(evt);
            }
        });

        ADBorrowBtn.setText("Borrow/Return");
        ADBorrowBtn.setToolTipText("If the student has borrow the took it will return it otherwise the student will borrow it");
        ADBorrowBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADBorrowBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AdminLayout = new javax.swing.GroupLayout(Admin);
        Admin.setLayout(AdminLayout);
        AdminLayout.setHorizontalGroup(
            AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ADBackBtn)
                .addGap(18, 18, 18)
                .addComponent(ADBorrowBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ADDeleteBtn)
                .addGap(18, 18, 18)
                .addComponent(ADGenerateBtn)
                .addGap(44, 44, 44))
            .addGroup(AdminLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ADStudentLbl)
                    .addComponent(ADBookLbl))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(AdminLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AdminLayout.createSequentialGroup()
                        .addComponent(ADBook, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(AdminLayout.createSequentialGroup()
                                .addComponent(ADBkTitleLbl)
                                .addGap(34, 34, 34)
                                .addComponent(ADBkTitleTxf))
                            .addGroup(AdminLayout.createSequentialGroup()
                                .addComponent(ADBkAuthorLbl)
                                .addGap(21, 21, 21)
                                .addComponent(ADBkAuthorTxf))
                            .addGroup(AdminLayout.createSequentialGroup()
                                .addComponent(ADBkISBNLbl)
                                .addGap(31, 31, 31)
                                .addComponent(ADBkISBNTxf))
                            .addGroup(AdminLayout.createSequentialGroup()
                                .addComponent(ADBkCatLbl)
                                .addGap(10, 10, 10)
                                .addComponent(ADBkCatCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(AdminLayout.createSequentialGroup()
                                .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(AdminLayout.createSequentialGroup()
                                        .addComponent(ADBkAvailabilityLbl)
                                        .addGap(23, 23, 23))
                                    .addGroup(AdminLayout.createSequentialGroup()
                                        .addComponent(ADBkAddBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ADBkModifyBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ADBkCanelBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ADBkAvailabilityRBtn))
                                .addGap(21, 21, 21))))
                    .addGroup(AdminLayout.createSequentialGroup()
                        .addComponent(ADStd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AdminLayout.createSequentialGroup()
                                .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ADStdCellLbl)
                                    .addComponent(ADStdBorrowLbl)
                                    .addComponent(ADStdSurnameLbl)
                                    .addComponent(ADStdNameLbl))
                                .addGap(18, 18, 18)
                                .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ADStdCellTxf, javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(ADStdSurnameTxf, javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(ADStdNameTxf, javax.swing.GroupLayout.Alignment.CENTER)
                                    .addGroup(AdminLayout.createSequentialGroup()
                                        .addComponent(ADStdBorrowCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(AdminLayout.createSequentialGroup()
                                .addComponent(ADStdAddBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ADStdModifyBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ADStdCanelBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(21, 21, 21)))))
                .addContainerGap())
            .addComponent(ADSep2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(ADSep1)
        );
        AdminLayout.setVerticalGroup(
            AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ADStudentLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AdminLayout.createSequentialGroup()
                        .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ADStdNameLbl)
                            .addComponent(ADStdNameTxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ADStdSurnameLbl)
                            .addComponent(ADStdSurnameTxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ADStdCellLbl)
                            .addComponent(ADStdCellTxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ADStdBorrowLbl)
                            .addComponent(ADStdBorrowCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(ADStdCanelBtn)
                            .addComponent(ADStdModifyBtn)
                            .addComponent(ADStdAddBtn)))
                    .addComponent(ADStd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ADSep1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(ADBookLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AdminLayout.createSequentialGroup()
                        .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ADBkTitleLbl)
                            .addComponent(ADBkTitleTxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ADBkAuthorLbl)
                            .addComponent(ADBkAuthorTxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ADBkISBNLbl)
                            .addComponent(ADBkISBNTxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ADBkCatLbl)
                            .addComponent(ADBkCatCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ADBkAvailabilityLbl)
                            .addComponent(ADBkAvailabilityRBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ADBkModifyBtn)
                            .addComponent(ADBkAddBtn)
                            .addComponent(ADBkCanelBtn)))
                    .addComponent(ADBook, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ADSep2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(ADBackBtn)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ADGenerateBtn)
                        .addComponent(ADDeleteBtn)
                        .addComponent(ADBorrowBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Login, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Admin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Login, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Admin, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * This method allows the Admin / Librarian to enter "Enter" to submit there input
     * More user-friendly approach
     * @param evt - default parameter when button clicked
     */
    private void LGPasswordTxfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LGPasswordTxfActionPerformed
        LGSubmitBtnActionPerformed(evt);
    }//GEN-LAST:event_LGPasswordTxfActionPerformed

    /**
     * This method takes the Admin / Librarian inputs (Username and Password)
     * Compares to the Admin Database
     * Either grants or denies access
     * If access is granted a message will display
     *      Directs to Admin panel
     * Else possible reasons for access denial will display
     * @param evt - default parameter when button clicked
     */
    private void LGSubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LGSubmitBtnActionPerformed
        String flag = "NotFound";
        String result = "";
        if (!LGAdminNameTxf.getText().isEmpty() && !LGPasswordTxf.getText().isEmpty()) {
            for (Admin staff : adminList) {
                result = staff.equals(LGAdminNameTxf.getText(), LGPasswordTxf.getText());
                if(result.equals("true")){
                    break;
                }
            }
            if (result.equals("password")) {
                    JOptionPane.showConfirmDialog(null, "Incorrect password", "Authentication", 2, 0);
                } else if (result.equals("username")) {
                    JOptionPane.showConfirmDialog(null, "Incorrect username", "Authentication", 2, 0);
                } else if (result.equals("true")) {
                    cleanAdmin();
                    cleanBook();
                } else {
                    JOptionPane.showConfirmDialog(null, "Incorrect username and password", "Authentication", 2, 0);
                }
        } else if (LGAdminNameTxf.getText().isEmpty() || LGPasswordTxf.getText().isEmpty()) {
            JOptionPane.showConfirmDialog(rootPane, "Please fill in all fields", "Missing input", 2, 3);
        }
    }//GEN-LAST:event_LGSubmitBtnActionPerformed
    /**
     * Takes Admin / Librarian back to Login panel
     * @param evt - default parameter when button clicked
     */
    private void ADBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADBackBtnActionPerformed
        cleanLogin();
    }//GEN-LAST:event_ADBackBtnActionPerformed
/**
 * Admin / User may press "Enter" to submit their Login
 * @param evt - default parameter when button clicked
 */
    private void LGAdminNameTxfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LGAdminNameTxfActionPerformed
        LGSubmitBtnActionPerformed(evt);
    }//GEN-LAST:event_LGAdminNameTxfActionPerformed
/**
 * Admin / Librarian or User / Student may make use of this function to look up a specific book by its Title
 * If book is found 2 results may occur and a message will display
 *      Book is found but not available for borrowing
 *      Book is found and is available for borrowing
 * Else if User didnt input a search condition, then a message will display
 *      Please enter book title
 * Else
 *      Book is not in the library
 * @param evt  - default parameter when button clicked
 */
    private void LGSearchSubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LGSearchSubmitBtnActionPerformed
        if (LGSearchTxf.getText().equals("Search for book") || LGSearchTxf.getText().isEmpty()) {
            JOptionPane.showConfirmDialog(rootPane, "Please enter book title", "Wrong input", 2, 3);
        } else {
            Book wantedBook = new Book(LGSearchTxf.getText());
            if (bookList.contains(wantedBook)) {
                LGBookLst.setSelectedIndex(bookList.indexOf(wantedBook));
                wantedBook = bookList.get(bookList.indexOf(wantedBook));
                if (wantedBook.getAvailable().equals("false")) {
                    JOptionPane.showConfirmDialog(rootPane, "Book is found but not available for borrowing", "Results", 2, 1);
                } else {
                    JOptionPane.showConfirmDialog(rootPane, "Book is found but and is available for borrowing", "Results", 2, 1);
                }
            } else {
                JOptionPane.showConfirmDialog(rootPane, "Book not found in Library", "Results", 2, 3);
            }
        }
    }//GEN-LAST:event_LGSearchSubmitBtnActionPerformed
/**
 * Ignore IDLE auto generated code cant remove
 * @param evt - default parameter when button clicked
 */
    private void ADStdNameTxfActionPerformed(java.awt.event.ActionEvent evt) {
        //just ignore weird netbeans shizz cant delete
    }
/**
 * Ignore IDLE auto generated code cant remove
 * @param evt - default parameter when button clicked
 */
    private void ADBkAuthorTxfActionPerformed(java.awt.event.ActionEvent evt) {
        //just ignore weird netbeans shizz cant delete
    }

    /**
     * Ignore IDLE auto generated code cant remove
     * @param evt - default parameter when button clicked
     */
    public void ADStdSurnameTxfActionPerformed(java.awt.event.ActionEvent evt) {
        //just ignore weird netbeans shizz cant delete
    }
/**
 * Allows User / Student or Admin / Librarian to submit search condition by pressing "Enter"
 * A more user-friendly approach
 * @param evt - default parameter when button clicked
 */
    private void LGSearchTxfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LGSearchTxfActionPerformed
        LGSearchSubmitBtnActionPerformed(evt);
    }//GEN-LAST:event_LGSearchTxfActionPerformed
/**
 * From the Student list and when an item is selected
 * Its attributes are shown in the corresponding text fields and combo box etc
 * Modify, Delete and Cancel functions are available
 * Back and Generate are unavailable
 * @param evt - default parameter when button clicked
 */
    private void ADStdLstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADStdLstMouseClicked
        User selectedUser = userList.get(ADStdLst.getSelectedIndex());
        ADStdNameTxf.setText(selectedUser.getFirstName());
        ADStdSurnameTxf.setText(selectedUser.getSurname());
        ADStdCellTxf.setText(selectedUser.getCellNum());
        ADStdBorrowCombo.setSelectedIndex(selectedUser.getBorrowBook());
        ADStdModifyBtn.setEnabled(true);
        ADStdAddBtn.setEnabled(false);
        ADStdCanelBtn.setEnabled(true);

        //Delete
        if (ADBookLst.isSelectionEmpty() && !ADStdLst.isSelectionEmpty()) {
            ADDeleteBtn.setEnabled(true);
        }
        else if(!ADBookLst.isSelectionEmpty() && !ADStdLst.isSelectionEmpty()){
            ADDeleteBtn.setEnabled(false);
            ADBorrowBtn.setEnabled(true);
        }
        else {
            ADDeleteBtn.setEnabled(false);
        }
    }//GEN-LAST:event_ADStdLstMouseClicked
/**
 * From the Student List
 * Only when an item is selected Admin / Librarian can Modify
 * It checks if all attributes are filled in
 * Else a display message is shown to Admin / Librarian
 * Student record is updated in Student Database
 * Student List is updated
 * @param evt - default parameter when button clicked
 */
    private void ADStdModifyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADStdModifyBtnActionPerformed
        if (ADStdModifyBtn.getText().equals("Modify")) {
            ADStdModifyBtn.setText("Done");
            unLockADUser();
            lockADBookPart();
            ADStdModifyBtn.setEnabled(true);
            ADStdAddBtn.setEnabled(false);
        } else {
            obtainADUser();
        }
    }//GEN-LAST:event_ADStdModifyBtnActionPerformed
/**
 * Sets Student attributes to default, hence clears them
 * Locks and unlocks all corresponding components
 * @param evt - default parameter when button clicked
 */
    private void ADStdCanelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADStdCanelBtnActionPerformed
        cleanAdmin();
        cleanBook();
        lockADBookPart();
        ADBkAddBtn.setEnabled(true);
        ADBookLst.setEnabled(true);
    }//GEN-LAST:event_ADStdCanelBtnActionPerformed
/**
 * From the Student List
 * Only when an item is unselected Admin / Librarian can Add
 * It checks if all attributes are filled in
 * Else a display message is shown to Admin / Librarian
 * Student record is created and added into Student Database
 * Student list is updated
 * @param evt - default parameter when button clicked
 */
    private void ADStdAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADStdAddBtnActionPerformed
        if (ADStdAddBtn.getText().equals("Add")) {
            ADStdAddBtn.setText("Done");
            unLockADUser();
            lockADBookPart();
            ADStdModifyBtn.setEnabled(false);
            ADStdAddBtn.setEnabled(true);
        } else {
            createADUser();
        }
    }//GEN-LAST:event_ADStdAddBtnActionPerformed
/**
 * From the Book list and when an item is selected
 * Its attributes are shown in the corresponding text fields and combo box etc
 * Modify, Delete and Cancel functions are available
 * Back and Generate are unavailable
 * @param evt - default parameter when button clicked
 */
    private void ADBookLstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADBookLstMouseClicked
        Book selectedBook = bookList.get(ADBookLst.getSelectedIndex());
        ADBkTitleTxf.setText(selectedBook.getTitle());
        ADBkAuthorTxf.setText(selectedBook.getAuthor());
        ADBkISBNTxf.setText(selectedBook.getISBN());
        ADBkCatCombo.setSelectedIndex(selectedBook.genreIndex());
        ADBkAvailabilityRBtn.setSelected(selectedBook.availability());
        ADBkModifyBtn.setEnabled(true);
        ADBkAddBtn.setEnabled(false);
        ADBkCanelBtn.setEnabled(true);

        if (ADStdLst.isSelectionEmpty() && !ADBookLst.isSelectionEmpty()) {
            ADDeleteBtn.setEnabled(true);
        }else if(!ADStdLst.isSelectionEmpty() && !ADBookLst.isSelectionEmpty()){
            ADDeleteBtn.setEnabled(false);
            ADBorrowBtn.setEnabled(true);
        } 
        else {
            ADDeleteBtn.setEnabled(false);
        }
    }//GEN-LAST:event_ADBookLstMouseClicked
/**
 * From the Book List
 * Only when an item is selected Admin / Librarian can Modify
 * It checks if all attributes are filled in
 * Else a display message is shown to Admin / Librarian
 * Book record is updated in Book Database
 * Book List is updated
 * @param evt - default parameter when button clicked
 */
    private void ADBkModifyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADBkModifyBtnActionPerformed
        if (ADBkModifyBtn.getText().equals("Modify")) {
            ADBkModifyBtn.setText("Done");
            unLockADBook();
            lockADUserPart();
            ADBkModifyBtn.setEnabled(true);
            ADBkAddBtn.setEnabled(false);
        } else {
            obtainADBook();
        }
    }//GEN-LAST:event_ADBkModifyBtnActionPerformed
/**
 * Sets Book attributes to default, hence clears them
 * Locks and unlocks all corresponding components
 * @param evt - default parameter when button clicked
 */
    private void ADBkCanelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADBkCanelBtnActionPerformed
        cleanBook();
        cleanAdmin();
        lockADUserPart();
        ADStdAddBtn.setEnabled(true);
        ADStdLst.setEnabled(true);
    }//GEN-LAST:event_ADBkCanelBtnActionPerformed
/**
 * From the Book List
 * Only when an item is unselected Admin / Librarian can Add
 * It checks if all attributes are filled in
 * Else a display message is shown to Admin / Librarian
 * Book record is created and added into Book Database
 * Book list is updated
 * @param evt - default parameter when button clicked
 */
    private void ADBkAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADBkAddBtnActionPerformed
        if (ADBkAddBtn.getText().equals("Add")) {
            ADBkAddBtn.setText("Done");
            unLockADBook();
            lockADUserPart();
            ADBkModifyBtn.setEnabled(false);
            ADBkAddBtn.setEnabled(true);
        } else {
            createADBook();
        }
    }//GEN-LAST:event_ADBkAddBtnActionPerformed
/**
 * Delete button is only available when either an item is selected from Student list or Book list
 * Not Both
 * That record is deleted and Database is updated
 * List is updated
 * Successfully delete message is displayed
 * @param evt - default parameter when button clicked
 */
    private void ADDeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDeleteBtnActionPerformed
        if (ADBookLst.isSelectionEmpty() && !ADStdLst.isSelectionEmpty()) {
            String result = "Successfully deleted student with ID " + userList.get(ADStdLst.getSelectedIndex()).getUserID() + ", " + userList.get(ADStdLst.getSelectedIndex()).getFirstName() + " " + userList.get(ADStdLst.getSelectedIndex()).getSurname();
            userList.remove(ADStdLst.getSelectedIndex());
            refreshList();
            cleanAdmin();
            JOptionPane.showConfirmDialog(rootPane, result, "Results", 2, 1);
        } else if (!ADBookLst.isSelectionEmpty() && ADStdLst.isSelectionEmpty()) {
            String result = "Successfully deleted book with ID " + bookList.get(ADBookLst.getSelectedIndex()).getBookID() + ", " + bookList.get(ADBookLst.getSelectedIndex()).getTitle() + " - " + bookList.get(ADBookLst.getSelectedIndex()).getAuthor();
            bookList.remove(ADBookLst.getSelectedIndex());
            refreshList();
            cleanBook();
            JOptionPane.showConfirmDialog(rootPane, result, "Results", 2, 1);
        }
    }//GEN-LAST:event_ADDeleteBtnActionPerformed
/**
 * Exports all Database into external csv files
 * Attributes are splitted by ","
 * Successfully message is displayed
 * @param evt - default parameter when button clicked
 */
    private void ADGenerateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADGenerateBtnActionPerformed
        //Saves the database in a CSV file
        String save = "";
        try {
            for (Book b : bookList) {
                save += b.save();
            }
            FileWriter temp = new FileWriter("BooksData.csv");
            temp.write(save);
            temp.close();
            save = "";
            for (User u : userList) {
                save += u.save();
            }
            temp = new FileWriter("UsersData.csv");
            temp.write(save);
            temp.close();
        } catch (IOException e) {
            e.getMessage();
        }
        JOptionPane.showConfirmDialog(rootPane, "Successfully generate csv report","Success",2,-1);
    }//GEN-LAST:event_ADGenerateBtnActionPerformed
/**
 * Borrow button is only available when an item from both Student list and Book list are selected
 * If User / Student hasnt borrowed that book
 * and If User / Student hasnt borrowed 5 of more books
 * Then User / Student may borrow it
 * Student record is updated (Borrowbooks increases and BookID is added)
 * Else if User / Student has borrowed that book
 * Then its an return
 * Student record is update (Borrowbooks decrease and BookID is removed)
 * Else
 * User / Student reached its maximum amount of borrowing limits
 * Messages are displayed for all 3 options
 * @param evt - default parameter when button clicked
 */
    private void ADBorrowBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADBorrowBtnActionPerformed
        User currentUser = userList.get(ADStdLst.getSelectedIndex());
            if(currentUser.getBookIDs().contains(""+bookList.get(ADBookLst.getSelectedIndex()).getBookID()) && currentUser.getBorrowBook() != 0){
                currentUser.setBorrowBook(currentUser.getBorrowBook()-1);
                currentUser.setBookIDs(currentUser.getBookIDs().replace("-"+bookList.get(ADBookLst.getSelectedIndex()).getBookID(), ""));
                JOptionPane.showConfirmDialog(rootPane, "This student has successfully returned the book "+ADBkTitleTxf.getText(),"Result",2,1);
                refreshList();
                cleanAdmin();
                cleanBook();
            }else if(currentUser.getBorrowBook() != 5){
                if(bookList.get(ADBookLst.getSelectedIndex()).getAvailable().equals("true")){
                    currentUser.setBorrowBook(currentUser.getBorrowBook()+1);
                    currentUser.setBookIDs(currentUser.getBookIDs()+"-"+bookList.get(ADBookLst.getSelectedIndex()).getBookID());
                    JOptionPane.showConfirmDialog(rootPane, "This student has successfully borrowed the book "+ADBkTitleTxf.getText(),"Result",2,1);
                    refreshList();
                    cleanAdmin();
                    cleanBook();
                }else{
                    JOptionPane.showConfirmDialog(rootPane, "This Book is not available for borrowing.","Result",2,1);
                }
            }else{
                JOptionPane.showConfirmDialog(rootPane, "This student has borrowed the maximum amount of books","Result",2,1);
            }
        
    }//GEN-LAST:event_ADBorrowBtnActionPerformed
/**
 * Sets the Login panel to its default and start up format
 */
    private void cleanLogin() {
        setContentPane(Login);
        Admin.setVisible(false);
        Login.setVisible(true);
        LGAdminNameTxf.setText(null);
        LGPasswordTxf.setText(null);
        LGSearchTxf.setText("Search for book");
        LGBookLst.clearSelection();
    }
/**
 * Lock / setEnabled(false) to all function
 * That are not allowed during Modify and Add
 */
    private void lockFunctions() {
        ADBackBtn.setEnabled(false);
        ADDeleteBtn.setEnabled(false);
        ADBorrowBtn.setEnabled(false);
        ADGenerateBtn.setEnabled(false);
    }
/**
 * unLock / setEnabled(true) to all function
 * That are not allowed during Modify and Add
 */
    private void unLockFunctions() {
        ADBackBtn.setEnabled(true);
        ADDeleteBtn.setEnabled(false);
        ADGenerateBtn.setEnabled(true);
        ADBorrowBtn.setEnabled(false);
    }
/**
 * unLock / setEnabled(true) to all function User / Student attributes
 */
    private void unLockADUser() {
        ADStdNameTxf.setEnabled(true);
        ADStdSurnameTxf.setEnabled(true);
        ADStdCellTxf.setEnabled(true);
        ADStdBorrowCombo.setEnabled(true);
        ADStdCanelBtn.setEnabled(true);
        ADStdLst.setEnabled(false);
        //functions
        ADBackBtn.setEnabled(false);
        ADGenerateBtn.setEnabled(false);
        ADDeleteBtn.setEnabled(false);
    }
/**
 * Lock / setEnabled(false) to all function Book attributes
 */
    private void unLockADBook() {
        ADBkTitleTxf.setEnabled(true);
        ADBkAuthorTxf.setEnabled(true);
        ADBkISBNTxf.setEnabled(true);
        ADBkCatCombo.setEnabled(true);
        ADBkAvailabilityRBtn.setEnabled(true);
        ADBookLst.setEnabled(false);
        ADBkCanelBtn.setEnabled(true);
        //functions
        ADBackBtn.setEnabled(false);
        ADGenerateBtn.setEnabled(false);
        ADDeleteBtn.setEnabled(false);
    }
/**
 * Lock / setEnabled(false) to parts function User / Student attributes
 */
    private void lockADUserPart() {
        ADStdLst.setEnabled(false);
        ADStdAddBtn.setEnabled(false);
        ADStdModifyBtn.setEnabled(false);
        ADStdCanelBtn.setEnabled(false);
    }
/**
 * Lock / setEnabled(false) to parts function Book attributes
 */
    private void lockADBookPart() {
        ADBookLst.setEnabled(false);
        ADBkAddBtn.setEnabled(false);
        ADBkModifyBtn.setEnabled(false);
        ADBkCanelBtn.setEnabled(false);
    }
/**
 * unLock / setEnabled(true) to parts function User / Student attributes
 */
    private void unLockADUserPart() {
        ADStdLst.setEnabled(true);
        ADStdAddBtn.setEnabled(true);
        ADStdModifyBtn.setEnabled(true);
        ADStdCanelBtn.setEnabled(true);
    }
/**
 * unLock / setEnabled(true) to parts function Book attributes
 */
    private void unLockADBookPart() {
        ADBookLst.setEnabled(true);
        ADBkAddBtn.setEnabled(true);
        ADBkModifyBtn.setEnabled(true);
        ADBkCanelBtn.setEnabled(true);
    }
/**
 * Lock / setEnabled(false) to all attributes and functions User / Student attributes
 */
    private void lockADUser() {
        ADStdNameTxf.setEnabled(false);
        ADStdSurnameTxf.setEnabled(false);
        ADStdCellTxf.setEnabled(false);
        ADStdBorrowCombo.setEnabled(false);
        ADStdModifyBtn.setEnabled(false);
        ADStdAddBtn.setEnabled(true);
        ADStdCanelBtn.setEnabled(false);
        ADStdLst.setEnabled(true);
        //functions
        ADBackBtn.setEnabled(true);
        ADGenerateBtn.setEnabled(true);
        ADDeleteBtn.setEnabled(false);
    }
/**
 * Lock / setEnabled(false) to all attributes and functions Book attributes
 */
    private void lockADBook() {
        ADBkTitleTxf.setEnabled(false);
        ADBkAuthorTxf.setEnabled(false);
        ADBkISBNTxf.setEnabled(false);
        ADBkCatCombo.setEnabled(false);
        ADBkAvailabilityRBtn.setEnabled(false);
        ADBkModifyBtn.setEnabled(false);
        ADBkAddBtn.setEnabled(true);
        ADBkCanelBtn.setEnabled(false);
        ADBookLst.setEnabled(true);
        //functions
        ADBackBtn.setEnabled(true);
        ADGenerateBtn.setEnabled(true);
        ADDeleteBtn.setEnabled(false);
    }
/**
 * Obtain all User / Student inputs from attributes
 * Checks if all are filled
 * If Not Message is displayed
 * Sets updated attributes
 * Student Database is updated
 * Admin Panel is refreshed
 * Student List is refreshed
 */
    private void obtainADUser() {
        User currentUser = userList.get(ADStdLst.getSelectedIndex());
        if (ADStdNameTxf.getText().isEmpty() || ADStdSurnameTxf.getText().isEmpty() || ADStdCellTxf.getText().isEmpty() || ADStdBorrowCombo.getSelectedIndex() == -1) {
            JOptionPane.showConfirmDialog(rootPane, "Please fill in all student attributes", "Missing fields", 2, 3);
        } else {
            currentUser.setFirstName(ADStdNameTxf.getText());
            currentUser.setSurname(ADStdSurnameTxf.getText());
            currentUser.setCellNum(ADStdCellTxf.getText());
            currentUser.setBorrowBook(ADStdBorrowCombo.getSelectedIndex());
            cleanAdmin();
            refreshList();
        }
    }
/**
 * Obtain all Book inputs from attributes
 * Checks if all are filled
 * If Not Message is displayed
 * Sets updated attributes
 * Book Database is updated
 * Admin Panel is refreshed
 * Book List is refreshed
 */
    private void obtainADBook() {
        Book currentBook = bookList.get(ADBookLst.getSelectedIndex());
        if (ADBkAuthorTxf.getText().isEmpty() || ADBkTitleTxf.getText().isEmpty() || ADBkISBNTxf.getText().isEmpty() || ADBkCatCombo.getSelectedIndex() == -1) {
            JOptionPane.showConfirmDialog(rootPane, "Please fill in all book attributes", "Missing fields", 2, 3);
        } else {
            currentBook.setAuthor(ADBkAuthorTxf.getText());
            currentBook.setTitle(ADBkTitleTxf.getText());
            currentBook.setISBN(ADBkISBNTxf.getText());
            currentBook.indexGenre(ADBkCatCombo.getSelectedIndex());
            currentBook.setAvailable(ADBkAvailabilityRBtn.isSelected());
            cleanBook();
            unLockADUserPart();
            refreshList();
        }
    }
/**
 * Obtain all User / Student inputs from attributes
 * Checks if all are filled
 * If Not Message is displayed
 * Uses these to create a new User / Student object
 * Student Database is updated
 * Admin Panel is refreshed
 * Student List is refreshed
 */
    private void createADUser() {
        if (ADStdNameTxf.getText().isEmpty() || ADStdSurnameTxf.getText().isEmpty() || ADStdCellTxf.getText().isEmpty() || ADStdBorrowCombo.getSelectedIndex() == -1) {
            JOptionPane.showConfirmDialog(rootPane, "Please fill in all student attributes", "Missing fields", 2, 3);
        } else {
            User newUser = new User(userList.size() + 1 + "", ADStdNameTxf.getText(), ADStdSurnameTxf.getText(), ADStdCellTxf.getText(), "" + ADStdBorrowCombo.getSelectedIndex());
            userList.add(newUser);
            cleanAdmin();
            cleanBook();
            refreshList();
        }
    }
/**
 * Obtain all Book inputs from attributes
 * Checks if all are filled
 * If Not Message is displayed
 * Uses these to create a new Book object
 * Book Database is updated
 * Admin Panel is refreshed
 * Book List is refreshed
 */
    private void createADBook() {
        if (ADBkAuthorTxf.getText().isEmpty() || ADBkTitleTxf.getText().isEmpty() || ADBkISBNTxf.getText().isEmpty() || ADBkCatCombo.getSelectedIndex() == -1) {
            JOptionPane.showConfirmDialog(rootPane, "Please fill in all book attributes", "Missing fields", 2, 3);
        } else {
            Book newBook = new Book(bookList.size() + 1 + "", ADBkTitleTxf.getText(), ADBkAuthorTxf.getText(), "" + "", ADBkISBNTxf.getText(), "");
            if (ADBkAvailabilityRBtn.getSelectedObjects() == null) {
                newBook.setAvailable(false);
            } else {
                newBook.setAvailable(true);
            }
            newBook.indexGenre(ADBkCatCombo.getSelectedIndex());
            bookList.add(newBook);
            cleanBook();
            cleanAdmin();
            refreshList();
        }
    }
/**
 * Lets default to Admin Panel
 *      User / Student Selection
 */
    private void cleanAdmin() {
        //set default values
        setContentPane(Admin);
        Admin.setVisible(true);
        Login.setVisible(false);
        ADStdNameTxf.setText(null);
        ADStdSurnameTxf.setText(null);
        ADStdCellTxf.setText(null);
        ADStdBorrowCombo.setSelectedIndex(-1);
        ADStdLst.clearSelection();
        ADStdModifyBtn.setText("Modify");
        ADStdAddBtn.setText("Add");
        //Lock attributes
        lockADUser();
        //Unlock functions
        unLockFunctions();
    }
/**
 * Lets default to Admin Panel
 *      Book Selection
 */
    private void cleanBook() {
        ADBookLst.clearSelection();
        ADBkAuthorTxf.setText(null);
        ADBkTitleTxf.setText(null);
        ADBkISBNTxf.setText(null);
        ADBkCatCombo.setSelectedIndex(-1);
        ADBkAvailabilityRBtn.setSelected(false);
        ADBkModifyBtn.setText("Modify");
        ADBkAddBtn.setText("Add");
        //Lock attributes
        lockADBook();
        //Unlock functions
        unLockFunctions();
    }
/**
 * Reads in 3 CSV files and stores data into corresponding databases
 * Adds items into corresponding Lists
 * Closes file
 */
    private void readData() {
        try {
            Scanner scan = new Scanner(new FileReader("BooksData.csv"));
            //read book records
            while (scan.hasNextLine()) {
                String[] line = scan.nextLine().split(",");
                Book newBook = new Book(line[0], line[1], line[2], line[3], line[4], line[5]);
                bookList.add(newBook);
            }
            scan.close();
            //read user records
            scan = new Scanner(new FileReader("UsersData.csv"));
            while (scan.hasNextLine()) {
                String[] line = scan.nextLine().split(",");
                User newUser = new User(line[0], line[1], line[2], line[3], line[4]);
                newUser.setBookIDs(line[5].substring(1, line[5].length()-1));
                userList.add(newUser);
            }
            scan.close();
            //read admin records
            scan = new Scanner(new FileReader("AdminsData.csv"));
            while (scan.hasNextLine()) {
                String[] line = scan.nextLine().split(",");
                Admin newAdmin = new Admin(line[0], line[1]);
                adminList.add(newAdmin);
            }
            scan.close();
        } catch (FileNotFoundException e) {
            e.getMessage();
        }
    }
/**
 * Updates all 3 List
 * After an operations
 */
    private void refreshList() {
        model = new DefaultListModel<>();
        for (Book b : bookList) {
            model.addElement(b.toString());
        }
        LGBookLst.setModel(model);
        LGBookLst.clearSelection();

        ADBookLst.setModel(model);
        ADBookLst.clearSelection();

        model = new DefaultListModel<>();
        for (User u : userList) {
            model.addElement(u.toString());
        }
        ADStdLst.setModel(model);
        ADStdLst.clearSelection();
    }

    /**
     *This main method runs the first JFrame with the Login Panel
     * By setting Login panel to visible and Admin panel to invisible
     * Then the 3 data files are read into the corresponding data structures
     * The JList are updated
     * @param args - default parameter 
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
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Panel start = new Panel();
                start.setVisible(true);
                start.Admin.setVisible(false);
                start.readData();
                start.refreshList();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADBackBtn;
    private javax.swing.JButton ADBkAddBtn;
    private javax.swing.JLabel ADBkAuthorLbl;
    private javax.swing.JTextField ADBkAuthorTxf;
    private javax.swing.JLabel ADBkAvailabilityLbl;
    private javax.swing.JRadioButton ADBkAvailabilityRBtn;
    private javax.swing.JButton ADBkCanelBtn;
    private javax.swing.JComboBox<String> ADBkCatCombo;
    private javax.swing.JLabel ADBkCatLbl;
    private javax.swing.JLabel ADBkISBNLbl;
    private javax.swing.JTextField ADBkISBNTxf;
    private javax.swing.JButton ADBkModifyBtn;
    private javax.swing.JLabel ADBkTitleLbl;
    private javax.swing.JTextField ADBkTitleTxf;
    private javax.swing.JScrollPane ADBook;
    private javax.swing.JLabel ADBookLbl;
    private javax.swing.JList<String> ADBookLst;
    private javax.swing.JButton ADBorrowBtn;
    private javax.swing.JButton ADDeleteBtn;
    private javax.swing.JButton ADGenerateBtn;
    private javax.swing.JSeparator ADSep1;
    private javax.swing.JSeparator ADSep2;
    private javax.swing.JScrollPane ADStd;
    private javax.swing.JButton ADStdAddBtn;
    private javax.swing.JComboBox<String> ADStdBorrowCombo;
    private javax.swing.JLabel ADStdBorrowLbl;
    private javax.swing.JButton ADStdCanelBtn;
    private javax.swing.JLabel ADStdCellLbl;
    private javax.swing.JTextField ADStdCellTxf;
    private javax.swing.JList<String> ADStdLst;
    private javax.swing.JButton ADStdModifyBtn;
    private javax.swing.JLabel ADStdNameLbl;
    private javax.swing.JTextField ADStdNameTxf;
    private javax.swing.JLabel ADStdSurnameLbl;
    private javax.swing.JTextField ADStdSurnameTxf;
    private javax.swing.JLabel ADStudentLbl;
    private javax.swing.JPanel Admin;
    private javax.swing.JLabel LGAdminLbl;
    private javax.swing.JLabel LGAdminNameLbl;
    private javax.swing.JTextField LGAdminNameTxf;
    private javax.swing.JScrollPane LGBook;
    private javax.swing.JList<String> LGBookLst;
    private javax.swing.JTextArea LGHelpTxa;
    private javax.swing.JLabel LGPasswordLbl;
    private javax.swing.JPasswordField LGPasswordTxf;
    private javax.swing.JLabel LGSearchLbl;
    private javax.swing.JButton LGSearchSubmitBtn;
    private javax.swing.JTextField LGSearchTxf;
    private javax.swing.JSeparator LGSep;
    private javax.swing.JButton LGSubmitBtn;
    private javax.swing.JScrollPane LGTxa;
    private javax.swing.JPanel Login;
    // End of variables declaration//GEN-END:variables
}
