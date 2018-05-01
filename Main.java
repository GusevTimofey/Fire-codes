public class Main {
    public static void main(String[] args) {
        String g_x = "x^7 + 1";
        String f_x = "x^4 + x^1 + 1";
        Polynom G_polynom = new Polynom(g_x);
        Polynom F_polynom = new Polynom(f_x);

        System.out.println(G_polynom);
        System.out.println(F_polynom);

        Polynom mul = G_polynom.mul(F_polynom);
        System.out.println(mul);

        Polynom div = mul.div(G_polynom);
        System.out.println(div);

    }
}
