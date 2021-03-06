package arenasessence2;

import java.awt.event.KeyEvent;
import java.io.File;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Formatter;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Masaje extends javax.swing.JFrame {

    public Masaje() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel28 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        MasajeP1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Cardiacos = new javax.swing.JTextField();
        Circulatorios = new javax.swing.JTextField();
        Digestibos = new javax.swing.JTextField();
        Ginecologicos = new javax.swing.JTextField();
        Cirugias = new javax.swing.JTextField();
        Tanticon = new javax.swing.JTextField();
        Medicamentos = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Tmasaje = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Peso = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Talla = new javax.swing.JTextField();
        Cintura = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Cadera = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        Gluteos = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        Brazos = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        Otros = new javax.swing.JTextArea();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        NHij = new javax.swing.JTextField();
        ECiv = new javax.swing.JTextField();
        MasajeP2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        Desayuno = new javax.swing.JTextField();
        Almuerzo = new javax.swing.JTextField();
        Once = new javax.swing.JTextField();
        Cena = new javax.swing.JTextField();
        Actfisica = new javax.swing.JTextField();
        fumador = new javax.swing.JTextField();
        Alcohol = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Motivo = new javax.swing.JTextArea();
        Volver = new javax.swing.JButton();
        Registrar = new javax.swing.JButton();

        jLabel28.setText("jLabel28");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Masaje");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(406, 406, 406)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addGap(461, 461, 461))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel2.setText("Cardiacos");

        jLabel3.setText("Circulatorios");

        jLabel4.setText("Digestivos");

        jLabel5.setText("Ginecologicos");

        jLabel6.setText("Cirujias");

        jLabel7.setText("Tipo anticoncept.");

        jLabel8.setText("Medicamentos");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel8.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        jLabel9.setText("Otros");

        Cardiacos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CardiacosActionPerformed(evt);
            }
        });

        Circulatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CirculatoriosActionPerformed(evt);
            }
        });

        Digestibos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DigestibosActionPerformed(evt);
            }
        });

        Ginecologicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GinecologicosActionPerformed(evt);
            }
        });

        Cirugias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CirugiasActionPerformed(evt);
            }
        });

        Tanticon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TanticonActionPerformed(evt);
            }
        });

        Medicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedicamentosActionPerformed(evt);
            }
        });

        jLabel10.setText("Tipo de masaje");

        jLabel11.setText("Peso");

        jLabel12.setText("Talla");

        jLabel13.setText("cintura");

        jLabel14.setText("cadera");

        jLabel15.setText("gluteos");

        jLabel16.setText("Brazos");

        Otros.setColumns(20);
        Otros.setLineWrap(true);
        Otros.setRows(4);
        Otros.setWrapStyleWord(true);
        Otros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Enter(evt);
            }
        });
        jScrollPane3.setViewportView(Otros);

        jLabel26.setText("N° de Hijos");

        jLabel27.setText("E. Civil");

        javax.swing.GroupLayout MasajeP1Layout = new javax.swing.GroupLayout(MasajeP1);
        MasajeP1.setLayout(MasajeP1Layout);
        MasajeP1Layout.setHorizontalGroup(
            MasajeP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MasajeP1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(MasajeP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MasajeP1Layout.createSequentialGroup()
                        .addGroup(MasajeP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MasajeP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Brazos)
                            .addComponent(Gluteos)
                            .addComponent(Cadera)
                            .addComponent(Cintura)
                            .addComponent(Talla)
                            .addComponent(Tmasaje)
                            .addComponent(Peso)))
                    .addGroup(MasajeP1Layout.createSequentialGroup()
                        .addGroup(MasajeP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MasajeP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(MasajeP1Layout.createSequentialGroup()
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(79, 79, 79))
                                .addGroup(MasajeP1Layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addGroup(MasajeP1Layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addGroup(MasajeP1Layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addGroup(MasajeP1Layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addGroup(MasajeP1Layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addGroup(MasajeP1Layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addGroup(MasajeP1Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(MasajeP1Layout.createSequentialGroup()
                                .addGroup(MasajeP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel26))
                                .addGap(132, 132, 132)))
                        .addGroup(MasajeP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cardiacos, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                            .addComponent(Circulatorios)
                            .addComponent(Digestibos)
                            .addComponent(Ginecologicos)
                            .addComponent(Cirugias)
                            .addComponent(Tanticon)
                            .addComponent(Medicamentos)
                            .addComponent(jScrollPane3)
                            .addComponent(NHij)
                            .addComponent(ECiv, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        MasajeP1Layout.setVerticalGroup(
            MasajeP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MasajeP1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MasajeP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(ECiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MasajeP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(NHij, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MasajeP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Cardiacos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MasajeP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Circulatorios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MasajeP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Digestibos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MasajeP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Ginecologicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MasajeP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Cirugias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MasajeP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Tanticon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MasajeP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Medicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MasajeP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MasajeP1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MasajeP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Tmasaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MasajeP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MasajeP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Talla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MasajeP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(Cintura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MasajeP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(Cadera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MasajeP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(Gluteos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MasajeP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(Brazos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel17.setText("Habitos alimenticios");

        jLabel18.setText("Desayuno");

        jLabel19.setText("Almuerzo");

        jLabel20.setText("Once");

        jLabel21.setText("Cena");

        jLabel22.setText("Acti. fisica");

        jLabel23.setText("Fumador cant.");

        jLabel24.setText("Alcohol cant.");

        jLabel25.setText("Motivo de consulta");

        Motivo.setColumns(20);
        Motivo.setLineWrap(true);
        Motivo.setRows(5);
        Motivo.setWrapStyleWord(true);
        jScrollPane2.setViewportView(Motivo);

        Volver.setText("Cancelar");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        Registrar.setText("Registrar");
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MasajeP2Layout = new javax.swing.GroupLayout(MasajeP2);
        MasajeP2.setLayout(MasajeP2Layout);
        MasajeP2Layout.setHorizontalGroup(
            MasajeP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MasajeP2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MasajeP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MasajeP2Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(59, 59, 59)
                        .addComponent(fumador))
                    .addGroup(MasajeP2Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(80, 80, 80)
                        .addComponent(Actfisica))
                    .addGroup(MasajeP2Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(104, 104, 104)
                        .addComponent(Cena))
                    .addGroup(MasajeP2Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(104, 104, 104)
                        .addComponent(Once))
                    .addGroup(MasajeP2Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(85, 85, 85)
                        .addComponent(Almuerzo))
                    .addGroup(MasajeP2Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(81, 81, 81)
                        .addComponent(Desayuno))
                    .addGroup(MasajeP2Layout.createSequentialGroup()
                        .addGroup(MasajeP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25)
                            .addComponent(jLabel17))
                        .addGap(36, 36, 36)
                        .addGroup(MasajeP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Alcohol)
                            .addComponent(jScrollPane2))))
                .addGap(56, 56, 56))
            .addGroup(MasajeP2Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(Volver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(170, 170, 170)
                .addComponent(Registrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(61, 61, 61))
        );
        MasajeP2Layout.setVerticalGroup(
            MasajeP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MasajeP2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MasajeP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(Desayuno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MasajeP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(Almuerzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MasajeP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(Once, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MasajeP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(Cena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MasajeP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(Actfisica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MasajeP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(fumador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MasajeP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(Alcohol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(MasajeP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MasajeP2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel25))
                    .addGroup(MasajeP2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MasajeP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Volver)
                    .addComponent(Registrar))
                .addGap(80, 80, 80))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(MasajeP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(MasajeP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MasajeP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MasajeP2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    boolean fincl = false;
    private String nombre;
    private String apellido;
    private String tel;
    private String edad;
    private String fecha;
    private String hora;

    public void Pase(String nombre, String apellido, String tel, String edad, String fecha, String hora) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tel = tel;
        this.edad = edad;
        this.fecha = fecha;
        this.hora = hora;
    }

    public boolean isFincl() {
        return fincl;
    }
    private void CardiacosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CardiacosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CardiacosActionPerformed

    private void CirculatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CirculatoriosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CirculatoriosActionPerformed

    private void DigestibosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DigestibosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DigestibosActionPerformed

    private void GinecologicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GinecologicosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GinecologicosActionPerformed

    private void CirugiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CirugiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CirugiasActionPerformed

    private void TanticonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TanticonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TanticonActionPerformed

    private void MedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedicamentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MedicamentosActionPerformed

    private String barra = File.separator;
    private String Ubicacion = System.getProperty("user.dir") + barra + "Masaje" + barra;

    boolean OK = false;

    private void reseteo(JPanel N1){
        for(Object o : N1.getComponents()){
            if(o instanceof JTextField){
                ((JTextField) o).setText("");
            }
        }
    }
    boolean guardado = false;
    private void Crear() {
        LocalDate hoy0 = LocalDate.now();
        LocalTime ora = LocalTime.now();
        String ubicacion2 = Ubicacion + nombre + barra;
        System.out.println(ubicacion2);
        String hoy = hoy0.getDayOfMonth()+"/"+hoy0.getMonthValue()+"/"+hoy0.getYear();
        String Archivo = hoy0+" "+ora.getHour()+"-"+ora.getMinute()+"-"+ora.getSecond()+".Masaje";
        File crea_Ubicacion = new File(ubicacion2);
        File crea_archivo = new File(ubicacion2 + Archivo);
        if (crea_archivo.exists()) {
            //JOptionPane.showMessageDialog(rootPane, "Por favor ingrese la fecha de hoy");
        } else {
            //
            try {
                crea_Ubicacion.mkdirs();
                Formatter crea = new Formatter(ubicacion2 + Archivo);
                crea.format("%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s",
                        "Fecha=" + hoy,
                        "hora=" + ora,
                        "Nombre=" + nombre,
                        "Apellido=" + apellido,
                        "Telefono=" + tel,
                        "Edad=" + edad,
                        "Fechadecita=" + fecha,
                        "Hora de cita=" + hora,
                        "Ecivil="+ECiv.getText(),
                        "NHijos="+NHij.getText(),
                        "Cardiacos=" + Cardiacos.getText(),
                        "Circulatorios=" + Circulatorios.getText(),
                        "Digestivos=" + Digestibos.getText(),
                        "Ginecologicos=" + Ginecologicos.getText(),
                        "Cirugias=" + Cirugias.getText(),
                        "T.anticonsept=" + Tanticon.getText(),
                        "Medicamentos=" + Medicamentos.getText(),
                        "Otros=<html>"+Otros.getText()+"<html>",
                        "T.Masaje=" + Tmasaje.getText(),
                        "Peso=" + Peso.getText(),
                        "Talla=" + Talla.getText(),
                        "Cintura=" + Cintura.getText(),
                        "Cadera=" + Cadera.getText(),
                        "Gluteos=" + Gluteos.getText(),
                        "Brazos=" + Brazos.getText(),
                        "Desayuno=" + Desayuno.getText(),
                        "Almuerzo=" + Almuerzo.getText(),
                        "Once=" + Once.getText(),
                        "Cena=" + Cena.getText(),
                        "Act.Fisica=" + Actfisica.getText(),
                        "Cant.cigarrillos=" + fumador.getText(),
                        "Alcohol=" + Alcohol.getText(),
                        "Motivodeconsulta=" + Motivo.getText());
                crea.close();
                System.out.println("OK");
                this.guardado = true;
                JOptionPane.showMessageDialog(rootPane, "Persona registrada");
                System.out.println("LISTO");
                this.OK = true;
                this.fincl = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "E R R O R ! ! ! \n "+e);
            }

        }
    }

    public boolean isOK() {
        return this.OK;
    }
    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        // TODO add your handling code here:
        Crear();
        if(guardado == true){
            for(int i = 0; i<2; i++){
                    switch(i){
                        case 0: reseteo(MasajeP1);
                                System.out.println("P1 Limiado");break;
                        case 1: reseteo(MasajeP2);
                                System.out.println("P2 Limpiado");break;
                    }
                }
                Otros.setText("");
                Motivo.setText("");
        }
    }//GEN-LAST:event_RegistrarActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        // TODO add your handling code here:
        this.fincl = true;
    }//GEN-LAST:event_VolverActionPerformed

    String ntxt;
    int lineas = 1;
    private void Enter(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Enter
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            this.ntxt = "<html>"+Otros.getText()+"<html>";
            Otros.setText(ntxt+"<p>");
//            String [] area = new String[lineas];
//            area[lineas-1] = Otros.getText();
//            this.ntxt = area[lineas-1]+"<p>";
//            lineas = lineas + 1;
        }
    }//GEN-LAST:event_Enter

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Masaje().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Actfisica;
    private javax.swing.JTextField Alcohol;
    private javax.swing.JTextField Almuerzo;
    private javax.swing.JTextField Brazos;
    private javax.swing.JTextField Cadera;
    private javax.swing.JTextField Cardiacos;
    private javax.swing.JTextField Cena;
    private javax.swing.JTextField Cintura;
    private javax.swing.JTextField Circulatorios;
    private javax.swing.JTextField Cirugias;
    private javax.swing.JTextField Desayuno;
    private javax.swing.JTextField Digestibos;
    private javax.swing.JTextField ECiv;
    private javax.swing.JTextField Ginecologicos;
    private javax.swing.JTextField Gluteos;
    private javax.swing.JPanel MasajeP1;
    private javax.swing.JPanel MasajeP2;
    private javax.swing.JTextField Medicamentos;
    private javax.swing.JTextArea Motivo;
    private javax.swing.JTextField NHij;
    private javax.swing.JTextField Once;
    private javax.swing.JTextArea Otros;
    private javax.swing.JTextField Peso;
    private javax.swing.JButton Registrar;
    private javax.swing.JTextField Talla;
    private javax.swing.JTextField Tanticon;
    private javax.swing.JTextField Tmasaje;
    private javax.swing.JButton Volver;
    private javax.swing.JTextField fumador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
