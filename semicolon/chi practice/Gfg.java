class Gfg{
public static void main(String...args){
for (int i = 0; i < 10; i++){
if (i == 4){
continue;
}
System.out.println("i: " +i);
}
System.out.println("out of loop abi wetin u de find");


}
}



class Gfg {
public static void main(String... args) {
    int i = 0;
     while (i < 10) {
     if (i == 6) {
     break;
}
     System.out.println("i: " + i);
     i++;
}
     System.out.println("Out of the loop. What are you looking for?");
    }
}