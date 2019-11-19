//Kalıtım vardır.
public class Yerli extends Ilac{
	private int etki;		//İlaçların yan etki yüzdesi alınmıştır.

	public Yerli(String Name, String Type, int Prime_cost, int Sale_price,int etki) 
	{
		//Constructor.
		super(Name, Type, Prime_cost, Sale_price);
		this.etki = etki;
		//Ekstra olarak yan etki eklenmiştir.
	}
	
	boolean verilen_hasar(int etki_yuzdesi)
	{
		//etki yüzdesi 60dan büyük ise yan etkisi var anlamında true döndürür. Değilse false...
		if(etki_yuzdesi>60)
		{
			return true;
		}
		else
			return false;
	}
	//get set metodlarıyla private öğelere erişim sağlanmıştır.
	public int getEtki() 
	{
		return etki;
	}
	public void setEtki(int etki) 
	{
		this.etki = etki;
	}
}