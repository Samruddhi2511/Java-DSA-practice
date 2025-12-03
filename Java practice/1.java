public class MyClass {
    public StringBuffer insert(int index, String data) {
        StringBuffer sb1 = new StringBuffer("12345");
        sb1.insert(index, data);
        System.out.println(sb1);
        return sb1;
    }

    public StringBuffer setCharAt(int index, char ch) {
        StringBuffer sb1 = new StringBuffer("12345");
        sb1.setCharAt(index, ch);
        System.out.println(sb1);
        return sb1;
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.insert(2, "AB");

        MyClass obj1 = new MyClass();
        obj1.setCharAt(2, 'A');
    }
}
