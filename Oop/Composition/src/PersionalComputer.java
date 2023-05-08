public class PersionalComputer  extends Product{
	private ComputerCase computerCase;
	private Monitor monitor;
	private MotherBroad motherBroad;
	
	public PersionalComputer(String model, String manufacturer, ComputerCase computerCase, Monitor monitor, MotherBroad motherBroad) {
		super(model, manufacturer);
		this.computerCase = computerCase;
		this.monitor = monitor;
		this.motherBroad = motherBroad;
	}
	
	private void drawLogo() {
		monitor.drawPixelAt(1000, 1000, "yellow");
	}
	
	public void powerUp() {
		computerCase.pressPowerButton();
		motherBroad.loadProgram("Windows 11");
		this.drawLogo();
	}
	
//	public ComputerCase getComputerCase() {
//		return computerCase;
//	}
//
//	public Monitor getMonitor() {
//		return monitor;
//	}
//
//	public MotherBroad getMotherBroad() {
//		return motherBroad;
//	}
}
