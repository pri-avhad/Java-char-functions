class char_fns
{
    static void main()
    {
        boolean a = Character.isLetter('d');
        System.out.println("boolean a = Character.isLetter('d'); " +a);
        boolean b = Character.isLetter('1');
        System.out.println("boolean b = Character.isLetter('1'); " +b);
        boolean c = Character.isDigit('d');
        System.out.println("boolean c = Character.isDigit('d'); " +c);
        boolean d = Character.isDigit('1');
        System.out.println("boolean d = Character.isDigit('1'); " +d);
        boolean e = Character.isLetterOrDigit('d');
        System.out.println("boolean e = Character.isLetterOrDigit('d'); " +e);
        boolean f = Character.isLetterOrDigit('1');
        System.out.println("boolean f = Character.isLetterOrDigit('1'); " +f);
        boolean g = Character.isWhitespace('d');
        System.out.println("boolean g = Character.isWhitespace('d'); " +g);
        boolean h = Character.isWhitespace(' ');
        System.out.println(" boolean h = Character.isWhitespace(' '); " +h);
        boolean i = Character.isUpperCase('d');
        System.out.println(" boolean i = Character.isUpperCase('d'); " +i);
        boolean j = Character.isUpperCase('D');
        System.out.println("boolean j = Character.isUpperCase('D'); " +j);
        boolean k = Character.isLowerCase('d');
        System.out.println("boolean k = Character.isLowerCase('d'); " +k);
        boolean l = Character.isLowerCase('D');
        System.out.println("boolean l = Character.isLowerCase('D'); " +l);
        char m = Character.toUpperCase('d');
        System.out.println(" boolean m = Character.toUpperCase('d'); " +m);
        char n = Character.toUpperCase('D');
        System.out.println(" boolean n = Character.toUpperCase('D'); " +n);
        char o = Character.toLowerCase('d');
        System.out.println("boolean o = Character.toLowerCase('d'); " +o);
        char p = Character.toLowerCase('D');
        System.out.println("boolean p = Character.toLowerCase('D'); " +p);
        }
    }