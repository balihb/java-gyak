/*

Az alábbi Java program feladata, hogy kiírja az 1-től 4-ig lévő számok felét.

Az elvárt kimenet:

0.5
1.0
1.5
2.0
Kiirtam 4 szamot

Javítsa ki a programot!

 */

class Ot {
    public static void main(String[] args) {
        //int i = 4;
        for (int i = 1; i <= 4; i++) {
            double j = i / 2;
            float f = i;
            double k = i;
            System.out.println();
            System.out.println("(double) (i / 2)");
            System.out.println((double) (i / 2));
            System.out.println("i / (double) 2");
            System.out.println(i / (double) 2);
            System.out.println("(double) i / 2");
            System.out.println((double) i / 2);
            System.out.println("i / 2.");
            System.out.println(i / 2.);
            System.out.println("i / 2.0");
            System.out.println(i / 2.0);
            // egész
            System.out.println("j");
            System.out.println(j);
            // egész
            System.out.println("(double) j");
            System.out.println((double) j);
            System.out.println("k / 2");
            System.out.println(k / 2);
            System.out.println("(double) k / 2");
            System.out.println((double) k / 2);
            // nincs szükség az " " utána írására, mindenképpen string lesz
            //System.out.println(i / 2 + " ");

            System.out.println(f / 2);
            System.out.println(i / 2f);

            System.out.println(f / k);
        }
        //i = 4;
        System.out.println("Kiirtam " + 4 + " szamot");
    }
}

/*
A double a valóságban pontatlan. Ha pontos lebegőpontos műveleteket akarunk, a BigDecimal osztályt kell használni.

https://docs.oracle.com/javase/8/docs/api/java/math/BigDecimal.html
 */

/*
Bytecode:
https://en.wikipedia.org/wiki/Java_bytecode_instruction_listings

   L7
    LINENUMBER 25 L7
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    LDC "(double) (i / 2)"
    INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/String;)V
   L8
    LINENUMBER 26 L8
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    ILOAD 1
    ICONST_2
    IDIV
    I2D
    INVOKEVIRTUAL java/io/PrintStream.println (D)V
   L9
    LINENUMBER 27 L9
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    LDC "i / (double) 2"
    INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/String;)V
   L10
    LINENUMBER 28 L10
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    ILOAD 1
    I2D
    LDC 2.0
    DDIV
    INVOKEVIRTUAL java/io/PrintStream.println (D)V
   L11
    LINENUMBER 29 L11
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    LDC "(double) i / 2"
    INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/String;)V
   L12
    LINENUMBER 30 L12
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    ILOAD 1
    I2D
    LDC 2.0
    DDIV
    INVOKEVIRTUAL java/io/PrintStream.println (D)V
   L13
    LINENUMBER 31 L13
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    LDC "i / 2."
    INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/String;)V
   L14
    LINENUMBER 32 L14
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    ILOAD 1
    I2D
    LDC 2.0
    DDIV
    INVOKEVIRTUAL java/io/PrintStream.println (D)V
   L15
    LINENUMBER 33 L15
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    LDC "i / 2.0"
    INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/String;)V
   L16
    LINENUMBER 34 L16
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    ILOAD 1
    I2D
    LDC 2.0
    DDIV
    INVOKEVIRTUAL java/io/PrintStream.println (D)V
   L17
    LINENUMBER 36 L17
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    LDC "j"
    INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/String;)V
   L18
    LINENUMBER 37 L18
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    DLOAD 2
    INVOKEVIRTUAL java/io/PrintStream.println (D)V
   L19
    LINENUMBER 39 L19
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    LDC "(double) j"
    INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/String;)V
   L20
    LINENUMBER 40 L20
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    DLOAD 2
    INVOKEVIRTUAL java/io/PrintStream.println (D)V
   L21
    LINENUMBER 41 L21
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    LDC "k / 2"
    INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/String;)V
   L22
    LINENUMBER 42 L22
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    DLOAD 5
    LDC 2.0
    DDIV
    INVOKEVIRTUAL java/io/PrintStream.println (D)V
   L23
    LINENUMBER 43 L23
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    LDC "(double) k / 2"
    INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/String;)V
   L24
    LINENUMBER 44 L24
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    DLOAD 5
    LDC 2.0
    DDIV
    INVOKEVIRTUAL java/io/PrintStream.println (D)V
   L25
    LINENUMBER 48 L25
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    FLOAD 4
    FCONST_2
    FDIV
    INVOKEVIRTUAL java/io/PrintStream.println (F)V
   L26
    LINENUMBER 49 L26
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    ILOAD 1
    I2F
    FCONST_2
    FDIV
    INVOKEVIRTUAL java/io/PrintStream.println (F)V
   L27
    LINENUMBER 51 L27
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    FLOAD 4
    F2D
    DLOAD 5
    DDIV
    INVOKEVIRTUAL java/io/PrintStream.println (D)V
*/
