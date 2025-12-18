Cruise Management System - Java Console Application
Project Overview
A comprehensive Cruise Management System developed in Java, implementing a fully functional console-based application for managing cruise ship operations,
passenger bookings, cabin assignments, and shore excursions. The system demonstrates advanced Object-Oriented Programming (OOP) principles and real-world software design patterns.

Technical Stack
Language: Java (Core Java)
Architecture: Object-Oriented Design with Inheritance and Polymorphism
Data Structures: ArrayList for dynamic collections
Design Pattern: Menu-Driven Console Application
IDE Compatibility: Any Java IDE (VS Code, IntelliJ, Eclipse)
Core Features & Functionalities
1. Multi-Entity Data Management
Ships Management: Supports 10 unique cruise ships with customizable names
Cruise Operations: Each ship operates independent one-week cruises
Cabin System: Two types of accommodation - Suites (4-passenger capacity with optional balcony) and Standard Cabins (6-passenger capacity with optional sea view)
Passenger Records: Complete passenger tracking with name, cabin assignment, and excursion bookings
Port Destinations: Multiple port locations for shore excursions
Excursion Booking: Day-scheduled shore excursions with capacity management
2. Cruise Information Display (Use Case 1)
View detailed cruise information by ship selection
Display total passenger count per cruise
List all excursions with real-time availability status
Show "Fully Booked" or available space count for each excursion
3. Excursion Information System (Use Case 2)
Browse excursions by cruise ship
View port destinations and scheduled days
Display alphabetically sorted passenger manifests for each excursion
Real-time booking status updates
4. Passenger Information Lookup (Use Case 3)
View comprehensive passenger profiles
Display cabin number and type (Suite/Standard with amenities)
List cabin mates (passengers sharing the same cabin)
Show all booked excursions for each passenger
Alphabetically sorted passenger lists for easy navigation
5. Excursion Booking System (Use Case 4)
Select passenger for booking
Intelligent filtering: only shows excursions passenger hasn't booked AND aren't full
Real-time availability display with remaining spaces
Booking confirmation with success message
Prevents duplicate bookings and overbooking
6. Cabin Relocation System (Use Case 5)
Display all vacant cabins with type and amenities
Select passenger(s) to relocate
Group Transfer Feature: Automatically moves ALL cabin mates together
Updates all passenger-cabin references automatically
Prevents assigning passengers to occupied cabins
Object-Oriented Programming Concepts Demonstrated
Concept	Implementation
Abstraction	Cabin abstract class with abstract getCabinType() method
Inheritance	Suite and StandardCabin extend Cabin
Polymorphism	getCabinType() overridden differently in Suite vs StandardCabin
Encapsulation	Private fields with public getters/setters in all classes
Composition	Cruise contains Ship, Cabins, Passengers, and Excursions
Association	Bidirectional relationship between Passenger ↔ Cabin, Passenger ↔ Excursion
Class Architecture (8 Classes + 1 Main)
Class	Description	Key Attributes
Ship	Represents a cruise ship	shipName
Port	Represents a port destination	name
Cabin (Abstract)	Base class for cabin types	number, capacity, passengers list
Suite	Premium cabin (extends Cabin)	hasBalcony, 4-person capacity
StandardCabin	Regular cabin (extends Cabin)	hasSeaView, 6-person capacity
Passenger	Passenger entity	name, cabin reference, bookedExcursions list
Excursion	Shore trip entity	port, dayOfWeek, capacity, bookedPassengers list
Cruise	Main cruise entity	ship, passengers, excursions, cabins lists
Task2Mainaa	Application entry point	Menu system, data initialization, all use cases
Advanced Technical Features
Input Validation: All menu selections validated with boundary checking
Exit Options: Every submenu includes safe exit (0 to cancel)
Alphabetical Sorting: Custom bubble sort implementation for passenger lists
Duplicate Prevention: Booking system prevents duplicate passenger entries
Capacity Management: Automatic full/available status tracking
Data Integrity: Bidirectional references maintained (Passenger↔Cabin, Passenger↔Excursion)
Resource Management: Proper scanner resource cleanup on exit
Pre-populated Data: 4 fully configured cruises with passengers, cabins, and excursions for demonstration
Sample Pre-Loaded Data
4 Active Cruises: Ocean Majesty, Sapphire Voyager, Aurora Dream, Neptune's Crown
15 Passengers distributed across cruises
12 Ports: Jeddah, Istanbul, Florida, Karachi, Naples, Dubai, Maldives, LA, Melbourne, Barcelona, Athens, Venice
12 Excursions scheduled on different days (Monday, Wednesday, Friday, etc.)
Multiple Cabin Types: Mix of Suites and Standard Cabins with various amenities
Skills Demonstrated
Java Programming
Object-Oriented Design
Data Structure Management (ArrayList)
Console UI/UX Design
Input Validation & Error Handling
Code Documentation & Comments
Software Architecture Planning
Real-World Business Logic Implementation
Lines of Code: ~720 lines across 9 files
