package com.nonage.controller.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nonage.dao.AddressDAO;
import com.nonage.dto.AddressVO;

public class FindZipNumAction implements Action{
/*
 * 버튼이 눌리면, NonageServlet?command=find_zip_num이 발생, 
 * 이 요청을 받아 주소 정보를 찾아오는 액션을 만든다.
 */
	
  @Override
  public void execute(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {		  
    String url="member/findZipNum.jsp";
    
    String dong=request.getParameter("dong");
    
    if(dong!=null && dong.trim().equals("")==false){
      AddressDAO addressDAO=AddressDAO.getInstance();      
      ArrayList<AddressVO> addressList = addressDAO.selectAddressByDong(dong.trim());      
      request.setAttribute("addressList", addressList);
    }
    
    RequestDispatcher dispatcher=request.getRequestDispatcher(url);
    dispatcher.forward(request, response);    
  }
}
