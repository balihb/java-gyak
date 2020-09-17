class KetSzam {
    public static void main(String[] args) {
		if(args.length > 1) {
			int szamEgy = Integer.parseInt(args[0]);
			int szamKetto = Integer.parseInt(args[1]);
		
			if(szamEgy > szamKetto) {
				int ideiglenesSzam = szamEgy;
				szamEgy = szamKetto;
				szamKetto = ideiglenesSzam;
			}
		
			System.out.println("Osszeg: " + (szamEgy + szamKetto));
			System.out.println("Kulonbseg: " + (szamKetto - szamEgy));
			System.out.println("Szorzat: " + (szamEgy * szamKetto));
			if(szamKetto == 0) {
				System.out.println("Nem osztunk 0-val")
			} else {
				System.out.println("Hanyados: " + (szamEgy / szamKetto));
			}
			System.out.println("Maradek: " + (szamEgy % szamKetto));
		} else {
			System.out.println("Nem elegendo parameter");
		}
    }
}
