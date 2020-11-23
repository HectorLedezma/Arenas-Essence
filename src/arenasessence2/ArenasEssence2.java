package arenasessence2;
public class ArenasEssence2 {

    public static void main(String[] args) {
        Login pri = new Login();
        Pantalla ppl = new Pantalla();
        Editarcliente edc = new Editarcliente();
        
        boolean conti0 = false;
        boolean conti1 = true;
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
                if(ppl.volv() == true){
                    ppl.setVisible(false);
                    pri.setVisible(true);
                    conti0 = false;
                    conti1 = true;
                    ppl.volv = false;
                }    
            }
        }
        
        
    }
    
}
