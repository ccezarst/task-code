package org.firstinspires.ftc.teamcode.hardware

import com.qualcomm.hardware.rev.RevTouchSensor
import com.qualcomm.robotcore.eventloop.opmode.Disabled
import com.qualcomm.robotcore.hardware.DcMotor
import com.qualcomm.robotcore.hardware.DcMotorSimple
import com.qualcomm.robotcore.hardware.HardwareMap
import com.qualcomm.robotcore.hardware.Servo
import com.qualcomm.robotcore.hardware.TouchSensor

import org.firstinspires.ftc.robotcore.external.Telemetry
import java.io.File
import java.io.FileOutputStream
import java.io.PrintWriter
import java.util.*
import kotlin.math.absoluteValue
import com.qualcomm.robotcore.hardware.DistanceSensor


/**
 * front pistons subsystem.
 *
 * This class controls the hardware for hoisting
 */

class FrontPistons(hwMap: HardwareMap) {
    companion object {

    }
    /**if x ==1
    {ok=1
    } else ok =0

     if x==1 ? ok=1 : ok=0
     if x==1 ok=1 ?: ok=0

     telemtry -- mod de afisare a datelor pt un cod
     Exception-- erori
     **/
    private val rightServo = hwMap.servo["frontRightServo"] ?: throw Exception("Failed to find frontRightServo")
    private val leftServo = hwMap.servo["frontLeftServo"] ?: throw Exception("Failed to find frontLeftServo")


    init {
        rightServo.position = 0.0;
        leftServo.position = 0.0;
        // so they spin in the same direction
        rightServo.direction = Servo.Direction.FORWARD;
        // why reverse instead of backward??
        // also why not implement backward and make it interchangeable with reverse
        leftServo.direction = Servo.Direction.REVERSE;
        // assuming these are the correct directions
    }
    fun extend()
    {
        rightServo.position = 1.0;
        leftServo.position =  1.0;
    }
    fun close()
    {
        rightServo.position = 0.0;
        leftServo.position =  0.0;
    }














}
