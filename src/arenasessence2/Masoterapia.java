/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arenasessence2;

import java.io.File;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Formatter;
import javax.swing.JOptionPane;

/**
 *
 * @author hectorledez el gamer
 */
public class Masoterapia extends javax.swing.JFrame {

    /**
     * Creates new form Masoterapia
     */
    public Masoterapia() {
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

        jLabel1 = new javax.swing.JLabel();
        N1 = new javax.swing.JCheckBox();
        N2 = new javax.swing.JCheckBox();
        N3 = new javax.swing.JCheckBox();
        N4 = new javax.swing.JCheckBox();
        N5 = new javax.swing.JCheckBox();
        N6 = new javax.swing.JCheckBox();
        N7 = new javax.swing.JCheckBox();
        N8 = new javax.swing.JCheckBox();
        N9 = new javax.swing.JCheckBox();
        N10 = new javax.swing.JCheckBox();
        N11 = new javax.swing.JCheckBox();
        N12 = new javax.swing.JCheckBox();
        N13 = new javax.swing.JCheckBox();
        N14 = new javax.swing.JCheckBox();
        N15 = new javax.swing.JCheckBox();
        Volver = new javax.swing.JButton();
        Fin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Razon de Visita");

        N1.setText("Ha recibido antes algun masaje profecional");

        N2.setText("Se ha operado alguna vez");

        N3.setText("Tiene algun problema a la columna");

        N4.setText("Esta embarazada");

        N5.setText("Lleva lentes de contacto");

        N6.setText("Toma algun medicamento con prescripcion medica");

        N7.setText("Padece de lumbagia cronica");

        N8.setText("Tiene frecuentes dolores de cabeza");

        N9.setText("Esta siempre cansado");

        N10.setText("Tiene problemas cardiacos");

        N11.setText("Tiene hipertencion arterial");

        N12.setText("Tiene varices");

        N13.setText("Tiene algun dolor que irradie por las piernas y brazos");

        N14.setText("Sufre de artritis");

        N15.setText("Padece alguna otra enfermedad");

        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        Fin.setText("Terminar");
        Fin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(N1)
                            .addComponent(N15)
                            .addComponent(N14)
                            .addComponent(N13)
                            .addComponent(N12)
                            .addComponent(N11)
                            .addComponent(N10)
                            .addComponent(N9)
                            .addComponent(N8)
                            .addComponent(N7)
                            .addComponent(N6)
                            .addComponent(N5)
                            .addComponent(N4)
                            .addComponent(N3)
                            .addComponent(N2))
                        .addContainerGap(43, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Volver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Fin)
                        .addGap(59, 59, 59))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(N1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(N2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(N3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(N4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(N5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(N6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(N7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(N8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(N9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(N10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(N11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(N12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(N13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(N14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(N15)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Volver)
                    .addComponent(Fin))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String q1;
    String q2;
    String q3;
    String q4;
    String q5;
    String q6;
    String q7;
    String q8;
    String q9;
    String q10;
    String q11;
    String q12;
    String q13;
    String q14;
    String q15;
    
    private String c1(boolean click){
        if(click == true){
            this.q1 = "Si";
        }else{
            this.q1 = "No";
        }
        return q1;
    }
    private String c2(boolean click){
        if(click == true){
            this.q2 = "Si";
        }else{
            this.q2 = "No";
        }
        return q2;
    }
    private String c3(boolean click){
        if(click == true){
            this.q3 = "Si";
        }else{
            this.q3 = "No";
        }
        return q3;
    }
    private String c4(boolean click){
        if(click == true){
            this.q4 = "Si";
        }else{
            this.q4 = "No";
        }
        return q4;
    }
    private String c5(boolean click){
        if(click == true){
            this.q5 = "Si";
        }else{
            this.q5 = "No";
        }
        return q5;
    }
    private String c6(boolean click){
        if(click == true){
            this.q6 = "Si";
        }else{
            this.q6 = "No";
        }
        return q6;
    }
    private String c7(boolean click){
        if(click == true){
            this.q7 = "Si";
        }else{
            this.q7 = "No";
        }
        return q7;
    }
    private String c8(boolean click){
        if(click == true){
            this.q8 = "Si";
        }else{
            this.q8 = "No";
        }
        return q8;
    }
    private String c9(boolean click){
        if(click == true){
            this.q9 = "Si";
        }else{
            this.q9 = "No";
        }
        return q9;
    }
    private String c10(boolean click){
        if(click == true){
            this.q10 = "Si";
        }else{
            this.q10 = "No";
        }
        return q10;
    }
    private String c11(boolean click){
        if(click == true){
            this.q11 = "Si";
        }else{
            this.q11 = "No";
        }
        return q11;
    }
    private String c12(boolean click){
        if(click == true){
            this.q12 = "Si";
        }else{
            this.q12 = "No";
        }
        return q12;
    }
    private String c13(boolean click){
        if(click == true){
            this.q13 = "Si";
        }else{
            this.q13 = "No";
        }
        return q13;
    }
    private String c14(boolean click){
        if(click == true){
            this.q14 = "Si";
        }else{
            this.q14 = "No";
        }
        return q14;
    }
    private String c15(boolean click){
        if(click == true){
            this.q15 = "Si";
        }else{
            this.q15 = "No";
        }
        return q15;
    }
    
    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        // TODO add your handling code here:
        this.fincl = true;
    }//GEN-LAST:event_VolverActionPerformed

    private String barra = File.separator;
    private String Ubicacion = System.getProperty("user.dir") + barra + "Masoterapia" + barra;

    boolean OK = false;

    private void Crear() {
        LocalDate hoy = LocalDate.now();
        LocalTime ora = LocalTime.now();
        String ubicacion2 = Ubicacion + nombre + barra;
        System.out.println(ubicacion2);
        String Archivo = hoy+" "+ora.getHour()+"-"+ora.getMinute()+"-"+ora.getSecond()+".Masoterapia";
        File crea_Ubicacion = new File(ubicacion2);
        File crea_archivo = new File(ubicacion2 + Archivo);
        if (crea_archivo.exists()) {
            //JOptionPane.showMessageDialog(rootPane, "Por favor ingrese la fecha de hoy");
        } else {
            try {
                crea_Ubicacion.mkdirs();
                Formatter crea = new Formatter(ubicacion2 + Archivo);
                crea.format("%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s",
                        "Fecha=" + hoy,
                        "hora=" + ora,
                        "Nombre=" + nombre,
                        "Apellido=" + apellido,
                        "Telefono=" + tel,
                        "Edad=" + edad,
                        "Fecha de cita=" + fecha,
                        "Hora de cita=" + hora,
                        "a1="+c1(N1.isSelected()),
                        "a2="+c1(N2.isSelected()),
                        "a3="+c1(N3.isSelected()),
                        "a4="+c1(N4.isSelected()),
                        "a5="+c1(N5.isSelected()),
                        "a6="+c1(N6.isSelected()),
                        "a7="+c1(N7.isSelected()),
                        "a8="+c1(N8.isSelected()),
                        "a9="+c1(N9.isSelected()),
                        "a10="+c1(N10.isSelected()),
                        "a11="+c1(N11.isSelected()),
                        "a12="+c1(N12.isSelected()),
                        "a13="+c1(N13.isSelected()),
                        "a14="+c1(N14.isSelected()),
                        "a15="+c1(N15.isSelected()));
                crea.close();
                this.OK = true;
                N1.setSelected(false);N6.setSelected(false);N11.setSelected(false);
                N2.setSelected(false);N7.setSelected(false);N12.setSelected(false);
                N3.setSelected(false);N8.setSelected(false);N13.setSelected(false);
                N4.setSelected(false);N9.setSelected(false);N14.setSelected(false);
                N5.setSelected(false);N10.setSelected(false);N15.setSelected(false); 
                JOptionPane.showMessageDialog(rootPane, "Persona registrada");
                this.fincl = true;
            }catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, "E R R O R ! ! !");
            }
            
        }
    }
    private void FinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinActionPerformed
        // TODO add your handling code here:
        Crear();
    }//GEN-LAST:event_FinActionPerformed
boolean fincl = false;
String nombre;
String apellido;
String tel;
String edad;
String fecha;
String hora;

    public void Pase(String nombre, String apellido, String tel,String edad,String fecha,String hora){
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
    public boolean isOK() {
        return OK;
    }
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
            java.util.logging.Logger.getLogger(Masoterapia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Masoterapia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Masoterapia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Masoterapia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Masoterapia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Fin;
    private javax.swing.JCheckBox N1;
    private javax.swing.JCheckBox N10;
    private javax.swing.JCheckBox N11;
    private javax.swing.JCheckBox N12;
    private javax.swing.JCheckBox N13;
    private javax.swing.JCheckBox N14;
    private javax.swing.JCheckBox N15;
    private javax.swing.JCheckBox N2;
    private javax.swing.JCheckBox N3;
    private javax.swing.JCheckBox N4;
    private javax.swing.JCheckBox N5;
    private javax.swing.JCheckBox N6;
    private javax.swing.JCheckBox N7;
    private javax.swing.JCheckBox N8;
    private javax.swing.JCheckBox N9;
    private javax.swing.JButton Volver;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
