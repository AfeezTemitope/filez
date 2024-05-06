public class TwelveDaysOfChristmas {
public static void main(String[] args) {
String[] days = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};
String[] gifts = {"a Partridge in a Pear Tree", "Two Turtle Doves", "Three French Hens", "Four Calling Birds", "Five Golden Rings", "Six Geese a Laying", "Seven Swans a Swimming", "Eight Maids a Milking", "Nine Ladies Dancing", "Ten Lords a Leaping", "Eleven Pipers Piping", "Twelve Drummers Drumming"};

for (int i = 0; i < 12; i++) {
System.out.println("On the " + days[i] + " day of Christmas,");
System.out.println("My true love sent to me:");

for (int j = i; j >= 0; j--) {
switch (j) {
case 0:
if (i != 0) {
System.out.println("And " + gifts[j]);
} else {
System.out.println(gifts[j]);
}
break;
default:
System.out.println(gifts[j] + ",");
break;
}
}

System.out.println();
        }
    }
}