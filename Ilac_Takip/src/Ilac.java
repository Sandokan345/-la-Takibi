//Super class
public class Ilac {
	private String Name;
	private String Type;
	private int Prime_cost;
	private int Sale_price;
	/*Bu s�n�f�n nesnelerii�in �zellikler olu�turuldu.
	 *Name: �la� ad�.
	 *Type: �la� t�r�.
	 *Prime_cost: �retim maliyeti.
	 *Sale_price: Sat�� fiyat�.
	 *Bu �zellikler private olarak tan�mlanarak �zerinde de�i�iklik yap�lmas� engellendi.*/
	
	public Ilac(String Name, String Type, int Prime_cost, int Sale_price) {
		/*Constructor olu�turuldu.
		 *Constructor yard�m�yla test methodunda olu�turdu�umuz nesnelere olu�um esnas�nda �zellik atayabiliriz.*/
		this.Name = Name;
		this.Type = Type;
		this.Prime_cost = Prime_cost;
		this.Sale_price = Sale_price;
	}
	
	public Ilac() {
		/*Constructor OVERLOAD edildi
		 *Nesne olu�umu esnas�nda �zellik belirlenmesse bilgi yok ve 0 ��kt�lar� verir.*/
		this.Name = "Bilgi Yok.";
		this.Type = "Bilgi Yok.";
		this.Prime_cost = 0;
		this.Sale_price = 0;
	}
	int kar_durumu(int Prime_cost, int Sale_price)
	{
		/*Bu method ald��� �retim maliyeti ile sat�� miktar� aras�ndaki fark� geri d�nd�r�p kar durumunu belirler.*/
		return Sale_price - Prime_cost;
	}
	/*Burdan sonraki kodlar getter setter kodlar�d�r.
	 *Ba�ta private olarak tan�mlad���m�z �zelliklerin d��ardan eri�ilmesine olanak sa�larlar.*/
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public String getType() {
		return Type;
	}
	public void setType(String Type) {
		this.Type = Type;
	}

	public int getPrime_cost() {
		return Prime_cost;
	}
	public void setPrime_cost(int Prime_cost) {
		this.Prime_cost = Prime_cost;
	}

	public int getSale_price() {
		return Sale_price;
	}
	public void setSale_price(int Sale_price) {
		this.Sale_price = Sale_price;
	}
}