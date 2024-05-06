import java.util.Scanner;

public class NokiaPhone {
public static void main(String... args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Welcome to Nokia Phone Menu!");
int userInput;
int userInput1 = 0;
int userInput2 = 0;
int userInput3 = 0;


String prompt = """
        -------------------
         WELCOME NEW USER
       -------------------
        1 -> PHONEBOOK
        2 -> MESSAGES
        3 -> CALL REGISTER
       
      
        """;


System.out.println( prompt);
System.out.println("Select an option:");
userInput = scanner.nextInt();


String p = """
1. Search
2. Service Nos.
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
11. Enter 11 to go back
""";

String  Messages = """
1. Write messages
2. Inbox
3. Outbox
4. Picture messages
5. Templates
6. Smileys
7. Message settings
   
   a. SET
   i) message centre number
   ii) message sent as
   iii) message validity
   
   b. Common
   i) Delivery reports
   ii) Reply via same centre
   iii) Character support

8. Info service
9. Voice mailbox number
10. Service command editor
""";
String  callRegister = """
1. Missed calls
2. Received calls
3. Dialled numbers
4. Erase recent call lists
5. Show call duration
  a. Last call duration
  b. All calls' duration
  c. Received calls' duration
4. Dialled calls' duration
5. Clear timers
6. Show call costs
  a. Last call cost
  b. All calls' cost
  c. Clear counters
7. Call cost settings
  a. Call cost limit
  b. Show costs in
8. Prepaid credit
""";


switch (userInput){
case 1 -> {System.out.println("PHONEBOOK");
          System.out.println(p);
          System.out.println("choose NEXT option");
          userInput1  = scanner.nextInt();}
          
}

 switch (userInput1) {
case 1 -> {System.out.println("Search");
System.out.println();
System.out.println("EMPTY");
System.out.println();
System.out.println();
System.out.println(prompt);
System.out.println("Select an option:");
userInput = scanner.nextInt();}

case 2 -> {System.out.println("Service Nos.");
System.out.println();
System.out.println("EMPTY");
System.out.println();
System.out.println();
 System.out.println(prompt);
System.out.println("Select an option:");
userInput = scanner.nextInt();}

case 3 -> {System.out.println("Add name");
System.out.println();
System.out.println("EMPTY");
System.out.println();
System.out.println();
System.out.println(prompt);
System.out.println("Select an option:");
userInput = scanner.nextInt();}

case 4 -> {System.out.println("Erase");
System.out.println();
System.out.println("EMPTY");
System.out.println();
System.out.println();
System.out.println(prompt);
System.out.println("Select an option:");
userInput = scanner.nextInt();}

case 5 -> {System.out.println("Edit");
System.out.println();
System.out.println("EMPTY");
System.out.println();
System.out.println();
 System.out.println(prompt);
System.out.println("Select an option:");
userInput = scanner.nextInt();}

case 6 -> {System.out.println("Assign tone");
System.out.println();
System.out.println("EMPTY");
System.out.println();
System.out.println();
 System.out.println(prompt);
System.out.println("Select an option:");
userInput = scanner.nextInt();}

case 7 -> {System.out.println("Send b'card");
System.out.println();
System.out.println("EMPTY");
System.out.println();
System.out.println();
 System.out.println(prompt);
System.out.println("Select an option:");
userInput = scanner.nextInt();}

case 8 -> {System.out.println("Options");
System.out.println();
System.out.println("EMPTY");
System.out.println();
System.out.println();
 System.out.println(prompt);
System.out.println("Select an option:");
userInput = scanner.nextInt();}

case 9 -> {System.out.println("Speed dials");
System.out.println();
System.out.println("EMPTY");
System.out.println();
System.out.println();
System.out.println(prompt);
System.out.println("Select an option:");
userInput = scanner.nextInt();}

case 10 -> {System.out.println("Voice tags");
System.out.println();
System.out.println("EMPTY");
System.out.println();
System.out.println();
System.out.println(prompt);
System.out.println("Select an option:");
userInput = scanner.nextInt();}

case 11 -> {
System.out.println();
System.out.println("EMPTY");
System.out.println();
System.out.println();
 System.out.println(prompt);
System.out.println("Select an option:");
userInput = scanner.nextInt();;}
default ->  {System.out.print("e choke wetin u still de find");}
}

switch (userInput){
case 2 -> {System.out.println("MESSAGES");
          System.out.println(Messages);
          System.out.println("choose NEXT option");
          userInput2  = scanner.nextInt();}
}

switch (userInput2) {
case 1 -> {System.out.println("Write messages");}
case 2 -> {System.out.println("Inbox");}
case 3 -> {System.out.println("Outbox");}
case 4 -> {System.out.println("Picture messages");}
case 5 -> {System.out.println("Templates");}
case 6 -> {System.out.println("Smileys");}
case 7 -> {System.out.println("Message settings");}
case 8 -> {System.out.println("Info service");}
case 9 -> {System.out.println("Voice mailbox number");}
case 10 -> {System.out.println("Service command editor");
}
}

switch (userInput){
case 3 -> {System.out.println("CALL REGISTER");
          System.out.println(callRegister);
          System.out.println("choose NEXT option");
          userInput3  = scanner.nextInt();
}
}
switch (userInput3) {
case 1 -> {System.out.println("Missed calls");}
case 2 -> {System.out.println("Recieved calls");}
case 3 -> {System.out.println("Dialled numbers");}
case 4 -> {System.out.println("Erase recent call lists");}
case 5 -> {System.out.println("Clear timers");}
case 6 -> {System.out.println("Show call costs");}
case 7 -> {System.out.println("Call cost settings");}
case 8 -> {System.out.println("prepaid credit");}
}
}
}
