package arenasessence2;

import javax.swing.JOptionPane;

public class ArenasEssence2 {

    public static void main(String[] args) {
        Login pri = new Login();
        Pantalla ppl = new Pantalla();
        
        Masaje masaje = new Masaje();//1
        Podologia podologia = new Podologia();//2
        Masoterapia masoterapia = new Masoterapia();//3
        Colorimetria colorimetria = new Colorimetria();//4
        
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
            }
            
        }
        
        
    }
    
}
