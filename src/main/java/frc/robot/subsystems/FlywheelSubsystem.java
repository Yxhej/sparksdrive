// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.PortMap;

public class FlywheelSubsystem extends SubsystemBase {
  private CANSparkMax flywheelLeft = new CANSparkMax(PortMap.SPARK_LEFT_FLYWHEEL, MotorType.kBrushless);
  private CANSparkMax flywheelRight = new CANSparkMax(PortMap.SPARK_RIGHT_FLYWHEEL, MotorType.kBrushless);

  /** Creates a new FlywheelSubsystem. */
  public FlywheelSubsystem() {
    flywheelLeft.setIdleMode(IdleMode.kBrake);
    flywheelRight.setIdleMode(IdleMode.kBrake);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
