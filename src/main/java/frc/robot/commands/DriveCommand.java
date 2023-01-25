// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveSubsystem;

public class DriveCommand extends CommandBase {
  private final DriveSubsystem DriveTrain;
  // private final Joystick leftJoystick;
  // private final Joystick rightJoystick;
  private final XboxController xbox;
  
  /** Creates a new DriveCommand. */
  // public DriveCommand(DriveSubsystem driveTrain, Joystick leftStick, Joystick rightStick) {
  //   DriveTrain = driveTrain;
  //   leftJoystick = leftStick;
  //   rightJoystick = rightStick;
  //   addRequirements(driveTrain);
  // }

  public DriveCommand(DriveSubsystem driveTrain, XboxController xbox) {
    DriveTrain = driveTrain;
    this.xbox = xbox;
    addRequirements(driveTrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double rightSpeed = xbox.getLeftY();
    double leftSpeed = -xbox.getRightY(); // left side inverted
    DriveTrain.setSpeed(rightSpeed, leftSpeed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
