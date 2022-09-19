import java.util.Scanner;

public class Rational {
    Scanner scan;
    int num;
    int denom;
    Rational(int num, int denom){
        scan = new Scanner(System.in);
        checkDenom(denom);
        this.num = num;
        this.denom = denom;
        simplestForm();


    }
    void checkDenom(int denom){
        while(denom==0){
            System.out.println("Enter a diferente denom");
            denom = scan.nextInt();
        }
        this.denom = denom;
    }
    void mult (Rational r2){
        this.num*=r2.num;
        this.denom*=r2.denom;
        this.simplestForm();
    }
    void add(Rational r2){
        this.num = this.num*r2.denom + r2.num*this.denom;
        this.denom = this.denom*r2.denom;
        this.simplestForm();
    }
    void simplestForm(){
        int i=2;
        while(i<= Integer.MAX_VALUE){
//            System.out.println("Entro1");
            if((this.num!=1 && this.denom!=1) && (i<=this.denom && i<= this.num)) {
//                System.out.println("Entro2");
                System.out.println(i);
                if (this.num % i == 0 && this.denom % i == 0) {
                    this.num /= i;
                    this.denom /= i;
                    i = 2;
                }else{
                    i+=1;
                }
            }else{
                break;
            }

        }
        System.out.println(this);
    }
    static Rational multClassM(Rational r1, Rational r2){
        return new Rational(r1.num*r2.num,r1.denom*r2.denom);
    }
    @Override
    public String toString() {
        return this.num+"/"+this.denom;
    }
}
