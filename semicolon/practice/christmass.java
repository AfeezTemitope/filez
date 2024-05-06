public class TwelveDaysOfChristmas {
    public static void main(String... args) {
      

String days = """
first
second
third
fourth
fifth
sixth
seventh
eighth
ninth
tenth
eleventh
twelfth
        """;

String verses ="""
'a partridge in a pear tree.',
'two turtle doves, and,'
'three French hens,'
'four calling birds,'
'five golden rings,'
'six geese a-laying,'
'seven swans a-swimming,'
'eight maids a-milking,'
'nine ladies dancing,'
'ten lords a-leaping,'
'eleven pipers piping,'
'twelve drummers drumming,'
        """;


for (int i = 0; i < days.length; i++) {
System.out.println("On the " + days[i] + " day of Christmas,");
System.out.println("My true love gave to me:");
for (int j = i; j >= 0; j--) {
System.out.println(verses[j]);
}
System.out.println();
        }
    }
}