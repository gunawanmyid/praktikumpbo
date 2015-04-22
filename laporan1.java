package prak1nita;

import javax.xml.crypto.Data;

public class laporansatu {
	public static void main(String args[]) {
		data();
		jumlah();  //pemanggilan method
		kurang();
		kali();
		bagi();
	}
	
	static void data() {
		String nama="nureksanita"; //mendeklarasikan varaibel lokal
		String alamat="samata";//mendeklarasikan varaibel lokal
		byte umur=20;//mendeklarasikan varaibel lokal
		System.out.println("Saya bernama "+nama);
		System.out.println("Dengan alamat di "+alamat);
		System.out.println("Sudah tua dengan umur "+umur);
	}
	static void jumlah() {
		int a,b,c; //mendeklarasikan varaibel lokal
		a=10;
		b=10;
		c=a+b;
		System.out.println("hasil penjumlahan "+a+" dan "+b+" adalah= "+c);
	}
	static void kurang() {
		int a,b,c; //mendeklarasikan varaibel lokal
		a=10;
		b=10;
		c=a-b;
		System.out.println("hasil pengurangan "+a+" dan "+b+" adalah= "+c);
	}
	static void kali() {
		int a,b,c; //mendeklarasikan varaibel lokal
		a=2;
		b=10;
		c=a*b;
		System.out.println("hasil perkalian "+a+" dan "+b+" adalah= "+c);
	}
	static void bagi() {
		float a,b,c; //mendeklarasikan varaibel lokal
		a=40;
		b=3;
		c=a/b;
		System.out.println("hasil pembagian "+a+" dan "+b+" adalah= "+c);
	}
}
