package odev1;

public class AsiManager implements AsiService {

	@Override
	public void asiEkle(Asi asi) {
		System.out.println(asi.getAsiAdi()+ "adl� a��y� se�tiniz ");
	}

	@Override
	public void asiSil(Asi asi) {
		System.out.println(asi.getAsiAdi()+ "adl� a��y� sisteminizden sildiniz ");
		
	}

	@Override
	public void dozBelirle(Asi asi) {
		System.out.println(asi.getAsiAdi()+ " adl� a��dan "+ asi.getDozAdedi()+" doz a��y�" + asi.getGunAraligi()+" g�n aral���nda vurulacaks�n�z");
		
	}

}
