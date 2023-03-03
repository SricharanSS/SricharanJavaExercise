package CommandPattern;

class tvOffCommand implements RemoteCommand {
	
	public tvOffCommand(RemoteReceiver remote) {
		this.remote = remote;
	}
	
	private RemoteReceiver remote;
	
	@Override
	public void execute() {
		remote.switchOff();
	}
}
