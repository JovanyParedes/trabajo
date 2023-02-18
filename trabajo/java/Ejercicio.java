
package ejercicio;

import javax.swing.JOptionPane;

public class Ejercicio {

    
    public static void main(String[] args) {
        
        String Nom;
        char Cat,Con;
        int Pre,Can,Imp,Des = 0,Tot = 0,tot=0,to=0,t=0,can=0,ca=0,c=0,Total=0,Descuento=0,
                des=0,de=0,d=0,Pro=0;
        float IGV,igv = 0,ig=0,i=0,Total_IGV=0;
        
       while (true)
       {
            Nom = JOptionPane.showInputDialog("INGRESE NOMBRE DEL PRODUCTO ");
        
            Cat = JOptionPane.showInputDialog("INGRESE CATEGORIA DEL PRODUCTO (A/B/C)").charAt(0);
        
            Pre = Integer.parseInt(JOptionPane.showInputDialog("INGRESE PRECIO DEL PRODUCTO"));
        
            Can = Integer.parseInt(JOptionPane.showInputDialog("INGRESE CANTIDAD DE PRODUCTOS"));
            
           switch (Cat)
           
            {
                case 'A':
                    Des = (int) (Pre*Can*0.05);
                    Imp = Pre*Can-Des;
                    IGV = (float) (Imp*0.18);
                    Tot = (int) (Imp + IGV);
                    can = Can;
                    tot = Tot;
                    des = Des;
                    igv = IGV;
                    
                    JOptionPane.showMessageDialog(null,"NOMBRE DEL PRODUCTO: " + Nom);
                    JOptionPane.showMessageDialog(null,"CATEGORIA DEL PRODUCTO: " + Cat);
                    JOptionPane.showMessageDialog(null, "PRECIO DEL PRODUCTO: " + Pre);
                    JOptionPane.showMessageDialog(null, "CANTIDAD DE PRODUCTOS: " + Can);
                    JOptionPane.showMessageDialog(null, "IMPORTE: " + Imp);
                    JOptionPane.showMessageDialog(null, "DESCUENTO: " + Des);
                    JOptionPane.showMessageDialog(null, "IGV: " + IGV);
                    JOptionPane.showMessageDialog(null, "TOTAL A PAGAR: "+ Tot);    
                    break;
                    
                case 'B':
                    Des=0;
                    Imp = Pre*Can;
                    IGV = (float) (Imp*0.18);
                    Tot = (int) (Imp + IGV);
                    ca=Can;
                    to=Tot;
                    ig = IGV;

                    JOptionPane.showMessageDialog(null,"NOMBRE DEL PRODUCTO: " + Nom);
                    JOptionPane.showMessageDialog(null,"CATEGORIA DEL PRODUCTO: " + Cat);
                    JOptionPane.showMessageDialog(null, "PRECIO DEL PRODUCTO: " + Pre);
                    JOptionPane.showMessageDialog(null, "CANTIDAD DE PRODUCTOS: " + Can);
                    JOptionPane.showMessageDialog(null, "IMPORTE: " + Imp);
                    JOptionPane.showMessageDialog(null, "DESCUENTO: " + Des);
                    JOptionPane.showMessageDialog(null, "IGV: " + IGV);
                    JOptionPane.showMessageDialog(null, "TOTAL A PAGAR: "+ Tot);
                    break;
                    
                case 'C':
                    Des = (int) (Pre*Can*0.10);
                    Imp = Pre*Can-Des;
                    IGV = (float) (Imp*0.18);
                    Tot = (int) (Imp + IGV);
                    c=Can;
                    t=Tot;
                    d = Des;
                    i = IGV;
                    
                    JOptionPane.showMessageDialog(null,"NOMBRE DEL PRODUCTO: " + Nom);
                    JOptionPane.showMessageDialog(null,"CATEGORIA DEL PRODUCTO: " + Cat);
                    JOptionPane.showMessageDialog(null, "PRECIO DEL PRODUCTO: " + Pre);
                    JOptionPane.showMessageDialog(null, "CANTIDAD DE PRODUCTOS: " + Can);
                    JOptionPane.showMessageDialog(null, "IMPORTE: " + Imp);
                    JOptionPane.showMessageDialog(null, "DESCUENTO: " + Des);
                    JOptionPane.showMessageDialog(null, "IGV: " + IGV);
                    JOptionPane.showMessageDialog(null, "TOTAL A PAGAR: "+ Tot);
                    break;
            }
           Total = tot + to + t; 
           Descuento = des + de + d;
           Total_IGV = igv + ig + i;
           Pro = Total/2;
           Con = JOptionPane.showInputDialog("DESEA CONTINUAR??").charAt(0);
           if(Con=='N'){
               
               JOptionPane.showMessageDialog(null, """
                                                   ARTICULOS VENDIDOS POR CATEGORIAS
                                                   A = """ + can + "\n" + "B = " + ca + "\n" + "C = " + c);
               JOptionPane.showMessageDialog(null, """
                                                   MONTO VENDIDO POR CATEGORIA
                                                   A = """ + tot + "\n" + "B = " + to + "\n" + "C = " + t);
               JOptionPane.showMessageDialog(null, "TOTAL VENDIDO EN GENERAL: S/." + Total);
               JOptionPane.showMessageDialog(null, "PROMEDIO DE VENTAS EN GENERAL:" + Pro);
               JOptionPane.showMessageDialog(null, "CANTIDAD DE IMPORTE DESCONTADO: S/." + Descuento);
               JOptionPane.showMessageDialog(null, "TOTAL IMPORTE IGV COBRADO: S/." + Total_IGV);
               JOptionPane.showMessageDialog(null,"GRACIAS POR SU VISITA");
               break;
           }
           
       }
           
       
    }
    
}
