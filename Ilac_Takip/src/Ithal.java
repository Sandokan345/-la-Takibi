//Kalýtým kullanýlmýþtýr.
public class Ithal extends Ilac{
	private String Uretim_yeri;
	private double dolar_kuru = 5.74;
	/*Ýthal ilaçlarýn fiyatlarý dolar kuru üzerinden hesaplanacaktýr.*/
	public Ithal(String Name, String Type, int Prime_cost, int Sale_price,String Uretim_yeri) 
	{
		//Constructorda super metoduyla Ilac sýnýfýnýn özellikleri kullanýlmýþtýr.
		super(Name, Type, Prime_cost, Sale_price);
		this.Uretim_yeri = Uretim_yeri;
		//Ekstra olarak Ýlaçlarýn üretim yeri alýnmýþtýr.
	}
	
	public Ithal() {
		//Constructor Overload
		super();
	}

	@Override
	int kar_durumu(int Prime_cost, int Sale_price)
	{
		/*Ilac sýnýfýndaki kar_durumu isimli metod override edilmiþtir.
		 *Dolar kuru üzerinden iþlem yapýlacaðý için fiyatlar dolar deðeriyle çarpýlmýþtýr.
		 *sonrasýnda super classta tekrardan kar_durumu iþlemi yapýlmýþtýr.*/
		Prime_cost *= dolar_kuru;
		Sale_price *= dolar_kuru;
		return super.kar_durumu(Prime_cost, Sale_price);
	}
	//get set metodlarýyla private öðelere eriþim saðlanýr.
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