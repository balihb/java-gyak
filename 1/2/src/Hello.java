class Hello {
    public static void main(String[] args) {
        System.out.println("Hello bello");

        Skip mySkip = null;

        System.out.println(mySkip.alma);

        mySkip = new Skip();
        System.out.println(mySkip.getKorte());

        mySkip = new Skip2();
        System.out.println(mySkip.getKorte());
    }
}
