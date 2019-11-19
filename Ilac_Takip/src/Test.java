//main methoda sahip test sýnýfý
public class Test {
	public static void main(String[] args)
	{
		int toplam=0;			//toplam kar durumunu çýktý olarak vermek için kullanýlacak
		/* 5 adet Ithal ve Yerli olarak ilaçlar oluþturuldu.
		 * Bu ilaçlarýn isimleri
		 * 				Çeþitleri
		 * 				Üretim Maliyetleri
		 * 				Satýþ fiyatlarý
		 * Constructor yardýmýyla oluþturulurken belirlenmiþtir.
		 * Ithal ilaçlar için Üretim yerleri eklemesi yapýlmýþtýr
		 * Yerli ilaçlar için yan etki yüzdesi eklemesi yapýlmýþtýr. */
		Ithal i1 = new Ithal("Calpol", "Surup", 10, 20, "Ýsvec");
		Ithal i2 = new Ithal("Silverdin","Merhem", 6, 10, "Makedonya");
		Ithal i3 = new Ithal("Majezik", "Kapsul", 2, 12, "ABD");
		Yerli i4 = new Yerli("Emadine", "Damla", 23, 68, 38);
		Yerli i5 = new Yerli("Nazofix", "Sprey", 6, 17, 65);
		//Ýlaçlarýn tutulduðu bir depo oluþturulmuþtur.
		Depo d1 = new Depo();	
		/*Depoya isim verildi.
		 *Depodaki ArrayListe ilaçlar eklendi*/
		d1.setDepo_name("Ecza Deposu");
		d1.ilac_ekle(i1);
		d1.ilac_ekle(i2);
		d1.ilac_ekle(i3);
		d1.ilac_ekle(i4);
		d1.ilac_ekle(i5);
		/*Ekran çýktýsýna önce depo adý verildi
		 *Her ilacýn oluþturulurken atandýðý özellikleri get set metodlarýyla ekrana çýktý olarak verildi.*/
		System.out.println(d1.getDepo_name());
		
		System.out.println("i1:\nilaç adý:"+i1.getName()+"\nÝlaç türü:"+i1.getType()+"\nÝlaç üretim maliyeti:"+
				i1.getPrime_cost()+"\nÝlaç satýþ fiyatý:"+i1.getSale_price()+"\nÜretim yeri:"+i1.getUretim_yeri());
		System.out.println("i2:\nilaç adý:"+i2.getName()+"\nÝlaç türü:"+i2.getType()+"\nÝlaç üretim maliyeti:"+
				i2.getPrime_cost()+"\nÝlaç satýþ fiyatý:"+i2.getSale_price()+"\nÜretim yeri:"+i2.getUretim_yeri());
		System.out.println("i3:\nilaç adý:"+i3.getName()+"\nÝlaç türü:"+i3.getType()+"\nÝlaç üretim maliyeti:"+
				i3.getPrime_cost()+"\nÝlaç satýþ fiyatý:"+i3.getSale_price()+"\nÜretim yeri:"+i3.getUretim_yeri());
		System.out.println("i4:\nilaç adý:"+i4.getName()+"\nÝlaç türü:"+i4.getType()+"\nÝlaç üretim maliyeti:"+
				i4.getPrime_cost()+"\nÝlaç satýþ fiyatý:"+i4.getSale_price()+"\nYüksek yanEtki:"+i4.verilen_hasar(i4.getEtki()));
		System.out.println("i5:\nilaç adý:"+i5.getName()+"\nÝlaç türü:"+i5.getType()+"\nÝlaç üretim maliyeti:"+
				i5.getPrime_cost()+"\nÝlaç satýþ fiyatý:"+i5.getSale_price()+"\nYüksek yanEtki:"+i5.verilen_hasar(i5.getEtki()));
		/*Kar hesaplamasý yapýlabilmesi için her ilaçtan edilen kar bir array yardýmýyla tutuldu.*/
		for(int i=0; i<d1.ilac_listesi.size(); i++)
		{
			d1.toplam_kar[i] = 
			(d1.ilac_listesi.get(i).kar_durumu(d1.ilac_listesi.get(i).getPrime_cost(), d1.ilac_listesi.get(i).getSale_price()));
		}
		//Oluþturulan arrayin her bir deðeri toplam adlý deðiþkene eklenerek toplam kar bulundu.
		for(int i=0; i<d1.toplam_kar.length; i++)
		{
			toplam += d1.toplam_kar[i];
		}
		System.out.println("\nToplam kar = "+toplam+" TL");	//Toplam kar çýktýsý verir.
	}
}