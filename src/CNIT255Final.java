/**
 *
 * @author Dave
 */

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.text.DecimalFormat;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.BoundedRangeModel;
import javax.swing.JPasswordField;

public class CNIT255Final extends javax.swing.JFrame implements AdminLogin {




    private static CustomerAccount currentCustomer;// = new CustomerAccount("David", "Tang", "4/14/19", (new Address("1342 Manicott Dr", "New Yourk", "New York", "USA", "23232")), (new ContactInfo("david@gmail.com", "4315581459")), (new LoginCredentials()), "22", "22");
    private static AdminAccount adminProfile;

    private static ArrayList< ItemStock > itemStockList = new ArrayList<>();    //Holds the list of items we offer
    private static ArrayList<Supplier> supplierList = new ArrayList<>();        //Holds the list of suppliers
    private static ArrayList<Category> categoryList = new ArrayList<>();        //Holds the list of categories
    private static ArrayList< Item > cartList = new ArrayList< Item >();        //Holds the list of items in the customer's cart

    private static DefaultListModel cartModel = new DefaultListModel();
    private static DefaultComboBoxModel categoryModel = new DefaultComboBoxModel();
    private static DefaultListModel productModel = new DefaultListModel();
    //private static DefaultListModel productModelCopy = new DefaultListModel();
    private static DefaultListModel productQuantModel = new DefaultListModel();
    
    private static DefaultListModel productElectronics = new DefaultListModel(); // Electronic products only
    private static DefaultListModel productFood = new DefaultListModel(); // Food products only
    private static DefaultListModel productGames = new DefaultListModel(); // Game products only
    
    private static DefaultListModel productElectronicsQuant = new DefaultListModel();
    private static DefaultListModel productFoodQuant = new DefaultListModel();
    private static DefaultListModel productGamesQuant = new DefaultListModel();

    private static DecimalFormat moneyFormat = new DecimalFormat("#.##");
    
    private static double cartTotal = 0.0;
    private static int comboCounter = 0;
    //private static

    /**
     * Creates new form CNIT255Final
     */
    public CNIT255Final(CustomerAccount currentCust) {
        initComponents();
        currentCustomer = currentCust;

        //Lists all of our products in the jList.  jList's variable is called ProductList
        for (int i=0; i<itemStockList.size(); i++) {
            productModel.addElement(itemStockList.get(i).getName());
        }
        ProductList.setModel(productModel);
        
        refreshLists();
        
        
        DefaultListModel supplierModel = new DefaultListModel();
        for (int i=0; i<supplierList.size(); i++) {
            supplierModel.addElement(supplierList.get(i).getCompanyName());
        }
        jListSupplier.setModel(supplierModel);
        
        DefaultListModel categoryModel = new DefaultListModel();
        
        for (int i=0; i<categoryList.size(); i++) {
            categoryModel.addElement(categoryList.get(i).getCategoryName());
            System.out.println(categoryList.get(i).getCategoryName());
        }
        jListCategory.setModel(categoryModel); 
       
        ProductList.addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    
                    String selectedName = ProductList.getSelectedValue();
                    
                    for( int i = 0; i < itemStockList.size(); i++ ){
                            ItemStock test = itemStockList.get( i );
                            String checkName = test.getName();
                            if(checkName.equals(selectedName)) {
                                txtDescription.setText("Price: " + test.getPrice() + "   :   " + test.getItemDescription());
                            }
                    }
                    //txtDescription.setText(ProductList.getSelectedValue());
                }
            }
        });
        
        //Cart Name
        cartName.setText(currentCustomer.getFirstName() + "'s Cart");
        
        // Initialize cart JList
        cartJList.setModel( cartModel );

        //Creating the admin profile, needs to be in a try catch since it throws NoSuchAlgorithmException
        try
        {
            adminProfile = new AdminAccount("Joe", "Smith", "7/22/16", (new Address("8173 S. Rockland Ave.", "Downers Grove", "Illinois", "USA", "60515")), (new ContactInfo("joesmith@business.com", "6302564410")), (new LoginCredentials("admin", "9b92b150d0d4bcf5727873780ef83b4233d326ff05fc9509f0ee7548b52a7477")), "A0001", "3/5/13");
        }
        catch (NoSuchAlgorithmException e)
        {
            System.out.println("Something went wrong, see: " + e);
        }
        
        //Making both scroll panes scroll at the same time
        BoundedRangeModel model = jScrollPane1.getVerticalScrollBar().getModel();
        jScrollPane2.getVerticalScrollBar().setModel(model);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogAdminPanel = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldItemName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldItemPrice = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldItemStock = new javax.swing.JTextField();
        jTextFieldItemExpirationDate = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldItemDescription = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListSupplier = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jListCategory = new javax.swing.JList<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButtonAddItem = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductList = new javax.swing.JList<>();
        addToCart = new javax.swing.JButton();
        cartName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cartTotalText = new javax.swing.JTextField();
        purchaseCartButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        cartJList = new javax.swing.JList<>();
        clearCartButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        productQuantityList = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cboCategory = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        logOut = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItemAdminPanel = new javax.swing.JMenuItem();

        jDialogAdminPanel.setMinimumSize(new java.awt.Dimension(700, 475));

        jLabel5.setText("Username");

        jLabel6.setText("Password");

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Name");

        jLabel8.setText("Price");

        jLabel9.setText("Stock Level");

        jLabel10.setText("Expiration Date");

        jLabel11.setText("Description");

        jListSupplier.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jListSupplier);

        jListCategory.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(jListCategory);

        jLabel12.setText("Supplier");

        jLabel13.setText("Category");

        jButtonAddItem.setText("Add Item");
        jButtonAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddItemActionPerformed(evt);
            }
        });

        jMenu2.setText("File");

        jMenuItem2.setText("Exit Admin Panel");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar2.add(jMenu2);

        jDialogAdminPanel.setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout jDialogAdminPanelLayout = new javax.swing.GroupLayout(jDialogAdminPanel.getContentPane());
        jDialogAdminPanel.getContentPane().setLayout(jDialogAdminPanelLayout);
        jDialogAdminPanelLayout.setHorizontalGroup(
            jDialogAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogAdminPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialogAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDialogAdminPanelLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldItemDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDialogAdminPanelLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldItemExpirationDate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDialogAdminPanelLayout.createSequentialGroup()
                        .addGroup(jDialogAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(jDialogAdminPanelLayout.createSequentialGroup()
                                .addGroup(jDialogAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jDialogAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(49, 49, 49)
                        .addGroup(jDialogAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jDialogAdminPanelLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDialogAdminPanelLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldItemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDialogAdminPanelLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldItemStock, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(37, 37, 37)
                .addGroup(jDialogAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(32, 32, 32)
                .addGroup(jDialogAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jButtonAddItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jDialogAdminPanelLayout.setVerticalGroup(
            jDialogAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogAdminPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialogAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDialogAdminPanelLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDialogAdminPanelLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDialogAdminPanelLayout.createSequentialGroup()
                        .addGroup(jDialogAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDialogAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jTextFieldItemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDialogAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jLabel9)
                            .addComponent(jTextFieldItemStock, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDialogAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextFieldItemExpirationDate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDialogAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTextFieldItemDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAddItem)
                .addContainerGap(254, Short.MAX_VALUE))
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane6.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane7.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        ProductList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ProductList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ProductList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProductList);

        addToCart.setText("Add to Cart");
        addToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartActionPerformed(evt);
            }
        });

        cartName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cartName.setText("Your Cart");

        jLabel2.setText("Total:");

        cartTotalText.setEditable(false);
        cartTotalText.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cartTotalText.setText("$0.00");

        purchaseCartButton.setText("Purchase Cart");
        purchaseCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseCartButtonActionPerformed(evt);
            }
        });

        cartJList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(cartJList);

        clearCartButton.setText("Clear Cart");
        clearCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearCartButtonActionPerformed(evt);
            }
        });

        productQuantityList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {  };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(productQuantityList);

        jLabel3.setText("Products:");

        jLabel4.setText("Qnt:");

        cboCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCategoryActionPerformed(evt);
            }
        });

        jLabel1.setText("Category:");

        logOut.setText("Log Out");
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });

        jButton2.setText("History");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtDescription.setColumns(20);
        txtDescription.setLineWrap(true);
        txtDescription.setRows(5);
        txtDescription.setWrapStyleWord(true);
        jScrollPane8.setViewportView(txtDescription);

        jMenu1.setText("File");

        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItemAdminPanel.setText("Admin Panel");
        jMenuItemAdminPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAdminPanelActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemAdminPanel);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(83, 83, 83))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cartName, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(logOut))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cartTotalText, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addToCart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearCartButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(purchaseCartButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cartName)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(logOut)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(purchaseCartButton)
                            .addComponent(clearCartButton)
                            .addComponent(addToCart))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cboCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cartTotalText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartActionPerformed
        //Adds the currently selected jList item into the 'currentCustomer's shopping cart

        String target = ProductList.getSelectedValue();

        for( int i = 0; i < itemStockList.size(); i++ )
        {
            ItemStock test = itemStockList.get( i );
            String checkName = test.getName();

            if( checkName.equals( target ))
            {
                //Checks to see if there is enough stock
                if(test.getStock() < 1) {
                    JOptionPane.showMessageDialog(this, "Item is out of stock!", "Item Out of Stock", JOptionPane.ERROR_MESSAGE);
                    break;
                }

                System.out.println("Found " + target);

                //                (No longer Relivent, using cartList ArrayList)

//                 currentCustomer.getShoppingcart().addItemToCart( (new ItemOrder(test.getIndex(), test.getName(), test.getPrice(), test.getTheSupplier(),
//                                                                    test.getExpirationDate(), test.getItemDescription(), test.getMyCategory(),
//                                                                    5)) );      //5 is the placeholder for ordernumber.

                //System.out.println("Added: " + currentCustomer.getShoppingcart().getCart().get(0).getName());
                /*
                System.out.println("Items in Cart:");
                for(ItemOrder a : currentCustomer.getShoppingcart().getCart()) {
                    System.out.println(a.getName());
                }*/

                // Change the cart list to reflect current cart changes
                cartModel.addElement( test.getName() );
                cartList.add( new Item(test.getIndex(), test.getName(), test.getPrice(), test.getTheSupplier(), //????~~
                        test.getExpirationDate(), test.getItemDescription(), test.getMyCategory() ));

                //Decreasing Stock
                itemStockList.get(i).setStock( (itemStockList.get(i).getStock() - 1) );


                // Calculate new total cart price
                String cartPrice = cartTotalText.getText().substring( 1 );
                double newCartPrice = test.getPrice() + Double.parseDouble( cartPrice );
                String stringNewCartPrice = moneyFormat.format(newCartPrice);
                cartTotalText.setText( "$" + stringNewCartPrice );

                cartTotal = newCartPrice;
                cboCategory.setSelectedIndex( 0 );
                refreshLists();
                ProductList.setSelectedValue(target, rootPaneCheckingEnabled);
                return;
            }
        }


    }//GEN-LAST:event_addToCartActionPerformed


    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);             //Exits the window
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void ProductListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductListMouseClicked

    }//GEN-LAST:event_ProductListMouseClicked

    private void purchaseCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseCartButtonActionPerformed
        JDialog.setDefaultLookAndFeelDecorated( true );
        int response = JOptionPane.showConfirmDialog( null, "Would you like to purchase the cart? Total is $" + moneyFormat.format(cartTotal), "Purchase confirmation",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE );

        if( response == JOptionPane.YES_OPTION )
        {
          System.out.println("Yes button clicked");
          System.out.println("Cart size: " + cartList.size());


            int cartSize = cartList.size();
            for( int i = cartSize - 1; i >= 0; i-- )
            {
                System.out.println("cartList.size(): " + cartList.size());
                System.out.println("Loop #: " + i);

                //removing 1 from the stock
                //int currentStock = itemStockList.get( (cartList.get(i).getIndex()) ).getStock();
                //itemStockList.get( (cartList.get(i).getIndex()) ).setStock(currentStock - 1);

                currentCustomer.getPurchaseHistory().add(cartList.get(i).getPrice() + "    :  " + cartList.get(i).getName());
                
                
                cartList.remove(i);
            }
            //cartList = null;
            refreshLists();

            cartModel.removeAllElements();
            cartTotalText.setText( "$0.0" );
            cartTotal = 0;

            System.out.println("Cart Size at end: " + cartList.size());
            JOptionPane.showMessageDialog(this, "Your Purchase Has Been Recorded.", "Purchase Sucessfull", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_purchaseCartButtonActionPerformed

    private void clearCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearCartButtonActionPerformed
        cartModel.removeAllElements();
        cartTotalText.setText( "$0.00" );
        cartTotal = 0;
        
        for( int i = cartList.size() - 1; i >= 0; i-- )
        {

            //Adding items back into inventory
            int currentStock = itemStockList.get( (cartList.get(i).getIndex()) ).getStock();
            itemStockList.get( (cartList.get(i).getIndex()) ).setStock(currentStock + 1);

            //removing item from cart
            cartList.remove( i );

            //System.out.println("Cart size: " + cartList.size());
        }
        
        ProductList.setModel( productModel );
        productQuantityList.setModel( productQuantModel );
        cboCategory.setSelectedItem( "" );
        refreshLists();
    }//GEN-LAST:event_clearCartButtonActionPerformed

    private void jMenuItemAdminPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAdminPanelActionPerformed
        jDialogAdminPanel.setVisible(true);
        
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);
        jLabel10.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        
        jTextFieldItemName.setVisible(false);
        jTextFieldItemPrice.setVisible(false);
        jTextFieldItemStock.setVisible(false);
        jTextFieldItemExpirationDate.setVisible(false);
        jTextFieldItemDescription.setVisible(false);
        
        jListSupplier.setVisible(false);
        jListCategory.setVisible(false);
        
        jButtonAddItem.setVisible(false);
    }//GEN-LAST:event_jMenuItemAdminPanelActionPerformed
    
    @Override
    public boolean checkCredentials(AdminAccount a, LoginCredentials l)
    {
        try
        {
            if((l.getUsername().equals(a.getLoginCreds().getUsername())) && (a.getLoginCreds().checkPassword(jPasswordField.getText())))
            {
                return true;
            }
        }
        catch (NoSuchAlgorithmException e)
        {
            System.out.println("Something went wrong, see: " + e);
        }
        return false;
    }
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LoginCredentials loginCheck = null; //Initialzed with null so Java doesnt freak out
        
        try                                 //Another try catch for catching NoSuchAlgorithmException
        {
            loginCheck = new LoginCredentials(jTextFieldUsername.getText(), new String(jPasswordField.getPassword()));
        }
        catch (NoSuchAlgorithmException e)
        {
            System.out.println("Something went wrong, see: " + e);
        }
        
        //(loginCheck.getUsername().equals(adminProfile.getLoginCreds().getUsername())) && (adminProfile.getLoginCreds().checkPassword(jPasswordField.getText()))
        
        
            if(checkCredentials(adminProfile, loginCheck))
            {                                                                                   //(checkPassword(loginCheck.getPass()))
                System.out.println("bruh moment");
                jLabel7.setVisible(true);
                jLabel8.setVisible(true);
                jLabel9.setVisible(true);
                jLabel10.setVisible(true);
                jLabel11.setVisible(true);
                jLabel12.setVisible(true);
                jLabel13.setVisible(true);

                jTextFieldItemName.setVisible(true);
                jTextFieldItemPrice.setVisible(true);
                jTextFieldItemStock.setVisible(true);
                jTextFieldItemExpirationDate.setVisible(true);
                jTextFieldItemDescription.setVisible(true);

                jListSupplier.setVisible(true);
                jListCategory.setVisible(true);

                jButtonAddItem.setVisible(true);

                jTextFieldUsername.setText("");
                jPasswordField.setText("");
                
                cboCategory.setModel(categoryModel);
            }
            else
            {
                JFrame about = new JFrame();
                JOptionPane.showMessageDialog(about, "Incorrect login credentials.\nPlease try again.");
                jPasswordField.setText("");
            } 
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        jTextFieldUsername.setText("");
        jPasswordField.setText("");
        jDialogAdminPanel.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButtonAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddItemActionPerformed
        JDialog.setDefaultLookAndFeelDecorated(true);
        int response = JOptionPane.showConfirmDialog( null, "Are you sure you want to add this item?", "Admin Add Item",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE );

        if( response == JOptionPane.YES_OPTION )
        {
        
            int supplierIndex = jListSupplier.getSelectedIndex();
            int categoryIndex = jListCategory.getSelectedIndex();
        
            itemStockList.add(new ItemStock(itemStockList.size(), jTextFieldItemName.getText(), Double.parseDouble(jTextFieldItemPrice.getText()), supplierList.get(supplierIndex), jTextFieldItemExpirationDate.getText(), jTextFieldItemDescription.getText(), categoryList.get(categoryIndex), Integer.parseInt(jTextFieldItemStock.getText())));
        
            refreshLists();
        
            jTextFieldItemName.setText("");
            jTextFieldItemPrice.setText("");
            jTextFieldItemStock.setText("");
            jTextFieldItemExpirationDate.setText("");
            jTextFieldItemDescription.setText("");
            
            jListSupplier.clearSelection();
            jListCategory.clearSelection();
        }
    }//GEN-LAST:event_jButtonAddItemActionPerformed

    private void cboCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCategoryActionPerformed
        System.out.println( "Selected category: " + cboCategory.getSelectedItem() );
        
        try
        {
            String targetCategory = cboCategory.getSelectedItem().toString();
            
            if( targetCategory.equals( "All Items" ) ) // If the default "All Items" category is selected, revert ProductList back to normal
            {
                ProductList.setModel( productModel );
                productQuantityList.setModel( productQuantModel );
            }
            else if( targetCategory.equals( "Electronics" ) ) // Set the list to the one that contains electronics only
            {          
                ProductList.setModel( productElectronics );
                productQuantityList.setModel( productElectronicsQuant );
            }
            else if( targetCategory.equals( "Food" ) ) // Repeat above except now it's the food only list
            {
                ProductList.setModel( productFood );
                productQuantityList.setModel( productFoodQuant );
            }
            else if( targetCategory.equals( "Games" ) )// Repeat above except now it's the games only list
            {
                ProductList.setModel( productGames );
                productQuantityList.setModel( productGamesQuant );
            }
        }
        catch( NullPointerException e )
        {
            // Do nothing
        }
                
        
    }//GEN-LAST:event_cboCategoryActionPerformed

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed

        JDialog.setDefaultLookAndFeelDecorated( true );
        int response = JOptionPane.showConfirmDialog( null, "Are you sure you want to log out?", "Log Out",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE );

        comboCounter = 0; // Reset refresher counter
        categoryModel.removeAllElements();
        
        if( response == JOptionPane.YES_OPTION )
        {
            this.setVisible(false);
            new LoginPage().setVisible(true);
        }
        
    }//GEN-LAST:event_logOutActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new customerHistory(currentCustomer).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        //Initalizing Categories
        categoryList.add(new Category("All Items", ""));
        categoryList.add(new Category("Electronics", "All things electronics"));
        categoryList.add(new Category("Food", "Items which can be consumed"));
        categoryList.add(new Category("Games", "The hottest games for all platforms"));
        
        //Initalizing Suppliers
        supplierList.add(new Supplier("FastFit", "Ben Wagrez", (new SupplierContactInfo("fastfit@fastfit.org", "4042728293",
        "12233312", "benwagrez@fastfit.org", "7048217332", "www.fastfit.org")) ));
        supplierList.add(new Supplier("BongoCo", "Bongo Man", (new SupplierContactInfo("bongo@bongoco.com", "8085038020", "58726184", "bongoman@bongoco.com", "9498187115", "www.bongoco.com"))));
        supplierList.add(new Supplier("FunkyFood", "Frank Funky", (new SupplierContactInfo("funkyman@funk.com", "7329304711", "930482234", "funkInc@funk.com", "8289203182", "www.funkfood.com"))));


        //Initalize some Items
        itemStockList.add(new ItemStock(0,"Raspberry Pi", 35.00, supplierList.get(0), "N/A", "A tiny computer", categoryList.get(1), 2000));
        itemStockList.add(new ItemStock(1,"Dell XPS 15", 999.99, supplierList.get(0), "N/A", "A Dell XPS laptop.  Brand new.  Great Value.", categoryList.get(1) ,300));
        itemStockList.add(new ItemStock(2,"Apple Macboook Pro - 13'", 999.99, supplierList.get(0), "N/A", "A tiny computer", categoryList.get(1) ,400));
        itemStockList.add(new ItemStock(3,"ASUS Zenbook S13", 1399.99, supplierList.get(0), "N/A", "A tiny computer", categoryList.get(1) ,600));
        itemStockList.add(new ItemStock(4,"Alienware Area-51m", 2149.99, supplierList.get(0), "N/A", "-- Latest 13.9-inch laptop in the flagship ZenBook series has the world’s thinnest display bezels, NVIDIA GeForce MX150 discrete graphics and 8th Gen Intel Core i7 CPU --", categoryList.get(1) ,300));
        itemStockList.add(new ItemStock(5,"David's Sanityyyyy", 3301.00, supplierList.get(0), "4/16/19", "The quickly fading entity of David's Sanity", categoryList.get(2), 1));
        itemStockList.add(new ItemStock(6, "Tom Clancy's Rainbow Six: Siege", 19.99, supplierList.get(1), "N/A", "Master the art of destruction and gadgetry in Tom Clancy's Rainbow Six Siege.", categoryList.get(3), 500));
        itemStockList.add(new ItemStock(7, "Sid Meier’s Civilization VI", 59.99, supplierList.get(1), "N/A", "Sid Meier's Civilization® VI. Civilization VI offers new ways to interact with your world, expand your empire across the map, advance your culture, and compete against history's greatest leaders!", categoryList.get(3), 700));
        itemStockList.add(new ItemStock(8, "Rocket League", 19.99, supplierList.get(1), "N/A", "Soccer meets driving once again in the long-awaited, physics-based game!", categoryList.get(3), 400));
        itemStockList.add(new ItemStock(9, "Far Cry 5", 59.99, supplierList.get(1), "N/A", "Far Cry 5 is a first-person shooter video game developed by Ubisoft Montreal and Ubisoft Toronto and published by Ubisoft for Microsoft Windows, PlayStation 4 and Xbox One.", categoryList.get(3), 700));
        itemStockList.add(new ItemStock(10, "Grand Theft Auto V", 29.99, supplierList.get(1), "N/A", "Grand Theft Auto V is an action-adventure video game developed by Rockstar North and published by Rockstar Games.", categoryList.get(3), 200));
        itemStockList.add(new ItemStock(11, "Warframe", 0.00, supplierList.get(1), "N/A", "Warframe is a free-to-play cooperative third-person shooter video game developed and published by Digital Extremes.", categoryList.get(3), 1000));
        itemStockList.add(new ItemStock(12, "Kingdom Come: Deliverance", 39.99, supplierList.get(1), "N/A", "Kingdom Come: Deliverance is an action role-playing video game developed by Warhorse Studios and published by Deep Silver.", categoryList.get(3), 1500));
        itemStockList.add(new ItemStock(13, "Counter-Strike: Global Offensive", 14.99, supplierList.get(1), "N/A", "Counter-Strike: Global Offensive is a multiplayer first-person shooter video game developed by Hidden Path Entertainment and Valve Corporation.", categoryList.get(3), 600));
        itemStockList.add(new ItemStock(14, "Jurassic World: Evolution", 44.99, supplierList.get(1), "N/A", "Jurassic World Evolution is a business simulation video game developed and published by Frontier Developments.", categoryList.get(3), 800));
        itemStockList.add(new ItemStock(15, "PlayerUnknown’s Battlegrounds", 29.99, supplierList.get(1), "N/A", "PlayerUnknown's Battlegrounds is an online multiplayer battle royale game developed and published by PUBG Corporation", categoryList.get(3), 700));
        itemStockList.add(new ItemStock(16, "G-Fuel 6 Pack", 9.99, supplierList.get(2), "07/11/2021", "G Fuel, is a brand of caffeinated drink mix sold by Gamma Labs, based in West Babylon, New York. G Fuel has had sponsorship deals with PewDiePie, Dr DisRespect, and FaZe Clan.", categoryList.get(2), 7500));
        itemStockList.add(new ItemStock(17, "Pizza Rolls", 4.99, supplierList.get(2), "09/21/2021", "Pizza Rolls are a frozen food product created by food industry entrepreneur Jeno Paulucci, who specialized in frozen Chinese food, in 1951.", categoryList.get(2), 1100));
        itemStockList.add(new ItemStock(18, "Lagzania", 8.99, supplierList.get(2), "03/11/2022", "B**** Lagzania, yum", categoryList.get(2), 9300));
        itemStockList.add(new ItemStock(19, "Turtle Beach Headphones", 105.00, supplierList.get(0), "N/A", "Hear the turtles with Turtle Beach's latest headphones!!", categoryList.get(1), 130));
        itemStockList.add(new ItemStock(20, "Razar Death Adder", 55.00, supplierList.get(0), "N/A", "Do YOU want to frag like Jerma985?? Well now you can, with the RAZER DEATHADDER!", categoryList.get(1), 230));
        //itemStockList.add(e)

        /*      commented out, not needed? @ Dave
        try {
            LoginCredentials a = new LoginCredentials();
            a.setPass("1234qazw");
            System.out.println(a.getPass());
       }
        catch(NoSuchAlgorithmException e) {
            
        }
        */

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new CNIT255Final(new CustomerAccount()).setVisible(true);
                new LoginPage().setVisible(true);
            }
        });
    }

    public void refreshLists() {

        //DefaultListModel productModel = new DefaultListModel(); Moved to static for reference
        //DefaultListModel productQuantModel = new DefaultListModel();
        
        productModel.removeAllElements();       // Not including these lines will double the list
        productQuantModel.removeAllElements();  // every time refreshLists() is used.
        productElectronics.removeAllElements();
        productFood.removeAllElements();
        productGames.removeAllElements();
        productElectronicsQuant.removeAllElements();
        productFoodQuant.removeAllElements();
        productGamesQuant.removeAllElements();
        //productModelCopy.removeAllElements();   
        
        //Refreshing itemlist and quantities based off of the values in 'itemStockList'
        for (int i=0; i<itemStockList.size(); i++) {
            productModel.addElement(itemStockList.get(i).getName());
            //productModelCopy.addElement(itemStockList.get(i).getName());
            productQuantModel.addElement(itemStockList.get(i).getStock());
            
            //System.out.println( "item stock category: " + itemStockList.get( i ).getCategoryName() );
            
            if( itemStockList.get( i ).getCategoryName().equals( "Electronics" ) ) // If the stock number is 0 and therefore an electronic
            {
                productElectronics.addElement( itemStockList.get( i ).getName() ); //Add to the electronics only list
                productElectronicsQuant.addElement(itemStockList.get( i ).getStock() );
            }
            else if( itemStockList.get( i ).getCategoryName().equals( "Food" ) ) // If the stock number is 0 and therefore an electronic
            {
                productFood.addElement( itemStockList.get( i ).getName() ); //Add to the electronics only list
                productFoodQuant.addElement(itemStockList.get( i ).getStock() );
            }
            else if( itemStockList.get( i ).getCategoryName().equals( "Games" ) ) // If the stock number is 0 and therefore an electronic
            {
                productGames.addElement( itemStockList.get( i ).getName() ); //Add to the electronics only list
                productGamesQuant.addElement(itemStockList.get( i ).getStock() );
            }
        }
        ProductList.setModel(productModel);
        productQuantityList.setModel(productQuantModel);
        
        //categoryModel.removeAllElements();
        
        if( comboCounter == 0 )
        {
            for (int i = 0; i < categoryList.size(); i++) {
            //System.out.println( "Adding " + categoryList.get( i ).getCategoryName() );
            
            //if( categoryModel.getElementAt( 1 ).getCategoryName.equals( "Electronics" ) )
            categoryModel.addElement(categoryList.get(i).getCategoryName());
            
            comboCounter++;
        }
        cboCategory.setModel(categoryModel);
        }
        
        
        // Initialize cart JList
        cartJList.setModel( cartModel );

    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ProductList;
    private javax.swing.JButton addToCart;
    private javax.swing.JList<String> cartJList;
    private javax.swing.JLabel cartName;
    private javax.swing.JTextField cartTotalText;
    private javax.swing.JComboBox<String> cboCategory;
    private javax.swing.JButton clearCartButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAddItem;
    private javax.swing.JDialog jDialogAdminPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jListCategory;
    private javax.swing.JList<String> jListSupplier;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemAdminPanel;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextFieldItemDescription;
    private javax.swing.JTextField jTextFieldItemExpirationDate;
    private javax.swing.JTextField jTextFieldItemName;
    private javax.swing.JTextField jTextFieldItemPrice;
    private javax.swing.JTextField jTextFieldItemStock;
    private javax.swing.JTextField jTextFieldUsername;
    private javax.swing.JButton logOut;
    private javax.swing.JList<String> productQuantityList;
    private javax.swing.JButton purchaseCartButton;
    private javax.swing.JTextArea txtDescription;
    // End of variables declaration//GEN-END:variables
}
