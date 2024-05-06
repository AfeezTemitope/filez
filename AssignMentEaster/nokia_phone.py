while True:
    print("\n")
    print("\n******************")
    print(":WELCOME NEW USER:")
    print("******************")
    print("ABIDO-SHAKERS NOKIA PHONE MENU")

    print(" 1. PHONEBOOK\t2. MESSAGES\t3. CHAT\t4. CALL REGISTER\n5. TONES\t6. SETTINGS\t7. CALL DIVERTS\t8. GAMES\t9.CALCULATOR\n10. REMINDERS\t11.CLOCK\t12.PROFILES\t13.SIM SERVICES\t14. EXIT  ")
    option = int(input("Enter an option: "))

    if option == 14:
        print("Exiting the menu.")
        break


    if option == 1:
        print("1. Search\n 2. Service Nos.'\n 3. Add name\n 4. Erase\n 5. Edit\n 6. Assign tone\n 7. Send b'card\n 8. Options\n 9. Speed dials\n 10. Voice tags\n")
        print()
        sub_option = int(input("Enter your sub-Option: "))
        print()
        
        if sub_option == 1:
            print("Searching...")
        elif sub_option == 2:
            print("Service Nos.'...")
        elif sub_option == 3:
            print("Adding name...")
        elif sub_option == 4:
            print("Erasing...")
        elif sub_option == 5:
            print("Editing...")
        elif sub_option == 6:
            print("Assigning Tone...")
        elif sub_option == 7:
            print("Sending b'card...")
        elif sub_option == 8:
            print("Available options...")
            print(" a. type of view")
            print(" b. memory status")
        elif sub_option == 9:
            print("Speed dialing...")
        elif sub_option == 10:
            print("Opening Voice tags...")
        else:
            print("Choose again or getat!!")

    elif option == 2:
        print("1. Write messages\n 2. Inbox\n 3. Outbox\n 4. Picture messages\n 5. Templates\n 6. Smileys\n 7. Message settings\n 8. Info service\n 9. Voice Mailbox Number\n 10. Service command Editor")
        print()
        sub_choice = int(input("Enter your sub-choice: "))
        print()
        
        if sub_choice == 1:
            print("Writing messages...")
        elif sub_choice == 2:
            print("Viewing inbox...")
        elif sub_choice == 3:
            print("Viewing outbox...")
        elif sub_choice == 4:
            print("Viewing picture messages...")
        elif sub_choice == 5:
            print("Viewing templates...")
        elif sub_choice == 6:
            print("Viewing smileys...")
        elif sub_choice == 7:
            print("Message Settings Menu:")
            print("a. SET")
            print("   i. Message Centre Number")
            print("   ii. Message Sent As")
            print("   iii. Message Validity")
            print("b. Common")
            print("   i. Delivery Reports")
            print("   ii. Reply via Same Centre")
            print("   iii. Character Support")
        elif sub_choice == 8:
            print("Accessing info service...")
        elif sub_choice == 9:
            print("Setting voice mailbox number...")
        elif sub_choice == 10:
            print("Editing service commands...")
        else:
            print("abg exit!!!.")

    elif option == 3:
        print("CHAT")
        chatzone = int(input("Input your chatzone: "))
        if chatzone == 1:
            print("Let's chat...")
        else:
            print("Abeg commot!!!")

    elif option == 4:
        print("1. Missed calls\n 2. Received calls\n 3. Dialed numbers\n 4. Erase recent calls lists\n 5. Show calls duration\n a. Last call duration\n b. All calls duration\n c. Received calls duration\n 6. Dialed calls' duration\n 7. Call timers\n 8. Show call costs\n a. Last call cost\n b. All call cost\n c. Clear counters\n 9. Call cost settings\n a. Call cost limit\n b. Show costs in\n 10. Prepaid credit")
        print()
        call_register = int(input("Enter your callRegister: "))
        print()
        if call_register == 1:
            print("Missed calls...")
        elif call_register == 2:
            print("Received calls...")
        elif call_register == 3:
            print("Dialed numbers...")
        elif call_register == 4:
            print("Erasing recent calls lists...")
        elif call_register == 5:
            print("Showing call durations...")
            print(" a. Last call")
            print(" b. All calls duration")
            print(" c. Received calls duration")
        elif call_register == 6:
            print("Dialed calls' duration...")
        elif call_register == 7:
            print("Call timers...")
        elif call_register == 8:
            print("Showing call costs...")
            print(" a. Last call cost")
            print(" b. All call cost")
            print(" c. Clearing counters")
        elif call_register == 9:
            print("Call cost settings...")
            print(" a. Call cost limit")
            print(" b. Showing call cost")
        elif call_register == 10:
            print("Prepaid credit...")
        else:
            print("Wetin u dey find wey no lost")

    elif option == 5:
        print("1. Ringing tone\n 2. Ringing volume\n 3. Incoming call alert\n 4. Composer\n 5. Message alert tone\n 6. Keypad tones\n 7. Warning and game tones\n 8. Vibrating alert\n 9. Screen saver")
    elif option == 6:
        print("1. Call settings\n 2. Phone settings\n 3. Security settings\n 4. Restore factory")
        print()
        print("Enter your settings:")
        settings = int(input())
        if settings == 1:
            print("1. Call settings...")
            print(" 1. Automatic redial\n 2. Speed dialling\n 3. Call waiting options\n 4. Own number sending\n 5. Phone line in use\n 6. Automatic answer")
        elif settings == 2:
            print("2. Phone settings...")
            print("1. Language\n 2. Cell info display\n 3. Welcome note\n 4. Network selection\n 5. Lights\n 6. Confirm SIM service actions")
        elif settings == 3:
            print("3. Security settings...")
            print("1. PIN code request\n 2. Call barring service\n 3. Fixed dialling\n 4. Closed user group\n 5. Phone security\n 6. Change access codes")
        elif settings == 4:
            print("Restoring factory settings..........")
	else:
            print("Invalid choice")
    elif option == 7:
	print("Call diverted........")
            print("**********************")
    elif option == 8:
        print("Games loading........")
            print("**********************")
    elif option == 9:
        print("Loading Calculator........")
        print("**********************")
    elif option == 10:
        print("Setting up reminders........")
        print("**********************")
    elif option == 11:
        print("Clock settings........")
        print("**********************")
        print()
            print("Enter your clock settings:")
            clock_settings = int(input())
        if clock_settings == 1:
            print("Clock setup")
            print("1. Alarm clock\n 2. Clock settings\n 3. Date setting\n 4. Stopwatch\n 5. Countdown timer\n 6. Auto update of date and time")
    elif choice == 12:
        print("Creating profiles........")
        print("**********************")
    elif choice == 13:
        print("Loading SIM services........")
        print("**********************")
    elif choice == 14:
        print("Exiting... thank you for using the abidoShaker phone menu")
        return
else:
        print("E don do you self rest!!!")

