package com.example1.remotecontrol;

import com.example1.remotecontrol.command.*;

public class Demo {
	public static void main(String[] args) {
		RemoteControl simpleRemoteControl =  new RemoteControl();

		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor("Garage");
		Stereo stereo = new Stereo("Living Room");

		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

		CeilingFanHighCommand ceilingFanOn = new CeilingFanHighCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

		GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
		GarageDoorClosedCommand garageDoorClosed = new GarageDoorClosedCommand(garageDoor);

		StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);

		simpleRemoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		simpleRemoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		simpleRemoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
		simpleRemoteControl.setCommand(3, stereoOnWithCD, stereoOff);
		simpleRemoteControl.setCommand(4, garageDoorOpen, garageDoorClosed);

		System.out.println(simpleRemoteControl);


		simpleRemoteControl.onButtonWasPressed(0);
		simpleRemoteControl.offButtonWasPressed(0);

		System.out.println(simpleRemoteControl);
		simpleRemoteControl.undoButtonWasPushed();

		simpleRemoteControl.onButtonWasPressed(1);
		simpleRemoteControl.offButtonWasPressed(1);
		System.out.println(simpleRemoteControl);
		simpleRemoteControl.undoButtonWasPushed();

		simpleRemoteControl.onButtonWasPressed(2);
		simpleRemoteControl.offButtonWasPressed(2);
		simpleRemoteControl.onButtonWasPressed(3);
		simpleRemoteControl.offButtonWasPressed(3);
		simpleRemoteControl.onButtonWasPressed(4);
		simpleRemoteControl.offButtonWasPressed(4);

		Command[] partyOn = {livingRoomLightOn, stereoOnWithCD};
		Command[] partyOff = {livingRoomLightOff, stereoOff};
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);
		simpleRemoteControl.setCommand(5, partyOnMacro, partyOffMacro);
		System.out.println(simpleRemoteControl);
		simpleRemoteControl.onButtonWasPressed(5);
		simpleRemoteControl.offButtonWasPressed(5);
	}
}
