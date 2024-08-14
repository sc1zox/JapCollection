public class Fibonacci {

    int fibrek(int in){
        if(in==1 || in==2){
            return 1;
        }
        else {
                return fibrek(in-1)+fibrek(in-2);
        }
    }

    int fibit(int in){

        if(in==1){
            return 1;
        }
        int fib = 1;
        int prevFib = 1;


        for(int i=2; i<in; i++) {
            int temp = fib;
            fib+= prevFib;
            prevFib = temp;
        }

        return fib;
    }
}
