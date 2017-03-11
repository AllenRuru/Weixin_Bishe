/*package com.allen.menu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.allen.pojo.AccessToken;
import com.allen.util.WeixinUtil;

public class MenuManager {

	private static Logger log = LoggerFactory.getLogger(MenuManager.class);  
	
	public static void main(String[] args) {  
        // 第三方用户唯一凭证  
        String appId = "wx8178e6b9707a0f72";  
        // 第三方用户唯一凭证密钥  
        String appSecret = "4c6c5ab6a0a0bc0accba50fd7d523043";  
  
        // 调用接口获取access_token  
        AccessToken at = WeixinUtil.getAccessToken(appId, appSecret);  
  
        if (null != at) {  
            // 调用接口创建菜单  
            int result = WeixinUtil.createMenu(getMenu(), at.getToken());  
  
            // 判断菜单创建结果  
            if (0 == result)  
                log.info("菜单创建成功！");  
            else  
                log.info("菜单创建失败，错误码：" + result);  
        }  
    }  
	
	*//** 
     * 组装菜单数据 
     *  
     * @return 
     *//*  
    private static Menu getMenu() {  
        
    	ViewButton button01 = new ViewButton();
		button01.setName("台风信息查询");
		button01.setType("view");
		button01.setUrl("http://182.254.141.217/Weixin/pages/Info_search.jsp");
		
		ViewButton button02 = new ViewButton();
		button01.setName("台风路径模拟");
		button01.setType("view");
		button01.setUrl("http://182.254.141.217/Weixin/pages/Info_search.jsp");
        
        Menu menu = new Menu();  
        menu.setButton(new Button[] { button01, button02 });  
  
        return menu;  
    }  
}  
	
*/