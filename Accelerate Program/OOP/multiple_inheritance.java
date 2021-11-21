interface printable1{  
    void print1();  
}

interface printable2{  
    void print2();  
}

public class MyClass implements printable1, printable2 {
    
    public void print1(){
        
    }
    
    public void print2(){
        
    }
    
    public static void main(String args[]) {
      int x=10;
      int y=25;
      int z=x+y;

      System.out.println("Sum of x+y = " + z);
    }
}