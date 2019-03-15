/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;


/**
 * Add your docs here.
 */

/**
 * Add your docs here.
 */
public class Lift extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  DoubleSolenoid pitchSolenoid = null;

  public Lift () {
    pitchSolenoid = new DoubleSolenoid(RobotMap.LIFT_PITCH_SOLENOID_DEPLOY, RobotMap.LIFT_PITCH_SOLENOID_RETRACT);

  }
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
  public void Up(){
    pitchSolenoid.set(DoubleSolenoid.Value.kForward);
  }
  public void Down(){
    pitchSolenoid.set(DoubleSolenoid.Value.kReverse);
  }
}
