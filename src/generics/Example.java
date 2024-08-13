package generics;

public class Example<T, V> {
    private String str = "";

    public String getStr() {
        return str;
    }

    public void addToStr(T t, V v) {
        if (this.str.isEmpty())
            this.str += t.toString() + v.toString();
        else
            this.str += "\n"  + t.toString() + v.toString();
    }
}
