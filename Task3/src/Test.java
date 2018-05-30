public class Test {
    public static void main(String[] args) {

        double x1 = 2.5, x2 = 3.4, x3 = 0.5,
                y1 = 6.2, y2 = 5.1, y3 = 1.1;
        boolean flagTriangle, flagRectTriangle;
        flagTriangle = Dots.findTriangle(Dots.Distance(x1,y1,x2,y2), Dots.Distance(x1,y1,x3,y3), Dots.Distance(x2,y2,x3,y3));
        if (flagTriangle) {
            System.out.println("This points are triangle!!!");
        }
        else{
            System.out.println("This points aren't triangle!!!");
        }

        flagRectTriangle = Dots.findRectTriangle(Dots.Distance(x1,y1,x2,y2), Dots.Distance(x1,y1,x3,y3), Dots.Distance(x2,y2,x3,y3));
        if (flagRectTriangle) {
            System.out.println("This points are rectangular triangle!!!");
        }
        else{
            System.out.println("This points aren't rectangular triangle!!!");
        }
        //Dragon
        int Age = 5;
        int eyes = DragonHead.getEyes(Age);
        int heads = DragonHead.getHeads(Age);
                System.out.printf("%d + %d\n",eyes ,heads);

        //Vowel
        char symbol = 'a';
        char symbol2 = 'b';
        char symbol3 = 'U';
        boolean flag, flagTwo, flagThree, flagFour , flagFive;
        flag = Vowel.checkVowel(symbol);
        if(flag){
            System.out.println("The letter '" + symbol + "' is vowel.");
        }
        else{
            System.out.println("The letter '" + symbol + "' is consonant.");
        }

        flagFive = Vowel.checkVowelCharTwo(symbol3);
        if(flagFive){
            System.out.println("The letter '" + symbol3 + "' is vowel.");
        }
        else{
            System.out.println("The letter '" + symbol3 + "' is consonant.");
        }

        flagTwo =  Vowel.checkVowelTwo(symbol2);
        if(flagTwo){
            System.out.println("The letter '" + symbol2 + "' is vowel.");
        }
        else{
            System.out.println("The letter '" + symbol2 + "' is consonant.");
        }

        System.out.println("\tWith type string:");
        String str = "i";
        String str2 = "j";
        String str3 = "A";

        flagThree =  Vowel.checkVowelThree(str);
        if(flagThree){
            System.out.println("The letter '" + str + "' is vowel.");
        }
        else{
            System.out.println("The letter '" + str + "' is consonant.");
        }

        flagFour =  Vowel.checkVowelFour(str2);
        if(flagFour){
            System.out.println("The letter '" + str2 + "' is vowel.");
        }
        else{
            System.out.println("The letter '" + str2 + "' is consonant.");
        }

        //Mood
        String result = Mood.getMood();
        System.out.printf("%s\n",result);

        //Gregorian
        Gregorian gregorian = new Gregorian(25,11,2018);
            gregorian.toNextDay();
            System.out.println(gregorian.getDay()+ "." + gregorian.getMonth() + "." + gregorian.getYear());
    }

}
