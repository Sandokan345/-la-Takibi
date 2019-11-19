//Kal�t�m kullan�lm��t�r.
public class Ithal extends Ilac{
	private String Uretim_yeri;
	private double dolar_kuru = 5.74;
	/*�thal ila�lar�n fiyatlar� dolar kuru �zerinden hesaplanacakt�r.*/
	public Ithal(String Name, String Type, int Prime_cost, int Sale_price,String Uretim_yeri) 
	{
		//Constructorda super metoduyla Ilac s�n�f�n�n �zellikleri kullan�lm��t�r.
		super(Name, Type, Prime_cost, Sale_price);
		this.Uretim_yeri = Uretim_yeri;
		//Ekstra olarak �la�lar�n �retim yeri al�nm��t�r.
	}
	
	public Ithal() {
		//Constructor Overload
		super();
	}

	@Override
	int kar_durumu(int Prime_cost, int Sale_price)
	{
		/*Ilac s�n�f�ndaki kar_durumu isimli metod override edilmi�tir.
		 *Dolar kuru �zerinden i�lem yap�laca�� i�in fiyatlar dolar de�eriyle �arp�lm��t�r.
		 *sonras�nda super classta tekrardan kar_durumu i�lemi yap�lm��t�r.*/
		Prime_cost *= dolar_kuru;
		Sale_price *= dolar_kuru;
		return super.kar_durumu(Prime_cost, Sale_price);
	}
	//get set metodlar�yla private ��elere eri�im sa�lan�r.
	public String getUretim_yeri() {
		return Uretim_yeri;
	}
	public void setUretim_yeri(String Uretim_yeri) {
		this.Uretim_yeri = Uretim_yeri;
	}

	public double getDolar_kuru() {
		return dolar_kuru;
	}
	public void setDolar_kuru(double dolar_kuru) {
		this.dolar_kuru = dolar_kuru;
	}
}