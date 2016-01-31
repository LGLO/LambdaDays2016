package mutable;

public class AB {
    final int a;
    int b;
    
    public AB(){
        a = 0;
    }
    
    public AB(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
