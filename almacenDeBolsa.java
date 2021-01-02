
package prueba3;

import javax.swing.JOptionPane;

public class prueba3 {
   public static void main(String[] args) {
        int bolsa=2000,cap=3500,y,nuevo,z,z2,dif=1500,cont=0,cont2=0;
        String x,opc;
        x=JOptionPane.showInputDialog("Buen dia! , desea efectuar algún deposito o retiro?"+"\n\nOpciones: ---(si)----(no)----");
        if("si".equals(x.toLowerCase())){
            do{
              y=Integer.parseInt(JOptionPane.showInputDialog("Digite una opcion: "+"\n1. Deposito"+"\n2. Retiro"));
              if(y==1){
                  z=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de bolsas a depositar: "));
                  if(z<=dif){
                      bolsa+=z;
                      dif=cap-bolsa;
                      cont++;
                  }
                  else{
                      JOptionPane.showMessageDialog(null,"La capacidad del almacén esta llena");
                  }                  
              }
              else if(y==2){
                  z2=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de bolsas a retirar: "));
                  if(z2<=bolsa){
                      bolsa-=z2;
                      dif=cap-bolsa;
                      cont2++;
                  }
                  else{
                      JOptionPane.showMessageDialog(null,"La capacidad del almacén esta vacía");
                  }      
              }
              JOptionPane.showMessageDialog(null,"\n\n\t..:LISTA:.."+
                      "\n1. El stock del almacén: "+bolsa+
                      "\n2. La capacidad libre del almacén: "+dif+
                      "\n3. El número de depósitos y de retiros efectuados: "+
                              "\n   Depositos-> "+cont+
                              "\n   Retiros->  "+cont2+
                      "\n4. La cantidad total de bolsas depositadas y retiradas: "+(cont+cont2)+
                      "\n5. La cantidad máxima de bolsas retiradas y depositadas"+(cont+cont2)+
                      "\n6. La cantidad mínima de bolsas retiradas  y depositadas"+1);
              opc=JOptionPane.showInputDialog("Desea efectuar algún otro deposito o retiro?"+"\n\nOpciones: ---(si)----(no)----");
            }while(!"no".equals(opc.toLowerCase()));
        }
    }       
}