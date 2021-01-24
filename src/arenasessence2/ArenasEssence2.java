package arenasessence2;

import java.io.File;
import java.time.LocalTime;
import javax.swing.JOptionPane;

public class ArenasEssence2 {

    public static void main(String[] args) {
        Login pri = new Login();
        Pantalla ppl = new Pantalla();
        String barra = File.separator;
        Masaje masaje = new Masaje();//1
        Podologia podologia = new Podologia();//2
        Masoterapia masoterapia = new Masoterapia();//3
        Colorimetria colorimetria = new Colorimetria();//4
        
        FichaMasaje masaj = new FichaMasaje();
        FichaPodologia podol = new FichaPodologia();
        FichaMasoterapia masot = new FichaMasoterapia();
        FichaColorimetria colori = new FichaColorimetria();
        
        boolean conti0 = false;
        boolean conti1 = true;
        boolean contiex = true;
        boolean contigen =false;
        while(contigen == false){
            while(conti0 == false){
                pri.setVisible(true);
                if(pri.Lopa == true){
                    pri.setVisible(false);
                    ppl.setVisible(true);
                    //System.out.println("Nombre: "+pri.nombre);
                    ppl.datosEmpleado(pri.nombre, pri.apellido, pri.rut, pri.telefono);
                    conti0 = true;
                    conti1 = false;
                    
                    pri.Lopa = false;
                }
            }
            while(conti1 == false){
                ppl.setVisible(true);
                contiex = true;
                if(ppl.volv() == true){
                    ppl.setVisible(false);
                    pri.setVisible(true);
                    conti0 = false;
                    conti1 = true;
                    ppl.volv = false;
                }
                if(ppl.tapa == true){
                    switch(ppl.inquisidor()){
                        case 1:
                            while(contiex == true){
                                ppl.setVisible(false);
                                masaje.setVisible(true);
                                masaje.Pase(ppl.nombre(), ppl.apellido(), ppl.telefono(), ppl.edad(), ppl.fecha(), ppl.hora(), ppl.otros());
                                if(masaje.fincl == true){
                                    ppl.setOK(masaje.isOK());
                                    contiex = false;
                                    ppl.setVisible(true);
                                    masaje.setVisible(false);
                                    ppl.tapa = false;
                                    masaje.fincl = false;
                                }
                            }
                            break;
                        case 2:
                            while(contiex == true){
                                ppl.setVisible(false);
                                podologia.setVisible(true);
                                podologia.Pase(ppl.nombre(), ppl.apellido(), ppl.telefono(), ppl.edad(), ppl.fecha(), ppl.hora(), ppl.otros());
                                if(podologia.fincl == true){
                                    ppl.setOK(podologia.isOK());
                                    contiex = false;
                                    ppl.setVisible(true);
                                    podologia.setVisible(false);
                                    ppl.tapa = false;
                                    podologia.fincl = false;
                                }
                            }
                            break;
                        case 3:
                            while(contiex == true){
                                ppl.setVisible(false);
                                masoterapia.setVisible(true);
                                masoterapia.Pase(ppl.nombre(), ppl.apellido(), ppl.telefono(), ppl.edad(), ppl.fecha(), ppl.hora(), ppl.otros());
                                if(masoterapia.fincl == true){
                                    contiex = false;
                                    ppl.setVisible(true);
                                    masoterapia.setVisible(false);
                                    ppl.tapa = false;
                                    masoterapia.fincl = false;
                                }
                            }
                            break;
                        case 4:
                            while(contiex == true){
                                ppl.setVisible(false);
                                colorimetria.setVisible(true);
                                colorimetria.Pase(ppl.nombre(), ppl.apellido(), ppl.telefono(), ppl.edad(), ppl.fecha(), ppl.hora(), ppl.otros());
                                if(colorimetria.fincl == true){
                                    contiex = false;
                                    ppl.setVisible(true);
                                    colorimetria.setVisible(false);
                                    ppl.tapa = false;
                                    colorimetria.fincl = false;
                                }
                            }
                            break;
                        default:
                            JOptionPane.showMessageDialog(null,"Por favor, ingrese el trabajo que se va a realizar");
                            break;
                    }
                    ppl.tapa = false;
                }
                if(ppl.Fichas == true){
                    String nombrearchi = ppl.getjTable3().getValueAt(ppl.getjTable3().getSelectedRow(), 0).toString()+"."+ppl.getCarpetatratamiento().getSelectedItem();
                    String nombreclien = ppl.getjTable3().getValueAt(ppl.getjTable3().getSelectedRow(), 1).toString();
                    System.out.println(nombrearchi);
                    String ubicacion = System.getProperty("user.dir")+barra+ppl.getCarpetatratamiento().getSelectedItem()+barra+nombreclien+barra+nombrearchi;
                    //System.out.println(ubicacion);
                    File contenedor = new File(ubicacion);
                            switch(ppl.carpetatrata()){
                                case 1:
                                    while(masaj.bolver == false){
                                        masaj.setVisible(true);
                                        ppl.setVisible(false);
                                        masaj.PasaArchivo(contenedor);
                                    }
                                    masaj.setVisible(false);
                                    ppl.setVisible(true);
                                    ppl.setfich(false);
                                    masaj.setBolver(false);
                                    ppl.getjTable3().setModel(ppl.getDtm());
                                    break;
                                case 2:
                                    while(podol.bolver == false){
                                        podol.setVisible(true);
                                        ppl.setVisible(false);
                                        //System.out.println(LocalTime.now());
                                    }
                                    podol.setVisible(false);
                                    ppl.setVisible(true);
                                    ppl.setfich(false);
                                    podol.setBolver(false);
                                    ppl.getjTable3().setModel(ppl.getDtm());
                                    break;
                                case 3:break;
                                case 4:break;
                                default:break;
                            }
                }
            }
            
        }
        
        
    }
    
}
