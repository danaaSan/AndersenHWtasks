package pack;

public class  Check{
     public void checkClassLoader(){
         System.out.println("ClassLoader is working!");
         System.out.println("Using loader: " + this.getClass().getClassLoader());
     }
 }