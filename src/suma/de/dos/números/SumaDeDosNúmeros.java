/*
 En este cídogo se puede trabajar con las operaciones matemáticas básicas utilizando dos números.
 */
package suma.de.dos.números;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class SumaDeDosNúmeros {

    public static void main(String[] args) {
        // En la siguiente línea se declaran las variabes que se utilizarán para almacenar los resultados
        float a = 0, b=0, c=0;
        String val="";
        int cont=0, select = 0;
        // En la presente cadena se puede observar las operaciones que utulizarán para este código
        String[] option = {"Suma","Resta","Multipliación","División"};
        
        // Se inicializa el código indicando al usuario de que se trata
        JOptionPane.showMessageDialog(null, "Esta es una aplicación para realizar una operación matemática de dos números");
        
        /* 
        * Comenzamos a solicitar al usuario los valores que se utulizarán para la ejecución del código
        * En la línea 30 se muestra un método en el cual validamos que en realidad sea un valor valido para el
        programa.
        * En la línea 32 se convierte el valor insertado por el usuario en tipo Float para almcenarlo en una de las
        variables antes declaradas.
        */
        while(cont < 2){
            val = JOptionPane.showInputDialog(null, "Inserta un número");
             if(valida(val)==true){
                 if(cont == 0){
                     a=Float.parseFloat(val);
                 }else if(cont == 1){
                     b=Float.parseFloat(val);
                 }
             }else{
                 JOptionPane.showMessageDialog(null, "Por favor insertar un valor valido");
                 cont--;
             }
             cont++;
        }
       
        //Solicitamos al usuario que es lo que quiere realizar con los valores antes agregados
       select = JOptionPane.showOptionDialog(null, "Es necesario que seleccione una opción", "Operación a realizar", JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE, null, option, option[0]);
       
       // En el presente condicional anidado se realizan las operaciones segun se solicite por el usuario entregando el resultado de la misma
       if(select == 0){
           c = a+b;
           JOptionPane.showMessageDialog(null,c,"La suma de los dos número es",JOptionPane.WARNING_MESSAGE);
       }else if(select == 1){
           c = a-b;
           JOptionPane.showMessageDialog(null,c,"La resta de los dos número es",JOptionPane.WARNING_MESSAGE);
       }else if(select == 2){
           c = a*b;
           JOptionPane.showMessageDialog(null,c,"La multiplicación de los dos número es",JOptionPane.WARNING_MESSAGE);
       }else if(select == 3){
           c = a/b;
           JOptionPane.showMessageDialog(null,c,"La división de los dos número es",JOptionPane.WARNING_MESSAGE);
       }
    }
    
    //Metodo donde se valida que el usuario inserte valores numéricos para este código
    public static boolean valida(String dato){
        float a=0;
        boolean res=false;
        try{
            a=Float.parseFloat(dato);
            res=true;
            return res;
        }catch(Exception e){
            return res;
        }
        
    }
    
}
/*
* En este código solo se muestra como solicitar valores numpericos al usuario y realizar operaciones básicas
matemáticas con la finalidad de que el desarrollador tenga una base para crear una calculadores u otros programas donde
estas bases le sean de ayuda.
*/