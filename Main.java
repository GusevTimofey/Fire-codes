public class Main {
    public static void main(String[] args) {

        Polynom g_x = new Polynom("x^7 + 1");
        Polynom f_x = new Polynom("x^4 + x^1 + 1");
        Polynom h_x = g_x.mul(f_x);
        Polynom k_x = new Polynom("x^7 + 1");
        Polynom l_x = h_x.div(k_x).takeModPart();
        System.out.println("g_x: " + g_x);
        System.out.println("f_x: " + f_x);
        System.out.println("h_x = g_x * f_x: " + h_x);
        System.out.println("k_x: " + k_x);
        System.out.println("h_x mod k_x: " + l_x);
        System.out.println();


        Polynom q_x = new Polynom("x^8 + x^4 + x^2 + 1");
        Polynom w_x = new Polynom("x^7 + 1");
        Polynom e_x = q_x.div(w_x);
        Polynom e1_x = q_x.div(w_x).takeModPart();
        System.out.println("q_x / w_x: " +e_x);
        System.out.println("q_x mod w_x: " + e1_x);

    }
}
