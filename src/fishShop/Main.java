package fishShop;

public class Main {

	public static void main(String[] args) {
		Fish fs=new Fish();
		Rod rod=new Rod();		
		Bait bait=new Bait();
		Aquarium aq1=new Aquarium();
		
		fs.setName("DEN�Z ALASI");
	    fs.setFeatures("V�cut yanlardan yass�la�m��, f�ze �eklinde zeytin ye�ili renkli olup yanal �izginin �st� beyaz halkalarla �evrili k�rm�z� beneklidir. K�rm�z� beneklerin beyaz halkal� ve siyah beneklerin yan �izginin alt�na inmesi ile di�er alt t�rlerden ayr�l�r.");
		
	    rod.setName("Discovery");
		rod.setFeatures("Discovery Ba�lang�� Seti Yeni Dft Racer 360CM 100-150GR Charisma Silver Misinal� ");
	
		bait.setName("Sera Insect");
		bait.setFeatures("Sera Insect Nature Bal�k Yemi 250 ML");
		aq1.setAquarium("Fluval");
		aq1.setFeatures("Fluval Flex Akvaryum 34Lt Siyah");
			System.out.println(rod.getName()+" : "+rod.getFeatures());
		System.out.println(fs.getName()+" : "+fs.getFeatures());
		System.out.println(bait.getName()+" : "+bait.getFeatures());
		System.out.println(aq1.getAquarium()+" : "+aq1.getFeatures());
		
        
	
	
	}
	

}
