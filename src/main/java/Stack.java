import java.util.Vector;

public class Stack {

    private Integer[] arrays;
    private Integer top;
    private Integer capacity;

    public Stack(int capacity) {
    this.capacity  = capacity;
    this.arrays = new Integer[capacity];
    this.top = -1;
    }

    public void push(Integer number){
        if (top < capacity){
            arrays[++top] = number;
        }else {
            System.out.println("Stack is full");
        }
    }

    public Integer pup(){
        Integer getNum = arrays[capacity-1];
        arrays[capacity-1] = null;
        return getNum;
    }

    public static void main(String[] args) {

    }


}
