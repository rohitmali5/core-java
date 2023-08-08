package com.abstraction.implementor;

public class Printer {
	
	private PrintingMachine machine;
	
	public Bharath(PrintingMachine machine) {
		this.machine = machine;
	}

	
	public void getPrint() {
		if(machine!=null) {
			System.out.println("Machine is not null");
			this.machine.print();
		}
		else {
			System.err.println("machine is null cannot print");
		}
	}
}

}
