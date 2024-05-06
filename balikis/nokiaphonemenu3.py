print("""
Nokia Phone Menu
1 -> Phone book
2 -> Messages
3 -> Chat
4 -> Call register
5 -> Tones
6 -> Settings
7 -> Call divert
8 -> Games
9 -> Calculator
10 -> Reminders
11 -> Clock
12 -> Profiles
13 -> SIM services
""")


userinput = int(input("Enter your choice: "))

match userinput:

    case 1:
        print("Phone book")
        phonebookoption = int(input("Enter your choice: "))
        match phonebookoption:

            case 1:
                print("Search")
            case 2:
                print("Service Nos.")
            case 3:
                print("Add name")
            case 4:
                print("Erase")
            case 5:
                print("Edit")
            case 6:
                print("Assign tone")
            case 7:
                print("Send b'card")
            case 8:
                print("Options")
                optionsoption = int(input("""
                Select an option
                1 -> Type of view
                2 -> Memory status
                """))
                match optionsoption:
                    case 1:
                        print("Type of view")
                    case 2:
                        print("Memory status")
                    case _:
                        print("Invalid option")
            case 9:
                print("Speed dials")
            case 10:
                print("Voice tags")
            case _:
                print("Back")

    case 2:
        print("Messages")
        messagesoption = int(input("Enter your choice: "))
        match messagesoption:
     
            case 1:
                print("Write messages")
            case 2:
                print("Inbox")
            case 3:
                print("Outbox")
            case 4:
                print("Picture messages")
            case 5:
                print("Templates")
            case 6:
                print("Simelys")
            case 7:
                print("Message settings")
                messageoption = int(input("Enter your choice: "))
                match messageoption:
                    case 1:
                        print("Set 1")
                        setoption = int(input("""
                        Select an option
                        1 -> Message centre number
                        2 -> Message sent as
                        3 -> Message validity
                        """))
                        match setoption:
                            case 1:
                                print("Message centre number")
                            case 2:
                                print("Message sent as")
                            case 3:
                                print("Message validity")
                            case _:
                                print("Invalid option")
                    case 2:
                        print("Common")
                        commonoption = int(input("""
                        Select an option
                        1 -> Delivery reports
                        2 -> Reply via same centre
                        3 -> Character support
                        """))
                        match commonoption:
                            case 1:
                                print("Delivery reports")
                            case 2:
                                print("Reply via same centre")
                            case 3:
                                print("Character support")
                            case _:
                                print("Invalid option")
                    case _:
                        print("Back")
            case 8:
                print("Info service")
            case 9:
                print("Voice mailbox number")
            case 10:
                print("Service command editor")
            case _:
                print("Back")

    case 3:
        print("Chat")
    case 4:
        print("Call register")
        callregisteroption = int(input("Enter your choice: "))
        match callregisteroption:
            case 1:
                print("Missed calls")
            case 2:
                print("Received calls")
            case 3:
                print("Dialed number")
            case 4:
                print("Erase recent call lists")
            case 5:
                print("Show call duration")
                calldurationoption = int(input("Enter your choice: "))
                match calldurationoption:
                    case 1:
                        print("Last call duration")
                    case 2:
                        print("All calls' duration")
                    case 3:
                        print("Received calls' duration")
                    case 4:
                        print("Dialed calls' duration")
                    case 5:
                        print("Clear timers")
                    case _:
                        print("Invalid option")
            case 6:
                print("Show call costs")
                callcostsoption = int(input("Enter your choice: "))
                match callcostsoption:
                    case 1:
                        print("Last call cost")
                    case 2:
                        print("All calls' cost")
                    case 3:
                        print("Clear counter")
                    case _:
                        print("Invalid option")
            case 7:
                print("Call cost settings")
                costsettingsoption = int(input("Enter your choice: "))
                match costsettingsoption:
                    case 1:
                        print("Call cost limit")
                    case 2:
                        print("Show cost in")
                    case _:
                        print("Invalid option")
            case 8:
                print("Prepaid credit")
            case _:
                print("Back")

    case 5:
        print("Tones")
        tonesoption = int(input("Enter your choice: "))
        match tonesoption:
            case 1:
                print("Ringing tone")
            case 2:
                print("Ringing volume")
            case 3:
                print("Incoming call alert")
            case 4:
                print("Composer")
            case 5:
                print("Message alert tone")
            case 6:
                print("Keypad tone")
            case 7:
                print("Warning and games tones")
            case 8:
                print("Vibrating alert")
            case 9:
                print("Screen saver")
            case _:
                print("Back")

    case 6:
        print("Settings")
        settingsoption = int(input("Enter your choice: "))
        match settingsoption:
            case 1:
                print("Call settings")
                callsettingsoption = int(input("Enter your choice: "))
                match callsettingsoption:
                    case 1:
                        print("Automatic redial")
                    case 2:
                        print("Speed dialling")
                    case 3:
                        print("Call waiting options")
                    case 4:
                        print("Own number sending")
                    case 5:
                        print("Phone line in use")
                    case 6:
                        print("Automatic answer")
                    case _:
                        print("Invalid option")
            case 2:
                print("Phone settings")
                phonesettingsoption = int(input("Enter your choice: "))
                match phonesettingsoption:
                    case 1:
                        print("Language")
                    case 2:
                        print("Call info display")
                    case 3:
                        print("Welcome note")
                    case 4:
                        print("Network selection")
                    case 5:
                        print("Lights")
                    case 6:
                        print("Confirm SIM service actions")
                    case _:
                        print("Invalid option")
            case 3:
                print("Security settings")
                securitysettingsoption = int(input("Enter your choice: "))
                match securitysettingsoption:
                    case 1:
                        print("PIN code request")
                    case 2:
                        print("Call barring service")
                    case 3:
                        print("Fixed dialling")
                    case 4:
                        print("Closed user group")
                    case 5:
                        print("Phone security")
                    case 6:
                        print("Change access codes")
                    case _:
                        print("Invalid option")
            case 4:
                print("Restore factory settings")
            case _:
                print("Back")

    case 7:
        print("Call divert")
    case 8:
        print("Games")
    case 9:
        print("Calculator")
    case 10:
        print("Reminders")
    case 11:
        print("Clock")
        clockoption = int(input("Enter your choice: "))
        match clockoption:
            case 1:
                print("Alarm clock")
            case 2:
                print("Clock settings")
            case 3:
                print("Date setting")
            case 4:
                print("Stopwatch")
            case 5:
                print("Countdown timer")
            case 6:
                print("Auto update of date and time")
            case _:
                print("Back")
    case 12:
        print("Profiles")
    case 13:
        print("SIM services")
    case _:
        print("Back")


                         

          