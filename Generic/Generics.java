package Generic;
class data<T>{
    private T obj;

    public void setObj(T o){
        obj=o;
    }
    public T getObj(){
       return obj;
    }


}

public class Generics {
    public static void main(String[] args) {
        data<String> d = new data<>();
        d.setObj("Aditya");

        System.out.println(d.getObj());

    }
}
