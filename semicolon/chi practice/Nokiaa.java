import java.util.Scanner;
public class Nokiaa{
public static void main(String... args){
Scanner scanner = new Scanner (System.in);


String prompt;

prompt = """
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
0 -> EXIT
""";


System.out.println("Welcome to Nokia Phone Menu!");
System.out.println("1 -> PHONEBOOK");
System.out.println("2 -> MESSAGES");
System.out.println("3 -> CHAT");
System.out.println("4 -> CALL REGISTER");
System.out.println("5 -> TONES");
System.out.println("6 -> SETTINGS");
System.out.println("7 -> CALL DIVERT");
System.out.println("8 -> GAMES"); 
System.out.println("9 -> CALCULATOR");
System.out.println("10 -> REMINDERS");
System.out.println("11 -> CLOCK");
System.out.println("12 -> PROFILES");
System.out.println("12 -> SIM SERVICES");

System.out.println("CHOOSE AN OPTION");
int userInput = scanner.nextInt();

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

String Tones = """

1. Ringing tone
2. Ringing volume
3. Incoming call alert
4. Composer
5. Message alert tone
6. Keypad tones
7. Warning and game tones
8. Vibrating alert
9. Screen saver
""";

String Settings = """

1. Call settings
  a. Automatic redial
  b. Speed dialling
  c. Call waiting options
  d. Own number sending
  e. Phone line in use
  f. Automatic answer
2. Phone settings
  a. Language
  b. Cell info display
  c. Welcome note
  d. Network selection
  e. Lights?
  f. Confirm SIM service actions
3. Security settings
  a. PIN code request
  b. Call barring service
  c. Fixed dialling
  d. Closed user group
  e. Phone security
  f. Change access codes
4. Restore factory 
""";
String Clock = """

1. Alarm clock
2. Clock settings
3. Date setting
4. Stopwatch
5. Countdown timer
6. Auto update of date and time
""";



switch(userInput){
case 1 -> { System.out.println("PHONEBOOK");
System.out.print(phonebook);
}
case 2 -> { System.out.println("MESSAGES");
System.out.print(Messages);
}
case 3 -> { System.out.println("CHAT");

}
case 4 -> { System.out.println("CALL REGISTER");
System.out.print(callRegister);
}
case 5 -> { System.out.println("TONES");
System.out.print(Tones);
}
case 6 -> { System.out.println("SETTINGS");
System.out.print(Settings);
}
case 7 -> { System.out.println("CALL DIVERT");

}
case 8 -> { System.out.println("GAMES");

}
case 9 -> { System.out.println("CALCULATOR");

}
case 10-> { System.out.println("REMINDERS");

}
case 11 -> { System.out.println("CLOCK");
System.out.print(Clock);
}
case 12 -> { System.out.println("PROFILES");

}
case 13 -> { System.out.println("SIM SERVICES");

}
case 0 -> { System.out.println("EXIT");
}

default-> { System.out.println("wetin u deh find again your papa no de tire!!!");
}

}
}
}
