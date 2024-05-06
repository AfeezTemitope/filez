import java.util.Scanner;

public class NokiaiPhone {
public static void main(String... args) {
Scanner input = new Scanner(System.in);
while(true){
            System.out.println("\n");
            System.out.println("\n******************");
            System.out.println(":WELCOME NEW USER:");
            System.out.println("******************");
            System.out.println("ABIDO-SHAKERS NOKIA PHONE MENU");

            System.out.println(" 1. PHONEBOOK\n 2. MESSAGES\n 3. CHAT\n 4. CALL REGISTER\n 5. TONES\n 6. SETTINGS\n 7. CALL DIVERTS\n 8. GAMES\n 9.CALCULATOR\n 10. REMINDERS\n 11.CLOCK\n 12.PROFILES\n 13.SIM SERVICES\n 14. EXIT  ");
            System.out.print("Enter an option: ");
            int option = input.nextInt();


switch (option) {
      case 1 -> {
   //PHONEBOOK
        System.out.println("1. Search\n 2.Service Nos.'\n 3. Add name\n 4. Erase\n 5. Edit\n 6. Assign tone\n 7. send b'card\n 8. Options\n 9. speed dials\n 10. voice tags\n ");
        System.out.println();
        System.out.print("Enter your sub-Option: ");
        int subOption = input.nextInt();
        System.out.println();
        
switch (subOption) {
        case 1-> System.out.print("Searching...");
        case 2-> System.out.print("Service Nos. '...");
        case 3-> System.out.print("Adding name...");
        case 4-> System.out.print("Erasing...");
        case 5-> System.out.print("Editting...");
        case 6-> System.out.print("Assingning Tone...");
        case 7-> System.out.print("Sending b'card...");
        case 8-> {System.out.println("Available options...");
                  System.out.println(" a. type of view");
                  System.out.println(" b. memory status");}
        case 9-> System.out.print("speed dialing...");
        case 10-> System.out.print("Opening Voice tags...");

        default-> System.out.print("choose again or getat!!");}
break;
}




case 2 -> {
   //MESSAGES
        System.out.println("1. Write messages\n 2. Inbox\n 3. Outbox\n 4. Picture messages\n 5. Templates\n 6. Smileys\n 7. Message settings\n 8. Info service\n 9. Voice Mailbox Number\n 10. Service command Editor");

        System.out.println("Enter your sub-choice: ");
        System.out.println();
        int subChoice = input.nextInt();
        System.out.println();
switch (subChoice) {
                case 1 -> System.out.println("Writing messages...");
                case 2 -> System.out.println("Viewing inbox...");
                case 3 -> System.out.println("Viewing outbox...");
                case 4 -> System.out.println("Viewing picture messages...");
                case 5 -> System.out.println("Viewing templates...");
                case 6 -> System.out.println("Viewing smileys...");
                case 7 -> {
                    System.out.println("Message Settings Menu:");
                    System.out.println("a. SET");
                    System.out.println("   i. Message Centre Number");
                    System.out.println("   ii. Message Sent As");
                    System.out.println("   iii. Message Validity");
                    System.out.println("b. Common");
                    System.out.println("   i. Delivery Reports");
                    System.out.println("   ii. Reply via Same Centre");
                    System.out.println("   iii. Character Support");}
                case 8 -> System.out.println("Accessing info service...");
                case 9 -> System.out.println("Setting voice mailbox number...");
                case 10 -> System.out.println("Editing service commands...");
                default-> System.out.println("abg exit!!!.");}
break;
}

case 3 -> {   
       //CHAT
              System.out.println("CHAT");
System.out.println("input your chatzone");
              int chatzone = input.nextInt();
switch (chatzone){
              case 1->  System.out.println("let's chat...");
              default-> System.out.println("abg commot!!!");}
break;
}

case 4 -> {
        //CALL REGISTER
              System.out.println("1. missed calls\n 2. recieved calls\n 3. dialled numbers\n 4. erase recent calls lists\n 5. show calls duration\n a. last call duration\n b. all calls duration\n c.recieved calls duration\n 6. Dialled calls' duration\n 7. call timers\n 8. Show call costs\n a. a. Last call cost\n b. all call cost  c.  Clear counters\n 9. 9. Call cost settings\n a.Call cost limit\n b. Show costs in\n 10. Prepaid credit\n" );
              System.out.println();
              System.out.println("enter your callRegister");
              int callRegister = input.nextInt();
switch(callRegister){ 
               case 1-> System.out.println("1. missed calls...");
               case 2-> System.out.println("2. recieved...");
               case 3-> System.out.println("3. dialled...");
               case 4-> System.out.println("4. erasing...");
               case 5-> {System.out.println("5. call durations...");
                         System.out.println(" a. last call\n b. all calls duration\n c.recieved calls duration\n");}
               case 6-> System.out.println("6.dailled calls duration...");
               case 7-> System.out.println("call timers...");
               case 8-> {System.out.println("8. Showing call costs......");
                        System.out.println("a. Last call cost...\n b. all call cost...\n  c.  Clearing counters...\n ");}
               case 9-> {System.out.println("Call cost settings...");
                        System.out.println("a. call cost limit...\n b. showing call cost\n");}
               case 10-> System.out.println("1.prepaid credit...");
               default-> System.out.println("wetin u dey find wey no lost"); }
               break;
               }

case 5 ->{ 
     //TONES
            System.out.println("1. Ringing tone\n 2. Ringing volume\n 3. Incoming call alert\n 4. Composer\n 5. Message alert tone\n 6. Keypad tones\n 7. Warning and game tones\n 8. Vibrating alert\n 9. Screen saver\n"); 
          break;
 }

case 6 -> { 
  //SETTINGS
              System.out.println("1. Call settings\n 2. Phone settings\n 3. Security settings\n 4. Restore factory");
              System.out.println();
              System.out.println("enter your settings");
              int settings = input.nextInt();
switch (settings){
               case 1-> {System.out.println("1. call settings....");
                         System.out.println(" 1. Automatic redial\n 2. Speed dialling\n 3. Call waiting options\n 4. Own number sending\n 5. Phone line in use\n 6. Automatic answer");}
               case 2-> {System.out.println("2. phone settings...");
                        System.out.println("1. Language\n 2. Cell info display\n 3. Welcome note\n 4. Network selection\n 5. Lights\n 6. Confirm SIM service actions");}
               case 3-> {System.out.println("security settings...");
                        System.out.println("1. PIN code request\n 2. Call barring service\n 3. Fixed dialling\n 4. Closed user group\n 5. Phone security\n 6. Change access codes"); }
               case 4 -> System.out.print("Restoring factory settings..........");
               default-> System.out.println("wetin again!!!");}
               break;
               }
case 7-> {
   //CALL DIVERTS
             System.out.println("call diverted........");
             System.out.println("**********************");
}
case 8-> {
   //GAMES
             System.out.println("games loading........");
             System.out.println("**********************");
}
case 9-> {
   //CALCULATOR
             System.out.println("loading Calculator........");
             System.out.println("**********************");
}
case 10-> {
   //REMINDERS
             System.out.println("Setting up reminders........");
             System.out.println("**********************");
}
case 11-> {
   //CLOCK
             System.out.println("Clock settings........");
             System.out.println("**********************");
             System.out.println();
             System.out.println("enter your clockSettings");
             int clockSettings = input.nextInt();
switch(clockSettings){
             case 1-> {System.out.println("Clock setup");
                      System.out.println("1. Alarm clock\n 2. Clock settings\n 3. Date setting\n 4. Stopwatch\n 5. Countdown timer\n 6. Auto update of date and time");}
}
}
case 12-> {
   //PROFILES
             System.out.println("Creating profiles........");
             System.out.println("**********************");
}
case 13-> {
   //SIM SERVICES
             System.out.println("loading sim services........");
             System.out.println("**********************");
}

default-> System.out.print("e dun do you self rest!!!");


case 14->{
//EXIT
 System.out.println("Exiting... thank you for using the abidoShaker phone menu");
return;
}
}
}
}
}

