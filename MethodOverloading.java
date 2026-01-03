class Demo{
    void display(int a){
        System.out.println("Integer method called: " + a);
    }
    
    void display(String b){
        System.out.println("String method called: " + b);
    }
    
}

public class MethodOverloading {
    public static void main(String[] args) {
        Demo obj = new Demo();
        
        obj.display(10);          // Calls the method with integer parameter
        obj.display("Hello");    // Calls the method with string parameter
    }
}
