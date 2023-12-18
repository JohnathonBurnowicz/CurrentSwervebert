// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import frc.robot.Constants;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.revrobotics.SparkMaxAbsoluteEncoder.Type;
import com.revrobotics.SparkMaxPIDController;
import com.revrobotics.AbsoluteEncoder;
import com.revrobotics.RelativeEncoder;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ArmSubsystem2 extends SubsystemBase {
 private CANSparkMax m_arm;
  /** Creates a new ArmSubsystem2. */
  public ArmSubsystem2() {
 m_arm = new CANSparkMax(Constants.ArmCanId, MotorType.kBrushless);

    m_arm.set(0.25);
  
};


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
