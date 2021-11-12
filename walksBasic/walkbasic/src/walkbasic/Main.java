import java.util.Random;

public class Main {

	public static void main(String[] args) {

		boolean salida = false;
		int x = 3; // ancho
		int y = 1;// alto
		int probabilidad = 0;// comprovante

		Random r = new Random();

		while (salida == false) {
			
			
			probabilidad = r.nextInt(2);

			if (probabilidad == 1) {
				x = 4;
			} else {
				x = 3;
			}
			
			
			System.out.println("\n");

			String[][] mapa =  {{ "M", "M", "M", "E", "E", "M", "M", "M" },
								{ "M", "·", "·", "·", "·", "·", "·", "M" },
								{ "M", "·", "T", "T", "T", "T", "·", "M" }, 
								{ "M", "·", "·", "·", "·", "·", "·", "M" },
								{ "M", "·", "T", "T", "T", "T", "·", "M" }, 
								{ "M", "·", "·", "·", "·", "·", "·", "M" },
								{ "M", "·", "T", "T", "T", "T", "·", "M" }, 
								{ "M", "·", "·", "·", "·", "·", "·", "M" },
								{ "M", "M", "M", "S", "S", "M", "M", "M" }};

			

			probabilidad = r.nextInt(3);

            switch (probabilidad) {
            case 0:
                if (x > 1) {
                    x--;
                } else {
                    x++;
                }
                break;

            case 1:
                if (x < 7) {
                    x++;
                } else
                    x--;
                break;

            default:
                if (y < 7) {
                    y++;
                }
                break;
            }

			if (y == 7 && x == 3 || y == 7 && x == 4) {
				salida = true;
			}

			mapa[y][x] = "#";

			for (int i = 0; i < mapa.length; i++) {
				for (int a = 0; a < mapa[i].length; a++)
					System.out.print(" | " + mapa[i][a] + " | ");
				System.out.println("\n ------------------------------------------------------ ");
			}
		}
	}
}