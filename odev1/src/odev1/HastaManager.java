package odev1;

public class HastaManager implements HastaService{
private HastaKontrol hastaKontrol;

 public HastaManager(HastaKontrol hastaKontrol) {
	this.hastaKontrol= hastaKontrol;
}
	@Override
	public void hastaEkle(Hasta hasta) {
		if (hastaKontrol.GercekMi(hasta)) {
			
			System.out.println(hasta.getFirstName()+" "+hasta.getLastName()+"isimli hasta a�� listesine eklenmi�tir");
		}
		
		
	}

	@Override
	public void hastaSil(Hasta hasta) {
		if (hastaKontrol.GercekMi(hasta)==false) {
			System.out.println("say�n "+ hasta.getFirstName()+ " "+ hasta.getLastName()+" hen�z a�� s�rn�z geledi�i i�in a�� listesinden siliniyorsunuz");
		}
		
	}

	@Override
	public void asiYap(Hasta hasta) {
		System.out.println( "a�� yap�ld�");
		
	}

	

	

}
