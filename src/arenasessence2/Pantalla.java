package arenasessence2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Formatter;
import java.util.Properties;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Pantalla extends javax.swing.JFrame {

    public Pantalla() {
        initComponents();
        this.setLocationRelativeTo(null);
       // Editar.removeAllItems();
    }
    
    boolean volv;
    boolean filtros = false;
    boolean Fichas = false;
    
    String carpeta;
    
    String barra = File.separator;
    String ubicacionparaCBox;

    public String getUbicacionparaCBox() {
        return ubicacionparaCBox;
    }

    public void setUbicacionparaCBox(String ubicacionparaCBox) {
        this.ubicacionparaCBox = ubicacionparaCBox;
    }
    
    boolean cerro;

    public void setCerro(boolean cerro) {
        this.cerro = cerro;
    }    
    //metodo para llenar automaticamente los campos de "nuevo cliente"
    public void autollenar(){
        Editar.removeAllItems();
        if(Trabacl.getSelectedIndex() != 0){
            Editar.setEnabled(true);
            Selec.setEnabled(true);
            setUbicacionparaCBox(System.getProperty("user.dir")+barra+Trabacl.getItemAt(Trabacl.getSelectedIndex())+barra+"registros");
            File contenedor = new File(ubicacionparaCBox);
            File [] regigigas = contenedor.listFiles();
            setContenedor(contenedor);
            setRegigigas(regigigas);
            System.out.println("Hay: "+regigigas.length+ " archivos");
            for (int i = 0;i <  regigigas.length;i++) {
                if(regigigas[i].exists()){
                    Editar.addItem(regigigas[i].getName().replace(".registro", ""));
                }
            }
        }else{
            Editar.setEnabled(false);
            Selec.setEnabled(false);
        }
    }
    
    boolean fincl = false;
    boolean fincl1 = false;
    boolean fincl2 = true;
    
    boolean tapa = false;
    
    boolean masa;
    boolean podo;
    boolean maso;
    boolean colo;

    
    //procesos para pedir los datos de esta pantalla
    public String nombre(){
        return Nombcl.getText();
    }
    public String apellido(){
        return Apcl.getText();
    }
    public String telefono(){
        return Cellcl.getText();
    }
    public String edad(){
        return Edadcl.getText();
    }
    public String fecha(){
        return Fechcl.getText();
    }
    public String hora(){
        return Hrcl.getText();
    }
    
    public int inquisidor(){//proceso para pedir el indice del "Reserva para"
        return Trabacl.getSelectedIndex();
    }
    
    public void datosEmpleado(String nombreE, String Apellido, String rut, String tele){
        NomE.setText("Nombre: "+nombreE);
        ApeE.setText("Apellido: "+Apellido);
        RUTE.setText("RUT: "+rut);
        CellE.setText("Telefono: "+tele);
    }
    String [] Titulos = {"Fecha y hora", "Nombre", "Apellido","Telefono"};
    DefaultTableModel dtm = new DefaultTableModel(null,Titulos);
    
    String [] Titulos2 = {"Nombre","Apellido","Telefono"};
    DefaultTableModel dtm2 = new DefaultTableModel(null,Titulos2);
    
    //String masaje = System.getProperty("user,dir")+barra;
    
    
    public void setfich(boolean fic){
        this.Fichas = fic;
    }

    public JComboBox<String> getCarpetatratamiento() {
        return carpetatratamiento;
    }
    
    
    
    //metodo para mostrar los datos en la pantalla "Buscar cliente"
    private void regTabla(){
        if(carpetatratamiento.getSelectedIndex() == 0 || Nombrecliente.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Debe llenar ambos campos");
        }else{
            String ubicacion = System.getProperty("user.dir")+barra+carpetatratamiento.getItemAt(carpetatratamiento.getSelectedIndex())+barra+Nombrecliente.getText()+barra;
            File contenedor = new File(ubicacion);
            File [] registros = contenedor.listFiles();
            for(int i = 0; i<registros.length; i++){
                File url = new File(ubicacion+registros[i].getName());
                try{
                    FileInputStream fis = new FileInputStream(url);
                    Properties mostrar = new Properties();
                    mostrar.load(fis);
                    String Filas [] = {registros[i].getName().replace("."+carpetatratamiento.getSelectedItem(), ""),
                        mostrar.getProperty("Nombre"),
                        mostrar.getProperty("Apellido"),
                        mostrar.getProperty("Telefono")
                    };
                    dtm.addRow(Filas);
                }catch(Exception e){
                    
                }
            }
            jTable3.setModel(dtm);
        }
    }

    public DefaultTableModel getDtm() {
        return dtm;
    }

    public JTable getjTable3() {
        return jTable3;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principal = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Tmasaje = new javax.swing.JTable();
        nombretabla = new javax.swing.JLabel();
        Tratamiento = new javax.swing.JComboBox<>();
        Ir = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Fechcl = new javax.swing.JTextField();
        Nombcl = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Hrcl = new javax.swing.JTextField();
        Apcl = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Cellcl = new javax.swing.JTextField();
        Addcl = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Edadcl = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Trabacl = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Editar = new javax.swing.JComboBox<>();
        Selec = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        produc = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Nombrecliente = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        carpetatratamiento = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        inventario = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Pronom = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        ConNet = new javax.swing.JTextField();
        Unid = new javax.swing.JComboBox<>();
        PRECIO = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        ApeE = new javax.swing.JLabel();
        NomE = new javax.swing.JLabel();
        RUTE = new javax.swing.JLabel();
        CellE = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tmasaje.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tmasaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                press(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                relse(evt);
            }
        });
        jScrollPane5.setViewportView(Tmasaje);

        nombretabla.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nombretabla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombretabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5))
                .addGap(94, 94, 94))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombretabla, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Tratamiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Masaje", "Podologia", "Masoterapia", "Colorometria" }));

        Ir.setText("Ir");
        Ir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IrActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Seleccione tratamiento");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(348, 348, 348)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Tratamiento, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(322, 322, 322))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(Tratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Ir)
                .addContainerGap())
        );

        principal.addTab("Lista de Clientes", jPanel4);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Hora de cita");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Apellido");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Telefono");

        Addcl.setText("Agregar");
        Addcl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddclActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Edad");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Reserva para");

        Trabacl.setMaximumRowCount(5);
        Trabacl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Masaje", "Podologia", "Masoterapia", "Colorimetria", "Compra de producto" }));
        Trabacl.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Cambio(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Fecha de cita");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Seleccionar persona \nya registrada");

        Editar.setEnabled(false);

        Selec.setText("Selecionar");
        Selec.setEnabled(false);
        Selec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelecActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Producto");
        jLabel10.setEnabled(false);

        produc.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(Editar, 0, 137, Short.MAX_VALUE)
                                .addGap(34, 34, 34)
                                .addComponent(Selec, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                            .addComponent(Addcl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(177, 177, 177))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(187, 187, 187))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(180, 180, 180))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(178, 178, 178)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Edadcl)
                                    .addComponent(Nombcl)
                                    .addComponent(Apcl, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Cellcl)
                                    .addComponent(Trabacl, 0, 360, Short.MAX_VALUE)
                                    .addComponent(Fechcl)
                                    .addComponent(Hrcl)
                                    .addComponent(produc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(114, 114, 114))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Selec))
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nombcl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Apcl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Cellcl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Edadcl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Trabacl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(produc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Fechcl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Hrcl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addComponent(Addcl)
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        principal.addTab("Nuevo Cliente ", jPanel1);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Nombre");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Tratamiento");

        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable3.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable3MouseReleased(evt);
            }
        });
        jScrollPane4.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        carpetatratamiento.setMaximumRowCount(5);
        carpetatratamiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Masaje", "Podologia", "Masoterapia", "Colorimetria" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(439, 439, 439)
                        .addComponent(jLabel11))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(33, 33, 33))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(90, 90, 90)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nombrecliente)
                            .addComponent(carpetatratamiento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(366, 366, 366)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(377, 377, 377))
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(Nombrecliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9))
                .addGap(35, 35, 35)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(carpetatratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(12, 12, 12)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        principal.addTab("Buscar Cliente", jPanel5);

        inventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(inventario);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(jScrollPane3)
                .addGap(169, 169, 169))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                .addGap(224, 224, 224))
        );

        principal.addTab("Productos y servicios", jPanel6);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Nombre del Produccto o servicio");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Precio");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Contenido de envase");

        Unid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unidades", "gramos", "ml" }));

        jButton4.setText("Añadir al inventario");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Añadir Foto");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(231, 231, 231)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(353, 353, 353))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(311, 311, 311)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(ConNet)
                        .addGap(18, 18, 18)
                        .addComponent(Unid, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Pronom)
                    .addComponent(PRECIO)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(77, 77, 77))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(Pronom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(ConNet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Unid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(PRECIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(0, 210, Short.MAX_VALUE))
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        principal.addTab("Agregar Servicio", jPanel7);

        ApeE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        NomE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        RUTE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        CellE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton1.setText("Editar");

        jButton2.setText("Eliminar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ApeE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NomE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RUTE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CellE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(330, 330, 330))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(428, 428, 428)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(136, 136, 136))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(NomE, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ApeE, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RUTE, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CellE, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(45, 45, 45))
        );

        principal.addTab("Ver perfil de usuario", jPanel3);

        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(principal)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(303, 303, 303)
                .addComponent(Volver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(324, 324, 324))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(principal)
                .addGap(18, 18, 18)
                .addComponent(Volver)
                .addGap(13, 13, 13))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        this.volv = true;
    }//GEN-LAST:event_VolverActionPerformed

    File conten;
    File [] registeel;
    String regubi;

    public void setRegubi(String regubi) {
        this.regubi = regubi;
    }
    
    
    
    public File getContenedor() {
        return conten;
    }

    public void setContenedor(File contenedor) {
        this.conten = contenedor;
    }

    public File[] getRegigigas() {
        return registeel;
    }

    public void setRegigigas(File[] regigigas) {
        this.registeel = regigigas;
    }
    
    public 
    boolean existe;
    private void ward(){
        setUbicacionparaCBox(System.getProperty("user.dir")+barra+Trabacl.getItemAt(Trabacl.getSelectedIndex())+barra+"registros"+barra); 
        String persona = Nombcl.getText()+".registro";
        File crea_Ubicacion = new File(ubicacionparaCBox);
        File crea_archivo = new File(ubicacionparaCBox + persona);
//        
        if(crea_archivo.exists()){
            //crea_archivo.renameTo(crea_archivo);
        }else{
            try {
                crea_Ubicacion.mkdirs();
                try (Formatter crea = new Formatter(ubicacionparaCBox+persona)) {
                    crea.format("%s\r\n%s\r\n%s\r\n%s",
                            "Nombre=" + Nombcl.getText(),
                            "Apellido=" + Apcl.getText(),
                            "Telefono=" + Cellcl.getText(),
                            "Edad=" + Edadcl.getText());
                }
                System.out.println(ubicacionparaCBox+persona);
                
            } catch (Exception e) {
                System.out.println(e);
                System.exit(0);
            }
        }
        
    }
    
    private void AddclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddclActionPerformed
        if(Nombcl.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "El nombre de la persona es obligatorio");
        }
        else{
            this.tapa = true;
        }
    }//GEN-LAST:event_AddclActionPerformed

    //metodo para actualizar la tabla de la pantalla "Buscar cliente"
    private void actualtabla(){
        String ubicacion = System.getProperty("user.dir")+barra+carpetatratamiento.getSelectedItem()+barra+Nombrecliente.getText()+barra;
        File contenedor = new File(ubicacion);
        dtm.setRowCount(0);
        regTabla();
    }
    
    
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        actualtabla();
    }//GEN-LAST:event_jButton3ActionPerformed

    public int carpetatrata(){
        return carpetatratamiento.getSelectedIndex();
    }
    
    private void jTable3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MousePressed
        try{
            this.Fichas = true;
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_jTable3MousePressed

    private void jTable3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseReleased
        this.Fichas = true;
    }//GEN-LAST:event_jTable3MouseReleased

    private void paprodu(){
        produc.removeAllItems();
        for(int i = 0; i <procuctosnom.length; i++){
            produc.addItem(procuctosnom[i].getName().replace(".Productos", ""));
        }
        
    }
    
    private void Cambio(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Cambio
        // TODO add your handling code here:
        autollenar();
        if(Trabacl.getSelectedIndex() == 5){
            jLabel10.setEnabled(true);produc.setEnabled(true);
            paprodu();
        }else{
            jLabel10.setEnabled(false);produc.setEnabled(false);
        }
    }//GEN-LAST:event_Cambio

    private void SelecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelecActionPerformed
        // TODO add your handling code here:
        setUbicacionparaCBox(System.getProperty("user.dir")+barra+Trabacl.getItemAt(Trabacl.getSelectedIndex())+barra+"registros"+barra);
        String arfile = (String) Editar.getSelectedItem();
        File regis = new File(ubicacionparaCBox+arfile+".registro");
        System.out.println("Mostrando: "+ ubicacionparaCBox+arfile+".registro");
        mostrar(regis);
    }//GEN-LAST:event_SelecActionPerformed

    String Tnom;
    private void regeneral(){
        if(Tratamiento.getSelectedIndex() != 0){
            String ubicacion = System.getProperty("user.dir")+barra+Tratamiento.getSelectedItem().toString()+barra+"registros"+barra;
            File contenedor = new File(ubicacion);
            File [] registros = contenedor.listFiles();
            for(int i = 0; i<registros.length;i++){
                File url = new File(ubicacion+registros[i].getName());
                try{
                    FileInputStream fis = new FileInputStream(url);
                    Properties mostrar = new Properties();
                    mostrar.load(fis);
                    String filas [] = {registros[i].getName().replace(".registro", ""),mostrar.getProperty("Apellido"), mostrar.getProperty("Telefono")};
                    //this.Tnom = registros[i].getName().replace(".registro", "");
                    dtm2.addRow(filas);
                }catch(Exception e){

                }
            }
            Tmasaje.setModel(dtm2);
        }
    }
    
    private void recarga(){
        String ubicacion = System.getProperty("user.dir")+barra+Tratamiento.getSelectedItem().toString()+barra+"registros"+barra;
        File contenedor = new File(ubicacion);
        File [] registros = contenedor.listFiles();
        dtm2.setRowCount(0);
        regeneral();
    }
    
    private void IrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IrActionPerformed
        // TODO add your handling code here:
        if(Tratamiento.getSelectedIndex() != 0){
            nombretabla.setText(Tratamiento.getSelectedItem().toString());
            regeneral();
            recarga();
        }else{
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar en que tratamiento buscar");
        }
    }//GEN-LAST:event_IrActionPerformed

    private void press(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_press
        // TODO add your handling code here:
        Nombrecliente.setText(Tmasaje.getValueAt(Tmasaje.getSelectedRow(),0).toString());
        carpetatratamiento.setSelectedIndex(Tratamiento.getSelectedIndex());
        JOptionPane.showMessageDialog(rootPane, "Vaya a la pestaña de \"Buscar Cliente\"\n"
                + "y presione \"Buscar\"");
    }//GEN-LAST:event_press

    private void relse(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_relse
        // TODO add your handling code here:
        Nombrecliente.setText(Tmasaje.getValueAt(Tmasaje.getSelectedRow(),0).toString());
        carpetatratamiento.setSelectedIndex(Tratamiento.getSelectedIndex());
        JOptionPane.showMessageDialog(rootPane, "Vaya a la pestaña de \"Buscar Cliente\"\n"
                + "y presione \"Buscar\"");
    }//GEN-LAST:event_relse

    String carpetaproductos = System.getProperty("user.dir")+barra+"Productos"+barra;
    File procuctosfol = new File(carpetaproductos);
    File procuctosnom [] = procuctosfol.listFiles();

    public File[] getProcuctosnom() {
        return procuctosnom;
    }
    
    int Pnom;
    private void nuevoprodu(){
        File PCarnom [] = getProcuctosnom();
        if(PCarnom.equals(null)){
            this.Pnom = 0;
        }else{
            this.Pnom = procuctosnom.length;
        }
        System.out.println(" --> "+Pnom);
        String PnomS = Pnom+".Productos";
        System.out.println("el archivo se llamara "+PnomS);
        File productosfil = new File(carpetaproductos+PnomS);
        if(productosfil.exists()){
            
        }else{
            try{
                procuctosfol.mkdirs();
                Formatter crea = new Formatter(carpetaproductos + PnomS);
                crea.format("%s\r\n%s\r\n%s\r\n%s",
                        "ID="+PnomS.replace(".Productos", ""),
                        "Nombre="+Pronom.getText(),
                        "Cantidad="+ConNet.getText()+Unid.getSelectedItem(),
                        "Precio="+PRECIO.getText());
                crea.close();
                JOptionPane.showMessageDialog(rootPane, "Producto añadido");
            }catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, "Error: "+e);
            }
        }        
    }
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        System.out.println("Accediendo al metodo nuevoprodu()");
        nuevoprodu();
    }//GEN-LAST:event_jButton4ActionPerformed

    /*
    
    */
    String nom;
    String apel;
    String cell;
    String edad;
    private void setea(String nom,String apel,String cell,String edad){
        this.Nombcl.setText(nom);this.Apcl.setText(apel);this.Cellcl.setText(cell);this.Edadcl.setText(edad);
    }
    private void mostrar(File reg){
        System.out.println("ejecutando metodo");
        try{
            Properties mostrar = new Properties();
            mostrar.load(new FileReader(reg));
            System.out.println("momento...");
            this.nom = mostrar.getProperty("Nombre");
            this.apel = mostrar.getProperty("Apellido");
            this.cell = mostrar.getProperty("Telefono");
            this.edad = mostrar.getProperty("Edad");
            System.out.println("Nombre --> "+nom);
            System.out.println("Apellido --> "+apel);
            System.out.println("Cell --> "+cell);
            System.out.println("Edad -->"+edad);
            setea(nom,apel,cell,edad);
            System.out.println("Esta en: "+reg.getPath()); 
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    //metodo para limpiar la pantalla de "Nuevo Cliente"
    public void setOK(boolean OK) {
        if(OK == true){
            ward();
            Editar.removeAllItems();
            registeel = conten.listFiles();
            if(Tratamiento.getSelectedIndex() != 0){
                recarga();
            }
            Nombcl.setText("");
            Apcl.setText("");
            Cellcl.setText("");
            Edadcl.setText("");
            Trabacl.setSelectedIndex(0);
            Fechcl.setText("");
            Hrcl.setText("");
        }
    }
    public boolean volv(){
        return this.volv;
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addcl;
    private javax.swing.JTextField Apcl;
    private javax.swing.JLabel ApeE;
    private javax.swing.JLabel CellE;
    private javax.swing.JTextField Cellcl;
    private javax.swing.JTextField ConNet;
    private javax.swing.JTextField Edadcl;
    private javax.swing.JComboBox<String> Editar;
    private javax.swing.JTextField Fechcl;
    private javax.swing.JTextField Hrcl;
    private javax.swing.JButton Ir;
    private javax.swing.JLabel NomE;
    private javax.swing.JTextField Nombcl;
    private javax.swing.JTextField Nombrecliente;
    private javax.swing.JTextField PRECIO;
    private javax.swing.JTextField Pronom;
    private javax.swing.JLabel RUTE;
    private javax.swing.JButton Selec;
    private javax.swing.JTable Tmasaje;
    private javax.swing.JComboBox<String> Trabacl;
    private javax.swing.JComboBox<String> Tratamiento;
    private javax.swing.JComboBox<String> Unid;
    private javax.swing.JButton Volver;
    private javax.swing.JComboBox<String> carpetatratamiento;
    private javax.swing.JTable inventario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel nombretabla;
    private javax.swing.JTabbedPane principal;
    private javax.swing.JComboBox<String> produc;
    // End of variables declaration//GEN-END:variables
}