class Felek {
    public static void main(String[] args) {
		String szamEgyStr = System.console().readLine();
		String szamKettoStr = System.console().readLine();
		
		int szamEgy = Integer.parseInt(szamEgyStr);
		int szamKetto = Integer.parseInt(szamKettoStr);
		
		if(szamEgy > szamKetto) {
			int ideiglenesSzam = szamEgy;
			szamEgy = szamKetto;
			szamKetto = ideiglenesSzam;
		}
		
        for( int i = szamEgy; i <= szamKetto; i++ ) {
            System.out.println(i/2.);
        }
		//System.out.println(szamEgy + szamKetto);
		//System.out.println(szamEgy + "" + szamKetto);
        System.out.println("Kiirtam " + (szamKetto - szamEgy) + " szamot");
    }
}
