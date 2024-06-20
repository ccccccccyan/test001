package com.kh.bank;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import common.Common;
import dao.RateDAO;
import service.BankService;
import vo.RateVO;
//안녕 히히힣 여기도 3번!
@Controller
public class BankController {
	RateDAO rate_dao;

	public BankController(RateDAO rate_dao) {
		this.rate_dao = rate_dao;
	}
//히히 나 3번! 
	@RequestMapping(value = { "/", "list.do" })
	public String list(Model model) throws IOException {
		// 현재 날짜 가져오기
		LocalDate date = LocalDate.now();

		// 원하는 형식의 DateTimeFormatter 생성
		DateTimeFormatter fommat_date = DateTimeFormatter.ofPattern("yyyyMMdd");
		
//		for(int i = 0; i < 31; i++) {
//			// LocalDate를 문자열로 변환
//			String formattedDate = date.format(fommat_date);
//		
//			BankService bank = new BankService();
//			List<RateVO> list = bank.bank_serv(formattedDate); // api로 vo 리스트를 받아온다.
//			
//			System.out.println(i + " / "+list.size());
//			
//			if(list.get(0).getCur_nm() == null || list.get(0).getCur_nm() == "") {
//					int res = rate_dao.no_insert(list.get(0));
//			}else {
//				for (int j = 0; j < list.size(); j++) {
//					int res = rate_dao.data_insert(list.get(j));
//				}
//			}
//			 
//			
//			date = date.plusDays(-1);
//		}
		
		List<RateVO> selectlist = rate_dao.selectList();

		model.addAttribute("list", selectlist);
		return Common.Bank.VIEW_PATH + "bank_list.jsp"; 
//		return "redirect:test.do";
	}

	/*
	  @RequestMapping("test.do") 
	  public String test() { //현재 날짜 가져오기 
	  LocalDate date  = LocalDate.now();
	  
	  // 원하는 형식의 DateTimeFormatter 생성 
	  DateTimeFormatter fommat_date = DateTimeFormatter.ofPattern("yyyyMMdd");
	  
	  BankVO nowvo = bank_dao.selectOne(date.format(fommat_date));
	  
	  date = date.plusDays(-3);
	  
	  BankVO nowvo2 = bank_dao.selectOne(date.format(fommat_date));
	  System.out.println("제박ㄹ");
	  double res_d1 = Double.parseDouble(nowvo.getTtb()); 
	  double res_d2 = Double.parseDouble(nowvo2.getTtb());
	  
	  System.out.println(res_d1 + " / " + res_d2 + " : " + (res_d1-res_d2));
	  
	  int res_day = Integer.parseInt(nowvo.getDay()) -
	  Integer.parseInt(nowvo2.getDay());
	  
	  System.out.println("오늘 : "+res_day); 
	  return Common.Bank.VIEW_PATH + "bank_list.jsp"; 
	  }
	 
*/
}
