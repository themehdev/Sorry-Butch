// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.Command;

/** An example command that uses an example subsystem. */
public class ExampleCommand extends Command {

  private double rps = 0.0;
  private ExampleSubsystem sub_;

  public ExampleCommand(ExampleSubsystem sub, double rps) {
    this.rps = rps;
    this.sub_ = sub;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(sub_);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    if(rps == 0){
      sub_.stop();
    }else{
      sub_.spin(rps);
    }
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    sub_.stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
