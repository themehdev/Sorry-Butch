// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import XeroTalon.XeroTalon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ExampleSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  private XeroTalon shooter;
  public ExampleSubsystem() {
    shooter = new XeroTalon(3, "ExampleSubsystem", "Shooter", 0.6);
  }

  public void spin(double rps){
    shooter.setVelocity(rps);
  }

  public void stop(){
    shooter.stop();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
