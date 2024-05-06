import java.util.Scanner;
public class RedoTest{
public static void main(String... args){
Scanner scanner = new Scanner (System.in);

System.out.println("prompt");
int userInput = scanner.nextInt();


String prompt = """
Press
1 -> PHONEBOOK
2 -> MESSAGES
3 -> CHAT
4 -> CALL REGISTER
5 -> TONES
6 -> SETTINGS
7 -> CALL DIVERT
8 -> GAMES 
9 -> CALCULATOR
10 -> REMINDERS
11 -> CLOCK
12 -> PROFILES
12 -> SIM SERVICES
""";

String phonebook = """
1. Search
2. Service Nos. '
3. Add name
4. Erase
5. Edit
6. Assign tone
7. Send b'card
8. Options
    a. Type of view
    b.Memory status
9. Speed dials
10. Voice tags
""";

switch(userInput){
case 1 -> { System.out.println(PHONEBOOK);
System.out.print(phonebook);
}
