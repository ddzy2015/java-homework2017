package lab12;

public enum Computer {
	
	DELL("Intel i3","Windows 10","4G"),
	LENOVO("I5 7200U","Windows 10","8G"),
	MACBOOKPRO("Inter i5","Mac OS","8G");
	
	private final String cpu;
	private final String system;
	private final String mainMemoryCapacity;
	
	private Computer(String cpu, String system, String mainMemoryCapacity) {
		this.cpu = cpu;
		this.system = system;
		this.mainMemoryCapacity = mainMemoryCapacity;
	}
	
	public String getCpu() {
		return cpu;
	}
	
	public String getSystem() {
		return system;
	}
	
	public String getMainMemoryCapacity() {
		return mainMemoryCapacity;
	}
	
	@Override
	public String toString() {
		return String.format("Name: %s\nCPU: %s\nSystem: %s\nMainMemoryCapacity: %s",
				name(),
				cpu,
				system,
				mainMemoryCapacity);
	}
	
	public static void main(String[] args) {
		for (Computer computer : Computer.values()) {
			System.out.println("CPU: " + computer.cpu);
			System.out.println("System: " + computer.system);
			System.out.println("MainMemoryCapacity: " + computer.mainMemoryCapacity);
			System.out.println();
		}
		System.out.println("Computer with 8G memory: ");
		for (Computer computer : Computer.values()) {
			if (computer.getMainMemoryCapacity().equals("8G")) {
				System.out.println(computer.toString());
				System.out.println();
			}
		}
	}
	
}
