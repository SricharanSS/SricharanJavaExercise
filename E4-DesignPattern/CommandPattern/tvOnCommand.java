package CommandPattern;

class tvOnCommand implements RemoteCommand {

	private RemoteReceiver remote;
	
	public tvOnCommand(RemoteReceiver remote) {
		this.remote = remote;
	}
	
	@Override
	public void execute() {
		remote.switchOn();
	}
}