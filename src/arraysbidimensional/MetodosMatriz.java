

package arraysbidimensional;

import javax.swing.JOptionPane;


public class MetodosMatriz {
    public int[][] crearMatriz(int[][]taboa){
        for(int f=0;f<taboa.length;f++)
            for(int c=0;c<taboa[f].length;c++){
                taboa[f][c]=PedirDatos.pedirInt();
                
                        }
        return taboa;
    }
public void amosar(int[][]taboa){
    for(int f=0;f<taboa.length;f++){
        System.out.println("\n");
        for(int c=0;c<taboa[f].length;c++)
            System.out.print(taboa[f][c]+" ");
    
}}
public void sair(){
    System.exit(0);
}
public String[] arrayStringFila(int[][]taboa){
 
    String[]fila=new String[taboa.length];
    for(int i=0;i<fila.length;i++)
        fila[i]=PedirDatos.pedirString();
    return fila;
    
}
public String[] arrayStringColumna(int[][]taboa){
  String[]columnas=new String[taboa[0].length];
  for(int i=0;i<columnas.length;i++)
        columnas[i]=PedirDatos.pedirString();
    return columnas;
}
public void amosarTodo(int[][]taboa,String[]alumnos,String[]modulos){
    System.out.print("      ");
    for(int i=0;i<modulos.length;i++)
       
        System.out.print("   "+modulos[i]+"  ");
    for(int f=0;f<taboa.length;f++){
        System.out.println("\n "+alumnos[f]);
        for(int c=0;c<taboa[f].length;c++)
            System.out.print(taboa[f][c]+" ");
}
}
    public int[] mediaAlumnos(int[][]taboa,int[]mAlum){
        int acu=0;
        for(int f=0;f<taboa.length;f++){
          acu=0;
         for(int c=0;c<taboa[f].length;c++){
             acu=acu+taboa[f][c];
    }
    mAlum[f]=acu/taboa[f].length;
        System.out.println("**"+mAlum[f]);
    }
        return mAlum;
        
    }
public int[]mediaModulos(int[][]taboa,int[]mModulos){
int acu=0;
for(int c=0;c<mModulos.length;c++){
    acu=0;
    for(int f=0;f<taboa.length;f++)
        acu=acu+taboa[f][c];
    System.out.println("**" +acu/mModulos.length);
    mModulos[c]=acu/mModulos.length;
}
return mModulos;
}
}