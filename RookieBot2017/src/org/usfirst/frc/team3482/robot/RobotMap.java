package org.usfirst.frc.team3482.robot;

import com.ctre.CANTalon;
import com.ctre.CANTalon.FeedbackDevice;
import com.ctre.CANTalon.TalonControlMode;

import edu.wpi.first.wpilibj.RobotDrive;

public class RobotMap {
	//declare all objects in this class as static so there will only be one instance across all classes
	public static RobotDrive drive;
	//Talons for drive motors
	public static CANTalon frontLeftWheel;
	public static CANTalon frontRightWheel;
	public static CANTalon backLeftWheel;
	public static CANTalon backRightWheel;
	
	//Talon for gear manipulator
	public static CANTalon gearManipulator;
	
	//Talon for climber
	public static CANTalon climber;
	
	public static void init(){ //Iniitalize objects in this method
		//Find the real talon IDs by going to the web dashboard and flashing them
		frontLeftWheel = new CANTalon(8);
		frontRightWheel = new CANTalon(4);
		backLeftWheel = new CANTalon(1);
		backRightWheel = new CANTalon(3);
		
		gearManipulator = new CANTalon(2);

		
		climber = new CANTalon(7);
		
		drive  = new RobotDrive(frontRightWheel, backRightWheel, frontLeftWheel, backLeftWheel);
		
	}
}
