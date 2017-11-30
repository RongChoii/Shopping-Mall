package com.nonage.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nonage.dao.ProductDAO;
import com.nonage.dto.ProductVO;
/*
 * 상품 상세보기 페이지 만들기
 * 특정 상품을 클릭하면, 상품 상세보기 페이지로 이동한다.
 * 상품을 클릭하면,
 * "NonageServlet?command=product_detail&pseq=${productVO.pseq}"가 요청되어,
 * 상품 상세보기 페이지로 이동해야 하기 때문에, 액션 클래스를 만들고,
 * 이 요청을 처리할 코드를 ActionFactory에 추가한다.
 * 
 * 따라서, 액션클래스에서는 상품번호로 상풍 정보 하나를 얻어오기 위한  
 * ProductDAO.getProduct(pseq) 메소드를 호출해야 한다.
 */
public class ProductDetailAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url="product/productDetail.jsp";
		
		String pseq=request.getParameter("pseq").trim();
		
		ProductDAO productDAO=ProductDAO.getInstance();
		ProductVO productVO=productDAO.getProduct(pseq);
		
	}

}
