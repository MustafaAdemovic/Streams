package ba.bitcamp.mustafaademovic.Streams;

/**
 * Ucitavanje i ispisivanje pomocu streama
 * --
 */

import java.io.*;

public class UcitavanjeIspisivanjeStreama {

	public static void main(String[] args) throws IOException {
		System.out.println("Write some text: ");
		InputStream is = new DataInputStream(System.in);
		OutputStream os = new DataOutputStream(System.out);
		byte[] buffer = new byte[20];

		while (is.read(buffer) >= 0) {

			os.write(buffer);
			buffer = new byte[20];

		}
	}

}
