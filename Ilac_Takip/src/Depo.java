import java.util.ArrayList;
//Array ve ArrayList'lerin tutulduðu ilaçlarýn saklandýðý yerdir. 
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
		System.out.println("\tDepo inþa edildi...");
	}

	public void ilac_ekle(Ilac i)
	{
		//Bu methodda gönderilen ilaçlar ArrayListe ekleniyor.
		ilac_listesi.add(i);
	}
	
	public void ilac_kaldir(Ilac i)
	{
		//Bu methodda gönderilen ilaçlar ArrayListten kaldýrýlýyor.
		ilac_listesi.remove(i);
	}
	//Set get metodlarýyla private özelliklere dýþardan eriþim saðlanýr.
	public String getDepo_name() 
	{
		return depo_name;
	}
	public void setDepo_name(String depo_name) 
	{
		this.depo_name = depo_name;
	}
}