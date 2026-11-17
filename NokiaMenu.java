import java.util.Scanner;

public class NokiaMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n1. Phone book\n2. Messages\n3. Chat\n4. Call register\n5. Tones\n6. Settings\n7. Call divert\n8. Music\n9. Games\n10. Calculator\n11. Reminders\n12. Clock\n13. Profiles\n14. Services\n15. SIM services");
        int choice = input.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println("\n1. Search\n2. Service Nos.\n3. Add name\n4. Erase\n5. Edit\n6. Copy\n7. Assign tone\n8. Send b'card\n9. Options\n10. Speed dials\n11. Voice tags");
                choice = input.nextInt();
                switch (choice) {
                    case 1 -> System.out.println("Search selected");
                    case 2 -> System.out.println("Service Nos. selected");
                    case 3 -> System.out.println("Add name selected");
                    case 4 -> System.out.println("Erase selected");
                    case 5 -> System.out.println("Edit selected");
                    case 6 -> System.out.println("Copy selected");
                    case 7 -> System.out.println("Assign tone selected");
                    case 8 -> System.out.println("Send b'card selected");
                    case 9 -> {
                        System.out.println("\n1. Memory in use\n2. Type of view\n3. Memory status");
                        choice = input.nextInt();
                        switch (choice) {
                            case 1 -> System.out.println("Memory in use selected");
                            case 2 -> System.out.println("Type of view selected");
                            case 3 -> System.out.println("Memory status selected");
                        }
                    }
                    case 10 -> System.out.println("Speed dials selected");
                    case 11 -> System.out.println("Voice tags selected");
                }
            }
            case 2 -> {
                System.out.println("\n1. Write messages\n2. Inbox\n3. Outbox\n4. Picture messages\n5. Templates\n6. Smileys\n7. Message settings\n8. Info service\n9. Voice mailbox number\n10. Service command editor");
                choice = input.nextInt();
                switch (choice) {
                    case 1 -> System.out.println("Write messages selected");
                    case 2 -> System.out.println("Inbox selected");
                    case 3 -> System.out.println("Outbox selected");
                    case 4 -> System.out.println("Picture messages selected");
                    case 5 -> System.out.println("Templates selected");
                    case 6 -> System.out.println("Smileys selected");
                    case 7 -> {
                        System.out.println("\n1. Set 1\n2. Common");
                        choice = input.nextInt();
                        switch (choice) {
                            case 1 -> {
                                System.out.println("\n1. Message centre number\n2. Messages sent as\n3. Message validity");
                                choice = input.nextInt();
                                switch (choice) {
                                    case 1 -> System.out.println("Message centre number selected");
                                    case 2 -> System.out.println("Messages sent as selected");
                                    case 3 -> System.out.println("Message validity selected");
                                }
                            }
                            case 2 -> {
                                System.out.println("\n1. Delivery reports\n2. Reply via same centre\n3. Character support");
                                choice = input.nextInt();
                                switch (choice) {
                                    case 1 -> System.out.println("Delivery reports selected");
                                    case 2 -> System.out.println("Reply via same centre selected");
                                    case 3 -> System.out.println("Character support selected");
                                }
                            }
                        }
                    }
                    case 8 -> System.out.println("Info service selected");
                    case 9 -> System.out.println("Voice mailbox number selected");
                    case 10 -> System.out.println("Service command editor selected");
                }
            }
            case 3 -> System.out.println("Chat selected");
            case 4 -> {
                System.out.println("\n1. Missed calls\n2. Received calls\n3. Dialled numbers\n4. Erase recent call lists\n5. Show call duration\n6. Show call costs\n7. Call cost settings\n8. Prepaid credit");
                choice = input.nextInt();
                switch (choice) {
                    case 1 -> System.out.println("Missed calls selected");
                    case 2 -> System.out.println("Received calls selected");
                    case 3 -> System.out.println("Dialled numbers selected");
                    case 4 -> System.out.println("Erase recent call lists selected");
                    case 5 -> {
                        System.out.println("\n1. Last call duration\n2. All calls' duration\n3. Received calls' duration\n4. Dialled calls' duration\n5. Clear timers");
                        choice = input.nextInt();
                        switch (choice) {
                            case 1 -> System.out.println("Last call duration selected");
                            case 2 -> System.out.println("All calls' duration selected");
                            case 3 -> System.out.println("Received calls' duration selected");
                            case 4 -> System.out.println("Dialled calls' duration selected");
                            case 5 -> System.out.println("Clear timers selected");
                        }
                    }
                    case 6 -> {
                        System.out.println("\n1. Last call cost\n2. All calls' cost\n3. Clear counters");
                        choice = input.nextInt();
                        switch (choice) {
                            case 1 -> System.out.println("Last call cost selected");
                            case 2 -> System.out.println("All calls' cost selected");
                            case 3 -> System.out.println("Clear counters selected");
                        }
                    }
                    case 7 -> {
                        System.out.println("\n1. Call cost limit\n2. Show costs in");
                        choice = input.nextInt();
                        switch (choice) {
                            case 1 -> System.out.println("Call cost limit selected");
                            case 2 -> System.out.println("Show costs in selected");
                        }
                    }
                    case 8 -> System.out.println("Prepaid credit selected");
                }
            }
            case 5 -> {
                System.out.println("\n1. Ringing tone\n2. Ringing volume\n3. Incoming call alert\n4. Message alert tone\n5. Keypad tones\n6. Warning tones\n7. Vibrating alert\n8. Screen saver");
                choice = input.nextInt();
                switch (choice) {
                    case 1 -> System.out.println("Ringing tone selected");
                    case 2 -> System.out.println("Ringing volume selected");
                    case 3 -> System.out.println("Incoming call alert selected");
                    case 4 -> System.out.println("Message alert tone selected");
                    case 5 -> System.out.println("Keypad tones selected");
                    case 6 -> System.out.println("Warning tones selected");
                    case 7 -> System.out.println("Vibrating alert selected");
                    case 8 -> System.out.println("Screen saver selected");
                }
            }
            case 6 -> {
                System.out.println("\n1. Call settings\n2. Phone settings\n3. Security settings\n4. Restore factory settings");
                choice = input.nextInt();
                switch (choice) {
                    case 1 -> {
                        System.out.println("\n1. Automatic redial\n2. Speed dialling\n3. Call waiting options\n4. Own number sending\n5. Phone line in use\n6. Automatic answer");
                        choice = input.nextInt();
                        switch (choice) {
                            case 1 -> System.out.println("Automatic redial selected");
                            case 2 -> System.out.println("Speed dialling selected");
                            case 3 -> System.out.println("Call waiting options selected");
                            case 4 -> System.out.println("Own number sending selected");
                            case 5 -> System.out.println("Phone line in use selected");
                            case 6 -> System.out.println("Automatic answer selected");
                        }
                    }
                    case 2 -> {
                        System.out.println("\n1. Language\n2. Cell info display\n3. Welcome note\n4. Network selection\n5. Confirm SIM service actions");
                        choice = input.nextInt();
                        switch (choice) {
                            case 1 -> System.out.println("Language selected");
                            case 2 -> System.out.println("Cell info display selected");
                            case 3 -> System.out.println("Welcome note selected");
                            case 4 -> System.out.println("Network selection selected");
                            case 5 -> System.out.println("Confirm SIM service actions selected");
                        }
                    }
                    case 3 -> {
                        System.out.println("\n1. PIN code request\n2. Call barring service\n3. Fixed dialling\n4. Closed user group\n5. Security level\n6. Change access codes");
                        choice = input.nextInt();
                        switch (choice) {
                            case 1 -> System.out.println("PIN code request selected");
                            case 2 -> System.out.println("Call barring service selected");
                            case 3 -> System.out.println("Fixed dialling selected");
                            case 4 -> System.out.println("Closed user group selected");
                            case 5 -> System.out.println("Security level selected");
                            case 6 -> System.out.println("Change access codes selected");
                        }
                    }
                    case 4 -> System.out.println("Restore factory settings selected");
                }
            }
            case 7 -> System.out.println("Call divert selected");
            case 8 -> {
                System.out.println("\n1. Music player\n2. Radio\n3. Recorder\n4. Track list");
                choice = input.nextInt();
                switch (choice) {
                    case 1 -> System.out.println("Music player selected");
                    case 2 -> System.out.println("Radio selected");
                    case 3 -> System.out.println("Recorder selected");
                    case 4 -> System.out.println("Track list selected");
                }
            }
            case 9 -> System.out.println("Games selected");
            case 10 -> System.out.println("Calculator selected");
            case 11 -> System.out.println("Reminders selected");
            case 12 -> {
                System.out.println("\n1. Alarm clock\n2. Clock settings\n3. Date setting\n4. Stopwatch\n5. Countdown timer\n6. Auto update of date and time");
                choice = input.nextInt();
                switch (choice) {
                    case 1 -> System.out.println("Alarm clock selected");
                    case 2 -> System.out.println("Clock settings selected");
                    case 3 -> System.out.println("Date setting selected");
                    case 4 -> System.out.println("Stopwatch selected");
                    case 5 -> System.out.println("Countdown timer selected");
                    case 6 -> System.out.println("Auto update of date and time selected");
                }
            }
            case 13 -> System.out.println("Profiles selected");
            case 14 -> System.out.println("Services selected");
            case 15 -> System.out.println("SIM services selected");
        }
    }
}
