package oop;

public class TV {
int channel;
int volumeLevel;
boolean on;
public TV() {
	this.channel=channel;
	this.on=on;
	this.volumeLevel=volumeLevel;
}
public void TurnOn() {
	on=true;
}
public void TurnOff() {
	on=false;
}

public int getChannel() {
	return channel;
}
public int getVolumeLevel() {
	return volumeLevel;
}
public void setchannel(int newchannel) {
	if(on && newchannel >=1 && newchannel<=120) {
		this.channel=newchannel;
	}
	
}
public void setVolumeLevel(int volumeLevel) {
	if(on && volumeLevel >=1 && volumeLevel<=7)
	this.volumeLevel = volumeLevel;
}
public void channelUp() {
	if(on &&channel<120)
		channel++;
}
public void channelDown() {
	if(on &&channel>10)
		channel--;
}
public void volumUp() {
	if(on && volumeLevel<10)
		volumeLevel++;
}
public void volumDouwn() {
	if(on && volumeLevel>10)
		volumeLevel--;
}
public void printInfo() {
	System.out.println("tv channel is "+channel+"the volume level is "+volumeLevel);
}

}
