
// it is just like declaring the template in c++, we use generic to store any single objecct of any type
//GENERIC CLASS, <T> simply means we can make it for any type of datatype like any TEMPLATE

public class Data<T> {
    private T value;

    public Data() {
        this.value = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T val) {
        this.value = val;
    }


    public static void main(String[] args) {
        Data<String> data = new Data<>(); //making the data class of String type.
        data.setValue("Aditya");
        System.out.println(data.getValue());
    }
}
