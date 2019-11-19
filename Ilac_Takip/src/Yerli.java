//Kal�t�m vard�r.
public class Yerli extends Ilac{
	private int etki;		//�la�lar�n yan etki y�zdesi al�nm��t�r.

	public Yerli(String Name, String Type, int Prime_cost, int Sale_price,int etki) 
	{
		//Constructor.
		super(Name, Type, Prime_cost, Sale_price);
		this.etki = etki;
		//Ekstra olarak yan etki eklenmi�tir.
	}
	
	boolean verilen_hasar(int etki_yuzdesi)
	{
		//etki y�zdesi 60dan b�y�k ise yan etkisi var anlam�nda true d�nd�r�r. De�ilse false...
		if(etki_yuzdesi>60)
		{
			return true;
		}
		else
			return false;
	}
	//get set metodlar�yla private ��elere eri�im sa�lanm��t�r.
	public int getEtki() 
	{
		return etki;
	}
	public void setEtki(int etki) 
	{
		this.etki = etki;
	}
}