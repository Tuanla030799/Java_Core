public class Main {
	public static void main(String[] args) {
		ComputerCase theCase = new ComputerCase("2208", "Dell", "240");
		
		Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, "2540 x 1440");
		
		MotherBroad theMotherBroad = new MotherBroad("BJ-200", "Asus", 4, 6, "v2.44");
		
		PersionalComputer thePC = new PersionalComputer("2208", "Dell", theCase, theMonitor, theMotherBroad);
		
//		thePC.getComputerCase().pressPowerButton();
//		thePC.getMotherBroad().loadProgram("Windows 11");
//		thePC.getMonitor().drawPixelAt(10, 10, "red");
		
		thePC.powerUp();
	}
}