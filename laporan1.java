package prak1nita;

import javax.xml.crypto.Data; // INI MAKSUDNYA APAAN YAH? ..=), SILAHKAN BUAT TANPA IMPORT DECLARATION DULU ..=)

public class laporansatu { //BERIKAN PENJELASAN
	public static void main(String args[]) {
		data();
		jumlah();  //pemanggilan method METHOD APA? ..=)
		kurang();
		kali();
		bagi();
	}
	
	static void data() { //BERIKAN PENJELASAN
		String nama="nureksanita"; //mendeklarasikan varaibel lokal
		String alamat="samata";//mendeklarasikan varaibel lokal
		byte umur=20;//mendeklarasikan varaibel lokal
		System.out.println("Saya bernama "+nama); //BERIKAN PENJELASAN
		System.out.println("Dengan alamat di "+alamat);
		System.out.println("Sudah tua dengan umur "+umur);
	}
	static void jumlah() { //BERIKAN PENJELASAN
		int a,b,c; //mendeklarasikan varaibel lokal
		a=10; //SEDEHANAKAN
		b=10;  //SEDEHANAKAN
		c=a+b; //BERIKAN PENJELASAN
		System.out.println("hasil penjumlahan "+a+" dan "+b+" adalah= "+c);
	}
	static void kurang() { //BERIKAN PENJELASAN
		int a,b,c; //mendeklarasikan varaibel lokal
		a=10;
		b=10;
		c=a-b;
		System.out.println("hasil pengurangan "+a+" dan "+b+" adalah= "+c);
	}
	static void kali() { //BERIKAN PENJELASAN
		int a,b,c; //mendeklarasikan varaibel lokal
		a=2; //-SDA -
		b=10; //-SDA -
		c=a*b; //-SDA -
		System.out.println("hasil perkalian "+a+" dan "+b+" adalah= "+c);
	}
	static void bagi() { //BERIKAN PENJELASAN
		float a,b,c; //mendeklarasikan varaibel lokal
		a=40; //-SDA -
		b=3; //-SDA -
		c=a/b; //-SDA -
		System.out.println("hasil pembagian "+a+" dan "+b+" adalah= "+c);
	}
}
