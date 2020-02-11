
package arraysbidimensional;

import javax.swing.JOptionPane;


public class ArraysBidimensional {

 
    public static void main(String[] args) {
  int[][]matriz=new int[3][4];
  String[]alumnos={"alum1","alum2","alum3"};
  String[]modulos={"M1","M2","M3","M4"};
  int[]mModulos=new int[4];
  int[]mAlum=new int[3];
  int opcion;
  MetodosMatriz obx=new MetodosMatriz();
  do{
      opcion=Integer.parseInt(JOptionPane.showInputDialog("*****MENU***ª \n 1--> crear Matriz\n 2-->amosar\n 3-->amosar todo\n 4--> media alumnos\n Teclea opcion"));
  switch(opcion){
      case 1:matriz=obx.crearMatriz(matriz);
      break;
      case 2:obx.amosar(matriz);
      break;
      
      case 3:obx.amosarTodo(matriz, alumnos, modulos);
      break;
      case 4:obx.mediaAlumnos(matriz, mAlum);
      break;
      case 5:obx.mediaModulos(matriz, mModulos);
      break;
      case 6:obx.sair();
      break;
      
  }
     
  
    }while(opcion<4);
}
    
}
