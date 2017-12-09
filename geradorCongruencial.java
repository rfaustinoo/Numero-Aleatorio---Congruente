package geradordenumeros;

public class geradorCongruencial {
	public static int Congruencial(int a, int c, int m, int xn) {
		int rst = (((a*xn)+c)%m);
		return rst;
	}
}