package common;

//import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

//import dao.VisitDAO;
//import vo.VisitVO;

public class Common {
	
	public static class Bank{
		public static final String VIEW_PATH = "/WEB-INF/views/bank/";
	}

//	public static class SecurePwd{
//		//비밀번호 암호화 메서드
//		public static String encodePwd(String pwd) {
//			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
//			String encodePwd = encoder.encode(pwd); //비밀번호 암호화
//			return encodePwd;
//		}
//	
//		//비밀번호 복호화 메서드
//		public static boolean decodePwd(VisitVO vo, VisitDAO visit_dao) {
//			boolean isValid = false; // 암호 일치 여부 확인
//			
//			VisitVO resultVO = visit_dao.check(vo.getIdx());
//			
//			if(resultVO != null ) {
//				// 입력한 비밀번호와 DB의 암호화된 비밀번호가 일치하면 
//				// isValid가 true가 된다.
//				isValid = BCrypt.checkpw(vo.getPwd(), resultVO.getPwd());
//			}
//			
//			return isValid;
//		}
//	}
}
