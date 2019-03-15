/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.ShooterIn;
import frc.robot.commands.ShooterOut;
import frc.robot.commands.LiftDown;
import frc.robot.commands.LiftUp;
import frc.robot.commands.GrabberIn;
import frc.robot.commands.GrabberOut;

//import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/* import frc.robot.commands.Autonomous;
import frc.robot.commands.CloseClaw;
import frc.robot.commands.OpenClaw;
import frc.robot.commands.Pickup;
import frc.robot.commands.Place;
import frc.robot.commands.PrepareToPickup;
import frc.robot.commands.SetElevatorSetpoint;
import frc.robot.commands.SetWristSetpoint; */


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  public Joystick driverController = new Joystick(0);
  public Joystick driverController2 = new Joystick(1);
  
  //// CREATING BUTTONS
  
  Button aBtn = new JoystickButton(driverController, 1);
  Button bBtn = new JoystickButton(driverController, 2);
  Button xBtn = new JoystickButton(driverController, 3);
  Button yBtn = new JoystickButton(driverController, 4);
  Button leftBmp = new JoystickButton(driverController, 5);
  Button rightBmp = new JoystickButton(driverController, 6);
  Button backBtn = new JoystickButton(driverController, 7);
  Button startBtn = new JoystickButton(driverController, 8);
  Button leftJoyClick = new JoystickButton(driverController, 9);
  Button rightJoyClick = new JoystickButton(driverController, 10); 

  Button aBtn2 = new JoystickButton(driverController2, 1);
  Button bBtn2 = new JoystickButton(driverController2, 2);
  Button xBtn2 = new JoystickButton(driverController2, 3);
  Button yBtn2 = new JoystickButton(driverController2, 4);
  Button leftBmp2 = new JoystickButton(driverController2, 5);
  Button rightBmp2 = new JoystickButton(driverController2, 6);
  Button backBtn2 = new JoystickButton(driverController2, 7);
  Button startBtn2 = new JoystickButton(driverController2, 8);
  Button leftJoyClick2 = new JoystickButton(driverController2, 9);
  Button rightJoyClick2 = new JoystickButton(driverController2, 10); 

  //mapping joystick buttons
  public OI(){
    aBtn.whileHeld(new LiftUp());
    yBtn.whileHeld(new LiftDown());

    leftBmp.whileHeld(new ShooterIn());
    rightBmp.whileHeld(new ShooterOut());

    xBtn.whenPressed(new GrabberIn());
    bBtn.whenPressed(new GrabberOut());
  }
}
