/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Spark;
import frc.robot.RobotMap;
import frc.robot.commands.ShooterOut;

public class Shooter extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public static Spark LeftBallSpark = new Spark(RobotMap.DRIVETRAIN_LEFT_BALL_SPARK);
  public static  Spark RightBallSpark = new Spark(RobotMap.DRIVETRAIN_RIGHT_BALL_SPARK);

  public static double inSpeed = .75;
  public static double outSpeed = -.75;

  public Shooter(){

  }
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new ShooterOut());
  }

  public static void shootIn(){
    LeftBallSpark.set(inSpeed);
    RightBallSpark.set(inSpeed);
  }

  public static void shootOut(){
    LeftBallSpark.set(outSpeed);
    RightBallSpark.set(outSpeed);
  }
}