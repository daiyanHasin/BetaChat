
package groupchat;

import java.util.HashMap;


public class IdandPassword {
    HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IdandPassword(){
		
		logininfo.put("daiyan","dai");
		logininfo.put("Sadaf","sad");
		logininfo.put("aust","aust");
	}
	
	public HashMap getLoginInfo(){
		return logininfo;
	}
}
