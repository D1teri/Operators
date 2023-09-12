
/**
 Version: 1.0.0
 Author: D1teri or Dima K.
 **/
public class Operators
{
    int i = 10;
    int f = 3;
    boolean flag = false;
    public void run(){
        f = f + i ;
        if(flag == false){
        flag = true;
        }
        else {
        flag = false;
        }
        i++;
        
        System.out.println(i);
        System.out.println(f);
        System.out.println(flag);
    }
    
    public static void main (String[] args){
        Operators sp = new Operators();//creates a commad sp which can use memory of the system to run the code from file/class Operatos.
        sp.run();//runs function called run()
    }
}
