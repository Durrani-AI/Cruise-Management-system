// this is the main class where the program execution begins
//The code is distributed into to 2 section
//first where data is created for ships cruises cabins passengers excursions and ports
//second is the main menu where user can interact with the data and perform various operations


import java.util.ArrayList;
import java.util.Scanner;

public class Task2Mainaa {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 10 ships with unique names
        Ship ship1 = new Ship("Ocean Majesty");
        Ship ship2 = new Ship("Sapphire Voyager");
        Ship ship3 = new Ship("Aurora Dream");
        Ship ship4 = new Ship("Neptune's Crown");
        Ship ship5 = new Ship("Celestial Horizon");
        Ship ship6 = new Ship("Pacific Empress");
        Ship ship7 = new Ship("Royal Seafarer");
        Ship ship8 = new Ship("Azure Paradise");
        Ship ship9 = new Ship("Wanderlust Explorer");
        Ship ship10 = new Ship("Golden Meridian");

        // ships in ArrayList
        ArrayList<Ship> allShips = new ArrayList<>();
        allShips.add(ship1);
        allShips.add(ship2);
        allShips.add(ship3);
        allShips.add(ship4);
        allShips.add(ship5);
        allShips.add(ship6);
        allShips.add(ship7);
        allShips.add(ship8);
        allShips.add(ship9);
        allShips.add(ship10);

        // cruises for each ship
        ArrayList<Cruise> allCruises = new ArrayList<>();

        // Cruise 1:Mediterranean Star
        Cruise cruise1 = new Cruise(ship1);

        // cabins for cruise 1
        Suite cabin101 = new Suite(101, true); // Suite with balcony
        Suite cabin102 = new Suite(102, false); // Suite without balcony
        StandardCabin cabin201 = new StandardCabin(201, true); // Standard with sea view
        StandardCabin cabin202 = new StandardCabin(202, false); // Standard without sea view
        StandardCabin cabin203 = new StandardCabin(203, true); // Standard with sea view

        cruise1.addCabin(cabin101);
        cruise1.addCabin(cabin102);
        cruise1.addCabin(cabin201);
        cruise1.addCabin(cabin202);
        cruise1.addCabin(cabin203);

        // passengers for cruise 1
        Passenger p1 = new Passenger("Khizer Ahmed");
        Passenger p2 = new Passenger("Ahmed Ali");
        Passenger p3 = new Passenger("James Bond");
        Passenger p4 = new Passenger("Asif Khan");
        Passenger p5 = new Passenger("Mohammad Yusuf");
        Passenger p6 = new Passenger("Sara Khan");

        // Assigning passengers to cabins
        cabin101.addPassenger(p1);
        p1.setCabin(cabin101);

        cabin101.addPassenger(p2);
        p2.setCabin(cabin101);

        cabin201.addPassenger(p3);
        p3.setCabin(cabin201);

        cabin201.addPassenger(p4);
        p4.setCabin(cabin201);

        cabin201.addPassenger(p5);
        p5.setCabin(cabin201);

        cabin202.addPassenger(p6);
        p6.setCabin(cabin202);

        // Add passengers to cruise
        cruise1.addPassenger(p1);
        cruise1.addPassenger(p2);
        cruise1.addPassenger(p3);
        cruise1.addPassenger(p4);
        cruise1.addPassenger(p5);
        cruise1.addPassenger(p6);

        // Creating ports for cruise 1
        Port port1 = new Port("Jeddah");
        Port port2 = new Port("Istanbul");
        Port port3 = new Port("Florida");

        // Creating excursions for cruise 1
        Excursion exc1 = new Excursion(port1, "Monday", 6);
        Excursion exc2 = new Excursion(port2, "Wednesday", 7);
        Excursion exc3 = new Excursion(port3, "Friday", 8);

        cruise1.addExcursion(exc1);
        cruise1.addExcursion(exc2);
        cruise1.addExcursion(exc3);

        // Booking some passengers on excursions
        exc1.bookPassenger(p1);
        p1.bookExcursion(exc1);

        exc1.bookPassenger(p2);
        p2.bookExcursion(exc1);

        exc2.bookPassenger(p3);
        p3.bookExcursion(exc2);

        exc2.bookPassenger(p4);
        p4.bookExcursion(exc2);

        allCruises.add(cruise1);

        // Cruise 2:Sapphire Voyager
        Cruise cruise2 = new Cruise(ship2);

        // cabins for cruise 2
        Suite cabin301 = new Suite(301, true); // Suite with balcony
        StandardCabin cabin401 = new StandardCabin(401, true); // Standard with sea view
        StandardCabin cabin402 = new StandardCabin(402, false); // Standard without sea view

        cruise2.addCabin(cabin301);
        cruise2.addCabin(cabin401);
        cruise2.addCabin(cabin402);

        // passengers for cruise 2
        Passenger p7 = new Passenger("Samual tray");
        Passenger p8 = new Passenger("Albert cond");
        Passenger p9 = new Passenger("james vowes");

        // Assigning passengers to cabins
        cabin301.addPassenger(p7);
        p7.setCabin(cabin301);

        cabin401.addPassenger(p8);
        p8.setCabin(cabin401);

        cabin401.addPassenger(p9);
        p9.setCabin(cabin401);

        // Add passengers to cruise
        cruise2.addPassenger(p7);
        cruise2.addPassenger(p8);
        cruise2.addPassenger(p9);

        // Creating ports for cruise 2
        Port port4 = new Port("Karachi");
        Port port5 = new Port("Naples");
        Port port6 = new Port("Dubai");

        // Creating excursions for cruise 2
        Excursion exc4 = new Excursion(port4, "Tuesday", 4);
        Excursion exc5 = new Excursion(port5, "Thursday", 3);
        Excursion exc6 = new Excursion(port6, "Saturday", 5);

        cruise2.addExcursion(exc4);
        cruise2.addExcursion(exc5);
        cruise2.addExcursion(exc6);

        allCruises.add(cruise2);

        // Cruise 3: Azure Dream
        Cruise cruise3 = new Cruise(ship3);

        // cabins for cruise 3
        Suite cabin501 = new Suite(501, false); // Suite without balcony
        StandardCabin cabin601 = new StandardCabin(601, true); // Standard with sea view

        cruise3.addCabin(cabin501);
        cruise3.addCabin(cabin601);

        // passengers for cruise 3
        Passenger p10 = new Passenger("Daniel jack");

        // Assigning passengers to cabins
        cabin501.addPassenger(p10);
        p10.setCabin(cabin501);

        // Add passengers to cruise
        cruise3.addPassenger(p10);

        // Creating ports for cruise 3
        Port port7 = new Port("Maldives");
        Port port8 = new Port("LA");
        Port port9 = new Port("Melbourne");

        // Creating excursions for cruise 3
        Excursion exc7 = new Excursion(port7, "Monday", 6);
        Excursion exc8 = new Excursion(port8, "Wednesday", 4);
        Excursion exc9 = new Excursion(port9, "Friday", 5);

        cruise3.addExcursion(exc7);
        cruise3.addExcursion(exc8);
        cruise3.addExcursion(exc9);

        allCruises.add(cruise3);

        // Cruise 4: Neptune's Crown
        Cruise cruise4 = new Cruise(ship4);

        // cabins for cruise 4
        Suite cabin701 = new Suite(701, true); // Suite with balcony
        Suite cabin702 = new Suite(702, false); // Suite without balcony
        StandardCabin cabin801 = new StandardCabin(801, true); // Standard with sea view
        StandardCabin cabin802 = new StandardCabin(802, false); // Standard without sea view

        cruise4.addCabin(cabin701);
        cruise4.addCabin(cabin702);
        cruise4.addCabin(cabin801);
        cruise4.addCabin(cabin802);

        // passengers for cruise 4
        Passenger p11 = new Passenger("geralda smith");
        Passenger p12 = new Passenger("Emmy Wilson");
        Passenger p13 = new Passenger("Liam John");
        Passenger p14 = new Passenger("Daniel Riccardo");
        Passenger p15 = new Passenger("Noah Garcia");

        // Assigning passengers to cabins
        cabin701.addPassenger(p11);
        p11.setCabin(cabin701);

        cabin701.addPassenger(p12);
        p12.setCabin(cabin701);

        cabin801.addPassenger(p13);
        p13.setCabin(cabin801);

        cabin801.addPassenger(p14);
        p14.setCabin(cabin801);

        cabin801.addPassenger(p15);
        p15.setCabin(cabin801);

        // Add passengers to cruise
        cruise4.addPassenger(p11);
        cruise4.addPassenger(p12);
        cruise4.addPassenger(p13);
        cruise4.addPassenger(p14);
        cruise4.addPassenger(p15);

        // Creating ports for cruise 4
        Port port10 = new Port("Barcelona");
        Port port11 = new Port("Athens");
        Port port12 = new Port("Venice");

        // Creating excursions for cruise 4
        Excursion exc10 = new Excursion(port10, "Monday", 5);
        Excursion exc11 = new Excursion(port11, "Wednesday", 6);
        Excursion exc12 = new Excursion(port12, "Friday", 4);

        cruise4.addExcursion(exc10);
        cruise4.addExcursion(exc11);
        cruise4.addExcursion(exc12);

        allCruises.add(cruise4);

        ////////////////////////////////////////////////////////////////////////////////////////Main menu//////////////////////////////////////////////////////////////
        boolean running = true;
        // boolean function used to run the menu until user decides to exit.

        while (running) {

            System.out.println("\n========== Cruise Management System ==========");
            System.out.println("1: Cruise Information");
            System.out.println("2: Excursion Information");
            System.out.println("3: Passenger Information");
            System.out.println("4: Book Excursion");
            System.out.println("5: Change Passenger Cabin");
            System.out.println("0: Exit");
            System.out.println("================================================");
            System.out.println("Enter: ");

            int choice = scanner.nextInt();

            ////////////////////////////////////////////////////////////////////////////////////////1st Use case: Display Cruise Information//////////////////////////////////////////////////////////////

            if (choice == 1) {

                System.out.println("\nSelect a cruise ship:");
                for (int i = 0; i < allCruises.size(); i++) {
                    System.out.println((i + 1) + ": " + allCruises.get(i).getShip().getShipName());
                }
                System.out.println("0: Exit");
                System.out.println("Enter: ");
                int shipChoice = scanner.nextInt();

                if (shipChoice == 0) {
                    System.out.println("Exited Successfully.");
                    // Validate that user's choice is within valid range
                } else if (shipChoice > 0 && shipChoice <= allCruises.size()) {
                    // Showing the selected cruise
                    Cruise selectedCruise = allCruises.get(shipChoice - 1);
                    // Showing cruise information
                    System.out.println("\n=== Cruise Information ===");
                    System.out.println("Ship: " + selectedCruise.getShip().getShipName());
                    System.out.println("Total Passengers: " + selectedCruise.getTotalPassengers());
                    System.out.println("\nExcursions:");

                    // Showing all excursions for this cruise
                    ArrayList<Excursion> excursions = selectedCruise.getExcursions();
                    // Loop through each excursion
                    for (int i = 0; i < excursions.size(); i++) {
                        Excursion exc = excursions.get(i);
                        System.out.print("  - " + exc.getPortName() + " (" + exc.getDay() + "): ");

                        // Check if excursion is fully booked
                        if (exc.isFull()) {
                            System.out.println("Fully Booked!!");
                        } else {
                            System.out.println(exc.getAvailableSpaces() + " Available Space");
                        }
                    }
                } else {
                    System.out.println("invalid choice!");
                }
            }

            ////////////////////////////////////////////////////////////////////////////////////////2nd Usecase: Display Excursion Information//////////////////////////////////////////////////////////////
            else if (choice == 2) {

                System.out.println("\nSelect a cruise ship:");
                // Loop through all cruises
                for (int i = 0; i < allCruises.size(); i++) {
                    System.out.println((i + 1) + ": " + allCruises.get(i).getShip().getShipName());
                }
                System.out.println("Enter: ");
                int shipChoice = scanner.nextInt();

                // Validate cruise selection
                if (shipChoice > 0 && shipChoice <= allCruises.size()) {
                    // Showing selected cruise
                    Cruise selectedCruise = allCruises.get(shipChoice - 1);
                    // Selecting excursion to view information
                    System.out.println("\nSelect an excursion:");
                    ArrayList<Excursion> excursions = selectedCruise.getExcursions();
                    // Loop through excursions and display ports
                    for (int i = 0; i < excursions.size(); i++) {
                        System.out.println((i + 1) + ": " + excursions.get(i).getPortName());
                    }
                    System.out.println("0: Exit");
                    System.out.println("Enter: ");
                    int excChoice = scanner.nextInt();

                    // Check if user wants to exit
                    if (excChoice == 0) {
                        System.out.println("Exited Successfully.");
                        // Validate excursion selection
                    } else if (excChoice > 0 && excChoice <= excursions.size()) {
                        // Showing selected excursion
                        Excursion selectedExc = excursions.get(excChoice - 1);
                        // Showing excursion information
                        System.out.println("\n=== Excursion Information ===");
                        System.out.println("Port: " + selectedExc.getPortName());
                        System.out.println("Day: " + selectedExc.getDay());
                        System.out.println("\nPassengers booked on this excursion:");

                        // Showing all passengers booked on this excursion
                        ArrayList<Passenger> bookedPassengers = selectedExc.getBookedPassengers();

                        // Sort passengers alphabetically for better readability
                        sortPassengersByName(bookedPassengers);

                        // Check if any passengers are booked
                        if (bookedPassengers.size() == 0) {
                            System.out.println("  No passengers booked yet");
                        } else {
                            for (int i = 0; i < bookedPassengers.size(); i++) {
                                System.out.println(" - " + bookedPassengers.get(i).getPassengerName());
                            }
                        }
                    } else {
                        System.out.println("invalid choice!");
                    }
                }
            }

            ////////////////////////////////////////////////////////////////////////////////////////3rd Usecase: Display Passenger Information//////////////////////////////////////////////////////////////
            else if (choice == 3) {

                System.out.println("\nSelect a cruise ship:");
                for (int i = 0; i < allCruises.size(); i++) {
                    System.out.println((i + 1) + ": " + allCruises.get(i).getShip().getShipName());
                }
                System.out.println("0 :Exit");
                System.out.println("Enter: ");
                int shipChoice = scanner.nextInt();

                // Check if user wants to exit
                if (shipChoice == 0) {
                    System.out.println("Exited Successfully.");
                    // Validate cruise selection
                } else if (shipChoice > 0 && shipChoice <= allCruises.size()) {
                    // Showing selected cruise
                    Cruise selectedCruise = allCruises.get(shipChoice - 1);

                    // Showing all passengers from selected cruise
                    ArrayList<Passenger> passengers = selectedCruise.getPassengers();
                    // Sort passengers alphabetically for easier searching
                    sortPassengersByName(passengers);
                    // Selecting passenger to view information
                    System.out.println("\nSelect a passenger:");
                    for (int i = 0; i < passengers.size(); i++) {
                        System.out.println((i + 1) + ": " + passengers.get(i).getPassengerName());
                    }
                    System.out.println("0 :Exit");
                    System.out.println("Enter: ");
                    int passChoice = scanner.nextInt();

                    // Check if user wants to exit
                    if (passChoice == 0) {
                        System.out.println("Exited Successfully.");
                        // Validate passenger selection
                    } else if (passChoice > 0 && passChoice <= passengers.size()) {
                        // Showing selected passenger
                        Passenger selectedPass = passengers.get(passChoice - 1);
                        // Showing passenger information
                        System.out.println("\n=== Passenger Information ===");
                        System.out.println("Name: " + selectedPass.getPassengerName());

                        // Showing passenger's cabin information
                        Cabin passCabin = selectedPass.getCabin();
                        System.out.println(
                                "Cabin: " + passCabin.getCabinNumber() + " (" + passCabin.getCabinType() + ")");

                        // Showing all passengers in the same cabin
                        ArrayList<Passenger> cabinMates = passCabin.getPassengers();
                        // Sort cabin mates alphabetically
                        sortPassengersByName(cabinMates);
                        System.out.println("\nCabin mates:");

                        // Flag to track if passenger has cabin mates
                        boolean hasCabinMates = false;
                        // Loop through cabin passengers
                        for (int i = 0; i < cabinMates.size(); i++) {
                            // Skip the selected passenger
                            if (!cabinMates.get(i).equals(selectedPass)) {
                                if (!hasCabinMates) {
                                    hasCabinMates = true;
                                }
                                System.out.println("  - " + cabinMates.get(i).getPassengerName());
                            }
                        }

                        if (!hasCabinMates) {
                            System.out.println("  Alone");
                        }

                        // Showing passenger's booked excursions
                        ArrayList<Excursion> passExc = selectedPass.getBookedExcursions();
                        System.out.println("\nBooked excursions:");

                        // Check if passenger has any excursions booked
                        if (passExc.size() == 0) {
                            System.out.println("  No excursions booked");
                        } else {
                            for (int i = 0; i < passExc.size(); i++) {
                                System.out.println(
                                        "  - " + passExc.get(i).getPortName() + " (" + passExc.get(i).getDay() + ")");
                            }
                        }
                    } else {
                        System.out.println("Invalid choice!");
                    }
                }
            }

            ////////////////////////////////////////////////////////////////////////////////////////4th Usecase: Book Excursion//////////////////////////////////////////////////////////////
            else if (choice == 4) {

                System.out.println("\nSelect a cruise ship:");
                for (int i = 0; i < allCruises.size(); i++) {
                    System.out.println((i + 1) + ": " + allCruises.get(i).getShip().getShipName());
                }
                System.out.println("0: Exit");
                System.out.println("Enter: ");
                int shipChoice = scanner.nextInt();

                // Check if user wants to exit
                if (shipChoice == 0) {
                    System.out.println("Exited Successfully.");
                    // Validate cruise selection
                } else if (shipChoice > 0 && shipChoice <= allCruises.size()) {
                    // Showing selected cruise
                    Cruise selectedCruise = allCruises.get(shipChoice - 1);

                    // Showing all passengers from selected cruise
                    ArrayList<Passenger> passengers = selectedCruise.getPassengers();
                    // Sort passengers alphabetically
                    sortPassengersByName(passengers);
                    // Selecting passenger to book excursion for
                    System.out.println("\nSelect a passenger:");
                    for (int i = 0; i < passengers.size(); i++) {
                        System.out.println((i + 1) + ": " + passengers.get(i).getPassengerName());
                    }
                    System.out.println("0: Exit");
                    System.out.println("Enter choice: ");
                    int passChoice = scanner.nextInt();

                    // Check if user wants to exit
                    if (passChoice == 0) {
                        System.out.println("Exited Successfully.");
                        // Validate passenger selection
                    } else if (passChoice > 0 && passChoice <= passengers.size()) {
                        // Showing selected passenger
                        Passenger selectedPass = passengers.get(passChoice - 1);

                        // Create list to store available excursions
                        ArrayList<Excursion> availableExc = new ArrayList<>();
                        // Showing all excursions from the cruise
                        ArrayList<Excursion> allExc = selectedCruise.getExcursions();

                        // Filter excursions that passenger hasn't booked and aren't full
                        for (int i = 0; i < allExc.size(); i++) {
                            Excursion exc = allExc.get(i);
                            // Check if passenger hasn't booked this excursion and it's not full
                            if (!selectedPass.hasBookedExcursion(exc) && !exc.isFull()) {
                                availableExc.add(exc);
                            }
                        }

                        // Check if there are any available excursions
                        if (availableExc.size() == 0) {
                            System.out.println("\nNo excursions available for this passenger!");
                        } else {
                            System.out.println("\nExcursions available:");
                            for (int i = 0; i < availableExc.size(); i++) {
                                Excursion exc = availableExc.get(i);
                                System.out.println((i + 1) + ": " + exc.getPortName() + " (" + exc.getDay() + ") - "
                                        + exc.getAvailableSpaces() + " Available Space");
                            }
                            System.out.println("0: Cancel");
                            System.out.println("Enter: ");
                            int excChoice = scanner.nextInt();

                            // Validate excursion selection
                            if (excChoice > 0 && excChoice <= availableExc.size()) {
                                // Showing selected excursion
                                Excursion selectedExc = availableExc.get(excChoice - 1);
                                // Book passenger on the excursion
                                selectedExc.bookPassenger(selectedPass);
                                // Add excursion to passenger's booked list
                                selectedPass.bookExcursion(selectedExc);
                                System.out.println("\nBooking confirmed! " + selectedPass.getPassengerName()
                                        + " is now booked on " + selectedExc.getPortName() + " excursion.");
                            } else if (excChoice == 0) {
                                // User cancelled the booking
                                System.out.println("Booking cancelled.");
                            } else {
                                // Invalid excursion choice
                                System.out.println("Invalid choice!");
                            }
                        }
                    } else {
                        // Invalid passenger choice
                        System.out.println("Invalid choice!");
                    }
                }
            }

            ////////////////////////////////////////////////////////////////////////////////////////5th Usecase: Change Passenger Cabin//////////////////////////////////////////////////////////////
            else if (choice == 5) {

                System.out.println("\nSelect a cruise ship:");
                for (int i = 0; i < allCruises.size(); i++) {
                    System.out.println((i + 1) + ": " + allCruises.get(i).getShip().getShipName());
                }
                System.out.println("0: Exit");
                System.out.println("Enter: ");
                int shipChoice = scanner.nextInt();

                // Check if user wants to exit
                if (shipChoice == 0) {
                    System.out.println("Exited Successfully.");
                    // Validate cruise selection
                } else if (shipChoice > 0 && shipChoice <= allCruises.size()) {
                    // Showing selected cruise
                    Cruise selectedCruise = allCruises.get(shipChoice - 1);

                    // Showing all empty cabins from the cruise
                    ArrayList<Cabin> vacantCabins = selectedCruise.getVacantCabins();

                    // Check if there are any empty cabins available
                    if (vacantCabins.size() == 0) {
                        System.out.println("\nNo empty cabins available!");
                    } else {
                        System.out.println("\nEmpty cabins:");
                        for (int i = 0; i < vacantCabins.size(); i++) {
                            Cabin cab = vacantCabins.get(i);
                            System.out.println(
                                    (i + 1) + ": Cabin " + cab.getCabinNumber() + " (" + cab.getCabinType() + ")");
                        }

                        // Ask user if they want to proceed with cabin change
                        System.out.println("\nDo you want to continue?");
                        System.out.println("1: Yes");
                        System.out.println("0: Cancel");
                        System.out.println("Enter: ");
                        int continueChoice = scanner.nextInt();

                        // Check if user wants to continue
                        if (continueChoice == 1) {

                            // Showing all passengers from selected cruise
                            ArrayList<Passenger> passengers = selectedCruise.getPassengers();
                            // Sort passengers alphabetically
                            sortPassengersByName(passengers);
                            // Selecting passenger to move
                            System.out.println("\nSelect a passenger to move:");
                            for (int i = 0; i < passengers.size(); i++) {
                                System.out.println((i + 1) + ": " + passengers.get(i).getPassengerName());
                            }
                            System.out.println("0: Exit");
                            System.out.println("Enter: ");
                            int passChoice = scanner.nextInt();

                            // Check if user wants to exit
                            if (passChoice == 0) {
                                System.out.println("Exited Successfully.");
                                // Validate passenger selection
                            } else if (passChoice > 0 && passChoice <= passengers.size()) {
                                // Showing selected passenger
                                Passenger selectedPass = passengers.get(passChoice - 1);
                                // Selecting new cabin to move to
                                System.out.println("\nSelect a vacant cabin:");
                                for (int i = 0; i < vacantCabins.size(); i++) {
                                    Cabin cab = vacantCabins.get(i);
                                    System.out.println((i + 1) + ": Cabin " + cab.getCabinNumber() + " ("
                                            + cab.getCabinType() + ")");
                                }
                                System.out.println("0: Exit");
                                System.out.println("Enter: ");
                                int cabinChoice = scanner.nextInt();

                                // Check if user wants to exit
                                if (cabinChoice == 0) {
                                    System.out.println("Exited Successfully.");
                                    // Validate cabin selection
                                } else if (cabinChoice > 0 && cabinChoice <= vacantCabins.size()) {
                                    // Showing the new cabin to move to
                                    Cabin newCabin = vacantCabins.get(cabinChoice - 1);
                                    // Showing passenger's current cabin
                                    Cabin oldCabin = selectedPass.getCabin();

                                    // Create temporary list to store all cabin mates including selected passenger
                                    ArrayList<Passenger> cabinMates = new ArrayList<>();
                                    // Copy all passengers from old cabin to temporary list
                                    for (int i = 0; i < oldCabin.getPassengers().size(); i++) {
                                        cabinMates.add(oldCabin.getPassengers().get(i));
                                    }

                                    // Move all passengers from old cabin to new cabin
                                    for (int i = 0; i < cabinMates.size(); i++) {
                                        Passenger p = cabinMates.get(i);
                                        // Remove passenger from old cabin
                                        oldCabin.removePassenger(p);
                                        // Add passenger to new cabin
                                        newCabin.addPassenger(p);
                                        // Update passenger's cabin reference
                                        p.setCabin(newCabin);
                                    }

                                    System.out.println("\nCabin change successful!");
                                    // Show how many passengers were moved
                                    System.out.println("Moved " + cabinMates.size() + " passenger(s) from Cabin "
                                            + oldCabin.getCabinNumber() + " to Cabin " + newCabin.getCabinNumber());
                                } else {
                                    // Invalid cabin choice
                                    System.out.println("Invalid choice!");
                                }
                            } else {
                                // Invalid passenger choice
                                System.out.println("Invalid choice!");
                            }
                        } else {
                            // User cancelled the operation
                            System.out.println("Exited Successfully.");
                        }
                    }
                }
            }

            ////////////////////////////////////////////////////////////////////////////////////////Exit//////////////////////////////////////////////////////////////
            else if (choice == 0) {
                running = false;
                System.out.println("\nThanks and take care");
            }

            else {
                System.out.println("Please try again.");
            }
        }

        scanner.close();
    }

    // Using Helper method to sort passengers alphabetically by name using bubble
    // sort
    private static void sortPassengersByName(ArrayList<Passenger> passengers) {
        for (int i = 0; i < passengers.size() - 1; i++) {
            for (int j = 0; j < passengers.size() - 1 - i; j++) {
                if (passengers.get(j).getPassengerName().compareTo(passengers.get(j + 1).getPassengerName()) > 0) {
                    Passenger temp = passengers.get(j);
                    passengers.set(j, passengers.get(j + 1));
                    passengers.set(j + 1, temp);
                }
            }
        }
    }
}
