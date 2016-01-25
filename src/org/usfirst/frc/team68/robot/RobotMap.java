package org.usfirst.frc.team68.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // DriveTrain Port Mapping Constants
    public static int driveLeftFront = 1;		// CAN bus port 1
    public static int driveRightFront = 2;		// CAN bus port 2
    public static int driveLeftRear = 3;		// CAN bus port 3
    public static int driveRightRear = 4;		// CAN bus port 4
    
    // Joystick Port Mapping Constants
    public static int leftJoystick = 0;			// USB port 0
    public static int rightJoystick = 1;		// USB port 1
    public static int xBoxController = 2;		// USB port 2
    
    public static int joystickYAxis = 1;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
}
