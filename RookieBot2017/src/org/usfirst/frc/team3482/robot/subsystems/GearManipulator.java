package org.usfirst.frc.team3482.robot.subsystems;

import org.usfirst.frc.team3482.robot.Robot;
import org.usfirst.frc.team3482.robot.RobotMap;

import com.ctre.CANTalon;
import com.ctre.CANTalon.FeedbackDevice;
import com.ctre.CANTalon.TalonControlMode;

import edu.wpi.first.wpilibj.command.Subsystem;



public class GearManipulator extends Subsystem{
	private static CANTalon gearManipulator = RobotMap.gearManipulator;
	
	public static double talonStartPosition;
	
	public GearManipulator(){
		gearManipulator.changeControlMode(TalonControlMode.Position);
		gearManipulator.setFeedbackDevice(FeedbackDevice.CtreMagEncoder_Relative);
		gearManipulator.reverseSensor(true);
		gearManipulator.configNominalOutputVoltage(+0f, -0f);
		gearManipulator.configPeakOutputVoltage(+12f, -12f);
		gearManipulator.setCurrentLimit(30);
		gearManipulator.setAllowableClosedLoopErr(0);
		gearManipulator.setProfile(0);
		gearManipulator.setF(0.0);//0
		gearManipulator.setP(0.15);//0
		gearManipulator.setI(0.0);//0
		gearManipulator.setD(0.0);//0
		talonStartPosition = gearManipulator.getPosition();
	}
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	public void setToGearPosition(){
		gearManipulator.changeControlMode(TalonControlMode.Position);
		gearManipulator.set(talonStartPosition + 1.5);
	}
	public void setToUprightPosition(){
		gearManipulator.changeControlMode(TalonControlMode.Position);
		gearManipulator.set(talonStartPosition + 3);
	}
	public void setToBallPosition(){
		gearManipulator.changeControlMode(TalonControlMode.Position);
		gearManipulator.set(talonStartPosition + 0.1);
	}
	
}
