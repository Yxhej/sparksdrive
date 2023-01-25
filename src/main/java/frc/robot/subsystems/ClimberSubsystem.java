// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import frc.robot.PortMap;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ClimberSubsystem extends SubsystemBase {
  private CANSparkMax telescopeMotor = new CANSparkMax(PortMap.SPARK_TELESCOPE, MotorType.kBrushless);

  /** Creates a new ClimberSubsystem. */
  public ClimberSubsystem() {
    telescopeMotor.setIdleMode(IdleMode.kBrake);
  }

  public void extendTelescope() {
    telescopeMotor.set(0.9);
  }

  public void retractTelesope() {
    telescopeMotor.set(-0.9);
  }
  public void stopTelescope() {
    telescopeMotor.set(0);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
