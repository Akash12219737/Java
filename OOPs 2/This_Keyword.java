public class This_Keyword {
    class A {
        int a;
        void show() {
            System.out.println(this);
        }
    }

    public static void main(String[] args) {
        This_Keyword outer = new This_Keyword();
        A r = outer.new A();
        System.out.println(r);
        r.show();
    }
}