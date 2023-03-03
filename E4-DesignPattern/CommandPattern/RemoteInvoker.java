package CommandPattern;

class RemoteInvoker {
	RemoteCommand command;
	public RemoteInvoker(RemoteCommand command) {
		this.command = command;
	}
	
	public void execute() {
		this.command.execute();
	}
}