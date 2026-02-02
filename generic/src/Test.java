public class Test <T>{
//T - type K - key V - value E - element
private  T field;

    public Test() {
    }

    public T getField() {
        return field;
    }

    public void setField(T field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return "Test{" +
                "field=" + getField() +
                '}';
    }
}
