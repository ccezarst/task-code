package org.firstinspires.ftc.teamcode

import com.qualcomm.robotcore.eventloop.opmode.Disabled
import com.qualcomm.robotcore.eventloop.opmode.TeleOp
import com.qualcomm.robotcore.hardware.DigitalChannel
import com.qualcomm.robotcore.hardware.DistanceSensor
import com.qualcomm.robotcore.util.ElapsedTime
import com.qualcomm.robotcore.hardware.TouchSensor
import org.firstinspires.ftc.teamcode.hardware.Hardware
import org.firstinspires.ftc.teamcode.hardware.Outtake
import java.lang.Math.atan2

@TeleOp(name = "CompleteDrive", group = "Main")
class CompleteDrive: OpMode() {

    override fun preInit() {

    }
    override fun preInitLoop() {
        //   hw.outtake.initSlider()
        //   hw.outtake.initClaws()
        telemetry.addLine("Waiting for start...")
        telemetry.update()
        idle()
    }

    enum class LiftState{
        LIFT_START,
        LIFT_EXTEND_LOW,
        LIFT_EXTEND_MEDIUM,
        LIFT_EXTEND_UP,
        LIFT_LOW,
        LIFT_MEDIUM,
        LIFT_UP,
        LIFT_DUMP_UP,
        LIFT_DUMP_MEDIUM,
        LIFT_DUMP_LOW,
        LIFT_RETRACT,
    }


    override fun Hardware.run() {

         val gp1 = Gamepad(gamepad1)
         val gp2 = Gamepad(gamepad2)


        // var leftTriggerIsPressed = false
        var rightTriggerIsPressed = false
        var scale= 0.3 // 0.6

        var liftState = LiftState.LIFT_START

        var liftTimer = ElapsedTime()
        liftTimer.reset()

        //TODO Adjust these variables according to the needs

        var DUMP_TIME_LOW = 0.1
        var DUMP_TIME_UP = 0.2
        var DUMP_TIME_MEDIUM = 0.9




        var isSlowMode:Boolean = false
        var isReleased = false

        waitForStart()

        while(opModeIsActive())
        {

            val power = speed

            val rotPower = rotation
            hw.motors.move(direction, power*1.0, rotPower*1.0)

            if(gp2.checkToggle(Gamepad.Button.X))
            {
                intake.startIntake()
            }
            if(gp2.checkToggle(Gamepad.Button.Y))
            {
                intake.stopIntake()
            }
            if(gp2.checkToggle(Gamepad.Button.RIGHT_BUMPER))
            {
                outtake.toggle()
            }
            if(gp2.checkToggle(Gamepad.Button.LEFT_BUMPER)){
                hw.hangmode.activate();
            }


        }
    }


    ///The direction in which the robot is translating
    private val direction: Double
        get() {
            val x = -gamepad1.left_stick_x.toDouble()  // -
            val y = -gamepad1.left_stick_y.toDouble() // +

            return atan2(y, x) / Math.PI * 180.0 - 90.0
        }

    /// Rotation around the robot's Z axis.
    private val rotation: Double
        get() = -gamepad1.right_stick_x.toDouble()  // -

    /// Translation speed.
    private val speed: Double
        get() {
            val x = gamepad1.left_stick_x.toDouble() //+
            val y = gamepad1.left_stick_y.toDouble() //+

            return Math.sqrt((x * x) + (y * y))
        }

}