import java.util.Arrays;

public class Vector {
    Rational vector[];
    StringBuffer sb;
    int index;
    Vector(int size){
        sb = new StringBuffer();
        this.index = 0;
        vector = new Rational[size];
    }
    void addELement(Rational r){
        this.vector[this.index] = r;
        this.index+=1;
    }
    Rational getElement(int index){
        if(index>this.vector.length) {
            throw new Error("Index is greater than the elements numbers in the array");
        }
        return this.vector[index];
    }
    String walkList(){
        if(this.sb.length()>0) {
            this.sb.delete(0, this.sb.length());
        }
        this.sb.append("(");
        for(int i=0;i<this.vector.length;i+=1){
            this.sb.append(this.vector[i].num+"/"+this.vector[i].denom+",");
        }
        this.sb.deleteCharAt(sb.length()-1);
        this.sb.append(")");
        return this.sb.toString();
    }
    void set(int i,  Rational r){
        if(i>this.vector.length){
            throw new Error("i entered is greater than vector's length");
        }
        this.vector[i] = r;
    }
    void add(Vector vec2){
        if(vec2.vector.length!=this.vector.length){
            throw new Error("No tienen el mismo tamagno");
        }
        for(int index = 0 ; index<this.vector.length;index+=1){
            this.vector[index].add(vec2.vector[index]);
        }

    }
    void mult(Rational r){
        for(int i=0;i<this.vector.length;i+=1){
            this.vector[i].mult(r);
        }
    }
    @Override
    public String toString() {
        return this.walkList();
    }
}
