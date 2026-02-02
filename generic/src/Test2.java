public class Test2 {
    private Object field;
    // Ana class


    public Test2(Object field) {
        this.field = field;
    }

    public Object getField() {
        return field;
    }

    public void setField(Object field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return "Test2{" +
                "field=" + getField() +
                '}';
    }
}
