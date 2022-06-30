public class Main {
    public static void main(String[] args) throws Exception {
//        Stack s = new Stack(4);
//        s.push(2);
//        s.push(12);
//        s.push(22);
//        s.push(24);
//        s.display();
//        System.out.println();
//        System.out.println(s.pop());
//        System.out.println();
//        s.display();
//        s.size();

        DynamicStack s2 = new DynamicStack(4);
        s2.push(2);
        s2.push(21);
        s2.push(12);
        s2.push(24);
        s2.push(25);
        s2.push(28);
        s2.display();
        System.out.println(s2.pop());
        System.out.println(s2.size());
    }
}
