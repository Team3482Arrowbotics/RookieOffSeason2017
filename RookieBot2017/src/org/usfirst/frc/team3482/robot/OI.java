package org.usfirst.frc.team3482.robot;

import org.usfirst.frc.team3482.robot.commands.Climb;
import org.usfirst.frc.team3482.robot.commands.DropBalls;
import org.usfirst.frc.team3482.robot.commands.RotateGear;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

//testing github, ignore this

public class OI {
	public static Joystick controller;
	public static JoystickButton gearButton;
	public static JoystickButton climberButton;
	public static JoystickButton dropBallButton;
	public static void init(){
		controller = new Joystick(0);
		
		gearButton = new JoystickButton(controller, 1); //button 1 is A
		gearButton.whenPressed(new RotateGear());
		
		dropBallButton = new JoystickButton(controller, 2); //button 2 is B
		dropBallButton.whileHeld(new DropBalls());
		
		climberButton = new JoystickButton(controller, 5);
		climberButton.whileHeld(new Climb());
	}
}
