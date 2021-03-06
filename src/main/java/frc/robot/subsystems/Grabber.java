/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;


import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class Grabber extends Subsystem {
 // Put methods for controlling this subsystem
  // here. Call these from Commands.
  DoubleSolenoid pitchSolenoid;

  public Grabber () {
    pitchSolenoid = new DoubleSolenoid(RobotMap.GRABBER_PITCH_SOLENOID_DEPLOY, RobotMap.GRABBER_PITCH_SOLENOID_RETRACT);
  }
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
  public void Close(){
    pitchSolenoid.set(DoubleSolenoid.Value.kReverse);
  }
  public void Open(){
    pitchSolenoid.set(DoubleSolenoid.Value.kForward);
  }
}
