// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.cscore.VideoCamera.WhiteBalance;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.DriveCommand;
import frc.robot.commands.ExtendTelescope;
import frc.robot.commands.RetractTelescope;
import frc.robot.commands.StopTelescope;
import frc.robot.subsystems.ClimberSubsystem;
import frc.robot.subsystems.DriveSubsystem;
import frc.util.Point;


/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
 
  private final DriveSubsystem driveTrain = new DriveSubsystem();
  private final ClimberSubsystem climb = new ClimberSubsystem();
  
  private final Joystick leftJoystick = new Joystick(PortMap.LEFT_JOYSTICK);
  private final Joystick rightJoystick = new Joystick(PortMap.RIGHT_JOYSTICK);
  private final XboxController xbox = new XboxController(PortMap.XBOX_CONTROLLER);

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
    configureDefaultCommands();
  }

    
    /**
     * Use this method to define your button->command mappings. Buttons can be created by
     * instantiating a {@link GenericHID} or one of its subclasses ({@link
     * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
     * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
     */
    private void configureButtonBindings() {
      // xbox.y()
      // .onTrue(new ExtendTelescope(climb))
      // .onFalse(new StopTelescope(climb));

      // xbox.b()
      // .onTrue(new RetractTelescope(climb))
      // .onFalse(new StopTelescope(climb));
    }
    
    private void configureDefaultCommands() {
      driveTrain.setDefaultCommand(new DriveCommand(driveTrain, xbox));
    }
    /**
     * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return new RunCommand(() -> {});
  }
}
