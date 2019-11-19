//main methoda sahip test s�n�f�
public class Test {
	public static void main(String[] args)
	{
		int toplam=0;			//toplam kar durumunu ��kt� olarak vermek i�in kullan�lacak
		/* 5 adet Ithal ve Yerli olarak ila�lar olu�turuldu.
		 * Bu ila�lar�n isimleri
		 * 				�e�itleri
		 * 				�retim Maliyetleri
		 * 				Sat�� fiyatlar�
		 * Constructor yard�m�yla olu�turulurken belirlenmi�tir.
		 * Ithal ila�lar i�in �retim yerleri eklemesi yap�lm��t�r
		 * Yerli ila�lar i�in yan etki y�zdesi eklemesi yap�lm��t�r. */
		Ithal i1 = new Ithal("Calpol", "Surup", 10, 20, "�svec");
		Ithal i2 = new Ithal("Silverdin","Merhem", 6, 10, "Makedonya");
		Ithal i3 = new Ithal("Majezik", "Kapsul", 2, 12, "ABD");
		Yerli i4 = new Yerli("Emadine", "Damla", 23, 68, 38);
		Yerli i5 = new Yerli("Nazofix", "Sprey", 6, 17, 65);
		//�la�lar�n tutuldu�u bir depo olu�turulmu�tur.
		Depo d1 = new Depo();	
		/*Depoya isim verildi.
		 *Depodaki ArrayListe ila�lar eklendi*/
		d1.setDepo_name("Ecza Deposu");
		d1.ilac_ekle(i1);
		d1.ilac_ekle(i2);
		d1.ilac_ekle(i3);
		d1.ilac_ekle(i4);
		d1.ilac_ekle(i5);
		/*Ekran ��kt�s�na �nce depo ad� verildi
		 *Her ilac�n olu�turulurken atand��� �zellikleri get set metodlar�yla ekrana ��kt� olarak verildi.*/
		System.out.println(d1.getDepo_name());
		
		System.out.println("i1:\nila� ad�:"+i1.getName()+"\n�la� t�r�:"+i1.getType()+"\n�la� �retim maliyeti:"+
				i1.getPrime_cost()+"\n�la� sat�� fiyat�:"+i1.getSale_price()+"\n�retim yeri:"+i1.getUretim_yeri());
		System.out.println("i2:\nila� ad�:"+i2.getName()+"\n�la� t�r�:"+i2.getType()+"\n�la� �retim maliyeti:"+
				i2.getPrime_cost()+"\n�la� sat�� fiyat�:"+i2.getSale_price()+"\n�retim yeri:"+i2.getUretim_yeri());
		System.out.println("i3:\nila� ad�:"+i3.getName()+"\n�la� t�r�:"+i3.getType()+"\n�la� �retim maliyeti:"+
				i3.getPrime_cost()+"\n�la� sat�� fiyat�:"+i3.getSale_price()+"\n�retim yeri:"+i3.getUretim_yeri());
		System.out.println("i4:\nila� ad�:"+i4.getName()+"\n�la� t�r�:"+i4.getType()+"\n�la� �retim maliyeti:"+
				i4.getPrime_cost()+"\n�la� sat�� fiyat�:"+i4.getSale_price()+"\nY�ksek yanEtki:"+i4.verilen_hasar(i4.getEtki()));
		System.out.println("i5:\nila� ad�:"+i5.getName()+"\n�la� t�r�:"+i5.getType()+"\n�la� �retim maliyeti:"+
				i5.getPrime_cost()+"\n�la� sat�� fiyat�:"+i5.getSale_price()+"\nY�ksek yanEtki:"+i5.verilen_hasar(i5.getEtki()));
		/*Kar hesaplamas� yap�labilmesi i�in her ila�tan edilen kar bir array yard�m�yla tutuldu.*/
		for(int i=0; i<d1.ilac_listesi.size(); i++)
		{
			d1.toplam_kar[i] = 
			(d1.ilac_listesi.get(i).kar_durumu(d1.ilac_listesi.get(i).getPrime_cost(), d1.ilac_listesi.get(i).getSale_price()));
		}
		//Olu�turulan arrayin her bir de�eri toplam adl� de�i�kene eklenerek toplam kar bulundu.
		for(int i=0; i<d1.toplam_kar.length; i++)
		{
			toplam += d1.toplam_kar[i];
		}
		System.out.println("\nToplam kar = "+toplam+" TL");	//Toplam kar ��kt�s� verir.
	}
}