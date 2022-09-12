package part16;



public class MagicButton {

	public MagicButton() {
		
	}
	private EventListener listener;
	
	public void setListener(EventListener listener) {
		this.listener = listener;
		listener.onClick();
	}
	public void onClickProcess() {
		if(listener!=null) {
			listener.onClick();
		}
	}
	
}
