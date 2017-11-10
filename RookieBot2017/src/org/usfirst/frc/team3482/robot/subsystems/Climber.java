package org.usfirst.frc.team3482.robot.subsystems;

import org.usfirst.frc.team3482.robot.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Climber extends Subsystem{
	private static double climberSpeed = 1;
	private static CANTalon talon = RobotMap.climber;
	
	public static void start(){
		talon.set(climberSpeed);
	}
	public static void stop(){
		talon.set(0);
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
}
