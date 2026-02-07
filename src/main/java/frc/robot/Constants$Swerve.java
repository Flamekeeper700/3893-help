/*    */ package frc.robot;
/*    */ 
/*    */ import com.pathplanner.lib.util.HolonomicPathFollowerConfig;
/*    */ import com.pathplanner.lib.util.PIDConstants;
/*    */ import com.pathplanner.lib.util.ReplanningConfig;
/*    */ import edu.wpi.first.math.geometry.Translation2d;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class Swerve
/*    */ {
/* 64 */   public static final Translation2d flModuleOffset = new Translation2d(0.28D, 0.28D);
/* 65 */   public static final Translation2d frModuleOffset = new Translation2d(0.28D, -0.28D);
/* 66 */   public static final Translation2d blModuleOffset = new Translation2d(-0.28D, 0.28D);
/* 67 */   public static final Translation2d brModuleOffset = new Translation2d(-0.28D, -0.28D);
/*    */   
/*    */   public static final double maxModuleSpeed = 4.5D;
/*    */   
/* 71 */   public static final HolonomicPathFollowerConfig pathFollowerConfig = new HolonomicPathFollowerConfig(new PIDConstants(5.0D, 0.0D, 0.0D), new PIDConstants(5.0D, 0.0D, 0.0D), 4.5D, flModuleOffset
/*    */ 
/*    */ 
/*    */       
/* 75 */       .getNorm(), new ReplanningConfig());
/*    */ }


/* Location:              D:\2024_Season_Robot_Code.jar!\frc\robot\Constants$Swerve.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */