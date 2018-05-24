
public class DataTypeFile {

    static String ERROR = "Compilation error";


    public static void TestYourByte(){
        byte a=5, b=4, c;
        System.out.println("Byte test-------------------------------------------------------------------------");
        System.out.println("________________________Arithmetic operators________________________");
        c=(byte)(a+b);
        c = (byte) (a + b);
        System.out.printf("(byte) ( %d + %d ) = %d\n", a, b, c);
        c = (byte) (a - b);
        System.out.printf("(byte) ( %d - %d ) = %d\n", a, b, c);
        c = (byte) (a * b);
        System.out.printf("(byte) ( %d * %d ) = %d\n", a, b, c);
        c = (byte) (a / b);
        System.out.printf("(byte) ( %d / %d ) = %d\n", a, b, c);
        c = (byte) (a % b);
        System.out.printf("(byte) (%d %% %d ) = %d\n", a, b, c);
        c = (byte) -a;
        System.out.printf("(byte) -%d = %d\n", a, c);
        c = (byte) +a;
        System.out.printf("(byte) +%d = %d\n", a, c);
        System.out.printf("%d++ = %d\n", a, c = a++);
        a = 4;
        System.out.printf("++%d = %d\n", a, c = ++a);
        a = 4;
        System.out.printf("%d-- = %d\n", a, c = a--);
        a = 4;
        System.out.printf("--%d = %d\n", a, c = --a);

        System.out.println("________________________Bitwise operators________________________");
        a = 5;
        c = (byte) ~a;
        System.out.printf("(byte) ~%d = %d\n", a, c);
        System.out.println("In binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        c = (byte) (a & b);
        System.out.printf("(byte) ( %d & %d ) = %d\n", a, b, c);
        System.out.println("In binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        c = (byte) (a | b);
        System.out.printf("(byte) ( %d | %d ) = %d\n", a, b, c);
        System.out.println("In binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        c = (byte) (a ^ b);
        System.out.printf("(byte) ( %d ^ %d ) = %d\n", a, b, c);
        System.out.println("In binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        c = (byte) (a << 1);
        System.out.printf("(byte) ( %d << 1 ) = %d\n", a, c);
        System.out.println("In binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        c = (byte) (a >> 1);
        System.out.printf("(byte) ( %d >> 1 ) = %d\n", a, c);
        System.out.println("In binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        c = (byte) (a >>> 1);
        System.out.printf("(byte) ( %d >>> 1 ) = %d\n", a, c);
        System.out.println("In binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        c = (byte) (-a >> 1);
        System.out.printf("(byte) ( %d >> 1 ) = %d\n", -a, c);
        System.out.println("In binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(-a), Integer.toBinaryString(c));
        c = (byte) (-a >>> 1);
        System.out.printf("(byte) ( %d >>> 1 ) = %d\n", -a, c);
        System.out.println("In binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(-a), Integer.toBinaryString(c));
        System.out.println("________________________Ternary operator________________________");
        a = 7;
        System.out.printf("%d > %d ? %d : %d -> %d\n", a, b, a, b, a > b ? a : b);
        System.out.printf("%d < %d ? %d : %d -> %d\n", a, b, a, b, a < b ? a : b);
        System.out.println("________________________Type casting________________________");
        byte e = 10;
        short s = 123;
        int i = 428_506;
        char c1 = '\u0125';
        long l = 201_782_75L;
        float f = 869.568F;
        double d = 2.568e-1;
        boolean b1 = true;
        c = (byte) s;
        System.out.printf("byte = short: c = (byte) %d -> %d\n", s, c);
        c = (byte) c1;
        System.out.printf("byte = char: c = (byte) %c -> %d\n", c1, c);
        c = (byte) i;
        System.out.printf("byte = int: c = (byte) %d -> %d\n", i, c);
        c = (byte) l;
        System.out.printf("byte = long: c = (byte) %d -> %d\n", l, c);
        c = (byte) f;
        System.out.printf("byte = float: c = (byte) %f -> %d\n", f, c);
        c = (byte) d;
        System.out.printf("byte = double: c = (byte) %e -> %d\n", d, c);
        //c = (byte) b1;
        System.out.printf("byte = boolean: c = (byte) %b -> %s\n", b1, ERROR);

    }
    //   -------------------------------------------------------------------------------------------------------------------------
    public static void TestYourShort(){
        short a = 30561, b = 11156, c;
        System.out.println("\nTests for Short-------------------------------------------------------------------------");
        //Arithmetic operators
        System.out.println("________________________Arithmetic operators________________________");
        c = (short) (a + b);
        System.out.printf("(short) ( %d + %d ) = %d\n", a, b, c);
        c = (short) (a - b);
        System.out.printf("(short) ( %d - %d ) = %d\n", a, b, c);
        c = (short) (a * b);
        System.out.printf("(short) ( %d * %d ) = %d\n", a, b, c);
        c = (short) (a / b);
        System.out.printf("(short) ( %d / %d ) = %d\n", a, b, c);
        c = (short) (a % b);
        System.out.printf("(short) ( %d %% %d ) = %d\n", a, b, c);
        try {
            c = (short) (a / 0);
        } catch (Exception e) {
            System.out.printf("(short) ( %d / 0 ) = %s\n", a,e.getClass());
        }
        try {
            c = (short) (a % 0);
        } catch (Exception e) {
            System.out.printf("(short) ( %d %% 0 ) = %s\n", a,e.getClass());
        }
        c = (short) -a;
        System.out.printf("(short) -%d = %d\n", a, c);
        c = (short) +a;
        System.out.printf("(short) +%d = %d\n", a, c);
        System.out.printf("%d++ = %d\n", a, c = a++);
        a = 26823;
        System.out.printf("++%d = %d\n", a, c = ++a);
        a = 26823;
        System.out.printf("%d-- = %d\n", a, c = a--);
        a = 26823;
        System.out.printf("--%d = %d\n", a, c = --a);


        System.out.println("________________________Bitwise operators________________________");
        a = 26823;
        c = (short) ~a;
        System.out.printf("(short) ~%d = %d\n", a, c);
        System.out.println("In binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        c = (short) (a & b);
        System.out.printf("(short) ( %d & %d ) = %d\n", a, b, c);
        System.out.println("In binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        c = (short) (a | b);
        System.out.printf("(short) ( %d | %d ) = %d\n", a, b, c);
        System.out.println("In binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        c = (short) (a ^ b);
        System.out.printf("(short) ( %d ^ %d ) = %d\n", a, b, c);
        System.out.println("In binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        c = (short) (a << 1);
        System.out.printf("(short) ( %d << 1 ) = %d\n", a, c);
        System.out.println("In binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        c = (short) (a >> 1);
        System.out.printf("(short) ( %d >> 1 ) = %d\n", a, c);
        System.out.println("In binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        c = (short) (a >>> 1);
        System.out.printf("(short) ( %d >>> 1 ) = %d\n", a, c);
        System.out.println("In binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        c = (short) (-a >> 1);
        System.out.printf("(short) ( %d >> 1 ) = %d\n", -a, c);
        System.out.println("In binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(-a), Integer.toBinaryString(c));
        c = (short) (-a >>> 1);
        System.out.printf("(short) ( %d >>> 1 ) = %d\n", -a, c);
        System.out.println("In binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(-a), Integer.toBinaryString(c));


        System.out.println("________________________Logical operation________________________");
        System.out.printf("%d == %d -> %b\n", a, b, a == b);
        System.out.printf("%d != %d -> %b\n", a, b, a != b);
        System.out.printf("%d < %d -> %b\n", a, b, a < b);
        System.out.printf("%d > %d -> %b\n", a, b, a > b);
        System.out.printf("%d <= %d -> %b\n", a, b, a <= b);
        System.out.printf("%d >= %d -> %b\n", a, b, a >= b);
        //c = !a;
        System.out.printf("!%d -> %s\n", a, ERROR);
        //c = a && b;
        System.out.printf("%d && %d -> %s\n", a, b, ERROR);
        //c = a || b;
        System.out.printf("%d || %d -> %s\n", a, b, ERROR);


        System.out.println("________________________Assignment operators________________________");
        a = 26823;
        System.out.printf("%d += %d -> %d\n", a, b, a += b);
        a = 26823;
        System.out.printf("%d -= %d -> %d\n", a, b, a -= b);
        a = 26823;
        System.out.printf("%d *= %d -> %d\n", a, b, a *= b);
        a = 26823;
        System.out.printf("%d /= %d -> %d\n", a, b, a /= b);
        a = 26823;
        System.out.printf("%d %%= %d -> %d\n", a, b, a %= b);
        a = 26823;
        System.out.printf("%d &= %d -> %d\n", a, b, a &= b);
        a = 26823;
        System.out.printf("%d |= %d -> %d\n", a, b, a |= b);
        a = 26823;
        System.out.printf("%d ^= %d -> %d\n", a, b, a ^= b);
        a = 26823;
        System.out.printf("%d >>= %d -> %d\n", a, b, a >>= b);
        a = 26823;
        System.out.printf("%d <<= %d -> %d\n", a, b, a <<= b);
        a = 26823;
        System.out.printf("%d >>>= %d -> %d\n", a, b, a >>>= b);


        System.out.println("________________________Ternary operator________________________");
        a = 26823;
        System.out.printf("%d > %d ? %d : %d -> %d\n", a, b, a, b, a > b ? a : b);
        System.out.printf("%d < %d ? %d : %d -> %d\n", a, b, a, b, a < b ? a : b);


        System.out.println("________________________Type casting________________________");
        byte e = 10;
        short s = 30156;
        int i = 428_506;
        char c1 = '\u0250';
        long l = 201_782_75L;
        float f = 869.568F;
        double d = 2.568e-1;
        boolean b1 = true;
        c = e;
        System.out.printf("short = byte: c = %d -> %d\n", e, c);
        c = (short) c1;
        System.out.printf("short = char: c = (short) %c -> %d\n", c1, c);
        c = (short) i;
        System.out.printf("short = int: c = (short) %d -> %d\n", i, c);
        c = (short) l;
        System.out.printf("short = long: c = (short) %d -> %d\n", l, c);
        c = (short) f;
        System.out.printf("short = float: c = (short) %f -> %d\n", f, c);
        c = (short) d;
        System.out.printf("short = double: c = (short) %e -> %d\n", d, c);
        //c = (short) b1;
        System.out.printf("short = boolean: c = (short) %b -> %s\n", b1, ERROR);

    }
    //   -------------------------------------------------------------------------------------------------------------------------
    public static void TestYourInt(){
        int a = 428_506, b = 562_369, c;
        System.out.println("\nTests for Int-------------------------------------------------------------------------");


        System.out.println("________________________Arithmetic operators________________________");
        c = a + b;
        System.out.printf("%d + %d = %d\n", a, b, c);
        c = a - b;
        System.out.printf("%d - %d = %d\n", a, b, c);
        c = a * b;
        System.out.printf("%d * %d = %d\n", a, b, c);
        c = a / b;
        System.out.printf("%d / %d = %d\n", a, b, c);
        c = a % b;
        System.out.printf("%d %% %d = %d\n", a, b, c);
        try {
            c = a / 0;
        } catch (Exception e) {
            System.out.printf("%d / 0 = %s\n", a,e.getClass());
        }
        try {
            c = a % 0;
        } catch (Exception e) {
            System.out.printf("%d %% 0 = %s\n", a,e.getClass());
        }
        c = -a;
        System.out.printf("-%d = %d\n", a, c);
        c = +a;
        System.out.printf("+%d = %d\n", a, c);
        System.out.printf("%d++ = %d\n", a, c = a++);
        a = 380_743_439;
        System.out.printf("++%d = %d\n", a, c = ++a);
        a = 380_743_439;
        System.out.printf("%d-- = %d\n", a, c = a--);
        a = 380_743_439;
        System.out.printf("--%d = %d\n", a, c = --a);



        System.out.println("________________________Bitwise operators________________________");
        a = 380_743_439;
        c = ~a;
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("In binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        c = a & b;
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("In binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        c = a | b;
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("In binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        c = a ^ b;
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("In binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        c = a << 1;
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("In binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        c = a >> 1;
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("In binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        c = a >>> 1;
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("In binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        c = -a >> 1;
        System.out.printf("%d >> 1 = %d\n", -a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(-a), Integer.toBinaryString(c));
        c = -a >>> 1;
        System.out.printf("%d >>> 1 = %d\n", -a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(-a), Integer.toBinaryString(c));


        System.out.println("________________________Logical operation________________________");
        System.out.printf("%d == %d -> %b\n", a, b, a == b);
        System.out.printf("%d != %d -> %b\n", a, b, a != b);
        System.out.printf("%d < %d -> %b\n", a, b, a < b);
        System.out.printf("%d > %d -> %b\n", a, b, a > b);
        System.out.printf("%d <= %d -> %b\n", a, b, a <= b);
        System.out.printf("%d >= %d -> %b\n", a, b, a >= b);
        //c = !a;
        System.out.printf("!%d -> %s\n", a, ERROR);
        //c = a && b;
        System.out.printf("%d && %d -> %s\n", a, b, ERROR);
        //c = a || b;
        System.out.printf("%d || %d -> %s\n", a, b, ERROR);


        System.out.println("________________________Assignment operators________________________");
        a = 380_743_439;
        System.out.printf("%d += %d -> %d\n", a, b, a += b);
        a = 380_743_439;
        System.out.printf("%d -= %d -> %d\n", a, b, a -= b);
        a = 380_743_439;
        System.out.printf("%d *= %d -> %d\n", a, b, a *= b);
        a = 380_743_439;
        System.out.printf("%d /= %d -> %d\n", a, b, a /= b);
        a = 380_743_439;
        System.out.printf("%d %%= %d -> %d\n", a, b, a %= b);
        a = 380_743_439;
        System.out.printf("%d &= %d -> %d\n", a, b, a &= b);
        a = 380_743_439;
        System.out.printf("%d |= %d -> %d\n", a, b, a |= b);
        a = 380_743_439;
        System.out.printf("%d ^= %d -> %d\n", a, b, a ^= b);
        a = 380_743_439;
        System.out.printf("%d >>= %d -> %d\n", a, b, a >>= b);
        a = 380_743_439;
        System.out.printf("%d <<= %d -> %d\n", a, b, a <<= b);
        a = 380_743_439;
        System.out.printf("%d >>>= %d -> %d\n", a, b, a >>>= b);

        System.out.println("________________________Ternary operator________________________");
        a = 380_743_439;
        System.out.printf("%d > %d ? %d : %d -> %d\n", a, b, a, b, a > b ? a : b);
        System.out.printf("%d < %d ? %d : %d -> %d\n", a, b, a, b, a < b ? a : b);

        System.out.println("________________________Type casting________________________");
        byte e = 10;
        short s = 30156;
        int i = 428_506;
        char c1 = '\u0250';
        long l = 201_782_75L;
        float f = 869.568F;
        double d = 2.568e-1;
        boolean b1 = true;
        c = e;
        System.out.printf("int = int: c = %d -> %d\n", e, c);
        c = s;
        System.out.printf("int = short: c = %d -> %d\n", s, c);
        c = c1;
        System.out.printf("int = char: c = %c -> %d\n", c1, c);
        c = (int) l;
        System.out.printf("int = long: c = (int) %d -> %d\n", l, c);
        c = (int) f;
        System.out.printf("int = float: c = (int) %f -> %d\n", f, c);
        c = (int) d;
        System.out.printf("int = double: c = (int) %e -> %d\n", d, c);
        //c = (int) b1;
        System.out.printf("int = boolean: c = (int) %b -> %s\n", b1, ERROR);
    }
    //   -------------------------------------------------------------------------------------------------------------------------
    public static void TestYourChar(){
        char a = 106, b = 55, c;
        System.out.println("\nTests for Char-------------------------------------------------------------------------");


        System.out.println("________________________Arithmetic operators________________________");
        c = (char) (a + b);
        System.out.printf("(char) ( %c + %c ) = %c\n", a, b, c);
        c = (char) (a - b);
        System.out.printf("(char) ( %c - %c ) = %c\n", a, b, c);
        c = (char) (a * b);
        System.out.printf("(char) ( %c * %c ) = %c\n", a, b, c);
        c = (char) (a / b);
        System.out.printf("(char) ( %c / %c ) = %c\n", a, b, c);
        c = (char) (a % b);
        System.out.printf("(char) ( %c %% %c ) = %c\n", a, b, c);
        try {
            c = (char) (a / '\u0000');
        } catch (Exception e) {
            System.out.printf("(char) ( %c / \'\\u0000\' ) = %s\n", a, e.getClass());
        }
        try {
            c = (char) (a % '\u0000');
        } catch (Exception e) {
            System.out.printf("(char) ( %c %% \'\\u0000\' ) = %s\n", (int) a,e.getClass());
        }
        c = (char) -a;
        System.out.printf("(char) -%c = %c\n", a, c);
        c = (char) +a;
        System.out.printf("(char) +%c = %c\n", a, c);
        System.out.printf("%c++ = %c\n", a, c = a++);
        a = 106;
        System.out.printf("++%c = %c\n", a, c = ++a);
        a = 106;
        System.out.printf("%c-- = %c\n", a, c = a--);
        a = 106;
        System.out.printf("--%c = %c\n", a, c = --a);



        System.out.println("________________________Bitwise operators________________________");
        a = 106;
        c = (char) ~a;
        System.out.printf("(char) ~%c = %c\n", a, c);
        System.out.println("In binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        c = (char) (a & b);
        System.out.printf("(char) ( %c & %c ) = %c\n", a, b, c);
        System.out.println("In binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        c = (char) (a | b);
        System.out.printf("(char) ( %c | %c ) = %c\n", a, b, c);
        System.out.println("In binary form:");
        System.out.printf("(char) ( %s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        c = (char) (a ^ b);
        System.out.printf("(char) ( %c ^ %c ) = %c\n", a, b, c);
        System.out.println("In binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        c = (char) (a << 1);
        System.out.printf("(char) ( %c << 1 ) = %c\n", a, c);
        System.out.println("In binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        c = (char) (a >> 1);
        System.out.printf("(char) ( %c >> 1 ) = %c\n", a, c);
        System.out.println("In binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        c = (char) (a >>> 1);
        System.out.printf("(char) ( %c >>> 1 ) = %c\n", a, c);
        System.out.println("In binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        c = (char) (-a >> 1);
        System.out.printf("(char) ( %c >> 1 ) = %c\n", (char) -a, c);
        System.out.println("In binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(-a), Integer.toBinaryString(c));
        c = (char) (-a >>> 1);
        System.out.printf("(char) ( %c >>> 1 ) = %c\n", (char) -a, c);
        System.out.println("In binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(-a), Integer.toBinaryString(c));



        System.out.println("________________________Logical operation________________________");
        System.out.printf("%c == %c -> %b\n", a, b, a == b);
        System.out.printf("%c != %c -> %b\n", a, b, a != b);
        System.out.printf("%c < %c -> %b\n", a, b, a < b);
        System.out.printf("%c > %c -> %b\n", a, b, a > b);
        System.out.printf("%c <= %c -> %b\n", a, b, a <= b);
        System.out.printf("%c >= %c -> %b\n", a, b, a >= b);
        //c = !a;
        System.out.printf("!%c -> %s\n", a, ERROR);
        //c = a && b;
        System.out.printf("%c && %c -> %s\n", a, b, ERROR);
        //c = a || b;
        System.out.printf("%c || %c -> %s\n", a, b, ERROR);


        System.out.println("________________________Assignment operators________________________");
        a = 106;
        System.out.printf("%c += %c -> %c\n", a, b, a += b);
        a = 106;
        System.out.printf("%c -= %c -> %c\n", a, b, a -= b);
        a = 106;
        System.out.printf("%c *= %c -> %c\n", a, b, a *= b);
        a = 106;
        System.out.printf("%c /= %c -> %c\n", a, b, a /= b);
        a = 106;
        System.out.printf("%c %%= %c -> %c\n", a, b, a %= b);
        a = 106;
        System.out.printf("%c &= %c -> %c\n", a, b, a &= b);
        a = 106;
        System.out.printf("%c |= %c -> %c\n", a, b, a |= b);
        a = 106;
        System.out.printf("%c ^= %c -> %c\n", a, b, a ^= b);
        a = 106;
        System.out.printf("%c >>= %c -> %c\n", a, b, a >>= b);
        a = 106;
        System.out.printf("%c <<= %c -> %c\n", a, b, a <<= b);
        a = 123;
        System.out.printf("%c >>>= %c -> %c\n", a, b, a >>>= b);


        System.out.println("________________________Ternary operator________________________");
        a = 5;
        System.out.printf("%c > %c ? %c : %c -> %c\n", a, b, a, b, a > b ? a : b);
        System.out.printf("%c < %c ? %c : %c -> %c\n", a, b, a, b, a < b ? a : b);


        System.out.println("________________________Type casting________________________");
        byte e = 10;
        short s = 30156;
        int i = 428_506;
        char c1 = '\u0250';
        long l = 201_782_75L;
        float f = 869.568F;
        double d = 2.568e-1;
        boolean b1 = true;
        c =(char) e;
        c = (char) e;
        System.out.printf("char = byte: c = (char) %d -> %c\n", e, c);
        c = (char) s;
        System.out.printf("char = short: c = (char) %d -> %c\n", s, c);
        c = (char) i;
        System.out.printf("char = int: c = (char) %d -> %c\n", i, c);
        c = (char) l;
        System.out.printf("char = long: c = (char) %d -> %c\n", l, c);
        c = (char) f;
        System.out.printf("char = float: c = (char) %f -> %c\n", f, c);
        c = (char) d;
        System.out.printf("char = double: c = (char) %e -> %c\n", d, c);
        //c = (char) b1;
        System.out.printf("char = boolean: c = (char) %b -> %s\n", b1, ERROR);
    }
    //   -------------------------------------------------------------------------------------------------------------------------
    public static void TestYourLong(){
        long a = 201_782_75L, b = 562_369, c;
        System.out.println("\nTests for Long-------------------------------------------------------------------------");


        System.out.println("________________________Arithmetic operators________________________");
        c = a + b;
        System.out.printf("%d + %d = %d\n", a, b, c);
        c = a - b;
        System.out.printf("%d - %d = %d\n", a, b, c);
        c = a * b;
        System.out.printf("%d * %d = %d\n", a, b, c);
        c = a / b;
        System.out.printf("%d / %d = %d\n", a, b, c);
        c = a % b;
        System.out.printf("%d %% %d = %d\n", a, b, c);
        try {
            c = a / 0;
        } catch (Exception e) {
            System.out.printf("%d / 0 = %s\n", a,e.getClass());
        }
        try {
            c = a % 0;
        } catch (Exception e) {
            System.out.printf("%d %% 0 = %s\n", a,e.getClass());
        }
        c = -a;
        System.out.printf("-%d = %d\n", a, c);
        c = +a;
        System.out.printf("+%d = %d\n", a, c);
        System.out.printf("%d++ = %d\n", a, c = a++);
        a = 201_782_75L;
        System.out.printf("++%d = %d\n", a, c = ++a);
        a = 201_782_75L;
        System.out.printf("%d-- = %d\n", a, c = a--);
        a = 201_782_75L;
        System.out.printf("--%d = %d\n", a, c = --a);



        System.out.println("________________________Bitwise operators________________________");
        a = 201_782_75L;
        c = ~a;
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("In binary form:");
        System.out.printf("~%s = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));
        c = a & b;
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("In binary form:");
        System.out.printf("%s & %s = %s\n", Long.toBinaryString(a), Long.toBinaryString(b), Long.toBinaryString(c));
        c = a | b;
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("In binary form:");
        System.out.printf("%s | %s = %s\n", Long.toBinaryString(a), Long.toBinaryString(b), Long.toBinaryString(c));
        c = a ^ b;
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("In binary form:");
        System.out.printf("%s ^ %s = %s\n", Long.toBinaryString(a), Long.toBinaryString(b), Long.toBinaryString(c));
        c = a << 1;
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("In binary form:");
        System.out.printf("%s << 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));
        c = a >> 1;
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("In binary form:");
        System.out.printf("%s >> 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));
        c = a >>> 1;
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("In binary form:");
        System.out.printf("%s >>> 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));
        c = -a >> 1;
        System.out.printf("%d >> 1 = %d\n", -a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Long.toBinaryString(-a), Long.toBinaryString(c));
        c = -a >>> 1;
        System.out.printf("%d >>> 1 = %d\n", -a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Long.toBinaryString(-a), Long.toBinaryString(c));


        System.out.println("________________________Logical operation________________________");
        System.out.printf("%d == %d -> %b\n", a, b, a == b);
        System.out.printf("%d != %d -> %b\n", a, b, a != b);
        System.out.printf("%d < %d -> %b\n", a, b, a < b);
        System.out.printf("%d > %d -> %b\n", a, b, a > b);
        System.out.printf("%d <= %d -> %b\n", a, b, a <= b);
        System.out.printf("%d >= %d -> %b\n", a, b, a >= b);
        //c = !a;
        System.out.printf("!%d -> %s\n", a, ERROR);
        //c = a && b;
        System.out.printf("%d && %d -> %s\n", a, b, ERROR);
        //c = a || b;
        System.out.printf("%d || %d -> %s\n", a, b, ERROR);


        System.out.println("________________________Assignment operators________________________");
        a = 201_782_75L;
        System.out.printf("%d += %d -> %d\n", a, b, a += b);
        a = 201_782_75L;
        System.out.printf("%d -= %d -> %d\n", a, b, a -= b);
        a = 201_782_75L;
        System.out.printf("%d *= %d -> %d\n", a, b, a *= b);
        a = 201_782_75L;
        System.out.printf("%d /= %d -> %d\n", a, b, a /= b);
        a = 201_782_75L;
        System.out.printf("%d %%= %d -> %d\n", a, b, a %= b);
        a = 201_782_75L;
        System.out.printf("%d &= %d -> %d\n", a, b, a &= b);
        a = 201_782_75L;
        System.out.printf("%d |= %d -> %d\n", a, b, a |= b);
        a = 201_782_75L;
        System.out.printf("%d ^= %d -> %d\n", a, b, a ^= b);
        a = 201_782_75L;
        System.out.printf("%d >>= %d -> %d\n", a, b, a >>= b);
        a = 201_782_75L;
        System.out.printf("%d <<= %d -> %d\n", a, b, a <<= b);
        a = 201_782_75L;
        System.out.printf("%d >>>= %d -> %d\n", a, b, a >>>= b);

        System.out.println("________________________Ternary operator________________________");
        a = 201_782_75L;
        System.out.printf("%d > %d ? %d : %d -> %d\n", a, b, a, b, a > b ? a : b);
        System.out.printf("%d < %d ? %d : %d -> %d\n", a, b, a, b, a < b ? a : b);

        System.out.println("________________________Type casting________________________");
        byte e = 10;
        short s = 30156;
        int i = 428_506;
        char c1 = '\u0250';
        long l = 201_782_75L;
        float f = 869.568F;
        double d = 2.568e-1;
        boolean b1 = true;
        c = e;
        System.out.printf("long = byte: c = %d -> %d\n", e, c);
        c = s;
        System.out.printf("long = short: c = %d -> %d\n", s, c);
        c = c1;
        System.out.printf("long = char: c = %c -> %d\n", c1, c);
        c = i;
        System.out.printf("long = int: c = %d -> %d\n", i, c);
        c = (long) f;
        System.out.printf("long = float: c = (long) %f -> %d\n", f, c);
        c = (long) d;
        System.out.printf("long = double: c = (long) %e -> %d\n", d, c);
        //c = (long) b1;
        System.out.printf("long = boolean: c = (long) %b -> %s\n", b1, ERROR);
    }
    //   -------------------------------------------------------------------------------------------------------------------------
    public static void TestYourFloat(){
        float a = 89565.5F, b = 1526.5F, c;
        System.out.println("\nTests for Float-------------------------------------------------------------------------");

        System.out.println("________________________Arithmetic operators________________________");
        c = a + b;
        System.out.printf("%f + %f = %f\n", a, b, c);
        c = a - b;
        System.out.printf("%f - %f = %f\n", a, b, c);
        c = a * b;
        System.out.printf("%f * %f = %f\n", a, b, c);
        c = a / b;
        System.out.printf("%f / %f = %f\n", a, b, c);
        c = a % b;
        System.out.printf("%f %% %f = %f\n", a, b, c);
        c = a / 0.0f;
        System.out.printf("%f / 0.0 = %f\n", a, c);
        c = a % 0.0f;
        System.out.printf("%f %% 0.0 = %f\n", a, c);
        c = -a;
        System.out.printf("-%f = %f\n", a, c);
        c = +a;
        System.out.printf("+%f = %f\n", a, c);
        System.out.printf("%f++ = %f\n", a, c = a++);
        a = 89565.5F;
        System.out.printf("++%f = %f\n", a, c = ++a);
        a = 89565.5F;
        System.out.printf("%f-- = %f\n", a, c = a--);
        a = 89565.5F;
        System.out.printf("--%f = %f\n", a, c = --a);


        System.out.println("________________________Bitwise operators________________________");
        a = 89565.5F;
        //c = ~a;
        System.out.printf("~%f -> %s\n", a, ERROR);
        //c = a & b;
        System.out.printf("%f & %f -> %s\n", a, b, ERROR);
        //c = a | b;
        System.out.printf("%f | %f -> %sd\n", a, b, ERROR);
        //c = a ^ b;
        System.out.printf("%f ^ %f -> %s\n", a, b, ERROR);
        //c = a << 1;
        System.out.printf("%f << 1 -> %s\n", a, ERROR);
        //c = a >> 1;
        System.out.printf("%f >> 1 -> %s\n", a, ERROR);
        //c = a >>> 1;
        System.out.printf("%f >>> 1 -> %s\n", a, ERROR);
        //c = ~a >> 1;
        System.out.printf("~%f >> 1 -> %s\n", a, ERROR);
        //c = ~a >>> 1;
        System.out.printf("~%f >>> 1 -> %s\n", a, ERROR);


        System.out.println("________________________Logical operation________________________");
        System.out.printf("%f == %f -> %b\n", a, b, a == b);
        System.out.printf("%f != %f -> %b\n", a, b, a != b);
        System.out.printf("%f < %f -> %b\n", a, b, a < b);
        System.out.printf("%f > %f -> %b\n", a, b, a > b);
        System.out.printf("%f <= %f -> %b\n", a, b, a <= b);
        System.out.printf("%f >= %f -> %b\n", a, b, a >= b);
        //c = !a;
        System.out.printf("!%f -> %s\n", a, ERROR);
        //c = a && b;
        System.out.printf("%f && %f -> %s\n", a, b, ERROR);
        //c = a || b;
        System.out.printf("%f || %f -> %s\n", a, b, ERROR);


        System.out.println("________________________Assignment operators________________________");
        a = 89565.5F;
        System.out.printf("%f += %f -> %f\n", a, b, a += b);
        a = 89565.5F;
        System.out.printf("%f -= %f -> %f\n", a, b, a -= b);
        a = 89565.5F;
        System.out.printf("%f *= %f -> %f\n", a, b, a *= b);
        a = 89565.5F;
        System.out.printf("%f /= %f -> %f\n", a, b, a /= b);
        a = 89565.5F;
        System.out.printf("%f %%= %f -> %f\n", a, b, a %= b);
        a = 89565.5F;
        //a &= b;
        System.out.printf("%f &= %f -> %s\n", a, b, ERROR);
        //a |= b;
        System.out.printf("%f |= %f -> %s\n", a, b, ERROR);
        //a ^= b;
        System.out.printf("%f ^= %f -> %s\n", a, b, ERROR);
        //a >>= b;
        System.out.printf("%f >>= %f -> %s\n", a, b, ERROR);
        //a <<= b;
        System.out.printf("%f <<= %f -> %s\n", a, b, ERROR);
        //a >>>= b;
        System.out.printf("%f >>>= %f -> %s\n", a, b, ERROR);


        System.out.println("________________________Ternary operator________________________");
        System.out.printf("%f > %f ? %f : %f -> %f\n", a, b, a, b, a > b ? a : b);
        System.out.printf("%f < %f ? %f : %f -> %f\n", a, b, a, b, a < b ? a : b);


        System.out.println("________________________Type casting________________________");
        byte e = 10;
        short s = 30156;
        int i = 428_506;
        char c1 = '\u0250';
        long l = 201_782_75L;
        float f = 869.568F;
        double d = 2.568e-1;
        boolean b1 = true;
        c = e;
        System.out.printf("float = float: c = %d -> %f\n", e, c);
        c = s;
        System.out.printf("float = short: c = %d -> %f\n", s, c);
        c = c1;
        System.out.printf("float = char: c = %c -> %f\n", c1, c);
        c = i;
        System.out.printf("float = int: c = %d -> %f\n", i, c);
        c = l;
        System.out.printf("float = long: c = %d -> %f\n", l, c);
        c = (float) d;
        System.out.printf("float = double: c = (float) %e -> %f\n", d, c);
        //c = (float) b1;
        System.out.printf("float = boolean: c = (float) %b -> %s\n", b1, ERROR);
    }
    //   -------------------------------------------------------------------------------------------------------------------------
    public static void TestYourDouble(){
        double a = 156.15e36, b = 1526.5e12, c;
        System.out.println("\nTests for Double-------------------------------------------------------------------------");

        System.out.println("________________________Arithmetic operators________________________");
        c = a + b;
        System.out.printf("%e + %e = %e\n", a, b, c);
        c = a - b;
        System.out.printf("%e - %e = %e\n", a, b, c);
        c = a * b;
        System.out.printf("%e * %e = %e\n", a, b, c);
        c = a / b;
        System.out.printf("%e / %e = %e\n", a, b, c);
        c = a % b;
        System.out.printf("%e %% %e = %e\n", a, b, c);
        c = a / 0.0;
        System.out.printf("%e / 0.0 = %e\n", a, c);
        c = -a / 0.0;
        System.out.printf("%e / 0.0 = %e\n", -a, c);
        c = 0.0 / 0.0;
        System.out.printf("0.0 / 0.0 = %e\n", c);
        c = a % 0.0;
        System.out.printf("%e %% 0.0 = %e\n", a, c);
        c = -a;
        System.out.printf("-%e = %e\n", a, c);
        c = +a;
        System.out.printf("+%e = %e\n", a, c);
        System.out.printf("%e++ = %e\n", a, c = a++);
        a = 156.15e36;
        System.out.printf("++%e = %e\n", a, c = ++a);
        a = 156.15e36;
        System.out.printf("%e-- = %e\n", a, c = a--);
        a = 156.15e36;
        System.out.printf("--%e = %e\n", a, c = --a);


        System.out.println("________________________Bitwise operators________________________");
        a = 156.15e36;
        //c = ~a;
        System.out.printf("~%e -> %s\n", a, ERROR);
        //c = a & b;
        System.out.printf("%e & %e -> %s\n", a, b, ERROR);
        //c = a | b;
        System.out.printf("%e | %e -> %sd\n", a, b, ERROR);
        //c = a ^ b;
        System.out.printf("%e ^ %e -> %s\n", a, b, ERROR);
        //c = a << 1;
        System.out.printf("%e << 1 -> %s\n", a, ERROR);
        //c = a >> 1;
        System.out.printf("%e >> 1 -> %s\n", a, ERROR);
        //c = a >>> 1;
        System.out.printf("%e >>> 1 -> %s\n", a, ERROR);
        //c = ~a >> 1;
        System.out.printf("~%e >> 1 -> %s\n", a, ERROR);
        //c = ~a >>> 1;
        System.out.printf("~%e >>> 1 -> %s\n", a, ERROR);


        System.out.println("________________________Logical operation________________________");
        System.out.printf("%e == %e -> %b\n", a, b, a == b);
        System.out.printf("%e != %e -> %b\n", a, b, a != b);
        System.out.printf("%e < %e -> %b\n", a, b, a < b);
        System.out.printf("%e > %e -> %b\n", a, b, a > b);
        System.out.printf("%e <= %e -> %b\n", a, b, a <= b);
        System.out.printf("%e >= %e -> %b\n", a, b, a >= b);
        //c = !a;
        System.out.printf("!%e -> %s\n", a, ERROR);
        //c = a && b;
        System.out.printf("%e && %e -> %s\n", a, b, ERROR);
        //c = a || b;
        System.out.printf("%e || %e -> %s\n", a, b, ERROR);


        System.out.println("________________________Assignment operators________________________");
        a = 156.15e36;
        System.out.printf("%e += %e -> %e\n", a, b, a += b);
        a = 156.15e36;
        System.out.printf("%e -= %e -> %e\n", a, b, a -= b);
        a = 156.15e36;
        System.out.printf("%e *= %e -> %e\n", a, b, a *= b);
        a = 156.15e36;
        System.out.printf("%e /= %e -> %e\n", a, b, a /= b);
        a = 156.15e36;
        System.out.printf("%e %%= %e -> %e\n", a, b, a %= b);
        a = 156.15e36;
        //a &= b;
        System.out.printf("%e &= %e -> %s\n", a, b, ERROR);
        //a |= b;
        System.out.printf("%e |= %e -> %s\n", a, b, ERROR);
        //a ^= b;
        System.out.printf("%e ^= %e -> %s\n", a, b, ERROR);
        //a >>= b;
        System.out.printf("%e >>= %e -> %s\n", a, b, ERROR);
        //a <<= b;
        System.out.printf("%e <<= %e -> %s\n", a, b, ERROR);
        //a >>>= b;
        System.out.printf("%e >>>= %e -> %s\n", a, b, ERROR);

        System.out.println("________________________Ternary operator________________________");
        System.out.printf("%e > %e ? %e : %e -> %e\n", a, b, a, b, a > b ? a : b);
        System.out.printf("%e < %e ? %e : %e -> %e\n", a, b, a, b, a < b ? a : b);


        System.out.println("________________________Type casting________________________");
        byte e = 10;
        short s = 30156;
        int i = 428_506;
        char c1 = '\u0250';
        long l = 201_782_75L;
        float f = 869.568F;
        double d = 156.15e36;
        boolean b1 = true;
        c = e;
        System.out.printf("double = byte: c = %d -> %e\n", e, c);
        c = s;
        System.out.printf("double = short: c = %d -> %e\n", s, c);
        c = c1;
        System.out.printf("double = char: c = %c -> %e\n", c1, c);
        c = i;
        System.out.printf("double = int: c = %d -> %e\n", i, c);
        c = l;
        System.out.printf("double = long: c = %d -> %e\n", l, c);
        c = f;
        System.out.printf("double = float: c =  %f -> %e\n", f, c);
        //c = (byte) b2;
        System.out.printf("double = boolean: c = (byte) %b -> %s\n", b1, ERROR);
    }
    //   -------------------------------------------------------------------------------------------------------------------------
    public static void TestYourBoolean(){
        boolean a = true, b = false, c;
        System.out.println("\nTests for Boolean-------------------------------------------------------------------------");
        //Arithmetic operators
        System.out.println("________________________Arithmetic operators________________________");
        //c = a + b;
        System.out.printf("%b + %b -> %s\n", a, b, ERROR);
        //c = a - b;
        System.out.printf("%b - %b -> %s\n", a, b, ERROR);
        //c = a * b;
        System.out.printf("%b * %b -> %s\n", a, b, ERROR);
        //c = a / b;
        System.out.printf("%b / %b -> %s\n", a, b, ERROR);
        //c = a % b;
        System.out.printf("%b %% %b -> %s\n", a, b, ERROR);
        //c = -a;
        System.out.printf("-%b -> %s\n", a, ERROR);
        //c = +a;
        System.out.printf("+%b -> %s\n", a, ERROR);
        System.out.printf("%b++ -> %s\n", a, ERROR);
        System.out.printf("++%b -> %s\n", a, ERROR);
        System.out.printf("%b-- -> %s\n", a, ERROR);
        System.out.printf("--%b -> %s\n", a, ERROR);


        System.out.println("________________________Bitwise operators________________________");
        //c = ~a;
        System.out.printf("~%b -> %s\n", a, ERROR);
        c = a & b;
        System.out.printf("%b & %b = %b\n", a, b, c);
        c = a | b;
        System.out.printf("%b | %b = %b\n", a, b, c);
        c = a ^ b;
        System.out.printf("%b ^ %b = %b\n", a, b, c);
        //c = a << 1;
        System.out.printf("%b << 1 -> %s\n", a, ERROR);
        //c = a >> 1;
        System.out.printf("%b >> 1 -> %s\n", a, ERROR);
        //c = a >>> 1;
        System.out.printf("%b >>> 1 -> %s\n", a, ERROR);


        System.out.println("________________________Logical operation________________________");
        System.out.printf("%b == %b -> %b\n", a, b, a == b);
        System.out.printf("%b != %b -> %b\n", a, b, a != b);
        System.out.printf("%b < %b -> %s\n", a, b, ERROR);
        System.out.printf("%b > %b -> %s\n", a, b, ERROR);
        System.out.printf("%b <= %b -> %s\n", a, b, ERROR);
        System.out.printf("%b >= %b -> %s\n", a, b, ERROR);
        System.out.printf("!%b -> %s\n", a, c = !a);
        System.out.printf("%b && %b -> %s\n", a, b, c = a && b);
        System.out.printf("%b || %b -> %s\n", a, b, c = a || b);


        System.out.println("________________________Assignment operators________________________");
        System.out.printf("%b += %b -> %s\n", a, b, ERROR);
        System.out.printf("%b -= %b -> %s\n", a, b, ERROR);
        System.out.printf("%b *= %b -> %s\n", a, b, ERROR);
        System.out.printf("%b /= %b -> %s\n", a, b, ERROR);
        System.out.printf("%b %%= %b -> %s\n", a, b, ERROR);
        a = true;
        System.out.printf("%b &= %b -> %b\n", a, b, a &= b);
        a = true;
        System.out.printf("%b |= %b -> %b\n", a, b, a |= b);
        a = true;
        System.out.printf("%b ^= %b -> %b\n", a, b, a ^= b);
        System.out.printf("%b >>= %b -> %b\n", a, b, ERROR);
        System.out.printf("%b <<= %b -> %b\n", a, b, ERROR);
        System.out.printf("%b >>>= %b -> %b\n", a, b, ERROR);


        System.out.println("________________________Ternary operator________________________");
        a = true;
        System.out.printf("%b = %b ? %b : %b -> %b\n", a, b, a, b, a = b ? a : b);
        System.out.printf("%b != %b ? %b : %b -> %b\n", a, b, a, b, a != b ? a : b);


        System.out.println("________________________Type casting________________________");
        byte e = 10;
        short s = 30156;
        int i = 428_506;
        char c1 = '\u0250';
        long l = 201_782_75L;
        float f = 869.568F;
        double d = 156.15e36;
        boolean b1 = true;
        //c = (boolean) b1;
        System.out.printf("boolean = byte: c = (boolean) %d -> %s\n", s, ERROR);
        //c = (boolean) s;
        System.out.printf("boolean = short: c = (boolean) %d -> %s\n", s, ERROR);
        //c = (boolean) c1;
        System.out.printf("boolean = char: c = (boolean) %c -> %s\n", c1, ERROR);
        //c = (boolean) i;
        System.out.printf("boolean = int: c = (boolean) %d -> %s\n", i, ERROR);
        //c = (boolean) l;
        System.out.printf("boolean = long: c = (boolean) %d -> %s\n", l, ERROR);
        //c = (boolean) f;
        System.out.printf("boolean = float: c = (boolean) %f -> %s\n", f, ERROR);
        //c = (boolean) d;
        System.out.printf("boolean = double: c = (boolean) %e -> %s\n", d, ERROR);
    }
    //   -------------------------------------------------------------------------------------------------------------------------
    public static void TestYourString(){
        String a = "EP ", b = "AM", c;
        System.out.println("\nTests for String-------------------------------------------------------------------------");


        System.out.println("________________________Arithmetic operators________________________");
        c = a + b;
        System.out.printf("%s + %s = %s\n", a, b, c);
        //c = a - b;
        //c = a * b;
        //c = a / b;
        //c = a % b;
        //c = a / 0;
        //c = a % 0;
        //c = -a;
        //c = +a;
        //System.out.printf("%s++ = %s\n", a, a++);
        //System.out.printf("++%s = %s\n", a, ++a);
        //System.out.printf("%s-- = %s\n", a, a--);
        //System.out.printf("--%s = %s\n", a, --a);


        System.out.println("________________________Bitwise operators________________________");
        //c = ~a;
        //c = a & b;
        //c = a | b;
        //c = a ^ b;
        //c = a << 1;
        //c = a >> 1;
        //c = a >>> 1;
        //c = ~a >> 1;
        //c = ~a >>> 1;


        System.out.println("________________________Logical operation________________________");
        System.out.printf("%s == %s -> %b\n", a, b, a == b);
        System.out.printf("%s != %s -> %b\n", a, b, a != b);
        //System.out.printf("%s < %s -> %b\n", a, b, a < b);
        //System.out.printf("%s > %s -> %b\n", a, b, a > b);
        //System.out.printf("%s <= %s -> %b\n", a, b, a <= b);
        //System.out.printf("%s >= %s -> %b\n", a, b, a >= b);
        //System.out.printf("!%s -> %s\n", a, !a);
        //System.out.printf("%s && %s -> %s\n", a, b, a && b);
        //System.out.printf("%s || %s -> %s\n", a, b, a || b);



        a = "EP";
        System.out.println("________________________Assignment operators________________________");
        System.out.printf("%s += %s -> %s\n", a, b, a += b);
        //System.out.printf("%s -= %s -> %d\n", a, b, a -= b);
        //System.out.printf("%s *= %s -> %d\n", a, b, a *= b);
        //System.out.printf("%s /= %s -> %d\n", a, b, a /= b);
        //System.out.printf("%s %%= %s -> %d\n", a, b, a %= b);
        //System.out.printf("%s &= %s -> %d\n", a, b, a &= b);
        //System.out.printf("%s |= %s -> %d\n", a, b, a |= b);
        //System.out.printf("%s ^= %s -> %d\n", a, b, a ^= b);
        //System.out.printf("%s >>= %s -> %d\n", a, b, a >>= b);
        //System.out.printf("%s <<= %s -> %d\n", a, b, a <<= b);
        //System.out.printf("%s >>>= %s -> %d\n", a, b, a >>>= b);


        System.out.println("________________________Ternary operator________________________");
        System.out.printf("%s = %s ? %s : %s -> %s\n", a, b, a, b, a == b ? a : b);
        System.out.printf("%s != %s ? %s : %s -> %s\n", a, b, a, b, a != b ? a : b);


        System.out.println("________________________Type casting________________________");
        a = "EP";
        //System.out.printf("(byte) %s -> %d\n", a, (byte) a);
        //System.out.printf("(short) %s -> %d\n", a, (short) a);
        //System.out.printf("(int) %s -> %d\n", a, (long) a);
        //System.out.printf("(long) %s -> %d\n", a, (long) a);
        //System.out.printf("(float) %s -> %f\n", a, (float) a);
        //System.out.printf("(double) %s -> %e\n", a, (double) a);
        //System.out.printf("(char) %s -> %c\n", a, (char) a);
        //System.out.printf("(boolean) %s -> %s\n", a, (boolean) a);
        System.out.printf("(Object) %s -> %s", a, (Object) a);
    }
}