package walkbasic;

import java.util.Random;

public class wals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0; // ancho
		int y = 3;// alto
		int p = 0;
		boolean noSalio = true;

		Random r = new Random();
		System.out.println(x + "/" + y);
		while (noSalio) {

			p = r.nextInt(3);

			switch (p) {
			case 0:
				if (x > 0) {
					x--;
				} else {
					x++;
				}
				break;
			case 1:
				if (x < 6) {
					x++;
				} else
					x--;
				break;
			default:
				if (y < 6) {
					y++;
				}
				break;

			}
			if (y == 6 && x == 3 || y == 6 && x == 2) {
				noSalio = false;
				
			} 
			System.out.println(x + "/" + y);
		}
	}

}
