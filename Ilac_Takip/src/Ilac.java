//Super class
public class Ilac {
	private String Name;
	private String Type;
	private int Prime_cost;
	private int Sale_price;
	/*Bu sýnýfýn nesneleriiçin özellikler oluþturuldu.
	 *Name: Ýlaç adý.
	 *Type: Ýlaç türü.
	 *Prime_cost: Üretim maliyeti.
	 *Sale_price: Satýþ fiyatý.
	 *Bu özellikler private olarak tanýmlanarak üzerinde deðiþiklik yapýlmasý engellendi.*/
	
	public Ilac(String Name, String Type, int Prime_cost, int Sale_price) {
		/*Constructor oluþturuldu.
		 *Constructor yardýmýyla test methodunda oluþturduðumuz nesnelere oluþum esnasýnda özellik atayabiliriz.*/
		this.Name = Name;
		this.Type = Type;
		this.Prime_cost = Prime_cost;
		this.Sale_price = Sale_price;
	}
	
	public Ilac() {
		/*Constructor OVERLOAD edildi
		 *Nesne oluþumu esnasýnda özellik belirlenmesse bilgi yok ve 0 çýktýlarý verir.*/
		this.Name = "Bilgi Yok.";
		this.Type = "Bilgi Yok.";
		this.Prime_cost = 0;
		this.Sale_price = 0;
	}
	int kar_durumu(int Prime_cost, int Sale_price)
	{
		/*Bu method aldýðý üretim maliyeti ile satýþ miktarý arasýndaki farký geri döndürüp kar durumunu belirler.*/
		return Sale_price - Prime_cost;
	}
	/*Burdan sonraki kodlar getter setter kodlarýdýr.
	 *Baþta private olarak tanýmladýðýmýz özelliklerin dýþardan eriþilmesine olanak saðlarlar.*/
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