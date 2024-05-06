public class TwelveDaysOfChristmas {
    public static void main(String... args) {

for (int day = 1; day <= 12; day++) {

String dayName = switch (day) {
case 1-> "first";
case 2-> "second";
case 3-> "third";    
case 4-> "fourth";
case 5-> "fifth";
case 6-> "sixth";
case 7-> "seventh";
case 8-> "eighth";
case 9->  "ninth";
case 10-> "tenth";
case 11-> "leventh";
case 12-> "twelfth";
default-> "unknown";
};


String gifts = switch (day){

  case 1-> "a partridge in a pear tree.";
  case 2-> "two turtle doves, and,";
  case 3-> "three French hens";
  case 4-> "four calling birds";
  case 5-> "five golden rings,";
  case 6-> "six geese a-laying,";
  case 7-> "seven swans a-swimming,";
  case 8-> "eight maids a-milking,";
  case 9-> "nine ladies dancing,";
  case 10-> "ten lords a-leaping,";
  case 11-> "eleven pipers piping,";
  case 12-> "twelve drummers drumming,";
  default-> "unknown";
        

};
System.out.println("On the " + dayName + " day of Christmas,");
System.out.println("My true love gave to me:");
System.out.println(gifts);
System.out.println();
}
}
}



