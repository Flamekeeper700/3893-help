/*     */ package frc.robot.subsystems;
/*     */ 
/*     */ import edu.wpi.first.math.kinematics.SwerveModulePosition;
/*     */ import edu.wpi.first.math.kinematics.SwerveModuleState;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class SimSwerveModule
/*     */ {
/* 135 */   private SwerveModulePosition currentPosition = new SwerveModulePosition();
/* 136 */   private SwerveModuleState currentState = new SwerveModuleState();
/*     */   
/*     */   public SwerveModulePosition getPosition() {
/* 139 */     return this.currentPosition;
/*     */   }
/*     */   
/*     */   public SwerveModuleState getState() {
/* 143 */     return this.currentState;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setTargetState(SwerveModuleState targetState) {
/* 148 */     this.currentState = SwerveModuleState.optimize(targetState, this.currentState.angle);
/*     */     
/* 150 */     this.currentPosition = new SwerveModulePosition(this.currentPosition.distanceMeters + this.currentState.speedMetersPerSecond * 0.02D, this.currentState.angle);
/*     */   }
/*     */ }


/* Location:              D:\2024_Season_Robot_Code.jar!\frc\robot\subsystems\AutoDriveSubsystem$SimSwerveModule.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */