package chapter09.test;

public class Button {
	
	OnClickListener listener;
	
	
	void setOnClickListener (OnClickListener Listener) {
		
		this.listener = listener;
	}
	
	void touch() {
		
//		listener.onClick();
		
	}
	static interface OnClickListener {
		
		void onClick();
	}
}
