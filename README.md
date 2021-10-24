# Jets Project

# Description

This is a program that mimics an application where users can perform a number of actions on a fleet of jets. Each individual Jet is an object of abstract class Jet and is stored in a separate class called AirField which itself is its own class. The application primarily calls on methods from the AirField class, where each Jet object stored in the ArrayList of Jets inside of the AirField class will then perform the method called. 

Inside of the Jets application itself, the app runs within a while loop from launch and the user will decide when they want to exit the application. Before the user is offered menu options, the program reads a .txt file populated with information required to create a new Jet object. The program automatically populates the airfield using information contained within that .txt file. 

The app functions from a menu offering the user numerical choices where the scanner reads the user input at which time a switch statement is called and the corresponding method will run. If a user enters a menu option that is not available, they will receive an error method and be brought back to the menu.

A majority of the menu options and corresponding functions result in a String being printed to the screen mimicing the real world action the method invokes. There are two menu options where a user can create a jet and add it to the fleet and remove a jet from the fleet, causing the size of the fleet to shrink or grow depending on their decisions. 

# Technologies Used
Eclipse, Git, Terminal

# What I learned
This program was the most in depth object oriented programming I have completed to date. The concept of a class to run the app and then a separate class where most methods are run was foreign at the start and a complex concept to wrap my head around. The first 10% of this program took 90% of my total time dedicated, but once the concept clicked, the last 90% of the program flowed freely.

Utilizing UML diagrams helped tremendously with designing the program as a whole, and because I used those, there was never any trouble understanding where each class lived, what extended what, or what inhereted/was an instance of what. Becoming more familiar with that concept will certainly be helpful as programs become more complex over time.

Additionally, the BufferedReader reading input file was a new concept learned this week. I also used more methods away from the main class in this program than I ever had previously.

