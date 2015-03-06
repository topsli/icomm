package com.sjtu.icare.modules.sys.utils.security;

import java.util.Map;

import org.apache.shiro.authc.AuthenticationToken;

public class StatelessToken implements AuthenticationToken {  
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;  
    private Map<String, ?> params;  
    private String clientDigest;  
    //省略部分代码  
    public StatelessToken(String username, Map<String, ?> params,
			String clientDigest) {
		super();
		this.username = username;
		this.params = params;
		this.clientDigest = clientDigest;
	}    
    
    public Object getPrincipal() {  return username;}  
    
	public Object getCredentials() {  return clientDigest;}
	
    public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Map<String, ?> getParams() {
		return params;
	}
	public void setParams(Map<String, ?> params) {
		this.params = params;
	}
	public String getClientDigest() {
		return clientDigest;
	}
	public void setClientDigest(String clientDigest) {
		this.clientDigest = clientDigest;
	}  
} 
