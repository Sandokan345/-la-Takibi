import java.util.ArrayList;
//Array ve ArrayList'lerin tutuldu�u ila�lar�n sakland��� yerdir. 
public class Depo {
	ArrayList<Ilac> ilac_listesi= new ArrayList<>();
	private String depo_name;
	public int[] toplam_kar = new int[10];
	
	public Depo(String depo_name) 
	{
		//Constructor
		this.depo_name = depo_name;
	}
	
	public Depo()
	{
		//Constructor overload edildi.
		super();
		System.out.println("\tDepo in�a edildi...");
	}

	public void ilac_ekle(Ilac i)
	{
		//Bu methodda g�nderilen ila�lar ArrayListe ekleniyor.
		ilac_listesi.add(i);
	}
	
	public void ilac_kaldir(Ilac i)
	{
		//Bu methodda g�nderilen ila�lar ArrayListten kald�r�l�yor.
		ilac_listesi.remove(i);
	}
	//Set get metodlar�yla private �zelliklere d��ardan eri�im sa�lan�r.
	public String getDepo_name() 
	{
		return depo_name;
	}
	public void setDepo_name(String depo_name) 
	{
		this.depo_name = depo_name;
	}
}