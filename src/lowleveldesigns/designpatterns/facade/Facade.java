package lowleveldesigns.designpatterns.facade;

public class Facade {
}

/**
 * A facade simply acts as a point of entry into your subsystem
 * Wrapper class that encapsulates a subsystem in order to hide the subsystem's complexity
 *
 * While the facade design pattern uses a number of different design principles, it purpose is to provide ease of access to a complex subsystem. This is done by encapsulating the subsystem classes into a Facade class, and then hiding
 * them from the client classes so that the clients do not know about the details of the subsystem.
 *
 * The Facade design pattern:
 *    Is a means to hide the complexity of a subsystem by encapsulating it behind a unifying wrapper
 *    called a facade class
 *
 *    Removes the need for client classes to manage a subsystem on their own, resulting in less coupling between the
 *    subsystem and client classes
 *
 *    Handles instantiation and redirection of tasks to the appropriate class within the subsystem
 *
 *    provides client classes with a simplified interface for the subsystem
 *
 *    Acts simply as a point of entry to a subsystem and does not add more functionality to the subsystem
 */