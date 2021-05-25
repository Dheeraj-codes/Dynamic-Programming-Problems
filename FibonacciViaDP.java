public class FibonacciViaDP {
    static int lookUp[] = new int[100];

    static void _initialize(){
        for(int i=0; i<100; i++)
            lookUp[i] = -1;
    }
    static int fib(int n){
        if(lookUp[n] == -1){
            if(n <=1)
                lookUp[n] = n;
            else
                lookUp[n] = fib(n-1) +fib(n-2);
        }
        return lookUp[n];
    }
    public static void main(String args[]){
        
        _initialize();
        for(int i=0; i<10; i++)
            System.out.println(fib(i));
    }

}
